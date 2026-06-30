package jv3;

/* loaded from: classes14.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(int i17, int i18, com.tencent.mm.protobuf.g gVar, long j17, com.tencent.mm.protobuf.g gVar2, java.util.LinkedList linkedList, java.util.List list, java.lang.String str, java.lang.String str2, java.lang.String str3, int i19, int i27, int i28, com.tencent.mm.protobuf.g gVar3, int i29, kotlin.jvm.internal.i iVar) {
        com.tencent.mm.protobuf.g gVar4 = (i29 & 4) != 0 ? null : gVar;
        long j18 = (i29 & 8) != 0 ? 0L : j17;
        com.tencent.mm.protobuf.g gVar5 = (i29 & 16) != 0 ? null : gVar2;
        java.util.LinkedList linkedList2 = (i29 & 32) != 0 ? null : linkedList;
        java.util.List list2 = (i29 & 64) != 0 ? null : list;
        java.lang.String str4 = (i29 & 128) != 0 ? null : str;
        java.lang.String str5 = (i29 & 256) != 0 ? null : str2;
        java.lang.String str6 = (i29 & 512) != 0 ? null : str3;
        int i37 = (i29 & 1024) != 0 ? 0 : i19;
        int i38 = (i29 & 2048) != 0 ? 0 : i27;
        int i39 = (i29 & 4096) != 0 ? 0 : i28;
        com.tencent.mm.protobuf.g gVar6 = (i29 & 8192) != 0 ? null : gVar3;
        r45.wv0 wv0Var = new r45.wv0();
        com.tencent.mm.protobuf.g gVar7 = gVar6;
        r45.xv0 xv0Var = new r45.xv0();
        int i47 = i38;
        xv0Var.setBaseResponse(new r45.ie());
        xv0Var.getBaseResponse().f376960e = new r45.du5();
        wv0Var.f389481d = i17;
        wv0Var.f389482e = i18;
        wv0Var.f389483f = gVar4;
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jz5.l ck6 = ((c61.l7) ((zy2.b6) c17)).ck(false);
        wv0Var.f389485h = ((java.lang.Number) ck6.f302833d).floatValue();
        wv0Var.f389484g = ((java.lang.Number) ck6.f302834e).floatValue();
        wv0Var.f389486i = j18;
        wv0Var.f389487m = gVar5;
        wv0Var.f389497w = linkedList2;
        if (list2 != null && (!list2.isEmpty())) {
            wv0Var.f389488n.addAll(list2);
        }
        wv0Var.f389489o = str4;
        wv0Var.f389495u = str5;
        wv0Var.f389496v = str6;
        wv0Var.f389490p = i39;
        wv0Var.f389491q = i37;
        wv0Var.f389492r = i47;
        int i48 = i39 > 0 ? 1 : j18 > 0 ? 2 : 0;
        wv0Var.f389493s = i48;
        wv0Var.f389494t = gVar7;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wv0Var;
        lVar.f70665b = xv0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderbgmlist";
        lVar.f70667d = 21113;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("type:");
        sb6.append(i17);
        sb6.append(" count:");
        sb6.append(i18);
        sb6.append(" location:");
        sb6.append(ck6);
        sb6.append(" videoDuration:");
        sb6.append(j18);
        sb6.append(" searchQuery:");
        sb6.append(str5);
        sb6.append(" forRecommendExtraInfo:");
        sb6.append(str4);
        sb6.append(" miaoJianMusicIdList:");
        sb6.append(list2);
        sb6.append(" scene:");
        sb6.append(i37);
        sb6.append(" camera:");
        sb6.append(i47);
        sb6.append(" assetType:");
        sb6.append(i48);
        sb6.append(" picNum:");
        sb6.append(i39);
        sb6.append(" hasPromptRawText:");
        sb6.append(gVar7 != null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderBgmList", sb6.toString());
    }
}
