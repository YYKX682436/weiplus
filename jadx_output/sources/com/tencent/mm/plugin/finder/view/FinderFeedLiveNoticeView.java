package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B%\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010)R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006*"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedLiveNoticeView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", "h", "Lyz5/l;", "getClickBtnCall", "()Lyz5/l;", "setClickBtnCall", "(Lyz5/l;)V", "clickBtnCall", "Lkotlin/Function0;", "i", "Lyz5/a;", "getClickCardCall", "()Lyz5/a;", "setClickCardCall", "(Lyz5/a;)V", "clickCardCall", "m", "getOnNoticeDoNotShowClicked", "setOnNoticeDoNotShowClicked", "onNoticeDoNotShowClicked", "n", "Z", "isNeedShowNoticeNotShowBtn", "()Z", "setNeedShowNoticeNotShowBtn", "(Z)V", "o", "isAutoCloseAfterSubscribe", "setAutoCloseAfterSubscribe", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderFeedLiveNoticeView extends android.widget.LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f131083q = 0;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f131084d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f131085e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f131086f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f131087g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l clickBtnCall;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public yz5.a clickCardCall;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.a onNoticeDoNotShowClicked;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isNeedShowNoticeNotShowBtn;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean isAutoCloseAfterSubscribe;

    /* renamed from: p, reason: collision with root package name */
    public long f131093p;

    public FinderFeedLiveNoticeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f131084d = kotlinx.coroutines.z0.b();
        this.f131086f = "Finder.FinderFeedLiveNoticeView";
        setOrientation(0);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ahy, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131087g = inflate;
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.view.r9(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView r42) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView.a(com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.content.Context r30, r45.h32 r31, java.lang.String r32, boolean r33, java.lang.Long r34, java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView.b(android.content.Context, r45.h32, java.lang.String, boolean, java.lang.Long, java.lang.String):void");
    }

    public final yz5.l getClickBtnCall() {
        return this.clickBtnCall;
    }

    public final yz5.a getClickCardCall() {
        return this.clickCardCall;
    }

    public final yz5.a getOnNoticeDoNotShowClicked() {
        return this.onNoticeDoNotShowClicked;
    }

    public final void setAutoCloseAfterSubscribe(boolean z17) {
        this.isAutoCloseAfterSubscribe = z17;
    }

    public final void setClickBtnCall(yz5.l lVar) {
        this.clickBtnCall = lVar;
    }

    public final void setClickCardCall(yz5.a aVar) {
        this.clickCardCall = aVar;
    }

    public final void setNeedShowNoticeNotShowBtn(boolean z17) {
        this.isNeedShowNoticeNotShowBtn = z17;
    }

    public final void setOnNoticeDoNotShowClicked(yz5.a aVar) {
        this.onNoticeDoNotShowClicked = aVar;
    }

    public FinderFeedLiveNoticeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f131084d = kotlinx.coroutines.z0.b();
        this.f131086f = "Finder.FinderFeedLiveNoticeView";
        setOrientation(0);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ahy, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f131087g = inflate;
        inflate.setOnClickListener(new com.tencent.mm.plugin.finder.view.r9(this));
    }
}
