package p05;

/* loaded from: classes5.dex */
public final class m4 {

    /* renamed from: a, reason: collision with root package name */
    public static final p05.m4 f350622a = new p05.m4();

    public final com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct a() {
        com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct weVisionModelResStruct = new com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct();
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        weVisionModelResStruct.f62926d = tq5.i.f421269a;
        weVisionModelResStruct.f62931i = ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).Bi();
        return weVisionModelResStruct;
    }

    public final void b(int i17, int i18, int i19) {
        com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct a17 = a();
        a17.f62929g = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i18);
        sb6.append('.');
        sb6.append(i19);
        a17.f62927e = a17.b("ModelList", sb6.toString(), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisionModelReporter", "reportAction: " + a17.n());
        a17.k();
    }

    public final void c() {
        boolean z17;
        com.tencent.mm.autogen.mmdata.rpt.WeVisionModelResStruct a17 = a();
        a17.f62929g = 1;
        java.util.LinkedList NewConfigList = p05.p3.f350641c.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList, "NewConfigList");
        a17.f62927e = a17.b("ModelList", kz5.n0.g0(NewConfigList, ";", null, null, 0, null, p05.j3.f350562d, 30, null), true);
        java.util.LinkedList linkedList = p05.p3.f350643e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            int intValue = ((java.lang.Number) obj).intValue();
            java.util.LinkedList NewConfigList2 = p05.p3.f350641c.f387993d;
            kotlin.jvm.internal.o.f(NewConfigList2, "NewConfigList");
            if (!NewConfigList2.isEmpty()) {
                java.util.Iterator it = NewConfigList2.iterator();
                while (it.hasNext()) {
                    z17 = false;
                    if (((r45.w87) it.next()).f388971d == intValue) {
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                arrayList.add(obj);
            }
        }
        a17.f62928f = a17.b("InvalidModelList", kz5.n0.g0(kz5.n0.Q(arrayList), ";", null, null, 0, null, p05.e3.f350508d, 30, null), true);
        java.util.LinkedList NewConfigList3 = p05.p3.f350642d.f387993d;
        kotlin.jvm.internal.o.f(NewConfigList3, "NewConfigList");
        a17.f62930h = a17.b("CgiModelList", kz5.n0.g0(NewConfigList3, ";", null, null, 0, null, p05.d3.f350495d, 30, null), true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeVisionModelReporter", "reportModelInfo: " + a17.n());
        a17.k();
    }
}
