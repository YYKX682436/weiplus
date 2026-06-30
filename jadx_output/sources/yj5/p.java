package yj5;

/* loaded from: classes8.dex */
public final class p extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f462724f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.u9 f462725g = new com.tencent.mm.ui.u9();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.s9 f462726h = new yj5.m(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454891p;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        java.util.LinkedList<oo0.a> D0 = ((oo0.e) ((v80.k) ((w80.i) i95.n0.c(w80.i.class))).wi()).D0(talkerInfo.f460742a);
        if (D0.size() <= 0) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (oo0.a aVar : D0) {
            kotlin.jvm.internal.o.d(aVar);
            linkedList.add(new xj5.f(aVar));
        }
        this.f462724f = D0;
        return linkedList;
    }

    @Override // yj5.a
    public void n0() {
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.p(ui6, tipsBarContext, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        this.f462725g.f211074a = this.f198580d.x();
        com.tencent.mm.ui.s9 s9Var = this.f462726h;
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        if (hashSet != null) {
            hashSet.add(s9Var);
        }
        pm0.v.O("LiveTipsBarProcessor", new yj5.o(this));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mm.ui.s9 s9Var = this.f462726h;
        java.util.HashSet hashSet = com.tencent.mm.ui.u9.f211073d;
        if (hashSet != null) {
            hashSet.remove(s9Var);
        }
        pm0.v.O("LiveTipsBarProcessor", new yj5.n(this));
    }
}
