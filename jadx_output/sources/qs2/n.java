package qs2;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs2.q f366313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SnsPostInfoEvent f366314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(qs2.q qVar, com.tencent.mm.autogen.events.SnsPostInfoEvent snsPostInfoEvent) {
        super(0);
        this.f366313d = qVar;
        this.f366314e = snsPostInfoEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        am.mw mwVar = this.f366314e.f54830g;
        long j17 = mwVar.f7374b;
        long j18 = mwVar.f7373a;
        qs2.q qVar = this.f366313d;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) qVar.f366318e).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((java.lang.Number) ((jz5.l) next).f302833d).longValue() == j17) {
                arrayList2.add(next);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct snsPostSyncFinderPostStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct) ((jz5.l) it6.next()).f302834e;
            snsPostSyncFinderPostStruct.f60693e = snsPostSyncFinderPostStruct.b("snsfeedid", j18 != 0 ? pm0.v.u(j18) : "", true);
            snsPostSyncFinderPostStruct.k();
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(snsPostSyncFinderPostStruct);
        }
        jz5.g gVar = qVar.f366318e;
        pm0.v.b0((java.util.ArrayList) ((jz5.n) gVar).getValue(), new qs2.g(j17));
        if (((java.util.ArrayList) ((jz5.n) gVar).getValue()).isEmpty()) {
            ((com.tencent.mm.plugin.finder.publish.FinderPublishFeatureService$snsPostListener$2$1) ((jz5.n) qVar.f366319f).getValue()).dead();
        }
        return jz5.f0.f302826a;
    }
}
