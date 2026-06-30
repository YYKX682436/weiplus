package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final t13.k f138115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.o2 f138116e;

    public m2(com.tencent.mm.plugin.fts.ui.o2 o2Var, t13.k unit, java.lang.String query) {
        kotlin.jvm.internal.o.g(unit, "unit");
        kotlin.jvm.internal.o.g(query, "query");
        this.f138116e = o2Var;
        this.f138115d = unit;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.ui.o2 o2Var = this.f138116e;
        java.util.LinkedList linkedList = o2Var.f138132q;
        if (linkedList != null) {
            if (!o2Var.f138133r && ((t13.k) linkedList.get(linkedList.size() - 1)).getType() == this.f138115d.getType()) {
                o2Var.f138133r = true;
            }
            java.util.LinkedList linkedList2 = o2Var.f138132q;
            java.util.Iterator it = linkedList2.iterator();
            int i17 = 0;
            int i18 = 0;
            while (it.hasNext()) {
                i18 = ((t13.k) it.next()).j(i18);
            }
            o2Var.n(i18);
            o2Var.notifyDataSetChanged();
            o2Var.l(i18, o2Var.f138133r);
            if (o2Var.f138133r) {
                if (linkedList2 != null) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (it6.hasNext()) {
                        i17 += ((t13.k) it6.next()).e();
                    }
                }
                g23.j.f267934e = i17;
                com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct kFContactSessionSearchLogStruct = new com.tencent.mm.autogen.mmdata.rpt.KFContactSessionSearchLogStruct();
                kFContactSessionSearchLogStruct.q(g23.j.f267932c);
                kFContactSessionSearchLogStruct.f58543d = 5L;
                kFContactSessionSearchLogStruct.f58544e = g23.j.f267931b;
                kFContactSessionSearchLogStruct.p(g23.j.f267933d);
                kFContactSessionSearchLogStruct.f58546g = g23.j.f267934e;
                kFContactSessionSearchLogStruct.k();
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSKefuBoxReporter", "report 29105 " + kFContactSessionSearchLogStruct.m());
            }
        }
    }
}
