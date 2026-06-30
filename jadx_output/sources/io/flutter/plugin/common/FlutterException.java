package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public class FlutterException extends java.lang.RuntimeException {
    private static final java.lang.String TAG = "FlutterException#";
    public final java.lang.String code;
    public final java.lang.Object details;

    public FlutterException(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        super(str2);
        this.code = str;
        this.details = obj;
    }
}
