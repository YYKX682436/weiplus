package p72;

/* loaded from: classes12.dex */
public final class e implements o72.b4 {

    /* renamed from: a, reason: collision with root package name */
    public final p75.n0 f352485a = dm.l3.f238208p;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f352486b = jz5.h.b(p72.b.f352474d);

    @Override // o72.b4
    public void a() {
        p75.i0 i17 = this.f352485a.i();
        i17.e(dm.l3.f238210r.u());
        java.util.ArrayList arrayList = (java.util.ArrayList) i17.a().k((l75.k0) ((jz5.n) this.f352486b).getValue(), p72.a.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", "------ printAllDelInfo ----- size:%s", java.lang.Integer.valueOf(arrayList.size()));
        java.util.Iterator it = arrayList.iterator();
        int i18 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", " ---- index:%s ----", java.lang.Integer.valueOf(i18));
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", ((p72.a) next).toString());
            i18 = i19;
        }
    }

    @Override // o72.b4
    public void b(java.util.List list, java.lang.String callMsg, int i17, int i18) {
        kotlin.jvm.internal.o.g(callMsg, "callMsg");
        if (list == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.c(list, i17, i18, callMsg, this));
    }

    @Override // o72.b4
    public void c(o72.r2 r2Var, java.lang.String callMsg, int i17, int i18) {
        kotlin.jvm.internal.o.g(callMsg, "callMsg");
        if (r2Var == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.d(r2Var, i17, i18, callMsg, this));
    }

    public final void d(o72.r2 r2Var, java.lang.String str, int i17, int i18) {
        try {
            int i19 = r2Var.field_id;
            p75.i0 i27 = dm.l3.f238208p.i();
            i27.f352657d = dm.l3.f238209q.i(java.lang.Integer.valueOf(i19));
            i27.f352656c = "MicroMsg.SDK.BaseFavDelInfo";
            p75.l0 a17 = i27.a();
            jz5.g gVar = this.f352486b;
            p72.a aVar = (p72.a) a17.o((l75.k0) ((jz5.n) gVar).getValue(), p72.a.class);
            p72.a aVar2 = aVar == null ? new p72.a() : aVar;
            aVar2.D0(r2Var.field_id);
            aVar2.z0(c01.id.c());
            aVar2.w0(com.tencent.mm.sdk.platformtools.z.f193105a + '_' + com.tencent.mm.sdk.platformtools.z.f193109e);
            aVar2.A0(i17);
            aVar2.F0(r2Var.field_type);
            aVar2.G0(r2Var.field_updateTime);
            aVar2.y0(aVar2.t0() | i18);
            long a18 = new m75.d(aVar2, null, null, "MicroMsg.SDK.BaseFavDelInfo").a((l75.k0) ((jz5.n) gVar).getValue());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfoInner: %s, curInfoNull=");
            sb6.append(aVar == null);
            sb6.append("， replaceInfo:");
            sb6.append(aVar2);
            sb6.append(" replaceRet:%s");
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", sb6.toString(), java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(a18));
            com.tencent.mm.autogen.mmdata.rpt.FavSpecificActionStruct favSpecificActionStruct = new com.tencent.mm.autogen.mmdata.rpt.FavSpecificActionStruct();
            favSpecificActionStruct.f56307d = 1L;
            favSpecificActionStruct.f56310g = r2Var.field_id;
            favSpecificActionStruct.f56308e = i17;
            favSpecificActionStruct.f56309f = i18;
            favSpecificActionStruct.k();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavDelMgr", th6, "updateDelInfoInner err", new java.lang.Object[0]);
        }
    }
}
