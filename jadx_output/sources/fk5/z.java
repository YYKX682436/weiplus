package fk5;

/* loaded from: classes11.dex */
public final class z extends com.tencent.mm.sdk.event.n {
    public z() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ForwardChattingReportStartEvent event = (com.tencent.mm.autogen.events.ForwardChattingReportStartEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.ce ceVar = event.f54349g;
        if (ceVar == null) {
            return true;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        linkedHashMap.put("comment_scene", a52.a.f1584l);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        linkedHashMap.put("behaviour_session_id", Ri);
        int i17 = ceVar.f6348a;
        if (i17 == 51 || i17 == 129 || i17 == 63) {
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String c17 = b52.b.c();
            if (c17 == null) {
                c17 = "";
            }
            linkedHashMap.put("finder_tab_context_id", c17);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b17 = b52.b.b();
            linkedHashMap.put("finder_context_id", b17 != null ? b17 : "");
        }
        am.de deVar = event.f54350h;
        java.util.Map map = deVar.f6445a;
        if (map != 0) {
            map.putAll(linkedHashMap);
            linkedHashMap = map;
        }
        deVar.f6445a = linkedHashMap;
        return true;
    }
}
