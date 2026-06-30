package r8;

/* loaded from: classes15.dex */
public final class c extends r8.e {

    /* renamed from: b, reason: collision with root package name */
    public long f393280b;

    public c(q8.o oVar) {
        super(oVar);
        this.f393280b = -9223372036854775807L;
    }

    public static java.lang.Object b(t9.p pVar, int i17) {
        if (i17 == 0) {
            return java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(pVar.h()));
        }
        if (i17 == 1) {
            return java.lang.Boolean.valueOf(pVar.m() == 1);
        }
        if (i17 == 2) {
            return d(pVar);
        }
        if (i17 != 3) {
            if (i17 == 8) {
                return c(pVar);
            }
            if (i17 != 10) {
                if (i17 != 11) {
                    return null;
                }
                java.util.Date date = new java.util.Date((long) java.lang.Double.valueOf(java.lang.Double.longBitsToDouble(pVar.h())).doubleValue());
                pVar.x(2);
                return date;
            }
            int p17 = pVar.p();
            java.util.ArrayList arrayList = new java.util.ArrayList(p17);
            for (int i18 = 0; i18 < p17; i18++) {
                arrayList.add(b(pVar, pVar.m()));
            }
            return arrayList;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        while (true) {
            java.lang.String d17 = d(pVar);
            int m17 = pVar.m();
            if (m17 == 9) {
                return hashMap;
            }
            hashMap.put(d17, b(pVar, m17));
        }
    }

    public static java.util.HashMap c(t9.p pVar) {
        int p17 = pVar.p();
        java.util.HashMap hashMap = new java.util.HashMap(p17);
        for (int i17 = 0; i17 < p17; i17++) {
            hashMap.put(d(pVar), b(pVar, pVar.m()));
        }
        return hashMap;
    }

    public static java.lang.String d(t9.p pVar) {
        int r17 = pVar.r();
        int i17 = pVar.f416541b;
        pVar.x(r17);
        return new java.lang.String(pVar.f416540a, i17, r17);
    }

    public void a(t9.p pVar, long j17) {
        if (pVar.m() != 2) {
            throw new m8.x();
        }
        if ("onMetaData".equals(d(pVar)) && pVar.m() == 8) {
            java.util.HashMap c17 = c(pVar);
            if (c17.containsKey("duration")) {
                double doubleValue = ((java.lang.Double) c17.get("duration")).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f393280b = (long) (doubleValue * 1000000.0d);
                }
            }
        }
    }
}
