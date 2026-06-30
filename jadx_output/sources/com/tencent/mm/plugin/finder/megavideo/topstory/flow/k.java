package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.util.ArrayList data, boolean z17, final com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar) {
        super(new in5.s() { // from class: com.tencent.mm.plugin.finder.megavideo.topstory.flow.MegaVideoAdapter$Companion$defaultItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 4) {
                    return new yn2.m(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e.this);
                }
                switch (type) {
                    case 11000:
                        return new yn2.n();
                    case 11001:
                        return new yn2.r(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e.this);
                    case 11002:
                        return new yn2.u(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e.this);
                    case 11003:
                        return new bo2.b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.e.this);
                    default:
                        hc2.l.a("Finder.MegaVideo.MegaVideoAdapter", type);
                        return new com.tencent.mm.plugin.finder.convert.z2();
                }
            }
        }, data, z17);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // in5.n0
    public java.lang.String k0(java.lang.Exception e17, androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(e17, "e");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return j5Var.toString();
        }
        return "Feed[" + j5Var + "] is not BaseFinderFeed";
    }

    @Override // in5.n0
    public java.lang.String l0(java.lang.Exception e17, int i17) {
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.e("Finder.MegaVideo.MegaVideoAdapter", java.lang.String.valueOf(e17.getMessage()));
        return super.l0(e17, i17);
    }
}
