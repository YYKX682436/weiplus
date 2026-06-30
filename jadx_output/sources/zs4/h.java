package zs4;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f475291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zs4.q f475292e;

    public h(zs4.q qVar, int i17) {
        this.f475292e = qVar;
        this.f475291d = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.r0(2, 1, com.tencent.mm.sdk.platformtools.t8.i1(), this.f475291d);
        zs4.q qVar = this.f475292e;
        java.lang.ref.WeakReference weakReference = qVar.f475314f;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.a(385, qVar);
        qVar.getClass();
        ((np5.e) qVar.f475314f.get()).a(new ys4.d(-1), true);
    }
}
