package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes8.dex */
public final class b implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f200797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout f200798b;

    public b(java.util.concurrent.atomic.AtomicInteger atomicInteger, com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout activityPullDownCloseLayout) {
        this.f200797a = atomicInteger;
        this.f200798b = activityPullDownCloseLayout;
    }

    @Override // db5.d
    public final void onComplete(boolean z17) {
        if (!z17 && this.f200797a.getAndIncrement() < 1) {
            db5.f.c(this.f200798b.f200532g, com.tencent.mm.ui.chatting.gallery.a.f200770a);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ActivityPullDownCloseLayout", "convertTranslucent drawComplete : " + z17);
    }
}
