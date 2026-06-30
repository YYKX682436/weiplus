package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f115551a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115552b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115553c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115554d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115555e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115556f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115557g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115558h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115559i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115560j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115561k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115562l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115563m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115564n;

    public j() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f115551a = arrayList;
        com.tencent.mm.plugin.finder.live.util.k kVar = new com.tencent.mm.plugin.finder.live.util.k("AppCpu", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar = new com.tencent.mm.plugin.finder.live.util.a("AverageAppCpu", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new com.tencent.mm.plugin.finder.live.util.k("GoodCpu", 20, 0, 4, null));
        arrayList2.add(new com.tencent.mm.plugin.finder.live.util.k("NormalCpu", 60, 0, 4, null));
        arrayList2.add(new com.tencent.mm.plugin.finder.live.util.k("BadCpu", 100, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var = new com.tencent.mm.plugin.finder.live.util.b3(kVar, aVar, arrayList2);
        this.f115552b = b3Var;
        com.tencent.mm.plugin.finder.live.util.k kVar2 = new com.tencent.mm.plugin.finder.live.util.k("VideoBitrate", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar2 = new com.tencent.mm.plugin.finder.live.util.a("AverageVideoBitrate", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(new com.tencent.mm.plugin.finder.live.util.k("BadVideoBitrate", 300, 0, 4, null));
        arrayList3.add(new com.tencent.mm.plugin.finder.live.util.k("NormalVideoBitrate", 1800, 0, 4, null));
        arrayList3.add(new com.tencent.mm.plugin.finder.live.util.k("GoodVideoBitrate", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var2 = new com.tencent.mm.plugin.finder.live.util.b3(kVar2, aVar2, arrayList3);
        this.f115553c = b3Var2;
        com.tencent.mm.plugin.finder.live.util.k kVar3 = new com.tencent.mm.plugin.finder.live.util.k("AudioBitrate", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar3 = new com.tencent.mm.plugin.finder.live.util.a("AverageAudioBitrate", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(new com.tencent.mm.plugin.finder.live.util.k("BadAudioBitrate", 10, 0, 4, null));
        arrayList4.add(new com.tencent.mm.plugin.finder.live.util.k("NormalAudioBitrate", 30, 0, 4, null));
        arrayList4.add(new com.tencent.mm.plugin.finder.live.util.k("GoodAudioBitrate", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var3 = new com.tencent.mm.plugin.finder.live.util.b3(kVar3, aVar3, arrayList4);
        this.f115554d = b3Var3;
        com.tencent.mm.plugin.finder.live.util.k kVar4 = new com.tencent.mm.plugin.finder.live.util.k("FrameRate", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar4 = new com.tencent.mm.plugin.finder.live.util.a("AverageFrameRate", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(new com.tencent.mm.plugin.finder.live.util.k("BadFrameRate", 5, 0, 4, null));
        arrayList5.add(new com.tencent.mm.plugin.finder.live.util.k("NormalFrameRate", 12, 0, 4, null));
        arrayList5.add(new com.tencent.mm.plugin.finder.live.util.k("GoodFrameRate", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var4 = new com.tencent.mm.plugin.finder.live.util.b3(kVar4, aVar4, arrayList5);
        this.f115555e = b3Var4;
        this.f115556f = new com.tencent.mm.plugin.finder.live.util.b3(new com.tencent.mm.plugin.finder.live.util.k("Width", 0, 0, 6, null), null, null);
        this.f115557g = new com.tencent.mm.plugin.finder.live.util.b3(new com.tencent.mm.plugin.finder.live.util.k("Height", 0, 0, 6, null), null, null);
        this.f115558h = new com.tencent.mm.plugin.finder.live.util.b3(new com.tencent.mm.plugin.finder.live.util.k("GOP", 0, 0, 6, null), null, null);
        com.tencent.mm.plugin.finder.live.util.k kVar5 = new com.tencent.mm.plugin.finder.live.util.k("NetSpeed", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar5 = new com.tencent.mm.plugin.finder.live.util.a("AverageNetSpeed", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(new com.tencent.mm.plugin.finder.live.util.k("BadNetSpeed", 300, 0, 4, null));
        arrayList6.add(new com.tencent.mm.plugin.finder.live.util.k("NormalNetSpeed", 1800, 0, 4, null));
        arrayList6.add(new com.tencent.mm.plugin.finder.live.util.k("GoodNetSpeed", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var5 = new com.tencent.mm.plugin.finder.live.util.b3(kVar5, aVar5, arrayList6);
        this.f115559i = b3Var5;
        com.tencent.mm.plugin.finder.live.util.k kVar6 = new com.tencent.mm.plugin.finder.live.util.k("NetJit", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar6 = new com.tencent.mm.plugin.finder.live.util.a("AverageNetJit", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(new com.tencent.mm.plugin.finder.live.util.k("GoodNetJit", 3, 0, 4, null));
        arrayList7.add(new com.tencent.mm.plugin.finder.live.util.k("NormalNetJit", 10, 0, 4, null));
        arrayList7.add(new com.tencent.mm.plugin.finder.live.util.k("BadNetJit", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var6 = new com.tencent.mm.plugin.finder.live.util.b3(kVar6, aVar6, arrayList7);
        this.f115560j = b3Var6;
        com.tencent.mm.plugin.finder.live.util.k kVar7 = new com.tencent.mm.plugin.finder.live.util.k("AVRecInterval", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar7 = new com.tencent.mm.plugin.finder.live.util.a("AverageAVRecInterval", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(new com.tencent.mm.plugin.finder.live.util.k("GoodAVRecInterval", 10, 0, 4, null));
        arrayList8.add(new com.tencent.mm.plugin.finder.live.util.k("NormalAVRecInterval", 50, 0, 4, null));
        arrayList8.add(new com.tencent.mm.plugin.finder.live.util.k("BadAVRecInterval", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var7 = new com.tencent.mm.plugin.finder.live.util.b3(kVar7, aVar7, arrayList8);
        this.f115561k = b3Var7;
        com.tencent.mm.plugin.finder.live.util.k kVar8 = new com.tencent.mm.plugin.finder.live.util.k("AVPlayInterval", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar8 = new com.tencent.mm.plugin.finder.live.util.a("AverageAVPlayInterval", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(new com.tencent.mm.plugin.finder.live.util.k("GoodAVPlayInterval", 10, 0, 4, null));
        arrayList9.add(new com.tencent.mm.plugin.finder.live.util.k("NormalAVPlayInterval", 50, 0, 4, null));
        arrayList9.add(new com.tencent.mm.plugin.finder.live.util.k("BadAVPlayInterval", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var8 = new com.tencent.mm.plugin.finder.live.util.b3(kVar8, aVar8, arrayList9);
        this.f115562l = b3Var8;
        com.tencent.mm.plugin.finder.live.util.k kVar9 = new com.tencent.mm.plugin.finder.live.util.k(" VideoCache", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar9 = new com.tencent.mm.plugin.finder.live.util.a("AverageVideoCache", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(new com.tencent.mm.plugin.finder.live.util.k("BadVideoCache", 100, 0, 4, null));
        arrayList10.add(new com.tencent.mm.plugin.finder.live.util.k("NormalVideoCache", 1500, 0, 4, null));
        arrayList10.add(new com.tencent.mm.plugin.finder.live.util.k("GoodVideoCache", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var9 = new com.tencent.mm.plugin.finder.live.util.b3(kVar9, aVar9, arrayList10);
        this.f115563m = b3Var9;
        com.tencent.mm.plugin.finder.live.util.k kVar10 = new com.tencent.mm.plugin.finder.live.util.k(" SumCacheSize", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar10 = new com.tencent.mm.plugin.finder.live.util.a("AverageSumCacheSize", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        arrayList11.add(new com.tencent.mm.plugin.finder.live.util.k("BadSumCacheSize", 100, 0, 4, null));
        arrayList11.add(new com.tencent.mm.plugin.finder.live.util.k("NormalSumCacheSize", 1500, 0, 4, null));
        arrayList11.add(new com.tencent.mm.plugin.finder.live.util.k("GoodSumCacheSize", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var10 = new com.tencent.mm.plugin.finder.live.util.b3(kVar10, aVar10, arrayList11);
        this.f115564n = b3Var10;
        arrayList.add(b3Var);
        arrayList.add(b3Var2);
        arrayList.add(b3Var3);
        arrayList.add(b3Var4);
        arrayList.add(b3Var5);
        arrayList.add(b3Var6);
        arrayList.add(b3Var7);
        arrayList.add(b3Var8);
        arrayList.add(b3Var9);
        arrayList.add(b3Var10);
    }
}
