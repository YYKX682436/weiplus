package j20;

@j95.b
/* loaded from: classes9.dex */
public final class o extends i95.w implements c00.y3 {

    /* renamed from: f, reason: collision with root package name */
    public float f297239f;

    /* renamed from: g, reason: collision with root package name */
    public float f297240g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f297237d = jz5.h.b(j20.m.f297233d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f297238e = jz5.h.b(j20.l.f297232d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f297241h = jz5.h.b(new j20.i(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f297242i = jz5.h.b(new j20.k(this));

    public static final java.util.List wi(j20.o oVar) {
        return (java.util.List) ((jz5.n) oVar.f297237d).getValue();
    }

    public final bw5.r6 Ai(int i17, float f17, float f18, long j17) {
        bw5.r6 r6Var = new bw5.r6();
        r6Var.f32413d = i17;
        boolean[] zArr = r6Var.f32417h;
        zArr[1] = true;
        r6Var.f32414e = f17;
        zArr[2] = true;
        r6Var.f32415f = f18;
        zArr[3] = true;
        r6Var.f32416g = j17;
        zArr[4] = true;
        return r6Var;
    }

    public final bw5.r6 Bi() {
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().f((i11.c) ((jz5.n) this.f297241h).getValue());
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        long j17 = i11.h.e().f287099h;
        jz5.l Di = Di();
        long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_WESHOP_LOCATION_TIME_LONG, 0L);
        boolean z17 = this.f297239f == 0.0f;
        java.lang.Object obj = Di.f302834e;
        java.lang.Object obj2 = Di.f302833d;
        if (z17) {
            if (this.f297240g == 0.0f) {
                if (((java.lang.Number) obj2).floatValue() == 0.0f) {
                    if (((java.lang.Number) obj).floatValue() == 0.0f) {
                        return Ai(105, 0.0f, 0.0f, 0L);
                    }
                }
            }
        }
        if (this.f297239f == 0.0f) {
            if (this.f297240g == 0.0f) {
                return Ai(1, ((java.lang.Number) obj2).floatValue(), ((java.lang.Number) obj).floatValue(), t17);
            }
        }
        if (((java.lang.Number) obj2).floatValue() == 0.0f) {
            if (((java.lang.Number) obj).floatValue() == 0.0f) {
                return Ai(1, this.f297239f, this.f297240g, j17);
            }
        }
        long c17 = c01.id.c();
        long j18 = c17 - t17;
        long j19 = c17 - j17;
        com.tencent.mars.xlog.Log.i("EcsPoiService", "curTime:" + c17 + ", storeDiffTime:" + j18 + '(' + Di + "), cacheDiffTime:" + j19 + '(' + this.f297239f + ':' + this.f297240g + ')');
        return j18 <= j19 ? Ai(1, ((java.lang.Number) obj2).floatValue(), ((java.lang.Number) obj).floatValue(), t17) : Ai(1, this.f297239f, this.f297240g, j17);
    }

    public final jz5.l Di() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WESHOP_LOCATION_STRING, ";");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.util.List e07 = r26.n0.e0((java.lang.String) m17, new char[]{';'}, false, 0, 6, null);
        int size = e07.size();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (size < 2) {
            return new jz5.l(valueOf, valueOf);
        }
        java.lang.Float f17 = r26.g0.f((java.lang.String) e07.get(0));
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        java.lang.Float f18 = r26.g0.f((java.lang.String) e07.get(1));
        return new jz5.l(java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(f18 != null ? f18.floatValue() : 0.0f));
    }

    public final void Ni(float f17, float f18) {
        long c17 = c01.id.c();
        com.tencent.mars.xlog.Log.i("EcsPoiService", "[storeLocation] longitude=" + f17 + " latitude=" + f18 + " time=" + c17);
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WESHOP_LOCATION_STRING;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f17);
        sb6.append(';');
        sb6.append(f18);
        c18.x(u3Var, sb6.toString());
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WESHOP_LOCATION_TIME_LONG, java.lang.Long.valueOf(c17));
    }

    public bw5.r6 Ri(int i17, int i18) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("EcsPoiService", i17 + " syncGetAndUpdatePoiInfo account not ready");
            return Ai(107, 0.0f, 0.0f, 0L);
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false);
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.G);
        if (!d17 || !Ri) {
            com.tencent.mars.xlog.Log.w("EcsPoiService", "source:" + i17 + " syncGetAndUpdatePoiInfo hasSystemPermission:" + d17 + " hasBusinessPermission:" + Ri);
            return !d17 ? Ai(104, 0.0f, 0.0f, 0L) : Ai(103, 0.0f, 0.0f, 0L);
        }
        bw5.r6 Bi = Bi();
        long c17 = c01.id.c();
        boolean z17 = i18 > 0 && ((long) (i18 * 1000)) < c17 - Bi.f32416g;
        com.tencent.mars.xlog.Log.i("EcsPoiService", "source:" + i17 + " syncGetAndUpdatePoiInfo needUpdatePoi:" + z17 + ",curTime:" + c17 + ", cache time:" + Bi.f32416g);
        if (!z17) {
            return Bi;
        }
        ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f297238e).getValue()).post(new j20.n(null, this, 0));
        return Bi;
    }
}
