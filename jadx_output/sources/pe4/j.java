package pe4;

/* loaded from: classes15.dex */
public class j implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe4.m f353704d;

    public j(pe4.m mVar) {
        this.f353704d = mVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth");
        pe4.m mVar = this.f353704d;
        if (mVar.f353720d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        } else {
            mVar.a();
            mVar.f353720d.obtainMessage(1, mVar.f353718b).sendToTarget();
        }
    }
}
