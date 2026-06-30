package lo2;

/* loaded from: classes10.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f320111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI f320112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320112e = finderMemberQAVideoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lo2.d0(this.f320112e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lo2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Throwable, java.lang.Object, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI;
        pz5.a aVar;
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy finderAutoSeekTPProxy;
        int i17;
        ?? r102;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        java.util.LinkedList<r45.mb4> mediaList2;
        r45.mb4 mb4Var2;
        pz5.a aVar2 = pz5.a.f359186d;
        int i18 = this.f320111d;
        com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI2 = this.f320112e;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f320111d = 1;
            r45.kb4 kb4Var = finderMemberQAVideoUI2.A;
            if (kb4Var != null) {
                java.util.LinkedList list = kb4Var.getList(0);
                r45.mb4 mb4Var3 = list != null ? (r45.mb4) list.getFirst() : null;
                if (mb4Var3 == null) {
                    finderAutoSeekTPProxy = null;
                } else {
                    com.tencent.mm.plugin.finder.storage.FinderItem finderItem = new com.tencent.mm.plugin.finder.storage.FinderItem();
                    finderItem.setMediaExtList(new java.util.LinkedList<>());
                    java.util.LinkedList<r45.mb4> mediaExtList = finderItem.getMediaExtList();
                    r45.kb4 kb4Var2 = finderMemberQAVideoUI2.A;
                    java.util.LinkedList list2 = kb4Var2 != null ? kb4Var2.getList(0) : null;
                    kotlin.jvm.internal.o.d(list2);
                    mediaExtList.addAll(list2);
                    com.tencent.mm.plugin.finder.storage.FeedData b17 = com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(finderItem);
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    finderAutoSeekTPProxy = new com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy(context);
                    finderAutoSeekTPProxy.setContinuePlayTimeLimitMs(600000L);
                    finderAutoSeekTPProxy.n(ds2.h.f242866a.c(finderMemberQAVideoUI2.f121403u, mb4Var3, false), true, b17);
                    finderAutoSeekTPProxy.setVideoViewFocused(true);
                    finderAutoSeekTPProxy.setLoop(true);
                }
                obj2 = finderAutoSeekTPProxy;
                finderMemberQAVideoUI = finderMemberQAVideoUI2;
                aVar = aVar2;
            } else {
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                if (b6Var != null) {
                    finderMemberQAVideoUI = finderMemberQAVideoUI2;
                    aVar = aVar2;
                    obj2 = zy2.b6.Tf(b6Var, finderMemberQAVideoUI2.f121403u, finderMemberQAVideoUI2.f121404v, 25, 600000L, null, null, null, false, null, this, com.tencent.wcdb.FileUtils.S_IRWXU, null);
                } else {
                    finderMemberQAVideoUI = finderMemberQAVideoUI2;
                    aVar = aVar2;
                    obj2 = null;
                }
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj;
            finderMemberQAVideoUI = finderMemberQAVideoUI2;
        }
        zy2.g5 g5Var = (zy2.g5) obj2;
        if (g5Var != null) {
            com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI finderMemberQAVideoUI3 = finderMemberQAVideoUI;
            finderMemberQAVideoUI3.f121408z = g5Var;
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderMemberQAVideoUI3.f121403u);
            com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView = finderMemberQAVideoUI3.f121405w;
            long j17 = 0;
            if (finderHeroSeekBarView != null) {
                finderHeroSeekBarView.setTotalTimeMs((h17 == null || (mediaList2 = h17.getMediaList()) == null || (mb4Var2 = (r45.mb4) kz5.n0.Z(mediaList2)) == null) ? 0L : mb4Var2.getLong(24));
            }
            if (h17 != null && (mediaList = h17.getMediaList()) != null && (mb4Var = (r45.mb4) kz5.n0.Z(mediaList)) != null) {
                j17 = mb4Var.getLong(24);
            }
            int i19 = com.tencent.mm.plugin.finder.member.ui.FinderMemberQAVideoUI.F;
            int i27 = j17 > ((long) 16000) ? 0 : 8;
            com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView2 = finderMemberQAVideoUI3.f121405w;
            if (finderHeroSeekBarView2 != null && finderMemberQAVideoUI3.f121406x != null && finderMemberQAVideoUI3.f121407y) {
                finderHeroSeekBarView2.setVisibility(i27);
                android.widget.ImageView imageView = finderMemberQAVideoUI3.f121406x;
                kotlin.jvm.internal.o.d(imageView);
                imageView.setVisibility(i27);
            }
            com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView3 = finderMemberQAVideoUI3.f121405w;
            if (finderHeroSeekBarView3 != null) {
                finderHeroSeekBarView3.setVideoPlayDurationProvider(new lo2.b0(finderMemberQAVideoUI3));
            }
            com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView4 = finderMemberQAVideoUI3.f121405w;
            if (finderHeroSeekBarView4 != null) {
                finderHeroSeekBarView4.setHeroSeekBarChangeListener(new lo2.c0(finderMemberQAVideoUI3, g5Var));
            }
            com.tencent.mm.pluginsdk.ui.seekbar.FinderHeroSeekBarView finderHeroSeekBarView5 = finderMemberQAVideoUI3.f121405w;
            if (finderHeroSeekBarView5 != null) {
                i17 = 1;
                finderHeroSeekBarView5.f191139u = true;
                r102 = 0;
                kotlinx.coroutines.l.d(finderHeroSeekBarView5.f191138t, null, null, new z35.y(finderHeroSeekBarView5, null), 3, null);
            } else {
                i17 = 1;
                r102 = 0;
            }
            android.widget.FrameLayout frameLayout = finderMemberQAVideoUI3.f121402t;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("videoContainer");
                throw r102;
            }
            frameLayout.addView(g5Var.getVideoView());
            g5Var.setMute(false);
            zy2.g5.u(g5Var, r102, i17, r102);
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = r102;
            if (g5Var instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
                finderThumbPlayerProxy = (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) g5Var;
            }
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
            }
            g5Var.setIMMVideoViewCallback(finderMemberQAVideoUI3);
        }
        return jz5.f0.f302826a;
    }
}
