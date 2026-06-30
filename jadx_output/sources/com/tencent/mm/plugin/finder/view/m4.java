package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132630d;

    public m4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        this.f132630d = finderColumnFrameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f132630d.getColumnFeedSelectorAdapter().d(false);
    }
}
