package zi4;

/* loaded from: classes9.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.g1 f473211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.nb f473212e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(zi4.g1 g1Var, bw5.nb nbVar) {
        super(0);
        this.f473211d = g1Var;
        this.f473212e = nbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        zi4.g1 g1Var = this.f473211d;
        java.lang.ref.WeakReference weakReference = g1Var.f473181e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        bw5.nb nbVar = this.f473212e;
        java.lang.String str = nbVar.f30597e[1] ? nbVar.f30596d : "";
        if (context == null) {
            com.tencent.mars.xlog.Log.e(g1Var.f473221g, "jumpPoiPage: failed");
        } else {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 0);
            j45.l.n(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 213);
        }
        return jz5.f0.f302826a;
    }
}
