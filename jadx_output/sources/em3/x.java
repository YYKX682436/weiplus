package em3;

/* loaded from: classes.dex */
public final class x extends com.tencent.mm.sdk.event.n {
    public x() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.r2 r2Var = event.f54053g;
        int i17 = r2Var.f7759a;
        if (i17 == 87) {
            if (r2Var.f7760b != 1) {
                return false;
            }
            am3.s sVar = (am3.s) i95.n0.c(am3.s.class);
            java.lang.String filePath = r2Var.f7761c;
            kotlin.jvm.internal.o.f(filePath, "filePath");
            sVar.Ai(filePath);
            return false;
        }
        if (i17 != 92) {
            return false;
        }
        int i18 = r2Var.f7760b;
        if (i18 == 1) {
            am3.s sVar2 = (am3.s) i95.n0.c(am3.s.class);
            java.lang.String filePath2 = r2Var.f7761c;
            kotlin.jvm.internal.o.f(filePath2, "filePath");
            sVar2.Bi(filePath2);
            return false;
        }
        if (i18 != 2) {
            return false;
        }
        am3.s sVar3 = (am3.s) i95.n0.c(am3.s.class);
        java.lang.String filePath3 = r2Var.f7761c;
        kotlin.jvm.internal.o.f(filePath3, "filePath");
        sVar3.wi(filePath3);
        return false;
    }
}
