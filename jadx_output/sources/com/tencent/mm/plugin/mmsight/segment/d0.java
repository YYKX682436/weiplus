package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f149001d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f149002e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149003f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f149004g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f149005h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149006i;

    public d0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend, int i17, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, com.tencent.mm.sdk.platformtools.n3 handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f149006i = recyclerThumbSeekBarExtend;
        this.f149001d = i17;
        this.f149002e = bitmap;
        this.f149003f = handler;
        this.f149004g = new java.lang.ref.WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149006i;
        if (this.f149005h) {
            com.tencent.mm.memory.u.f68981d.n(this.f149002e);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f149004g;
        if (((android.widget.ImageView) weakReference.get()) == null) {
            com.tencent.mm.memory.u.f68981d.n(this.f149002e);
            return;
        }
        try {
            com.tencent.mm.plugin.mmsight.segment.j a17 = recyclerThumbSeekBarExtend.f148902u.a();
            if (this.f149002e == null) {
                this.f149002e = com.tencent.mm.memory.u.f68981d.m(new com.tencent.mm.memory.t(a17.getScaledWidth(), a17.getScaledHeight()));
            }
            a17.reuseBitmap(this.f149002e);
            if (!this.f149005h) {
                this.f149002e = a17.getFrameAtTime(this.f149001d);
            }
            recyclerThumbSeekBarExtend.f148902u.c(a17);
            if (this.f149002e == null || this.f149005h || weakReference.get() == null) {
                com.tencent.mm.memory.u.f68981d.n(this.f149002e);
            } else {
                this.f149003f.post(new com.tencent.mm.plugin.mmsight.segment.c0(recyclerThumbSeekBarExtend, this.f149002e, (android.widget.ImageView) weakReference.get(), this));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "get bitmap error " + e17.getMessage());
            com.tencent.mm.memory.u.f68981d.n(this.f149002e);
        }
    }
}
