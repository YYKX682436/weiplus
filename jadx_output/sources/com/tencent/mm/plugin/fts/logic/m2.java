package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class m2 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f137628n;

    /* renamed from: o, reason: collision with root package name */
    public long f137629o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f137630p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.q2 f137631q;

    public m2(com.tencent.mm.plugin.fts.logic.q2 q2Var) {
        this.f137631q = q2Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "AddSOSHistoryTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.i iVar = this.f137631q.f137654e;
        java.lang.String str = this.f137628n;
        long j17 = this.f137629o;
        java.lang.String str2 = this.f137630p;
        iVar.f442218f.bindString(1, str);
        iVar.f442218f.bindLong(2, j17);
        iVar.f442218f.bindString(3, str2);
        iVar.f442218f.execute();
        return true;
    }
}
