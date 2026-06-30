package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f199472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f199473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f199474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.u3 f199475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f199476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(r45.nw1 nw1Var, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.chatting.component.u3 u3Var, kotlin.jvm.internal.h0 h0Var2) {
        super(0);
        this.f199472d = nw1Var;
        this.f199473e = f0Var;
        this.f199474f = h0Var;
        this.f199475g = u3Var;
        this.f199476h = h0Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", "onLiveFinish: update end ui, liveId=" + this.f199472d.getLong(0) + ", autoPlayIndex=" + this.f199473e.f310116d + ", feedId=" + pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) this.f199474f.f310123d).getId()));
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        vd2.j2 j2Var = vd2.j2.f435772a;
        vd2.j2.f435773b.clear();
        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f199476h.f310123d);
        j2Var.a(linkedList);
        this.f199475g.o0(true);
        return jz5.f0.f302826a;
    }
}
