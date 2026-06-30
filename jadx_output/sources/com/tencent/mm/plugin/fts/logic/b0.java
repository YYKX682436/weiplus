package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class b0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f137457n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137458o;

    public b0(com.tencent.mm.plugin.fts.logic.l lVar, long j17) {
        this.f137458o = lVar;
        this.f137457n = j17;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137458o;
        com.tencent.mm.plugin.fts.p pVar = (com.tencent.mm.plugin.fts.p) lVar.f137589h;
        long j17 = this.f137457n;
        p13.k c17 = pVar.c(j17);
        if (c17 != null) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) w13.d.f442210a.a(lVar.f137593o)).get(java.lang.Long.valueOf(j17));
            if (list == null) {
                list = new java.util.ArrayList();
            }
            com.tencent.mm.plugin.fts.logic.l lVar2 = this.f137458o;
            long j18 = c17.f351107a;
            lVar2.l(j18, c17.f351108b, list, j18);
        }
        lVar.f137594p.remove(java.lang.Long.valueOf(j17));
        return true;
    }
}
