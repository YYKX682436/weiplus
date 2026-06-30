package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class o {
    public o(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.vlog.model.a abaResult, r45.i70 outputConfig) {
        java.util.List<java.lang.Integer> transToList;
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(abaResult, "abaResult");
        kotlin.jvm.internal.o.g(outputConfig, "outputConfig");
        if (abaResult.f175537a == 0) {
            com.tencent.mm.plugin.sight.base.ABAPrams aBAPrams = abaResult.f175541e;
            int i19 = abaResult.f175538b;
            if (i19 > 0 && (i17 = abaResult.f175539c) > 0 && (i18 = abaResult.f175540d) > 0) {
                outputConfig.f376780i = i19;
                outputConfig.f376781m = i17;
                outputConfig.f376782n = i18;
                kotlin.jvm.internal.o.d(aBAPrams);
                outputConfig.D = aBAPrams.crf / 100.0f;
                kotlin.jvm.internal.o.d(aBAPrams);
                outputConfig.E = aBAPrams.vbvBufferSize;
                com.tencent.mars.xlog.Log.i("MicroMsg.CompositionInfoConverter", "video abaResult, width:" + outputConfig.f376780i + ", height:" + outputConfig.f376781m + ", " + outputConfig.f376782n + ", crf:" + outputConfig.D + ", vbvBufferSize:" + outputConfig.E);
            }
            if (aBAPrams == null || (transToList = aBAPrams.transToList()) == null) {
                return;
            }
            outputConfig.f376788t.addAll(transToList);
        }
    }

    public final com.tencent.mm.plugin.vlog.model.a b(com.tencent.mm.plugin.vlog.model.h1 composition, com.tencent.mm.modelcontrol.VideoTransPara videoParams, int i17, int i18, boolean z17) {
        com.tencent.mm.plugin.vlog.model.b bVar;
        kotlin.jvm.internal.o.g(composition, "composition");
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        java.util.ArrayList<com.tencent.mm.plugin.vlog.model.i1> arrayList = composition.f175597c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.tencent.mm.plugin.vlog.model.i1 i1Var : arrayList) {
            if (i1Var.f175617b == 2) {
                java.lang.String str = i1Var.f175616a;
                rm5.j jVar = i1Var.f175627l;
                bVar = new com.tencent.mm.plugin.vlog.model.b(str, jVar.f397504f, jVar.f397505g);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        return com.tencent.mm.plugin.vlog.model.d.b(com.tencent.mm.plugin.vlog.model.d.f175575a, arrayList2, videoParams, i17, i18, z17, 0, 32, null);
    }

    public final int c(int i17) {
        return i17 % 2 != 0 ? i17 - 1 : i17;
    }

    public final void d(com.tencent.mm.modelcontrol.VideoTransPara videoParams, r45.i70 outputConfig) {
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        kotlin.jvm.internal.o.g(outputConfig, "outputConfig");
        outputConfig.f376782n = videoParams.f71194g;
        outputConfig.f376783o = videoParams.f71193f;
        outputConfig.f376784p = videoParams.f71197m;
        outputConfig.f376785q = videoParams.f71198n;
        outputConfig.f376786r = videoParams.f71199o;
        outputConfig.f376787s = videoParams.f71200p;
        outputConfig.f376789u = videoParams.f71205u;
    }
}
