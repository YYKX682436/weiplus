package com.tencent.pigeon.flutter_pag;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u000b"}, d2 = {"createConnectionError", "Lcom/tencent/pigeon/flutter_pag/FlutterError;", "channelName", "", "wrapError", "", "", "exception", "", "wrapResult", "result", "mm_auto_gen_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class FlutterPagPagMessagePigeonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.tencent.pigeon.flutter_pag.FlutterError createConnectionError(java.lang.String str) {
        return new com.tencent.pigeon.flutter_pag.FlutterError("channel-error", "Unable to establish connection on channel: '" + str + "'.", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Object> wrapError(java.lang.Throwable th6) {
        if (th6 instanceof com.tencent.pigeon.flutter_pag.FlutterError) {
            return kz5.c0.i(((com.tencent.pigeon.flutter_pag.FlutterError) th6).getCode(), th6.getMessage(), ((com.tencent.pigeon.flutter_pag.FlutterError) th6).getDetails());
        }
        return kz5.c0.i(th6.getClass().getSimpleName(), th6.toString(), "Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<java.lang.Object> wrapResult(java.lang.Object obj) {
        return kz5.b0.c(obj);
    }
}
