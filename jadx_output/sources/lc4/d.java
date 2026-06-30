package lc4;

/* loaded from: classes4.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final void a(o75.c cVar) {
        java.util.HashMap hashMap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateResumeData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
        o75.b bVar = cVar.f343587a;
        o75.b bVar2 = o75.b.f343581b;
        java.lang.Object obj = null;
        if (kotlin.jvm.internal.o.b(bVar, o75.b.f343582c)) {
            xc4.p pVar = (xc4.p) cVar.f343590d;
            if (pVar != null) {
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (pVar.getCreateTime() > ((zc4.b) next).n().getCreateTime()) {
                        obj = next;
                        break;
                    }
                }
                com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().add(kz5.n0.c0(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6(), (zc4.b) obj), new zc4.b(pVar, true));
            }
        } else if (kotlin.jvm.internal.o.b(bVar, o75.b.f343583d)) {
            xc4.p pVar2 = (xc4.p) cVar.f343590d;
            if (pVar2 != null) {
                java.util.Iterator it6 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it6.next();
                    zc4.b bVar3 = (zc4.b) next2;
                    if (kotlin.jvm.internal.o.b(pVar2.a1(), bVar3.n().a1()) || (bVar3.n().y0() == 0 && pVar2.U0() == bVar3.n().U0())) {
                        obj = next2;
                        break;
                    }
                }
                int c07 = kz5.n0.c0(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6(), (zc4.b) obj);
                com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().remove(c07);
                com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().add(c07, new zc4.b(pVar2, true));
            }
        } else if (kotlin.jvm.internal.o.b(bVar, o75.b.f343584e)) {
            xc4.p pVar3 = (xc4.p) cVar.f343590d;
            if (pVar3 != null) {
                java.util.Iterator it7 = com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6().iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    java.lang.Object next3 = it7.next();
                    if (kotlin.jvm.internal.o.b(pVar3.a1(), ((zc4.b) next3).n().a1())) {
                        obj = next3;
                        break;
                    }
                }
                kotlin.jvm.internal.m0.a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.Q6()).remove((zc4.b) obj);
            }
        } else if (kotlin.jvm.internal.o.b(bVar, o75.b.f343585f) && (hashMap = cVar.f343591e) != null) {
            java.util.Iterator it8 = hashMap.entrySet().iterator();
            while (it8.hasNext()) {
                com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.f168761r.a((o75.c) ((java.util.Map.Entry) it8.next()).getValue());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateResumeData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$Companion");
    }
}
