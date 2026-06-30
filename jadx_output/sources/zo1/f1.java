package zo1;

/* loaded from: classes3.dex */
public final class f1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474603d;

    public f1(kotlin.jvm.internal.h0 h0Var) {
        this.f474603d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "[getDeviceListAsync] user cancel current action");
        java.util.concurrent.Future future = (java.util.concurrent.Future) this.f474603d.f310123d;
        if (future != null) {
            future.cancel(true);
        }
    }
}
