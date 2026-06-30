package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class f0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public boolean f137525n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f137526o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137527p;

    public f0(com.tencent.mm.plugin.fts.logic.l lVar, java.lang.String str) {
        this.f137527p = lVar;
        this.f137526o = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "MarkContactTimestampTask";
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137527p;
        java.util.HashMap hashMap = lVar.f137591m;
        java.lang.String str = this.f137526o;
        if (hashMap.containsKey(str)) {
            this.f137525n = true;
            return true;
        }
        if (!lVar.f137590i.add(str)) {
            this.f137525n = true;
            return true;
        }
        if (!lVar.p(((com.tencent.mm.plugin.fts.p) lVar.f137589h).a(str))) {
            this.f137525n = true;
            return true;
        }
        w13.b bVar = lVar.f137588g;
        bVar.f342204o.bindLong(1, 2L);
        bVar.f342204o.bindString(2, str);
        bVar.f342204o.bindLong(3, 0L);
        bVar.f342204o.execute();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{username: %s isSkipped: %b}", this.f137526o, java.lang.Boolean.valueOf(this.f137525n));
    }
}
