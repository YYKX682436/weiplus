package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout f115500d;

    public f0(com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout finderLivePushReplaceLayout) {
        this.f115500d = finderLivePushReplaceLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout finderLivePushReplaceLayout = this.f115500d;
        if (finderLivePushReplaceLayout.getChildCount() > 1) {
            finderLivePushReplaceLayout.removeViewAt(0);
        }
    }
}
