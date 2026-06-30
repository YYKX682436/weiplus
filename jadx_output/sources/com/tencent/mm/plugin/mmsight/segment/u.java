package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f149090d;

    public u(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f149090d = recyclerThumbSeekBar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.segment.g gVar = this.f149090d.f148877i;
        if (gVar != null) {
            gVar.a(true);
        }
    }
}
