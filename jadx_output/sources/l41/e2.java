package l41;

/* loaded from: classes15.dex */
public abstract class e2 {
    public static final void a(android.os.ResultReceiver resultReceiver, long j17, boolean z17, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result_key_err_code", i17);
            bundle.putString("result_key_err_msg", errMsg);
            bundle.putInt("result_key_action", z17 ? 7 : 8);
            resultReceiver.send(i17, bundle);
        }
    }

    public static final void b(android.os.ResultReceiver resultReceiver, long j17, boolean z17, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result_key_err_code", i17);
            bundle.putString("result_key_err_msg", errMsg);
            bundle.putInt("result_key_action", z17 ? 3 : 4);
            resultReceiver.send(i17, bundle);
        }
    }

    public static final void c(android.os.ResultReceiver resultReceiver, long j17, boolean z17, int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("result_key_err_code", i17);
            bundle.putString("result_key_err_msg", errMsg);
            bundle.putInt("result_key_action", z17 ? 1 : 2);
            resultReceiver.send(i17, bundle);
        }
    }
}
