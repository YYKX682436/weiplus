package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public final class e extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashSet f137502n;

    /* renamed from: o, reason: collision with root package name */
    public int f137503o;

    /* renamed from: p, reason: collision with root package name */
    public int f137504p;

    /* renamed from: q, reason: collision with root package name */
    public int f137505q;

    /* renamed from: r, reason: collision with root package name */
    public int f137506r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.k f137507s;

    public e(com.tencent.mm.plugin.fts.logic.k kVar) {
        this.f137507s = kVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "BuildChatroomMemberIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.a aVar;
        w13.a aVar2;
        o13.t tVar;
        if (this.f137502n == null) {
            this.f137502n = new java.util.HashSet();
            p75.i0 g17 = p13.a.f351060a.g(kz5.b0.c(p13.a.f351061b));
            g17.f352656c = "MicroMsg.FTS.FTS5SearchChatroomMemberLogic";
            p75.l0 a17 = g17.a();
            w13.a aVar3 = this.f137507s.f137577g;
            if (aVar3 != null && (tVar = aVar3.f342198f) != null) {
                android.database.Cursor o17 = ((com.tencent.mm.plugin.fts.o) tVar).o(a17.f352636a, a17.f352637b);
                while (true) {
                    try {
                        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
                        if (!cursorWrapper.moveToNext()) {
                            break;
                        }
                        java.util.HashSet hashSet = this.f137502n;
                        if (hashSet != null) {
                            hashSet.add(cursorWrapper.getString(0));
                        }
                    } finally {
                    }
                }
                vz5.b.a(o17, null);
            }
            java.util.HashSet hashSet2 = this.f137502n;
            this.f137504p = hashSet2 != null ? hashSet2.size() : 0;
        }
        o("getBuildChatroomSet");
        while (!java.lang.Thread.interrupted()) {
            p75.i0 g18 = dm.x1.N.g(kz5.c0.i(dm.x1.Q, dm.x1.R, dm.x1.T));
            g18.f352656c = "MicroMsg.FTS.FTS5SearchChatroomMemberLogic";
            g18.c(50, this.f137503o);
            g18.f352659f = kz5.b0.c(dm.x1.P.v());
            p75.l0 a18 = g18.a();
            java.util.ArrayList arrayList = new java.util.ArrayList(50);
            java.util.List k17 = a18.k(gm0.j1.u().f273153f, com.tencent.mm.storage.a3.class);
            com.tencent.mm.plugin.fts.logic.k kVar = this.f137507s;
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.a3 a3Var = (com.tencent.mm.storage.a3) it.next();
                if (!kVar.k(a3Var)) {
                    arrayList.add(a3Var);
                }
            }
            if (arrayList.isEmpty()) {
                o("buildChatroomMemberIndex");
                java.util.HashSet hashSet3 = this.f137502n;
                if (hashSet3 != null) {
                    java.util.HashSet<java.lang.String> hashSet4 = hashSet3.isEmpty() ^ true ? hashSet3 : null;
                    if (hashSet4 != null) {
                        com.tencent.mm.plugin.fts.logic.k kVar2 = this.f137507s;
                        for (java.lang.String str : hashSet4) {
                            this.f137506r++;
                            w13.a aVar4 = kVar2.f137577g;
                            if (aVar4 != null) {
                                aVar4.m0(new int[]{2097168}, str);
                            }
                        }
                    }
                }
                o("deleteUnuseChatroom");
                return true;
            }
            this.f137503o += 50;
            w13.a aVar5 = this.f137507s.f137577g;
            if (!(aVar5 != null && ((com.tencent.mm.plugin.fts.o) aVar5.f342198f).m()) && (aVar2 = this.f137507s.f137577g) != null) {
                aVar2.h();
            }
            java.util.Iterator it6 = arrayList.iterator();
            kotlin.jvm.internal.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                com.tencent.mm.storage.a3 a3Var2 = (com.tencent.mm.storage.a3) next;
                java.util.HashSet hashSet5 = this.f137502n;
                if (hashSet5 != null && hashSet5.remove(a3Var2.field_chatroomname)) {
                    it6.remove();
                } else {
                    this.f137505q++;
                    com.tencent.mm.plugin.fts.logic.k.j(this.f137507s, a3Var2);
                }
            }
            w13.a aVar6 = this.f137507s.f137577g;
            if ((aVar6 != null && ((com.tencent.mm.plugin.fts.o) aVar6.f342198f).m()) && (aVar = this.f137507s.f137577g) != null) {
                aVar.j();
            }
        }
        throw new java.lang.InterruptedException();
    }

    @Override // p13.c
    public java.lang.String j() {
        java.lang.String format = java.lang.String.format("{build: " + this.f137504p + " new: " + this.f137505q + ", remove: " + this.f137506r, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
