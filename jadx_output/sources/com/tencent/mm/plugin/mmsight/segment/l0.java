package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149052d;

    public l0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149052d = recyclerThumbSeekBarExtend;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mmsight.segment.g gVar = this.f149052d.f148892h;
        if (gVar != null) {
            gVar.a(true);
        }
    }
}
