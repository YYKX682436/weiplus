package wt3;

/* loaded from: classes5.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final r45.iz6 a(com.tencent.maas.utils.MJVideoClassifierResult mjVideoClassifierResult, java.lang.String modelKey) {
        kotlin.jvm.internal.o.g(mjVideoClassifierResult, "mjVideoClassifierResult");
        kotlin.jvm.internal.o.g(modelKey, "modelKey");
        r45.iz6 iz6Var = new r45.iz6();
        int[] iArr = mjVideoClassifierResult.f48571d;
        kotlin.jvm.internal.o.f(iArr, "getAudioTaskOutLabels(...)");
        iz6Var.f377420g = new java.util.LinkedList(kz5.v.e(iArr));
        float[] fArr = mjVideoClassifierResult.f48572e;
        kotlin.jvm.internal.o.f(fArr, "getAudioTaskOutScores(...)");
        iz6Var.f377421h = new java.util.LinkedList(kz5.v.d(fArr));
        float[] fArr2 = mjVideoClassifierResult.f48573f;
        kotlin.jvm.internal.o.f(fArr2, "getLastVersionOutScores(...)");
        iz6Var.f377422i = new java.util.LinkedList(kz5.v.d(fArr2));
        int[] iArr2 = mjVideoClassifierResult.f48568a;
        kotlin.jvm.internal.o.f(iArr2, "getVisionTaskOutLabels(...)");
        iz6Var.f377417d = new java.util.LinkedList(kz5.v.e(iArr2));
        float[] fArr3 = mjVideoClassifierResult.f48570c;
        kotlin.jvm.internal.o.f(fArr3, "getVisionTaskOutScores(...)");
        iz6Var.f377419f = new java.util.LinkedList(kz5.v.d(fArr3));
        int[] iArr3 = mjVideoClassifierResult.f48569b;
        kotlin.jvm.internal.o.f(iArr3, "getVisionTaskExceedsThreshold(...)");
        iz6Var.f377418e = new java.util.LinkedList(kz5.v.e(iArr3));
        float[] fArr4 = mjVideoClassifierResult.f48575h;
        kotlin.jvm.internal.o.f(fArr4, "getEmbeddingFeature(...)");
        iz6Var.f377424n = new java.util.LinkedList(kz5.v.d(fArr4));
        java.lang.String g17 = p05.a3.f350439a.g(modelKey);
        if (g17 == null) {
            g17 = "";
        }
        iz6Var.f377425o = g17;
        wt3.k kVar = wt3.q.f449470g;
        java.util.Map map = mjVideoClassifierResult.f48574g;
        kotlin.jvm.internal.o.f(map, "getClusters(...)");
        java.util.HashMap hashMap = (java.util.HashMap) map;
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
            r45.pi0 pi0Var = new r45.pi0();
            pi0Var.f383070d = intValue;
            pi0Var.f383071e = intValue2;
            arrayList.add(pi0Var);
        }
        iz6Var.f377423m = new java.util.LinkedList(arrayList);
        iz6Var.f377424n.size();
        iz6Var.f377423m.size();
        return iz6Var;
    }

    public final java.util.List b(java.util.List businessModelKeyList) {
        kotlin.jvm.internal.o.g(businessModelKeyList, "businessModelKeyList");
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        wt3.k kVar = wt3.q.f449470g;
        arrayList.addAll(wt3.q.f449471h);
        arrayList.addAll(businessModelKeyList);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.String str : arrayList) {
            p05.a3 a3Var = p05.a3.f350439a;
            java.lang.String g17 = a3Var.g(str);
            if (g17 != null) {
                linkedList.add(new com.tencent.maas.model.MJModelInfo(str, g17, a3Var.h(str)));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioMaasClassifier", "[getModelInfos] key:" + str + " path:" + g17);
        }
        return linkedList;
    }
}
