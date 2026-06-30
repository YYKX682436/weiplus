package lb0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final lb0.d f317669a = new lb0.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f317670b = jz5.h.b(lb0.b.f317667d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f317671c = jz5.h.b(lb0.c.f317668d);

    public static final java.util.Map a(lb0.d dVar, java.lang.String str) {
        java.lang.Object m521constructorimpl;
        dVar.getClass();
        if (r26.n0.N(str)) {
            return kz5.q0.f314001d;
        }
        java.util.List<java.lang.String> f07 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : f07) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.util.List f08 = r26.n0.f0(str2, new java.lang.String[]{"&"}, false, 0, 6, null);
                m521constructorimpl = kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) f08.get(0))), new lb0.a(kotlin.jvm.internal.o.b((java.lang.String) f08.get(1), "1"), java.lang.Long.parseLong((java.lang.String) f08.get(2)), java.lang.Long.parseLong((java.lang.String) f08.get(3)))));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                m521constructorimpl = null;
            }
            jz5.l lVar = (jz5.l) m521constructorimpl;
            if (lVar != null) {
                arrayList.add(lVar);
            }
        }
        return kz5.c1.q(arrayList);
    }

    public final long b(int i17, com.tencent.mm.pluginsdk.model.a adBusinessType) {
        long j17;
        kotlin.jvm.internal.o.g(adBusinessType, "adBusinessType");
        int ordinal = adBusinessType.ordinal();
        if (ordinal == 0) {
            lb0.a aVar = (lb0.a) ((java.util.Map) ((jz5.n) f317671c).getValue()).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                j17 = aVar.f317666c;
            }
            j17 = 0;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lb0.a aVar2 = (lb0.a) ((java.util.Map) ((jz5.n) f317670b).getValue()).get(java.lang.Integer.valueOf(i17));
            if (aVar2 != null) {
                j17 = aVar2.f317666c;
            }
            j17 = 0;
        }
        return j17 * f();
    }

    public final com.tencent.mm.pluginsdk.model.a c(wj.t0 t0Var) {
        if (t0Var == null) {
            return null;
        }
        switch (t0Var.ordinal()) {
            case 8:
            case 10:
            case 12:
                return com.tencent.mm.pluginsdk.model.a.f188776e;
            case 9:
            case 11:
            case 13:
                return com.tencent.mm.pluginsdk.model.a.f188775d;
            default:
                return null;
        }
    }

    public final java.lang.String d(com.tencent.mm.pluginsdk.model.a adBusinessType, android.content.Context context) {
        java.lang.Object obj;
        java.lang.String string;
        kotlin.jvm.internal.o.g(adBusinessType, "adBusinessType");
        if (context == null) {
            return "";
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int ordinal = adBusinessType.ordinal();
            if (ordinal == 0) {
                string = context.getString(com.tencent.mm.R.string.nzi);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                string = context.getString(com.tencent.mm.R.string.lc9);
            }
            obj = kotlin.Result.m521constructorimpl(string);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            obj = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        return (java.lang.String) (kotlin.Result.m524exceptionOrNullimpl(obj) == null ? obj : "");
    }

    public final long e(int i17, com.tencent.mm.pluginsdk.model.a adBusinessType) {
        long j17;
        kotlin.jvm.internal.o.g(adBusinessType, "adBusinessType");
        int ordinal = adBusinessType.ordinal();
        if (ordinal == 0) {
            lb0.a aVar = (lb0.a) ((java.util.Map) ((jz5.n) f317671c).getValue()).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                j17 = aVar.f317665b;
            }
            j17 = 0;
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lb0.a aVar2 = (lb0.a) ((java.util.Map) ((jz5.n) f317670b).getValue()).get(java.lang.Integer.valueOf(i17));
            if (aVar2 != null) {
                j17 = aVar2.f317665b;
            }
            j17 = 0;
        }
        return j17 * f();
    }

    public final long f() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a() ? 60000L : 86400000L;
    }

    public final boolean g(int i17, com.tencent.mm.pluginsdk.model.a adBusinessType) {
        kotlin.jvm.internal.o.g(adBusinessType, "adBusinessType");
        int ordinal = adBusinessType.ordinal();
        if (ordinal == 0) {
            lb0.a aVar = (lb0.a) ((java.util.Map) ((jz5.n) f317671c).getValue()).get(java.lang.Integer.valueOf(i17));
            if (aVar != null) {
                return aVar.f317664a;
            }
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lb0.a aVar2 = (lb0.a) ((java.util.Map) ((jz5.n) f317670b).getValue()).get(java.lang.Integer.valueOf(i17));
            if (aVar2 != null) {
                return aVar2.f317664a;
            }
        }
        return false;
    }
}
