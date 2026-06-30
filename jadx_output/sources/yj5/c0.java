package yj5;

/* loaded from: classes5.dex */
public final class c0 extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f462708f = "TopMsg.TopMsgTipsBarProcessor";

    /* renamed from: g, reason: collision with root package name */
    public final o75.a f462709g = new yj5.b0(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454887i;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        ak5.g0 g0Var = (ak5.g0) ((com.tencent.mm.plugin.appbrand.service.c6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.c6.class));
        java.lang.String str = talkerInfo.f460742a;
        java.util.List<com.tencent.mm.storage.db> Ri = g0Var.Ri(str);
        if (((java.util.LinkedList) Ri).size() <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (com.tencent.mm.storage.db dbVar : Ri) {
            if (!dbVar.v0()) {
                com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, dbVar.w0().f372605f);
                if (o27 != null) {
                    linkedList.add(new xj5.n(dbVar, o27));
                }
            }
        }
        return linkedList;
    }

    @Override // yj5.a
    public void n0() {
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.e0(ui6, tipsBarContext, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        dm.kb.f238124t.observe(this.f198580d.f460717l, this.f462709g);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        dm.kb.f238124t.removeObserver(this.f462709g);
    }
}
