package em3;

/* loaded from: classes8.dex */
public final class u extends com.tencent.mm.sdk.event.n {
    public u() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent event = (com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.dj djVar = event.f54480g;
        int i17 = djVar.f6471a;
        if (i17 == 87) {
            if (djVar.f6472b != 1) {
                return false;
            }
            am3.s sVar = (am3.s) i95.n0.c(am3.s.class);
            java.lang.String filePath = djVar.f6473c;
            kotlin.jvm.internal.o.f(filePath, "filePath");
            sVar.Ai(filePath);
            return false;
        }
        if (i17 != 92) {
            return false;
        }
        int i18 = djVar.f6472b;
        if (i18 == 1) {
            am3.s sVar2 = (am3.s) i95.n0.c(am3.s.class);
            java.lang.String filePath2 = djVar.f6473c;
            kotlin.jvm.internal.o.f(filePath2, "filePath");
            sVar2.Bi(filePath2);
            return false;
        }
        if (i18 != 2) {
            return false;
        }
        am3.s sVar3 = (am3.s) i95.n0.c(am3.s.class);
        java.lang.String filePath3 = djVar.f6473c;
        kotlin.jvm.internal.o.f(filePath3, "filePath");
        sVar3.wi(filePath3);
        return false;
    }
}
