package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderMsgFeedDetailUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderBaseFeedUI;", "Lcom/tencent/mm/plugin/finder/feed/c9;", "Lcom/tencent/mm/plugin/finder/feed/b9;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMsgFeedDetailUI extends com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI<com.tencent.mm.plugin.finder.feed.c9, com.tencent.mm.plugin.finder.feed.b9> {
    public boolean C;
    public boolean D;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed E;
    public boolean I;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.b9 f128636v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.c9 f128637w;

    /* renamed from: x, reason: collision with root package name */
    public long f128638x;

    /* renamed from: y, reason: collision with root package name */
    public int f128639y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f128640z;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f128635u = "Finder.FinderMsgFeedDetailUI";
    public long A = -1;
    public int B = -1;
    public final jz5.g F = jz5.h.b(new com.tencent.mm.plugin.finder.ui.nb(this));
    public final jz5.g G = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fb(this));
    public final com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI$feedDeleteListener$1 H = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>() { // from class: com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI$feedDeleteListener$1
        {
            super(com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI.this);
            this.__eventId = -108499199;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
            com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
            kotlin.jvm.internal.o.g(event, "event");
            pm0.v.X(new com.tencent.mm.plugin.finder.ui.eb(event, com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI.this));
            return false;
        }
    };

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        int intExtra = getIntent().getIntExtra("from_scene", 2);
        if (intExtra == 350) {
            return intExtra;
        }
        return intExtra == 1 ? 7 : 5;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public com.tencent.mm.plugin.finder.feed.c0 c7() {
        com.tencent.mm.plugin.finder.feed.b9 b9Var = this.f128636v;
        if (b9Var != null) {
            return b9Var;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public com.tencent.mm.plugin.finder.feed.i0 d7() {
        com.tencent.mm.plugin.finder.feed.c9 c9Var = this.f128637w;
        if (c9Var != null) {
            return c9Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    public void e7() {
        setMMTitle(com.tencent.mm.R.string.f8e);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f483315aa4);
        if (weImageView != null) {
            weImageView.setIconColor(getResources().getColor(com.tencent.mm.R.color.f479252u4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f7() {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI.f7():void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b3h;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set W0 = kz5.n0.W0(super.importUIComponents());
        W0.add(hy2.f.class);
        return W0;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.finder.feed.c9 c9Var = this.f128637w;
        if (c9Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (!c9Var.l().q()) {
            super.onBackPressed();
            return;
        }
        com.tencent.mm.plugin.finder.feed.c9 c9Var2 = this.f128637w;
        if (c9Var2 != null) {
            c9Var2.l().u();
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderMsgFeedDetailUI)).Rj(this, iy1.a.Finder);
        this.I = false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dead();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0116, code lost:
    
        if ((r2 != null && r2.getInteger(2) == 3) != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0237  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI.onResume():void");
    }
}
