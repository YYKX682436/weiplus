package dw3;

/* loaded from: classes10.dex */
public final class t0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f244278d;

    public t0(yz5.l lVar) {
        this.f244278d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.l lVar = this.f244278d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        dw3.u0.a(dw3.u0.f244283a, -2 == i17 ? 2 : 3);
    }
}
