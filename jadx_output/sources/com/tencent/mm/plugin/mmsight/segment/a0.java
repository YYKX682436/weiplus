package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f148976a = new com.tencent.mm.sdk.platformtools.n3();

    /* renamed from: b, reason: collision with root package name */
    public final int f148977b = 4;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3[] f148978c = new com.tencent.mm.sdk.platformtools.n3[4];

    /* renamed from: d, reason: collision with root package name */
    public int f148979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar f148980e;

    public a0(com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.f148980e = recyclerThumbSeekBar;
        this.f148979d = 0;
        new java.util.concurrent.LinkedBlockingDeque();
        int i17 = 0;
        while (true) {
            com.tencent.mm.sdk.platformtools.n3[] n3VarArr = this.f148978c;
            if (i17 >= n3VarArr.length) {
                this.f148979d = 0;
                return;
            }
            n3VarArr[i17] = new com.tencent.mm.sdk.platformtools.n3("RecyclerThumbSeekBar_SimpleImageLoader_" + i17);
            i17++;
        }
    }
}
