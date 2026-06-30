package qd1;

/* loaded from: classes7.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b f361656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.k0 f361657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qd1.j f361658f;

    public k(qd1.j jVar, fl1.b bVar, com.tencent.mm.plugin.appbrand.widget.k0 k0Var) {
        this.f361658f = jVar;
        this.f361656d = bVar;
        this.f361657e = k0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.TRUE);
        hashMap.put("cancel", java.lang.Boolean.FALSE);
        qd1.j jVar = this.f361658f;
        if (jVar.f361645i) {
            hashMap.put("content", this.f361656d.h());
        }
        this.f361657e.f91748b.remove(jVar.f361647n);
        jVar.f361640d.a(jVar.f361648o, jVar.f361654u.p("ok", hashMap));
    }
}
