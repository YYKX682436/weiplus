package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class fr implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.LiveMarqueeTextView f132126d;

    public fr(com.tencent.mm.plugin.finder.view.LiveMarqueeTextView liveMarqueeTextView) {
        this.f132126d = liveMarqueeTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.LiveMarqueeTextView.a(this.f132126d);
    }
}
