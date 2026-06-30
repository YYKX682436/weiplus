package qd1;

/* loaded from: classes7.dex */
public class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.k0 f361659d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.j f361660e;

    public l(qd1.j jVar, com.tencent.mm.plugin.appbrand.widget.k0 k0Var) {
        this.f361660e = jVar;
        this.f361659d = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.FALSE);
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        dialogInterface.dismiss();
        qd1.j jVar = this.f361660e;
        this.f361659d.f91748b.remove(jVar.f361647n);
        jVar.f361640d.a(jVar.f361648o, jVar.f361654u.p("ok", hashMap));
    }
}
