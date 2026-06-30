package p72;

/* loaded from: classes12.dex */
public final class k implements o72.b4 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f352499a = jz5.h.b(p72.g.f352487d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f352500b = jz5.h.b(new p72.h(this));

    @Override // o72.b4
    public void a() {
        java.lang.Object value = ((jz5.n) this.f352500b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.util.List<R> allObjects = ((com.tencent.wcdb.core.Table) value).getAllObjects(new com.tencent.wcdb.winq.OrderingTerm(up5.d.f429916d).order(com.tencent.wcdb.winq.Order.Desc), p72.f.class);
        kotlin.jvm.internal.o.f(allObjects, "getAllObjects(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", "------ printAllDelInfo ----- size:%s", java.lang.Integer.valueOf(allObjects.size()));
        java.util.Iterator it = allObjects.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", " ---- index:%s ----", 0);
            throw null;
        }
    }

    @Override // o72.b4
    public void b(java.util.List list, java.lang.String callMsg, int i17, int i18) {
        kotlin.jvm.internal.o.g(callMsg, "callMsg");
        if (list == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.i(list, i17, i18, callMsg, this));
    }

    @Override // o72.b4
    public void c(o72.r2 r2Var, java.lang.String callMsg, int i17, int i18) {
        kotlin.jvm.internal.o.g(callMsg, "callMsg");
        if (r2Var == null) {
            return;
        }
        pm0.v.O("THREAD.FavDelManager", new p72.j(r2Var, i17, i18, callMsg, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(o72.r2 r2Var, java.lang.String str, int i17, int i18) {
        jz5.g gVar = this.f352500b;
        try {
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            com.tencent.wcdb.orm.Field field = up5.d.f429915c;
            up5.r rVar = (up5.r) ((com.tencent.wcdb.core.Table) value).getFirstObject(field.eq(r2Var.field_id));
            up5.r rVar2 = rVar == null ? new up5.r() : rVar;
            rVar2.f430045a = r2Var.field_id;
            rVar2.f430046b = c01.id.c();
            rVar2.f430049e = com.tencent.mm.sdk.platformtools.z.f193105a + '_' + com.tencent.mm.sdk.platformtools.z.f193109e;
            rVar2.f430050f = i17;
            rVar2.f430051g = r2Var.field_type;
            rVar2.f430052h = r2Var.field_updateTime;
            rVar2.f430053i = rVar2.f430053i | i18;
            java.lang.Object value2 = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((com.tencent.wcdb.core.Table) value2).updateObject((com.tencent.wcdb.core.Table) rVar2, field.eq(rVar2.f430045a));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateDelInfoInner: %s, curInfoNull=");
            sb6.append(rVar == null);
            sb6.append("， replaceInfo:");
            sb6.append(rVar2);
            com.tencent.mars.xlog.Log.i("MicroMsg.FavDelMgr", sb6.toString(), java.lang.Integer.valueOf(r2Var.field_id));
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
