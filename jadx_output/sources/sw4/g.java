package sw4;

/* loaded from: classes8.dex */
public abstract class g {
    public static void a(com.tencent.mm.ui.MMActivity mMActivity, android.os.Bundle bundle, java.lang.Class cls, sw4.e eVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("task_class_name", cls.getName());
        intent.putExtra("input_data", bundle);
        intent.putExtra("orientation", -1);
        mMActivity.mmSetOnActivityResultCallback(new sw4.f(eVar));
        j45.l.n(mMActivity, "webview", ".luggage.ipc.IpcProxyUI", intent, 3456);
    }
}
