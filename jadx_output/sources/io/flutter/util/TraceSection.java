package io.flutter.util;

/* loaded from: classes13.dex */
public final class TraceSection implements java.lang.AutoCloseable {
    private TraceSection(java.lang.String str) {
        begin(str);
    }

    public static void begin(java.lang.String str) {
        t4.a.f(cropSectionName(str));
    }

    public static void beginAsyncSection(java.lang.String str, int i17) {
        t4.a.a(cropSectionName(str), i17);
    }

    private static java.lang.String cropSectionName(java.lang.String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void end() {
    }

    public static void endAsyncSection(java.lang.String str, int i17) {
        t4.a.b(cropSectionName(str), i17);
    }

    public static io.flutter.util.TraceSection scoped(java.lang.String str) {
        return new io.flutter.util.TraceSection(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        end();
    }
}
