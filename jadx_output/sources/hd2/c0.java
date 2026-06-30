package hd2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rm0.j f280464e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, rm0.j jVar) {
        super(0);
        this.f280463d = context;
        this.f280464e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context it = this.f280463d;
        kotlin.jvm.internal.o.f(it, "$it");
        pf5.z zVar = pf5.z.f353948a;
        if (!(it instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sr2.l5 l5Var = (sr2.l5) zVar.a((androidx.appcompat.app.AppCompatActivity) it).a(sr2.l5.class);
        rm0.j jVar = this.f280464e;
        l5Var.onSceneEnd(jVar.f397424e, jVar.f397425f, jVar.f397426g, null);
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(it);
        e4Var.d(com.tencent.mm.R.string.exk);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}
