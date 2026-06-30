package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¨\u0006\u0010"}, d2 = {"com/tencent/mm/plugin/finder/ui/ShareRelPresenter$buildItemCoverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lin5/s0;", "holder", "position", "Ljz5/f0;", "addListener", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", "item", "Lr45/nv2;", "shareUserInfo", "refreshThankForwardButton", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ShareRelPresenter$buildItemCoverts$1 implements in5.s {
    private byte _hellAccFlag_;
    final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm this$0;

    public ShareRelPresenter$buildItemCoverts$1(com.tencent.mm.plugin.finder.ui.qm qmVar) {
        this.this$0 = qmVar;
    }

    public final void addListener(final in5.s0 holder, final int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (holder.itemView.getTag(com.tencent.mm.R.id.g2e) != null) {
            return;
        }
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        final com.tencent.mm.plugin.finder.ui.qm qmVar = this.this$0;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderShareGuideShowEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderShareGuideShowEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1$addListener$1
            {
                this.__eventId = -1456508534;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderShareGuideShowEvent finderShareGuideShowEvent) {
                com.tencent.mm.autogen.events.FinderShareGuideShowEvent event = finderShareGuideShowEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.dd ddVar = event.f54324g;
                if (ddVar != null) {
                    if (i17 == ddVar.f6443a) {
                        com.tencent.mars.xlog.Log.i(qmVar.f129749x0, "type:" + ddVar.f6444b + " position:" + ddVar.f6443a);
                        in5.s0 s0Var = holder;
                        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
                        if (ddVar.f6444b == 1) {
                            if (finderVideoLayout != null) {
                                cw2.v9.j(finderVideoLayout, false, 1, null);
                            }
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.g2r);
                            if (frameLayout != null) {
                                frameLayout.setVisibility(0);
                            }
                        } else {
                            if (finderVideoLayout != null) {
                                cw2.v9.n(finderVideoLayout, 0, null, null, 7, null);
                            }
                            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.g2r);
                            if (frameLayout2 != null) {
                                frameLayout2.setVisibility(8);
                            }
                        }
                    }
                }
                return true;
            }
        };
        holder.itemView.setTag(com.tencent.mm.R.id.g2e, iListener);
        this.this$0.f129746l1.add(iListener);
        iListener.alive();
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == 2016) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = this.this$0.f106570t;
            kotlin.jvm.internal.o.e(baseFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader");
            java.util.List list = ((com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader) baseFeedLoader).Q;
            com.tencent.mm.ui.MMActivity context = this.this$0.f106421d;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            return new com.tencent.mm.plugin.finder.convert.wr(nyVar != null ? nyVar.V6() : null, this.this$0.f106427m, list);
        }
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.this$0;
        qmVar.getClass();
        in5.r itemConvert = new com.tencent.mm.plugin.finder.feed.FinderLoaderFeedUIContract$Presenter$buildItemCoverts$1(qmVar).getItemConvert(type);
        if (itemConvert instanceof com.tencent.mm.plugin.finder.convert.bh) {
            com.tencent.mm.plugin.finder.ui.qm qmVar2 = this.this$0;
            return new com.tencent.mm.plugin.finder.ui.fm(this.this$0, this, qmVar2.f106429o, qmVar2.f109047z, qmVar2.f106427m);
        }
        if (!(itemConvert instanceof com.tencent.mm.plugin.finder.convert.df)) {
            return itemConvert;
        }
        com.tencent.mm.plugin.finder.ui.qm qmVar3 = this.this$0;
        return new com.tencent.mm.plugin.finder.ui.gm(this.this$0, qmVar3.f109047z, qmVar3.f106427m);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void refreshThankForwardButton(in5.s0 r40, com.tencent.mm.plugin.finder.model.BaseFinderFeed r41, r45.nv2 r42) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.ShareRelPresenter$buildItemCoverts$1.refreshThankForwardButton(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, r45.nv2):void");
    }
}
