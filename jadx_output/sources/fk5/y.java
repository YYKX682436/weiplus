package fk5;

/* loaded from: classes12.dex */
public final class y extends f65.c {

    /* renamed from: d, reason: collision with root package name */
    public static final fk5.y f263683d = new fk5.y();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f263684e = true;

    public final int c(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17 = f9Var.j();
        if (j17 != null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            ot0.q v17 = ot0.q.v(j17);
            java.lang.Integer valueOf = v17 != null ? java.lang.Integer.valueOf(v17.f348666i) : null;
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return -1;
    }

    public final void d(java.lang.String talker, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(talker, j17);
        com.tencent.mm.autogen.events.ForwardChattingReportStartEvent forwardChattingReportStartEvent = new com.tencent.mm.autogen.events.ForwardChattingReportStartEvent();
        am.ce ceVar = forwardChattingReportStartEvent.f54349g;
        ceVar.getClass();
        fk5.y yVar = f263683d;
        ceVar.f6348a = yVar.c(n17);
        forwardChattingReportStartEvent.e();
        am.de deVar = forwardChattingReportStartEvent.f54350h;
        java.util.Map map = deVar.f6445a;
        if (map == null || map.isEmpty()) {
            return;
        }
        java.util.Map customParams = deVar.f6445a;
        kotlin.jvm.internal.o.f(customParams, "customParams");
        synchronized (yVar.f259870b) {
            if (yVar.f259870b.containsKey(java.lang.Long.valueOf(j17))) {
                java.util.Map map2 = (java.util.Map) ((java.util.LinkedHashMap) yVar.f259870b).get(java.lang.Long.valueOf(j17));
                if (map2 != null) {
                    map2.putAll(customParams);
                }
            } else {
                java.util.Map map3 = yVar.f259870b;
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                linkedHashMap.putAll(customParams);
                map3.put(valueOf, linkedHashMap);
            }
        }
    }

    public final void e(com.tencent.mm.storage.f9 msgInfo, java.util.Map params, boolean z17) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(params, "params");
        java.util.Map b17 = b(msgInfo.getMsgId());
        com.tencent.mm.autogen.events.ForwardChattingReportEndEvent forwardChattingReportEndEvent = new com.tencent.mm.autogen.events.ForwardChattingReportEndEvent();
        int type = msgInfo.getType();
        am.be beVar = forwardChattingReportEndEvent.f54348g;
        beVar.f6241a = type;
        beVar.f6242b = f263683d.c(msgInfo);
        beVar.f6244d = b17;
        beVar.f6245e = params;
        beVar.f6243c = msgInfo.getMsgId();
        beVar.f6246f = z17;
        beVar.f6247g = msgInfo.Q0();
        forwardChattingReportEndEvent.e();
        if (b17 == null || b17.isEmpty()) {
            return;
        }
        params.putAll(b17);
    }
}
