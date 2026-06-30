package com.tencent.mm.plugin.finder.live.controller.screenshotshare.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView;", "Landroid/widget/RelativeLayout;", "", "getViewId", "()I", "viewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class ShellView extends android.widget.RelativeLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f111617i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView f111618d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f111619e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f111620f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f111621g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController f111622h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShellView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r8, kotlin.coroutines.Continuation r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof xf2.t
            if (r0 == 0) goto L16
            r0 = r9
            xf2.t r0 = (xf2.t) r0
            int r1 = r0.f454304i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f454304i = r1
            goto L1b
        L16:
            xf2.t r0 = new xf2.t
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f454302g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f454304i
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r8 = r0.f454301f
            kotlin.jvm.internal.c0 r8 = (kotlin.jvm.internal.c0) r8
            java.lang.Object r1 = r0.f454300e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f454299d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r0 = (com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L8c
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            java.lang.Object r8 = r0.f454299d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r8 = (com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5c
        L4a:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView r9 = r8.f111618d
            if (r9 == 0) goto La9
            r0.f454299d = r8
            r0.f454304i = r5
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L5c
            goto La8
        L5c:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto La6
            java.lang.Class<c61.yb> r2 = c61.yb.class
            i95.m r2 = i95.n0.c(r2)
            c61.yb r2 = (c61.yb) r2
            c61.p2 r2 = (c61.p2) r2
            java.lang.String r2 = r2.fj()
            kotlin.jvm.internal.c0 r5 = new kotlin.jvm.internal.c0
            r5.<init>()
            kotlinx.coroutines.p0 r6 = kotlinx.coroutines.q1.f310570c
            xf2.u r7 = new xf2.u
            r7.<init>(r5, r9, r2, r3)
            r0.f454299d = r8
            r0.f454300e = r2
            r0.f454301f = r5
            r0.f454304i = r4
            java.lang.Object r9 = kotlinx.coroutines.l.g(r6, r7, r0)
            if (r9 != r1) goto L89
            goto La8
        L89:
            r0 = r8
            r1 = r2
            r8 = r5
        L8c:
            boolean r8 = r8.f310112d
            if (r8 == 0) goto La6
            java.lang.Class<zb0.b0> r8 = zb0.b0.class
            i95.m r8 = i95.n0.c(r8)
            zb0.b0 r8 = (zb0.b0) r8
            android.content.Context r9 = r0.getContext()
            xf2.v r2 = new xf2.v
            r2.<init>(r0)
            yb0.g r8 = (yb0.g) r8
            r8.wi(r9, r1, r2)
        La6:
            jz5.f0 r1 = jz5.f0.f302826a
        La8:
            return r1
        La9:
            java.lang.String r8 = "screenShotView"
            kotlin.jvm.internal.o.o(r8)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.a(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.b(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController c17, boolean z17) {
        kotlin.jvm.internal.o.g(c17, "c");
        this.f111622h = c17;
        android.view.View inflate = android.view.View.inflate(getContext(), getViewId(), this);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.mbt);
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView screenShotView = (com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView) findViewById;
        screenShotView.setLandscape(z17);
        screenShotView.setOnClickListener(xf2.o.f454292d);
        kotlin.jvm.internal.o.f(findViewById, "also(...)");
        this.f111618d = (com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.mtc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f111619e = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.mtd);
        findViewById3.setOnClickListener(new xf2.q(this));
        this.f111620f = findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.mte);
        findViewById4.setOnClickListener(new xf2.s(this));
        this.f111621g = findViewById4;
    }

    public abstract int getViewId();
}
