package pd5;

/* loaded from: classes.dex */
public final class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.Class cls;
        com.tencent.mm.autogen.events.RepairerActionEvent event = (com.tencent.mm.autogen.events.RepairerActionEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.uq uqVar = event.f54679g;
        int i17 = 0;
        if (uqVar.f8125a != 1) {
            return false;
        }
        java.lang.Class[] clsArr = pd5.l.f353581c;
        while (true) {
            if (i17 >= 8) {
                cls = null;
                break;
            }
            cls = clsArr[i17];
            if (kotlin.jvm.internal.o.b(((q55.e) cls.newInstance()).l(), uqVar.f8126b)) {
                break;
            }
            i17++;
        }
        if (cls == null) {
            return true;
        }
        pd5.l.f353583e.put(((q55.e) cls.newInstance()).k(), java.lang.Integer.valueOf(com.tencent.mm.storage.m2.a(uqVar.f8127c)));
        return true;
    }
}
