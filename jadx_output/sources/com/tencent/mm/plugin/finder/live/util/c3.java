package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115459a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115460b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115461c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115462d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115463e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115464f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115465g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115466h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115467i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115468j;

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b3 f115469k;

    public c3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.live.util.k kVar = new com.tencent.mm.plugin.finder.live.util.k("AppCpu", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar = new com.tencent.mm.plugin.finder.live.util.a("AverageAppCpu", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(new com.tencent.mm.plugin.finder.live.util.k("GoodCpu", 20, 0, 4, null));
        arrayList2.add(new com.tencent.mm.plugin.finder.live.util.k("NormalCpu", 60, 0, 4, null));
        arrayList2.add(new com.tencent.mm.plugin.finder.live.util.k("BadCpu", 100, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var = new com.tencent.mm.plugin.finder.live.util.b3(kVar, aVar, arrayList2);
        this.f115459a = b3Var;
        com.tencent.mm.plugin.finder.live.util.k kVar2 = new com.tencent.mm.plugin.finder.live.util.k("VideoBitrate", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar2 = new com.tencent.mm.plugin.finder.live.util.a("AverageVideoBitrate", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(new com.tencent.mm.plugin.finder.live.util.k("BadVideoBitrate", 300, 0, 4, null));
        arrayList3.add(new com.tencent.mm.plugin.finder.live.util.k("NormalVideoBitrate", 1800, 0, 4, null));
        arrayList3.add(new com.tencent.mm.plugin.finder.live.util.k("GoodVideoBitrate", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var2 = new com.tencent.mm.plugin.finder.live.util.b3(kVar2, aVar2, arrayList3);
        this.f115460b = b3Var2;
        com.tencent.mm.plugin.finder.live.util.k kVar3 = new com.tencent.mm.plugin.finder.live.util.k("AudioBitrate", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar3 = new com.tencent.mm.plugin.finder.live.util.a("AverageAudioBitrate", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(new com.tencent.mm.plugin.finder.live.util.k("BadAudioBitrate", 10, 0, 4, null));
        arrayList4.add(new com.tencent.mm.plugin.finder.live.util.k("NormalAudioBitrate", 30, 0, 4, null));
        arrayList4.add(new com.tencent.mm.plugin.finder.live.util.k("GoodAudioBitrate", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var3 = new com.tencent.mm.plugin.finder.live.util.b3(kVar3, aVar3, arrayList4);
        this.f115461c = b3Var3;
        com.tencent.mm.plugin.finder.live.util.k kVar4 = new com.tencent.mm.plugin.finder.live.util.k("Rtt", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar4 = new com.tencent.mm.plugin.finder.live.util.a("AverageRtt", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(new com.tencent.mm.plugin.finder.live.util.k("GoodRtt", 50, 0, 4, null));
        arrayList5.add(new com.tencent.mm.plugin.finder.live.util.k("NormalRtt", 100, 0, 4, null));
        arrayList5.add(new com.tencent.mm.plugin.finder.live.util.k("BadRtt", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var4 = new com.tencent.mm.plugin.finder.live.util.b3(kVar4, aVar4, arrayList5);
        this.f115462d = b3Var4;
        com.tencent.mm.plugin.finder.live.util.k kVar5 = new com.tencent.mm.plugin.finder.live.util.k("Uploss", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar5 = new com.tencent.mm.plugin.finder.live.util.a("AverageUploss", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(new com.tencent.mm.plugin.finder.live.util.k("GoodUploss", 5, 0, 4, null));
        arrayList6.add(new com.tencent.mm.plugin.finder.live.util.k("NormalUploss", 10, 0, 4, null));
        arrayList6.add(new com.tencent.mm.plugin.finder.live.util.k("BadUploss", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var5 = new com.tencent.mm.plugin.finder.live.util.b3(kVar5, aVar5, arrayList6);
        this.f115463e = b3Var5;
        com.tencent.mm.plugin.finder.live.util.k kVar6 = new com.tencent.mm.plugin.finder.live.util.k("Downloss", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar6 = new com.tencent.mm.plugin.finder.live.util.a("AverageDownloss", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(new com.tencent.mm.plugin.finder.live.util.k("GoodDownloss", 5, 0, 4, null));
        arrayList7.add(new com.tencent.mm.plugin.finder.live.util.k("NormalDownloss", 10, 0, 4, null));
        arrayList7.add(new com.tencent.mm.plugin.finder.live.util.k("BadDownloss", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var6 = new com.tencent.mm.plugin.finder.live.util.b3(kVar6, aVar6, arrayList7);
        this.f115464f = b3Var6;
        com.tencent.mm.plugin.finder.live.util.k kVar7 = new com.tencent.mm.plugin.finder.live.util.k("SendBytes", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar7 = new com.tencent.mm.plugin.finder.live.util.a("AverageSendBytes", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        arrayList8.add(new com.tencent.mm.plugin.finder.live.util.k("BadSendBytes", 500, 0, 4, null));
        arrayList8.add(new com.tencent.mm.plugin.finder.live.util.k("NormalSendBytes", 1800, 0, 4, null));
        arrayList8.add(new com.tencent.mm.plugin.finder.live.util.k("GoodSendBytes", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var7 = new com.tencent.mm.plugin.finder.live.util.b3(kVar7, aVar7, arrayList8);
        this.f115465g = b3Var7;
        com.tencent.mm.plugin.finder.live.util.k kVar8 = new com.tencent.mm.plugin.finder.live.util.k("ReceiveBytes", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar8 = new com.tencent.mm.plugin.finder.live.util.a("AverageReceiveBytes", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        arrayList9.add(new com.tencent.mm.plugin.finder.live.util.k("BadReceiveBytes", 500, 0, 4, null));
        arrayList9.add(new com.tencent.mm.plugin.finder.live.util.k("NormalReceiveBytes", 1800, 0, 4, null));
        arrayList9.add(new com.tencent.mm.plugin.finder.live.util.k("GoodReceiveBytes", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var8 = new com.tencent.mm.plugin.finder.live.util.b3(kVar8, aVar8, arrayList9);
        this.f115466h = b3Var8;
        com.tencent.mm.plugin.finder.live.util.k kVar9 = new com.tencent.mm.plugin.finder.live.util.k("FrameRate", 0, 0, 6, null);
        com.tencent.mm.plugin.finder.live.util.a aVar9 = new com.tencent.mm.plugin.finder.live.util.a("AverageFrameRate", 0L, 0, 0L, 14, null);
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(new com.tencent.mm.plugin.finder.live.util.k("BadFrameRate", 5, 0, 4, null));
        arrayList10.add(new com.tencent.mm.plugin.finder.live.util.k("NormalFrameRate", 12, 0, 4, null));
        arrayList10.add(new com.tencent.mm.plugin.finder.live.util.k("GoodFrameRate", Integer.MAX_VALUE, 0, 4, null));
        com.tencent.mm.plugin.finder.live.util.b3 b3Var9 = new com.tencent.mm.plugin.finder.live.util.b3(kVar9, aVar9, arrayList10);
        this.f115467i = b3Var9;
        this.f115468j = new com.tencent.mm.plugin.finder.live.util.b3(new com.tencent.mm.plugin.finder.live.util.k("Width", 0, 0, 6, null), null, null);
        this.f115469k = new com.tencent.mm.plugin.finder.live.util.b3(new com.tencent.mm.plugin.finder.live.util.k("Height", 0, 0, 6, null), null, null);
        arrayList.add(b3Var);
        arrayList.add(b3Var2);
        arrayList.add(b3Var3);
        arrayList.add(b3Var4);
        arrayList.add(b3Var5);
        arrayList.add(b3Var6);
        arrayList.add(b3Var7);
        arrayList.add(b3Var8);
        arrayList.add(b3Var9);
    }
}
