package na2;

/* loaded from: classes2.dex */
public final class n extends com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC {
    public final java.util.List F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.F = kz5.c0.i(new na2.l(getString(com.tencent.mm.R.string.p4f), 1), new na2.l(getString(com.tencent.mm.R.string.p4c), 2));
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public void G7() {
        E7(null);
        java.util.LinkedList<r45.bo6> linkedList = new java.util.LinkedList();
        for (na2.l lVar : this.F) {
            r45.bo6 bo6Var = new r45.bo6();
            bo6Var.set(0, lVar.f335977a);
            bo6Var.set(1, java.lang.Integer.valueOf(lVar.f335978b));
            bo6Var.set(2, java.lang.Long.valueOf(getIntent().getLongExtra("topic_id", 0L)));
            linkedList.add(bo6Var);
        }
        for (r45.bo6 bo6Var2 : linkedList) {
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment I7 = I7(bo6Var2);
            if (this.f101830z == null) {
                this.f101830z = I7;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC.R6(this, K7(bo6Var2, false), I7, false, 4, null);
        }
        r7();
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment I7(r45.bo6 tagInfo) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewTabUIC", "createFragment: " + tagInfo.getString(0) + ", tabId:" + tagInfo.getInteger(1));
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment finderPostPlayFragment = new com.tencent.mm.plugin.finder.feed.ui.fragment.FinderPostPlayFragment();
        finderPostPlayFragment.f110048z = getIntent().getLongExtra("from_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            stringExtra = "";
        }
        finderPostPlayFragment.G = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("source_session_buffer");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        finderPostPlayFragment.F = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("jump_native_by_pass");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        finderPostPlayFragment.H = stringExtra3;
        finderPostPlayFragment.B = getIntent().getIntExtra("double_comment_scene", 0);
        finderPostPlayFragment.C = getIntent().getIntExtra("single_comment_scene", 0);
        finderPostPlayFragment.I = getIntent().getIntExtra("business_type", 0);
        java.lang.String stringExtra4 = getIntent().getStringExtra("cli_report_info");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        finderPostPlayFragment.f110042J = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("by_pass");
        finderPostPlayFragment.A = stringExtra5 != null ? stringExtra5 : "";
        finderPostPlayFragment.f110047y = tagInfo.getInteger(1);
        finderPostPlayFragment.f110046x = getIntent().getLongExtra("topic_id", 0L);
        if (tagInfo.getInteger(1) == 1) {
            na2.m mVar = new na2.m(finderPostPlayFragment);
            finderPostPlayFragment.K = mVar;
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader baseFinderFeedLoader = finderPostPlayFragment.f110045w;
            if (baseFinderFeedLoader != null) {
                if (baseFinderFeedLoader == null) {
                    kotlin.jvm.internal.o.o("feedLoader");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader finderPostPlayLoader = baseFinderFeedLoader instanceof com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader ? (com.tencent.mm.plugin.finder.feed.model.FinderPostPlayLoader) baseFinderFeedLoader : null;
                if (finderPostPlayLoader != null) {
                    finderPostPlayLoader.f107572t = mVar;
                }
            }
        }
        return finderPostPlayFragment;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public w92.a K7(r45.bo6 tagInfo, boolean z17) {
        kotlin.jvm.internal.o.g(tagInfo, "tagInfo");
        java.lang.String string = tagInfo.getString(0);
        if (string == null) {
            string = "";
        }
        return new w92.a(-1, string, z17, tagInfo.getInteger(1), 1);
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public int N7() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC
    public boolean Q7(r45.r03 topicInfo) {
        kotlin.jvm.internal.o.g(topicInfo, "topicInfo");
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public int w7() {
        return com.tencent.mm.R.layout.adu;
    }

    @Override // com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC, x92.m
    public boolean y7() {
        return false;
    }

    @Override // x92.q
    public void z5() {
        setNormalStyle();
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager == null) {
            return;
        }
        viewPager.setOffscreenPageLimit(1);
    }
}
