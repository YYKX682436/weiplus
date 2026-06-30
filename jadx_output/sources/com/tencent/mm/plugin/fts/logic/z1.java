package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes9.dex */
public class z1 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f137754n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.StringBuffer f137755o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l2 f137756p;

    public z1(com.tencent.mm.plugin.fts.logic.l2 l2Var, java.util.List list) {
        this.f137756p = l2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f137754n = arrayList;
        arrayList.addAll(list);
        this.f137755o = new java.lang.StringBuffer();
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertMessageTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.l2 l2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f137754n).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            l2Var = this.f137756p;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            com.tencent.mm.plugin.fts.logic.b2 b2Var = new com.tencent.mm.plugin.fts.logic.b2(l2Var, null);
            b2Var.f137464a = f9Var.getMsgId();
            b2Var.f137465b = f9Var.Q0();
            b2Var.f137466c = f9Var.getCreateTime();
            b2Var.f137467d = f9Var.j();
            b2Var.f137468e = f9Var.getType();
            b2Var.f137470g = f9Var.A0();
            if (com.tencent.mm.plugin.fts.logic.l2.b(l2Var, b2Var, null)) {
                b2Var.a();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b2Var.f137471h)) {
                    arrayList.add(b2Var);
                }
            }
        }
        java.lang.StringBuffer stringBuffer = this.f137755o;
        stringBuffer.append("{MsgId: ");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.fts.logic.b2 b2Var2 = (com.tencent.mm.plugin.fts.logic.b2) it6.next();
            stringBuffer.append(b2Var2.f137464a);
            stringBuffer.append(",");
            stringBuffer.append(b2Var2.f137465b);
            stringBuffer.append(",");
            stringBuffer.append(b2Var2.f137466c);
            stringBuffer.append(" ");
        }
        stringBuffer.append("count: ");
        stringBuffer.append(arrayList.size());
        stringBuffer.append("}");
        if (arrayList.size() > 0) {
            l2Var.f137609h.h();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.plugin.fts.logic.b2 b2Var3 = (com.tencent.mm.plugin.fts.logic.b2) it7.next();
                l2Var.f137609h.N(65536, b2Var3.f137469f, b2Var3.f137464a, b2Var3.f137465b, b2Var3.f137466c, b2Var3.f137471h, b2Var3.f137472i);
            }
            l2Var.f137609h.j();
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return this.f137755o.toString();
    }
}
