package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t6 f151345d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(com.tencent.mm.plugin.mv.ui.uic.t6 t6Var) {
        super(0);
        this.f151345d = t6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.mv.ui.uic.t6 t6Var = this.f151345d;
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvPreviewTrackUIC$adapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                com.tencent.mm.plugin.mv.ui.uic.t6 t6Var2 = com.tencent.mm.plugin.mv.ui.uic.t6.this;
                return new com.tencent.mm.plugin.mv.ui.uic.n6(t6Var2, t6Var2);
            }
        }, t6Var.f151460e, false);
    }
}
