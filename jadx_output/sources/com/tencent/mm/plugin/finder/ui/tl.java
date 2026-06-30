package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class tl extends com.tencent.mm.plugin.finder.feed.b9 {
    public final java.lang.String A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(int i17, com.tencent.mm.ui.MMActivity context, boolean z17) {
        super(i17, context, z17, false, false, 24, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.A = "Finder.FinderShareFeedDetailUI";
    }

    @Override // com.tencent.mm.plugin.finder.feed.b9, com.tencent.mm.plugin.finder.feed.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.ui.Presenter$buildItemCoverts$1
            private final com.tencent.mm.protobuf.g getLikeBuffer() {
                com.tencent.mm.ui.MMActivity mMActivity = com.tencent.mm.plugin.finder.ui.tl.this.f106421d;
                if (mMActivity instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) {
                    return ((com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI) mMActivity).G;
                }
                return null;
            }

            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    return new com.tencent.mm.plugin.finder.convert.df(com.tencent.mm.plugin.finder.ui.tl.this, false, 0, false, 14, null);
                }
                if (type != 4) {
                    hc2.l.a(com.tencent.mm.plugin.finder.ui.tl.this.A, type);
                    return new com.tencent.mm.plugin.finder.convert.z2();
                }
                com.tencent.mm.plugin.finder.ui.tl tlVar = com.tencent.mm.plugin.finder.ui.tl.this;
                return new com.tencent.mm.plugin.finder.convert.bh(tlVar.f106429o, tlVar, false, 0, false, 28, null);
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.feed.c0
    public java.lang.String v() {
        return this.A;
    }
}
