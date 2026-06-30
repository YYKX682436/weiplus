package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class x2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f137733n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.StringBuffer f137734o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f137735p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.e3 f137736q;

    public x2(com.tencent.mm.plugin.fts.logic.e3 e3Var, java.util.List list, java.lang.String str) {
        this.f137736q = e3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f137733n = arrayList;
        arrayList.addAll(list);
        this.f137734o = new java.lang.StringBuffer();
        this.f137735p = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertServiceNotifyMsgTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.e3 e3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f137733n).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            e3Var = this.f137736q;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            com.tencent.mm.plugin.fts.logic.y2 y2Var = new com.tencent.mm.plugin.fts.logic.y2(e3Var, null);
            y2Var.f137744a = f9Var.getMsgId();
            y2Var.f137746c = f9Var.getCreateTime();
            y2Var.f137747d = f9Var.j();
            java.lang.String str = this.f137735p;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                y2Var.f137745b = f9Var.Q0();
            } else {
                y2Var.f137745b = str;
            }
            y2Var.a();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(y2Var.f137749f)) {
                arrayList.add(y2Var);
            }
        }
        java.lang.StringBuffer stringBuffer = this.f137734o;
        stringBuffer.append("{MsgId: ");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.plugin.fts.logic.y2 y2Var2 = (com.tencent.mm.plugin.fts.logic.y2) it6.next();
            stringBuffer.append(y2Var2.f137744a);
            stringBuffer.append(",");
            stringBuffer.append(y2Var2.f137745b);
            stringBuffer.append(",");
            stringBuffer.append(y2Var2.f137746c);
            stringBuffer.append(" ");
        }
        stringBuffer.append("count: ");
        stringBuffer.append(arrayList.size());
        stringBuffer.append("}");
        if (arrayList.size() > 0) {
            e3Var.f137517h.h();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.plugin.fts.logic.y2 y2Var3 = (com.tencent.mm.plugin.fts.logic.y2) it7.next();
                e3Var.f137517h.N(524288, y2Var3.f137748e, y2Var3.f137744a, y2Var3.f137745b, y2Var3.f137746c, y2Var3.f137749f, y2Var3.f137750g);
            }
            e3Var.f137517h.j();
        }
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return this.f137734o.toString();
    }
}
