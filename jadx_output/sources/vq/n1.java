package vq;

/* loaded from: classes5.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439199d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f350688a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UDR Project Id: ilinkres_c42c04f5");
        com.tencent.wechat.aff.udr.w Zi = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Zi("ilinkres_c42c04f5");
        if (Zi != null && (linkedList = Zi.f217586d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                com.tencent.wechat.aff.udr.x xVar = (com.tencent.wechat.aff.udr.x) it.next();
                sb6.append("\n\n");
                sb6.append(xVar.getName());
                sb6.append("\n版本：");
                sb6.append(xVar.f217590e);
                sb6.append("\n大小：");
                long j17 = xVar.f217593h;
                if (j17 > 1000000) {
                    sb6.append(j17 / 1000000.0d);
                    sb6.append("MB");
                } else {
                    sb6.append(j17 / 1000.0d);
                    sb6.append("KB");
                }
                sb6.append("\n路径：");
                sb6.append(xVar.K[20] ? xVar.f217608z : "");
            }
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f439199d);
        u1Var.g(sb7);
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
