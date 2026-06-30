package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class zc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter f133459d;

    public zc(com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter) {
        this.f133459d = finderLiveBubbleLayoutCompatSlideEnter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderLiveBubbleLayoutCompatSlideEnter finderLiveBubbleLayoutCompatSlideEnter = this.f133459d;
        uc2.i iVar = finderLiveBubbleLayoutCompatSlideEnter.B;
        if (iVar != null) {
            android.view.View findViewById = finderLiveBubbleLayoutCompatSlideEnter.findViewById(com.tencent.mm.R.id.fs6);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            ((sb2.o) iVar).Y6(findViewById, new android.content.Intent());
        }
    }
}
