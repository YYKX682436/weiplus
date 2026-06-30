package dd5;

/* loaded from: classes9.dex */
public final class s extends uc5.b0 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.s f229278p = new dd5.s();

    public s() {
        super(dd5.v.f229302b.f426539a);
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.u uVar = (dd5.u) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (uVar == null) {
            return;
        }
        android.widget.TextView d17 = binding.d();
        kotlin.jvm.internal.o.f(d17, "getTitleTv(...)");
        z(d17, context, uVar.f229295a);
        android.widget.TextView b17 = binding.b();
        kotlin.jvm.internal.o.f(b17, "getDescTv(...)");
        z(b17, context, uVar.f229296b);
        java.lang.String str = uVar.f229297c;
        if (!(!r26.n0.N(str))) {
            A(context, binding, com.tencent.mm.R.raw.link_regular);
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d g17 = g1Var.g();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        mn2.h3 e17 = ya2.l.f460502a.e(str, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        com.tencent.mm.ui.chatting.history.widgets.MsgHistoryGalleryIconImageView c17 = binding.c();
        kotlin.jvm.internal.o.f(c17, "getIconIv(...)");
        g17.c(e17, c17, g1Var.h(mn2.f1.f329962p));
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.u uVar = (dd5.u) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (uVar == null) {
            return;
        }
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        ((b00.r) z2Var).pj(context, uVar.f229298d, uVar.f229299e, bw5.x8.ECS_REQ_SCENE_SEARCH);
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        w05.a aVar = (w05.a) bVar.getCustom(bVar.f432315e + 56);
        if (aVar == null) {
            return null;
        }
        java.lang.String nickname = aVar.getNickname();
        java.lang.String str = nickname == null ? "" : nickname;
        java.lang.String string = context.getString(com.tencent.mm.R.string.nsg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String k17 = aVar.k();
        java.lang.String str2 = k17 == null ? "" : k17;
        java.lang.String Q0 = f9Var.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        return new dd5.u(str, string, str2, Q0, f9Var);
    }
}
