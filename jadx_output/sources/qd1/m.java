package qd1;

/* loaded from: classes7.dex */
public class m implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.k0 f361661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.j f361662e;

    public m(qd1.j jVar, com.tencent.mm.plugin.appbrand.widget.k0 k0Var) {
        this.f361662e = jVar;
        this.f361661d = k0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.FALSE);
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        qd1.j jVar = this.f361662e;
        this.f361661d.f91748b.remove(jVar.f361647n);
        jVar.f361640d.a(jVar.f361648o, jVar.f361654u.p("ok", hashMap));
    }
}
