package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class z extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f137751n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137752o;

    public z(com.tencent.mm.plugin.fts.logic.l lVar, long j17) {
        this.f137752o = lVar;
        this.f137751n = j17;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137752o;
        w13.b bVar = lVar.f137588g;
        int[] iArr = o13.d.f342224j;
        long j17 = this.f137751n;
        bVar.m0(iArr, java.lang.String.valueOf(j17));
        lVar.f137594p.remove(java.lang.Long.valueOf(j17));
        return true;
    }
}
