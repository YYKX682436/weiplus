package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149085d;

    public s(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f149085d = recyclerThumbSeekBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("RecyclerThumbSeekBar", "exec initAsyncTask");
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar = this.f149085d;
        if (recyclerThumbSeekBar.getHeight() == 0 || recyclerThumbSeekBar.getWidth() == 0) {
            recyclerThumbSeekBar.post(recyclerThumbSeekBar.f148885t);
            return;
        }
        recyclerThumbSeekBar.f148875g = recyclerThumbSeekBar.getHeight();
        recyclerThumbSeekBar.f148876h = (recyclerThumbSeekBar.getWidth() - (recyclerThumbSeekBar.f148882q * 2)) / 12;
        s75.d.b(new com.tencent.mm.plugin.mmsight.segment.r(this), "check duration of ");
    }
}
