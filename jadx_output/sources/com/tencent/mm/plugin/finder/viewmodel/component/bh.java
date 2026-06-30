package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.bh f133877a;

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.j2 f133878b;

    /* renamed from: c, reason: collision with root package name */
    public static final l75.z0 f133879c;

    /* renamed from: d, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.j2 f133880d;

    /* renamed from: e, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.j2 f133881e;

    /* renamed from: f, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.j2 f133882f;

    /* renamed from: g, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.f3 f133883g;

    /* renamed from: h, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.f3 f133884h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile kotlinx.coroutines.r2 f133885i;

    static {
        com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = new com.tencent.mm.plugin.finder.viewmodel.component.bh();
        f133877a = bhVar;
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, 0)));
        f133878b = a17;
        com.tencent.mm.plugin.finder.viewmodel.component.kg kgVar = com.tencent.mm.plugin.finder.viewmodel.component.kg.f134966d;
        f133879c = kgVar;
        gm0.j1.u().c().a(kgVar);
        com.tencent.mars.xlog.Log.i("Finder.FollowAggregationRepo", "init: configStg listener registered, initial followCount=" + ((java.lang.Number) ((kotlinx.coroutines.flow.h3) a17).getValue()).intValue());
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(kz5.p0.f313996d);
        f133880d = a18;
        f133881e = kotlinx.coroutines.flow.i3.a(com.tencent.mm.plugin.finder.viewmodel.component.ig.f134739d);
        f133882f = kotlinx.coroutines.flow.i3.a(null);
        kotlinx.coroutines.y0 a19 = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        kotlinx.coroutines.flow.y1 y1Var = new kotlinx.coroutines.flow.y1(kotlinx.coroutines.flow.l.i(new com.tencent.mm.plugin.finder.viewmodel.component.xg(a18)), new com.tencent.mm.plugin.finder.viewmodel.component.ng(null));
        kotlinx.coroutines.flow.w2 w2Var = kotlinx.coroutines.flow.v2.f310429a;
        kotlinx.coroutines.flow.f3 q17 = kotlinx.coroutines.flow.l.q(y1Var, a19, w2Var, bhVar.b(((java.util.List) ((kotlinx.coroutines.flow.h3) a18).getValue()).isEmpty()));
        f133883g = q17;
        kotlinx.coroutines.flow.j i17 = kotlinx.coroutines.flow.l.i(new com.tencent.mm.plugin.finder.viewmodel.component.ah(q17));
        com.tencent.mm.plugin.finder.viewmodel.component.hg hgVar = (com.tencent.mm.plugin.finder.viewmodel.component.hg) ((kotlinx.coroutines.flow.l2) q17).getValue();
        f133884h = kotlinx.coroutines.flow.l.q(i17, a19, w2Var, java.lang.Boolean.valueOf(hgVar == com.tencent.mm.plugin.finder.viewmodel.component.hg.f134629d || hgVar == com.tencent.mm.plugin.finder.viewmodel.component.hg.f134630e));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar, androidx.appcompat.app.AppCompatActivity appCompatActivity, bw5.ig igVar, com.tencent.mm.protobuf.g gVar) {
        boolean z17;
        java.lang.String str;
        bhVar.getClass();
        if (igVar != null) {
            java.util.LinkedList<bw5.hg> linkedList = igVar.f28571d;
            char c17 = 1;
            boolean z18 = false;
            if ((linkedList == null || linkedList.isEmpty()) == false) {
                kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) f133882f;
                bw5.ig igVar2 = (bw5.ig) h3Var.getValue();
                java.lang.Object[] objArr = gVar == null;
                boolean b17 = kotlin.jvm.internal.o.b(igVar2 != null ? igVar2.getLastBuffer() : null, gVar);
                if (objArr == false) {
                    if (!b17) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("applyResponse: lastBuffer mismatch, drop. old.continueFlag=");
                        sb6.append(igVar2 != null ? java.lang.Integer.valueOf(igVar2.f28572e) : null);
                        com.tencent.mars.xlog.Log.w("Finder.FollowAggregationRepo", sb6.toString());
                        return;
                    }
                    z18 = true;
                }
                kotlin.jvm.internal.o.f(linkedList, "getItems(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                for (bw5.hg hgVar : linkedList) {
                    bw5.ae b18 = hgVar.b();
                    java.lang.String str2 = b18.Z[2] ? b18.f25145e : "";
                    bw5.ae b19 = hgVar.b();
                    java.lang.String str3 = b19.Z[3] ? b19.f25146f : "";
                    boolean z19 = hgVar.f28206e;
                    bw5.ae b27 = hgVar.b();
                    if (b27.Z[c17]) {
                        z17 = z18;
                        str = b27.f25144d;
                    } else {
                        z17 = z18;
                        str = "";
                    }
                    arrayList.add(new com.tencent.mm.plugin.finder.viewmodel.component.lz(str2, str3, z19, str, java.lang.Long.valueOf(hgVar.f28207f)));
                    z18 = z17;
                    c17 = 1;
                }
                boolean z27 = z18;
                kotlinx.coroutines.flow.j2 j2Var = f133880d;
                while (true) {
                    kotlinx.coroutines.flow.h3 h3Var2 = (kotlinx.coroutines.flow.h3) j2Var;
                    java.lang.Object value = h3Var2.getValue();
                    java.util.List list = (java.util.List) value;
                    java.util.List t07 = z27 ? kz5.n0.t0(list, arrayList) : arrayList;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("applyResponse append=");
                    boolean z28 = z27;
                    sb7.append(z28);
                    sb7.append(": old.size=");
                    sb7.append(list.size());
                    sb7.append(" -> new.size=");
                    sb7.append(t07.size());
                    com.tencent.mars.xlog.Log.i("Finder.FollowAggregationRepo", sb7.toString());
                    if (h3Var2.j(value, t07)) {
                        break;
                    } else {
                        z27 = z28;
                    }
                }
                h3Var.k(igVar);
                if (igVar.f28572e == 0 || igVar.getLastBuffer() == null) {
                    return;
                }
                bhVar.e(appCompatActivity, true);
                return;
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("applyResponse: resp null or empty, resp=");
        sb8.append(igVar != null ? com.tencent.mm.plugin.finder.viewmodel.component.i00.a(igVar) : null);
        com.tencent.mars.xlog.Log.w("Finder.FollowAggregationRepo", sb8.toString());
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.hg b(boolean z17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z18 = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127627bh).getValue()).r()).booleanValue() && !z17;
        return (z18 && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127646ch).getValue()).r()).booleanValue()) ? com.tencent.mm.plugin.finder.viewmodel.component.hg.f134632g : z18 ? com.tencent.mm.plugin.finder.viewmodel.component.hg.f134631f : ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127646ch).getValue()).r()).booleanValue() ? com.tencent.mm.plugin.finder.viewmodel.component.hg.f134630e : com.tencent.mm.plugin.finder.viewmodel.component.hg.f134629d;
    }

    public final void c() {
        if (f133885i != null) {
            return;
        }
        synchronized (this) {
            if (f133885i != null) {
                return;
            }
            c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
            kotlinx.coroutines.y0 y0Var = l7Var != null ? l7Var.U : null;
            if (y0Var == null) {
                com.tencent.mars.xlog.Log.w("Finder.FollowAggregationRepo", "ensureResetWatcher: FinderCommonFeatureService unavailable, skip");
                return;
            }
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.mg(null), 3, null);
            ((kotlinx.coroutines.c3) d17).p(com.tencent.mm.plugin.finder.viewmodel.component.lg.f135064d);
            f133885i = d17;
        }
    }

    public final void d(java.lang.String username) {
        kotlinx.coroutines.flow.h3 h3Var;
        java.lang.Object value;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(username, "username");
        kotlinx.coroutines.flow.j2 j2Var = f133880d;
        do {
            h3Var = (kotlinx.coroutines.flow.h3) j2Var;
            value = h3Var.getValue();
            java.util.List<com.tencent.mm.plugin.finder.viewmodel.component.lz> list = (java.util.List) value;
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar : list) {
                if (kotlin.jvm.internal.o.b(lzVar.f135100d, username) && lzVar.f135099c) {
                    lzVar = new com.tencent.mm.plugin.finder.viewmodel.component.lz(lzVar.f135097a, lzVar.f135098b, false, lzVar.f135100d, lzVar.f135101e);
                }
                arrayList.add(lzVar);
            }
        } while (!h3Var.j(value, arrayList));
    }

    public final void e(androidx.appcompat.app.AppCompatActivity activity, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        c();
        kotlinx.coroutines.l.d(v65.m.b(activity), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.ug(z17, activity, null), 3, null);
    }
}
