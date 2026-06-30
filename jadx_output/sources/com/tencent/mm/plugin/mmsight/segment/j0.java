package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149040d;

    public j0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149040d = recyclerThumbSeekBarExtend;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "exec initAsyncTask");
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend = this.f149040d;
        if (recyclerThumbSeekBarExtend.getHeight() == 0 || recyclerThumbSeekBarExtend.getWidth() == 0) {
            recyclerThumbSeekBarExtend.post(this);
            return;
        }
        if (recyclerThumbSeekBarExtend.f148899r / recyclerThumbSeekBarExtend.f148901t > 0) {
            recyclerThumbSeekBarExtend.f148890f = recyclerThumbSeekBarExtend.getHeight();
            recyclerThumbSeekBarExtend.f148891g = (int) ((recyclerThumbSeekBarExtend.getWidth() - (recyclerThumbSeekBarExtend.f148895n * 2)) / (((float) recyclerThumbSeekBarExtend.f148899r) / ((float) recyclerThumbSeekBarExtend.f148901t)));
            s75.d.b(new com.tencent.mm.plugin.mmsight.segment.i0(recyclerThumbSeekBarExtend), "check duration of ");
        } else {
            com.tencent.mars.xlog.Log.e("RecyclerThumbSeekBar", "initAsyncTask return " + recyclerThumbSeekBarExtend.f148899r + " / " + recyclerThumbSeekBarExtend.f148901t);
        }
    }
}
