package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class hr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LiveMarqueeTextView f132272d;

    public hr(com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView) {
        this.f132272d = liveMarqueeTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.LiveMarqueeTextView.a(this.f132272d);
    }
}
