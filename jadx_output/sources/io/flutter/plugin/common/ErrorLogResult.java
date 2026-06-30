package io.flutter.plugin.common;

/* loaded from: classes11.dex */
public class ErrorLogResult implements io.flutter.plugin.common.MethodChannel.Result {
    private int level;
    private java.lang.String tag;

    public ErrorLogResult(java.lang.String str) {
        this(str, io.flutter.Log.WARN);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void error(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        java.lang.String str3;
        if (obj != null) {
            str3 = " details: " + obj;
        } else {
            str3 = "";
        }
        int i17 = this.level;
        if (i17 < io.flutter.Log.WARN) {
            return;
        }
        io.flutter.Log.println(i17, this.tag, str2 + str3);
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void notImplemented() {
        int i17 = this.level;
        if (i17 < io.flutter.Log.WARN) {
            return;
        }
        io.flutter.Log.println(i17, this.tag, "method not implemented");
    }

    @Override // io.flutter.plugin.common.MethodChannel.Result
    public void success(java.lang.Object obj) {
    }

    public ErrorLogResult(java.lang.String str, int i17) {
        this.tag = str;
        this.level = i17;
    }
}
