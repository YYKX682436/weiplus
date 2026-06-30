package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f122296a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.model.y9 f122297b = new com.tencent.mm.plugin.finder.feed.model.y9();

    /* renamed from: c, reason: collision with root package name */
    public r45.vx0 f122298c;

    public final jz5.l a(long j17, r45.vx0 vx0Var, boolean z17) {
        com.tencent.mm.plugin.finder.playlist.b bVar;
        java.util.List list;
        java.lang.Object obj;
        java.lang.Object obj2;
        this.f122298c = vx0Var;
        if (!this.f122296a.isEmpty()) {
            this.f122296a.clear();
        }
        boolean z18 = false;
        long j18 = vx0Var != null ? vx0Var.getLong(0) : 0L;
        int integer = vx0Var != null ? vx0Var.getInteger(10) : 0;
        if (z17) {
            synchronized (com.tencent.mm.plugin.finder.playlist.c.f122265a) {
                list = (java.util.List) ((java.util.LinkedHashMap) com.tencent.mm.plugin.finder.playlist.c.f122266b).get(new com.tencent.mm.plugin.finder.playlist.a(j18, integer));
            }
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((com.tencent.mm.plugin.finder.playlist.z1) obj).f122508d) {
                        break;
                    }
                }
                com.tencent.mm.plugin.finder.playlist.z1 z1Var = (com.tencent.mm.plugin.finder.playlist.z1) obj;
                if (z1Var != null && z1Var.getItemId() != j17) {
                    z1Var.f122508d = false;
                }
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (j17 == ((com.tencent.mm.plugin.finder.playlist.z1) obj2).getItemId()) {
                        break;
                    }
                }
                com.tencent.mm.plugin.finder.playlist.z1 z1Var2 = (com.tencent.mm.plugin.finder.playlist.z1) obj2;
                if (z1Var2 != null) {
                    z1Var2.f122508d = true;
                }
                this.f122296a.addAll(list);
                com.tencent.mars.xlog.Log.i("Finder.FinderPlayListLoader", "onAttach hit data cache, size: " + list.size());
                z18 = true;
            }
            synchronized (com.tencent.mm.plugin.finder.playlist.c.f122265a) {
                bVar = (com.tencent.mm.plugin.finder.playlist.b) ((java.util.LinkedHashMap) com.tencent.mm.plugin.finder.playlist.c.f122267c).get(new com.tencent.mm.plugin.finder.playlist.a(j18, integer));
            }
        } else {
            bVar = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListLoader", "onAttach id: " + j18 + ", extra:" + bVar + ", hitCache:" + z18);
        if (!z18) {
            return new jz5.l(new com.tencent.mm.plugin.finder.playlist.b(null, true, true), java.lang.Boolean.valueOf(z18));
        }
        kotlin.jvm.internal.o.d(bVar);
        return new jz5.l(bVar, java.lang.Boolean.valueOf(z18));
    }
}
