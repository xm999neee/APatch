-dontwarn org.bouncycastle.jsse.BCSSLParameters
-dontwarn org.bouncycastle.jsse.BCSSLSocket
-dontwarn org.bouncycastle.jsse.provider.BouncyCastleJsseProvider
-dontwarn org.conscrypt.Conscrypt$Version
-dontwarn org.conscrypt.Conscrypt
-dontwarn org.conscrypt.ConscryptHostnameVerifier
-dontwarn org.openjsse.javax.net.ssl.SSLParameters
-dontwarn org.openjsse.javax.net.ssl.SSLSocket
-dontwarn org.openjsse.net.ssl.OpenJSSE
-dontwarn java.beans.Introspector
-dontwarn java.beans.VetoableChangeListener
-dontwarn java.beans.VetoableChangeSupport

# Keep ini4j Service Provider Interface
-keep,allowobfuscation,allowoptimization public class org.ini4j.spi.*

# Kotlin
-assumenosideeffects class kotlin.jvm.internal.Intrinsics {
    public static void check*(...);
    public static void throw*(...);
}

-assumenosideeffects class kotlin.jvm.internal.Intrinsics {  
    public static void checkNotNull(...);  
    public static void checkParameterIsNotNull(...);  
    public static void checkNotNullParameter(...);  
    public static void checkExpressionValueIsNotNull(...);  
    public static void checkNotNullExpressionValue(...);  
    public static void checkReturnedValueIsNotNull(...);  
    public static void throwUninitializedPropertyAccessException(...);  
}

-allowaccessmodification
-renamesourcefileattribute ""  
-keepattributes !SourceFile,!LineNumberTable
