package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gb extends com.tencent.mm.plugin.finder.live.plugin.h {

    /* renamed from: s, reason: collision with root package name */
    public static final int f112669s = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl);

    /* renamed from: t, reason: collision with root package name */
    public static final int f112670t = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f112671p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f112672q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Runnable f112673r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112671p = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.db(root));
        this.f112672q = jz5.h.b(new com.tencent.mm.plugin.finder.live.plugin.fb(root));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t1(com.tencent.mm.plugin.finder.live.plugin.gb r19, com.tencent.mm.plugin.finder.live.plugin.ab r20, int r21, java.lang.String r22, boolean r23, long r24, android.view.View r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.gb.t1(com.tencent.mm.plugin.finder.live.plugin.gb, com.tencent.mm.plugin.finder.live.plugin.ab, int, java.lang.String, boolean, long, android.view.View, int, java.lang.Object):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible visible:");
        sb6.append(i17);
        sb6.append(",root.alpha:");
        android.view.ViewGroup viewGroup = this.f365323d;
        sb6.append(viewGroup.getAlpha());
        sb6.append(",isShow:");
        sb6.append(viewGroup.isShown());
        sb6.append(",root.parent:");
        sb6.append(viewGroup.getParent());
        sb6.append('!');
        com.tencent.mars.xlog.Log.e("FinderLiveBottomTipsLazyPlugin", sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mars.xlog.Log.e("FinderLiveBottomTipsLazyPlugin", "unMount!");
        java.lang.Runnable runnable = this.f112673r;
        android.view.ViewGroup viewGroup = this.f365323d;
        viewGroup.removeCallbacks(runnable);
        viewGroup.animate().setListener(new com.tencent.mm.plugin.finder.live.plugin.bb(this)).alpha(0.0f).start();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }
}
