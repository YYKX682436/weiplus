package vq;

/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439154d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        java.util.LinkedList NewConfigList = p05.p3.f350642d.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
        java.lang.String g07 = kz5.n0.g0(NewConfigList, "\n\n", null, null, 0, null, p05.i3.f350551d, 30, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("----------cgiInfo----------\n");
        sb6.append(g07);
        sb6.append("\n\n\n----------localInfo----------\n");
        java.util.LinkedList NewConfigList2 = p05.p3.f350641c.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList2, "NewConfigList");
        sb6.append(kz5.n0.g0(NewConfigList2, "\n\n", null, null, 0, null, p05.h3.f350537d, 30, null));
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f439154d);
        u1Var.g(sb7);
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
