package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f149104d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f149105e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f149106f = false;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149107g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f149108h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149109i;

    public y(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar, int i17, android.widget.ImageView imageView, android.graphics.Bitmap bitmap, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f149109i = recyclerThumbSeekBar;
        this.f149104d = i17;
        this.f149105e = new java.lang.ref.WeakReference(imageView);
        this.f149107g = n3Var;
        this.f149108h = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149109i;
        if (this.f149106f) {
            com.tencent.mm.memory.u.f68981d.n(this.f149108h);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f149105e;
        if (((android.widget.ImageView) weakReference.get()) == null) {
            com.tencent.mm.memory.u.f68981d.n(this.f149108h);
            return;
        }
        try {
            com.tencent.mm.plugin.mmsight.segment.j a17 = recyclerThumbSeekBar.f148884s.a();
            if (this.f149108h == null) {
                this.f149108h = com.tencent.mm.memory.u.f68981d.m(new com.tencent.mm.memory.t(a17.getScaledWidth(), a17.getScaledHeight()));
            }
            a17.reuseBitmap(this.f149108h);
            if (!this.f149106f) {
                this.f149108h = a17.getFrameAtTime(this.f149104d);
            }
            recyclerThumbSeekBar.f148884s.c(a17);
            if (this.f149108h == null || this.f149106f || weakReference.get() == null) {
                com.tencent.mm.memory.u.f68981d.n(this.f149108h);
            } else {
                this.f149107g.post(new com.tencent.mm.plugin.mmsight.segment.x(recyclerThumbSeekBar, this.f149108h, (android.widget.ImageView) weakReference.get(), this));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "get bitmap error " + e17.getMessage());
            com.tencent.mm.memory.u.f68981d.n(this.f149108h);
        }
    }
}
