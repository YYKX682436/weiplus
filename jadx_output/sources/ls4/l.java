package ls4;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f321077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ls4.u uVar) {
        super(1);
        this.f321077d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ns4.c0 it = (ns4.c0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        ls4.u uVar = this.f321077d;
        ns4.c0 c0Var = uVar.f321102c;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("consumePanel");
            throw null;
        }
        c0Var.f339464c.q();
        pr4.l lVar = uVar.f321100a;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new ns4.f0(lVar.f358031l, lVar.f358021b).f339518a;
        y1Var.f212037s = new ls4.k(uVar);
        y1Var.s();
        return jz5.f0.f302826a;
    }
}
