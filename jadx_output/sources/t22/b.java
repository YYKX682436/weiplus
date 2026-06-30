package t22;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f415077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t22.e f415078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.p64 p64Var, t22.e eVar, java.lang.String str) {
        super(0);
        this.f415077d = p64Var;
        this.f415078e = eVar;
        this.f415079f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.p64 p64Var = this.f415077d;
        t22.e eVar = this.f415078e;
        if (p64Var != null) {
            eVar.f415086d.dismiss();
            o22.i.d(eVar.f415083a, null, 1111, 0, this.f415079f, "");
            eVar.f415084b.a(false);
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(eVar.f415083a);
            android.content.Context context = eVar.f415083a;
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.jjz));
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.f490507x1));
            u1Var.l(new t22.a(eVar));
            u1Var.q(false);
        }
        return jz5.f0.f302826a;
    }
}
