package pe4;

/* loaded from: classes15.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe4.m f353703d;

    public i(pe4.m mVar) {
        this.f353703d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth by click button");
        pe4.m mVar = this.f353703d;
        gu5.c cVar = mVar.f353709k;
        if (cVar != null) {
            zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
            if (cVar.f275961a.isCanceled()) {
                zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
            } else {
                ju5.o.a().c(new gu5.a(cVar));
                ju5.o a17 = ju5.o.a();
                a17.f302136b.postDelayed(new gu5.b(cVar), 350L);
            }
        }
        if (mVar.f353720d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
        } else {
            mVar.a();
            mVar.f353720d.obtainMessage(1, mVar.f353718b).sendToTarget();
        }
    }
}
