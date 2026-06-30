package ox2;

/* loaded from: classes2.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f349696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f349697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f349698f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f349699g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f349700h;

    public o0(in5.s0 s0Var, long j17, com.tencent.mm.plugin.finder.convert.qe qeVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, r45.ri0 ri0Var) {
        this.f349696d = s0Var;
        this.f349697e = j17;
        this.f349698f = qeVar;
        this.f349699g = baseFinderFeed;
        this.f349700h = ri0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        in5.s0 s0Var = this.f349696d;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = null;
        if (s0Var.itemView.getTag(com.tencent.mm.R.id.tbw) == this) {
            s0Var.itemView.setTag(com.tencent.mm.R.id.tbw, null);
        }
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        long j17 = this.f349697e;
        boolean z17 = false;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && feedObject.getId() == j17) {
            z17 = true;
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "preloadCenterInteractionEasterEggEmoji: feedId不匹配，跳过绑定");
            return;
        }
        java.lang.String w17 = this.f349699g.w();
        r45.ri0 ri0Var = this.f349700h;
        if (ri0Var != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            iEmojiInfo = ((com.tencent.mm.feature.emoji.t2) ((com.tencent.mm.feature.emoji.api.n6) c17)).Di(ri0Var);
        }
        com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "onBindFeed: " + j17);
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = (com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg) s0Var.p(com.tencent.mm.R.id.tfm);
        if (centerInteractionEasterEgg == null) {
            if (iEmojiInfo == null) {
                return;
            }
            centerInteractionEasterEgg = ox2.p0.a(this.f349698f, s0Var);
            com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "onBindFeed:easterEggContainer==null call getEasterEggCenter");
        }
        if (centerInteractionEasterEgg != null) {
            centerInteractionEasterEgg.e(j17, w17, iEmojiInfo);
            centerInteractionEasterEgg.setVisibility(8);
        }
    }
}
