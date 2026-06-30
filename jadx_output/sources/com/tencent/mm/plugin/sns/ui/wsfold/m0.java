package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class m0 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f171404d;

    /* renamed from: e, reason: collision with root package name */
    public long f171405e = -1;

    public m0(int i17) {
        this.f171404d = i17;
    }

    @Override // ym3.a, ym3.f
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.j a(v65.i iVar, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        kotlinx.coroutines.flow.j a17 = a(iVar, (ym3.c) obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        return a17;
    }

    @Override // ym3.a
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        java.lang.Object obj = request.f463146d;
        if (!(obj instanceof java.lang.Long)) {
            kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
            v65.i.b(scope, null, new com.tencent.mm.plugin.sns.ui.wsfold.j0(request, this, b17, null), 1, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
            return b17;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj).longValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildDBCacheResponse", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        ym3.d dVar = new ym3.d(request);
        dVar.f463148b = true;
        com.tencent.mm.plugin.sns.storage.s2 y07 = com.tencent.mm.plugin.sns.model.l4.Qj().y0(longValue);
        byte[] bArr = y07 != null ? y07.field_groupStrcut : null;
        if (bArr != null) {
            try {
                if (!(bArr.length == 0)) {
                    r45.qb6 qb6Var = new r45.qb6();
                    qb6Var.parseFrom(bArr);
                    synchronized (jm0.k.f300270i) {
                        gm0.j1.b().c();
                        if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                            throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                        }
                        a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                    }
                    zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
                    java.util.LinkedList snsIds = qb6Var.f383810d;
                    kotlin.jvm.internal.o.f(snsIds, "snsIds");
                    for (java.lang.Long l17 : kz5.n0.K0(snsIds, java.lang.Math.min(this.f171404d, qb6Var.f383810d.size()))) {
                        if (l17 != null && longValue == l17.longValue()) {
                        }
                        kotlin.jvm.internal.o.d(l17);
                        xc4.p Y6 = gVar.Y6(l17.longValue());
                        if (Y6 != null) {
                            dVar.f463149c.add(new zc4.b(Y6, false));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsWsFoldDataUIC", "parse SnsWsGroupStruct fail:%s", e17.getMessage());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "load db count:" + dVar.f463149c.size() + " id:" + kz5.n0.g0(dVar.f463149c, ";", null, null, 0, null, com.tencent.mm.plugin.sns.ui.wsfold.i0.f171388d, 30, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildDBCacheResponse", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        kotlinx.coroutines.flow.i2 b18 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new xm3.q0(b18, dVar, null), 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource");
        return b18;
    }
}
