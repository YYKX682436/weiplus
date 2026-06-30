package com.tencent.mm.plugin.finder.live.plugin;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin;", "Landroid/widget/RelativeLayout;", "Lr45/of1;", "aliasInfo", "Ljz5/f0;", "setVisitorRole", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderVisitorRoleChooserPlugin extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.LiveBottomSheetPanel f111768e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f111769f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f111770g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f111771h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f111772i;

    /* renamed from: m, reason: collision with root package name */
    public bm2.h8 f111773m;

    public FinderVisitorRoleChooserPlugin(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "FinderLiveVisitorRoleChooserPlugin";
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisitorRole(r45.of1 of1Var) {
        int integer = of1Var.getInteger(2);
        int integer2 = g92.b.f269769e.k2().getInteger(4);
        com.tencent.mars.xlog.Log.i(this.TAG, "setVisitorRole chooseType:" + integer + ", curRoleType:" + integer2);
        if (integer != integer2) {
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            new ke2.m0(xy2.c.e(context), integer, null, null, new com.tencent.mm.plugin.finder.live.plugin.ao0(this, integer), 12, null).l();
        }
        yz5.l lVar = this.f111771h;
        if (lVar != null) {
            b(false);
            lVar.invoke(java.lang.Integer.valueOf(integer));
            this.f111771h = null;
        }
    }

    public final void b(boolean z17) {
        android.content.Context context;
        java.lang.Integer num;
        if (!z17) {
            android.content.Context context2 = getContext();
            context = context2 instanceof android.app.Activity ? context2 : null;
            if (context == null || (num = this.f111772i) == null) {
                return;
            }
            int intValue = num.intValue();
            android.view.Window window = ((android.app.Activity) context).getWindow();
            kotlin.jvm.internal.o.f(window, "getWindow(...)");
            window.setStatusBarColor(intValue);
            return;
        }
        android.content.Context context3 = getContext();
        context = context3 instanceof android.app.Activity ? context3 : null;
        if (context != null) {
            android.view.Window window2 = ((android.app.Activity) context).getWindow();
            kotlin.jvm.internal.o.f(window2, "getWindow(...)");
            if (com.tencent.mm.ui.bk.C()) {
                window2.setStatusBarColor(android.graphics.Color.parseColor("#05FFFFFF"));
            } else {
                window2.setStatusBarColor(android.graphics.Color.parseColor("#05000000"));
            }
        }
    }

    public final void c() {
        setId(com.tencent.mm.R.id.f484438ea4);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b1a, this);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) inflate.findViewById(com.tencent.mm.R.id.p4a);
        this.f111768e = liveBottomSheetPanel;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(inflate.getContext()).y);
            liveBottomSheetPanel.setOnVisibilityListener(com.tencent.mm.plugin.finder.live.plugin.bo0.f112063d);
        }
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.asv);
        this.f111769f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.co0(this));
        }
        this.f111770g = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.p4b);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b5w);
        if (textView != null) {
            textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.do0(this));
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.tencent.mm.ui.bl.c(textView.getContext());
            }
        }
        bm2.h8 h8Var = new bm2.h8();
        this.f111773m = h8Var;
        h8Var.f21951d = new com.tencent.mm.plugin.finder.live.plugin.eo0(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f111770g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.f111773m);
        }
        android.content.Context context = getContext();
        if (!(context instanceof android.app.Activity)) {
            context = null;
        }
        this.f111772i = context != null ? java.lang.Integer.valueOf(((android.app.Activity) context).getWindow().getStatusBarColor()) : null;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    public FinderVisitorRoleChooserPlugin(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.TAG = "FinderLiveVisitorRoleChooserPlugin";
        c();
    }
}
