package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f149021a = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: b, reason: collision with root package name */
    public final int f149022b = 4;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3[] f149023c;

    /* renamed from: d, reason: collision with root package name */
    public int f149024d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend f149025e;

    public g0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend recyclerThumbSeekBarExtend) {
        this.f149025e = recyclerThumbSeekBarExtend;
        com.tencent.mm.sdk.platformtools.n3[] n3VarArr = new com.tencent.mm.sdk.platformtools.n3[4];
        this.f149023c = n3VarArr;
        new java.util.concurrent.LinkedBlockingDeque();
        int length = n3VarArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            this.f149023c[i17] = new com.tencent.mm.sdk.platformtools.n3("RecyclerThumbSeekBar_SimpleImageLoader_" + i17);
        }
        this.f149024d = 0;
    }
}
