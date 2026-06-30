package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes8.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f130313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f130315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f130316g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f130317h;

    public n0(android.view.View view, com.tencent.mm.plugin.finder.uniComments.o0 o0Var, boolean z17, boolean z18, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f130313d = view;
        this.f130314e = o0Var;
        this.f130315f = z17;
        this.f130316g = z18;
        this.f130317h = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        int[] iArr = new int[2];
        android.view.View view = this.f130313d;
        view.getLocationOnScreen(iArr);
        int i18 = iArr[1];
        int[] iArr2 = new int[2];
        com.tencent.mm.plugin.finder.uniComments.a2 a2Var = this.f130314e.f130330o;
        android.widget.FrameLayout g17 = a2Var != null ? a2Var.g() : null;
        kotlin.jvm.internal.o.d(g17);
        g17.getLocationOnScreen(iArr2);
        int i19 = iArr2[1];
        if (this.f130315f) {
            i17 = -(this.f130316g ? com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl) : com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
        } else {
            i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        }
        int i27 = i19 - i18;
        int height = (view.getHeight() + i27) - i17;
        if (height > 0) {
            height = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479732dp) + (i27 - i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCommentDrawerPresenter", "transToDiscoverComment: targetY:" + height + " headerLayoutBottomY:" + i19 + " viewTopY:" + i18 + " view.height:" + view.getHeight() + " margin:" + i17 + ' ');
        if (height < 0) {
            this.f130317h.smoothScrollBy(0, -height);
        }
    }
}
