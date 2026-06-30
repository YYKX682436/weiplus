package gc0;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final gc0.f0 f270167a = new gc0.f0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f270168b = new com.tencent.mm.sdk.platformtools.r2(20);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f270169c = jz5.h.b(gc0.d0.f270122d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f270170d = jz5.h.b(gc0.e0.f270140d);

    public final r45.nl5 a(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.lang.Object value = ((jz5.n) f270169c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) value).j(talker);
        r45.nl5 nl5Var = new r45.nl5();
        try {
            nl5Var.parseFrom(j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecommendRemarkCache", th6, "getChattingRecommendRemarkSysTipsData err", new java.lang.Object[0]);
        }
        return nl5Var;
    }

    public final r45.ml5 b(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkShownEnable());
        if (h17 == 1) {
            r45.ml5 ml5Var = new r45.ml5();
            ml5Var.set(3, java.lang.Long.valueOf((c01.id.c() - ((j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkChattingTimeLimit()) * 60) * 1000)) + 10000));
            ml5Var.set(1, new java.util.LinkedList());
            ml5Var.set(0, new java.util.LinkedList());
            ml5Var.set(2, null);
            return ml5Var;
        }
        byte[] j17 = c().j(talker);
        r45.ml5 ml5Var2 = new r45.ml5();
        try {
            ml5Var2.fromProtobuf(j17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecommendRemarkCache", th6, "getShownData err", new java.lang.Object[0]);
        }
        if (h17 == 2) {
            ml5Var2.set(3, java.lang.Long.valueOf((c01.id.c() - ((j62.e.g().c(new com.tencent.mm.repairer.config.remark.RepairerConfigRecommendRemarkChattingTimeLimit()) * 60) * 1000)) + 10000));
        }
        return ml5Var2;
    }

    public final com.tencent.mm.sdk.platformtools.o4 c() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f270170d).getValue();
    }

    public final void d(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        java.lang.Object value = ((jz5.n) f270169c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.sdk.platformtools.o4) value).remove(talker);
    }

    public final void e(java.lang.String talker, long j17, java.util.List list) {
        kotlin.jvm.internal.o.g(talker, "talker");
        r45.ml5 b17 = b(talker);
        b17.set(3, java.lang.Long.valueOf(j17));
        b17.getList(1).clear();
        b17.getList(5).clear();
        b17.getList(0).clear();
        b17.getList(4).clear();
        b17.set(2, "");
        if (list != null) {
            b17.getList(6).addAll(list);
        }
        c().H(talker, b17.toByteArray());
    }
}
