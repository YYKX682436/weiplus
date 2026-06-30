package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0019\u0010\u001bJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGiftSendBtn;", "Landroid/widget/RelativeLayout;", "", "", "", "getReportSdkViewInfo", "Ljava/lang/Runnable;", "m", "Ljava/lang/Runnable;", "getSingleClickPagTask", "()Ljava/lang/Runnable;", "singleClickPagTask", "n", "Ljava/lang/String;", "getMCurGiftId", "()Ljava/lang/String;", "setMCurGiftId", "(Ljava/lang/String;)V", "mCurGiftId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveGiftSendBtn extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f115948d;

    /* renamed from: e, reason: collision with root package name */
    public final long f115949e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f115950f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f115951g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f115952h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f115953i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final java.lang.Runnable singleClickPagTask;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.lang.String mCurGiftId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftSendBtn(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f115948d = "FinderLiveGiftSendBtn";
        this.f115949e = 500L;
        this.f115952h = "assets://finder_live_gift_continue_click_short.pag";
        this.f115953i = "assets://finder_live_gift_single_click_short.pag";
        android.view.View.inflate(context, com.tencent.mm.R.layout.as7, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.eyb);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115950f = findViewById;
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.ey_);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        ((com.tencent.mm.view.MMPAGView) findViewById2).o(ae2.in.f3688a.a(ym5.f6.R1));
        kotlin.jvm.internal.o.f(findViewById2, "apply(...)");
        this.f115951g = (com.tencent.mm.view.MMPAGView) findViewById2;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "finder_live_room_gift_again");
        this.singleClickPagTask = new com.tencent.mm.plugin.finder.live.view.p5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.String, java.lang.Object> getReportSdkViewInfo() {
        return kz5.c1.l(new jz5.l("live_gift_id", this.mCurGiftId));
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f115948d, "resetSendAgainPagPath " + str);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f115951g;
        if (kotlin.jvm.internal.o.b(mMPAGView.getPath(), str)) {
            return;
        }
        mMPAGView.setPath(str);
    }

    public final void c(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f115948d, "showContinueClickSendAgaim longClick:" + z17);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f115951g;
        java.lang.String path = mMPAGView.getPath();
        java.lang.String str = this.f115952h;
        if (!kotlin.jvm.internal.o.b(path, str)) {
            if (mMPAGView.f()) {
                mMPAGView.n();
            }
            b(str);
            mMPAGView.setRepeatCount(1);
        }
        mMPAGView.setProgress(0.0d);
        mMPAGView.g();
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_gift_send_again", this.f115950f, getReportSdkViewInfo(), 25561);
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i(this.f115948d, "showSingleClickSendAgian");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f115951g;
        java.lang.String path = mMPAGView.getPath();
        java.lang.String str = this.f115953i;
        if (!kotlin.jvm.internal.o.b(path, str)) {
            if (mMPAGView.f()) {
                mMPAGView.n();
            }
            b(str);
            mMPAGView.setRepeatCount(-1);
            mMPAGView.setProgress(0.0d);
        }
        if (mMPAGView.f()) {
            return;
        }
        mMPAGView.g();
    }

    public final java.lang.String getMCurGiftId() {
        return this.mCurGiftId;
    }

    public final java.lang.Runnable getSingleClickPagTask() {
        return this.singleClickPagTask;
    }

    public final void setMCurGiftId(java.lang.String str) {
        this.mCurGiftId = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveGiftSendBtn(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
