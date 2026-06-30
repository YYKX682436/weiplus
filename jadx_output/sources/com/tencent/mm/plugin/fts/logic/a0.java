package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class a0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137446n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f137447o = false;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137448p;

    public a0(com.tencent.mm.plugin.fts.logic.l lVar, java.lang.String str) {
        this.f137448p = lVar;
        this.f137446n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertContactTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f137446n;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "Insert Contact %s", str);
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137448p;
        com.tencent.mm.storage.z3 a17 = ((com.tencent.mm.plugin.fts.p) lVar.f137589h).a(str);
        if (a17.d1().length() <= 0 || !lVar.p(a17)) {
            this.f137447o = true;
        } else {
            lVar.k(a17);
        }
        lVar.f137591m.remove(str);
        lVar.f137590i.remove(str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s isSkipped: %b}", this.f137446n, java.lang.Boolean.valueOf(this.f137447o));
    }
}
