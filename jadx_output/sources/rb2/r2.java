package rb2;

/* loaded from: classes10.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393742d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(in5.s0 s0Var) {
        super(1);
        this.f393742d = s0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.jb4 it = (r45.jb4) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        in5.s0 s0Var = this.f393742d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.bj(context, s0Var.getAdapterPosition(), (r45.my0) it.getCustom(2));
        return jz5.f0.f302826a;
    }
}
