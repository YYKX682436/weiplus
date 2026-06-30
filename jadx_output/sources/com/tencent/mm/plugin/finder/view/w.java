package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public abstract class w extends al5.a0 {

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.HashMap f133270o;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f133271e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f133272f;

    /* renamed from: g, reason: collision with root package name */
    public final pj4.t f133273g;

    /* renamed from: h, reason: collision with root package name */
    public al5.z f133274h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f133275i;

    /* renamed from: m, reason: collision with root package name */
    public final im5.c f133276m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.t f133277n;

    static {
        new com.tencent.mm.plugin.finder.view.s(null);
        f133270o = new java.util.HashMap();
    }

    public w(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, pj4.t pullDownParam) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(pullDownParam, "pullDownParam");
        this.f133271e = context;
        this.f133272f = finderObject;
        this.f133273g = pullDownParam;
        im5.c cVar = new im5.c();
        this.f133276m = cVar;
        cVar.keep(com.tencent.mm.plugin.finder.view.r.f132914d);
    }

    @Override // al5.a0
    public void g() {
        com.tencent.mm.plugin.finder.view.t tVar;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        this.f5862d = false;
        com.tencent.mm.plugin.finder.view.t tVar2 = this.f133277n;
        if (tVar2 != null) {
            md0.e eVar = (md0.e) ((nd0.e) i95.n0.c(nd0.e.class));
            android.content.Context context = this.f133271e;
            pj4.p0 p0Var = (pj4.p0) eVar.Ui(context, 9, pj4.p0.class);
            r45.qt2 qt2Var = new r45.qt2();
            if (p0Var != null) {
                qt2Var.set(1, p0Var.f355236d);
                qt2Var.set(5, 106);
            }
            long c17 = c01.id.c();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.protocal.protobuf.FinderObject feed = this.f133272f;
            kotlin.jvm.internal.o.g(feed, "feed");
            r45.vd6 vd6Var = new r45.vd6();
            vd6Var.set(0, java.lang.Long.valueOf(feed.getId()));
            r45.dm2 object_extend = feed.getObject_extend();
            vd6Var.set(28, object_extend != null ? object_extend.getString(62) : null);
            vd6Var.set(4, feed.getObjectNonceId());
            vd6Var.set(2, new r45.yw6());
            vd6Var.set(3, new r45.q25());
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = feed.getObjectDesc();
            vd6Var.set(13, java.lang.Integer.valueOf(objectDesc != null ? objectDesc.getMediaType() : 0));
            java.lang.String username = feed.getUsername();
            if (username == null) {
                username = "";
            }
            vd6Var.set(5, username);
            long j17 = tVar2.f133082a;
            vd6Var.set(6, java.lang.Long.valueOf(j17));
            java.lang.String sessionBuffer = feed.getSessionBuffer();
            if (sessionBuffer == null) {
                sessionBuffer = "";
            }
            vd6Var.set(8, sessionBuffer);
            vd6Var.set(16, java.lang.Long.valueOf(j17));
            r45.yw6 yw6Var = (r45.yw6) vd6Var.getCustom(2);
            if (yw6Var != null) {
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = feed.getObjectDesc();
                yw6Var.set(0, java.lang.Integer.valueOf((objectDesc2 == null || (media = objectDesc2.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) ? 0 : finderMedia.getVideoDuration()));
                long j18 = c17 - j17;
                tVar = tVar2;
                yw6Var.set(1, java.lang.Integer.valueOf((int) (j18 / 1000)));
                yw6Var.set(2, java.lang.Long.valueOf(j18));
                yw6Var.set(3, java.lang.Long.valueOf(yw6Var.getLong(2)));
                yw6Var.set(4, java.lang.Long.valueOf(yw6Var.getLong(2)));
                yw6Var.set(5, java.lang.Long.valueOf(yw6Var.getLong(2)));
                yw6Var.set(6, java.lang.Long.valueOf(j17));
                yw6Var.set(7, java.lang.Long.valueOf(c17));
            } else {
                tVar = tVar2;
            }
            r45.q25 q25Var = (r45.q25) vd6Var.getCustom(3);
            if (q25Var != null) {
                q25Var.set(1, 0);
                r45.yw6 yw6Var2 = (r45.yw6) vd6Var.getCustom(2);
                q25Var.set(2, java.lang.Integer.valueOf(yw6Var2 != null ? yw6Var2.getInteger(1) : 0));
                q25Var.set(14, 0);
                q25Var.set(3, java.lang.Integer.valueOf(tVar.f133083b));
            }
            com.tencent.mm.plugin.finder.report.n4.f125151r0.c(vd6Var, getTag());
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(vd6Var);
            com.tencent.mm.plugin.finder.report.w4.f125422a.b(linkedList, qt2Var, 0);
            com.tencent.mm.plugin.finder.report.o0 o0Var = com.tencent.mm.plugin.finder.report.r0.f125279q;
            long id6 = feed.getId();
            r45.dm2 object_extend2 = feed.getObject_extend();
            com.tencent.mm.plugin.finder.report.o0.b(o0Var, qt2Var, id6, object_extend2 != null ? object_extend2.getString(62) : null, 20, java.lang.String.valueOf(c17 - j17), 0L, null, null, null, 480, null);
        }
    }

    @Override // al5.a0
    public void l(al5.z zVar) {
        this.f133274h = zVar;
    }

    public void m() {
        if (this.f133275i) {
            return;
        }
        this.f133275i = true;
        com.tencent.mars.xlog.Log.i(getTag(), "checkFeedValidFromServer...");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f133272f;
        long id6 = finderObject.getId();
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        r45.dm2 object_extend = finderObject.getObject_extend();
        db2.g4 g4Var = new db2.g4(id6, objectNonceId, 106, 2, "", true, null, null, 0L, null, false, false, null, null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, object_extend != null ? object_extend.getString(62) : null, null, 402644928, null);
        g4Var.f16137p = false;
        g4Var.l().h(new com.tencent.mm.plugin.finder.view.v(this)).f(this.f133276m);
    }

    public abstract void n(boolean z17);

    public final boolean o() {
        java.lang.Boolean bool = (java.lang.Boolean) f133270o.get(java.lang.Long.valueOf(this.f133272f.getId()));
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void p(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        com.tencent.mars.xlog.Log.i(getTag(), "resetFinderObject: ");
        java.lang.String encodeToString = android.util.Base64.encodeToString(finderObject.toByteArray(), 0);
        al5.z zVar = this.f133274h;
        if (zVar != null) {
            kotlin.jvm.internal.o.d(encodeToString);
            cj4.b1 b1Var = (cj4.b1) zVar;
            pj4.o0 o0Var = b1Var.f41908a;
            java.util.LinkedList jumpInfos = o0Var.f355216g;
            kotlin.jvm.internal.o.f(jumpInfos, "jumpInfos");
            pj4.j0 a17 = sj4.a1.a(jumpInfos);
            java.lang.String str = a17 != null ? a17.f355139d : null;
            if (str == null) {
                str = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResetBusiBuf: jumpType:");
            sb6.append(str);
            sb6.append(" customParts:");
            bi4.o0 o0Var2 = b1Var.f41909b;
            sb6.append(o0Var2);
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.BaseStatusLoadLogic", sb6.toString());
            if (bi4.e.d(str) && !com.tencent.mm.sdk.platformtools.t8.K0(encodeToString)) {
                java.util.LinkedList jumpInfos2 = o0Var.f355216g;
                kotlin.jvm.internal.o.f(jumpInfos2, "jumpInfos");
                pj4.j0 a18 = sj4.a1.a(jumpInfos2);
                if (bi4.e.d(a18 != null ? a18.f355139d : null)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(a18 != null ? a18.f355141f : null)) {
                        java.util.LinkedList jumpInfos3 = o0Var.f355216g;
                        kotlin.jvm.internal.o.f(jumpInfos3, "jumpInfos");
                        pj4.j0 a19 = sj4.a1.a(jumpInfos3);
                        if (a19 != null) {
                            a19.f355141f = encodeToString;
                        }
                    }
                }
                java.util.LinkedList jumps = o0Var.f355221o.f355009m;
                kotlin.jvm.internal.o.f(jumps, "jumps");
                pj4.j0 a27 = sj4.a1.a(jumps);
                if (bi4.e.d(a27 != null ? a27.f355139d : null)) {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(a27 != null ? a27.f355141f : null)) {
                        java.util.LinkedList jumps2 = o0Var.f355221o.f355009m;
                        kotlin.jvm.internal.o.f(jumps2, "jumps");
                        pj4.j0 a28 = sj4.a1.a(jumps2);
                        if (a28 != null) {
                            a28.f355141f = encodeToString;
                        }
                    }
                }
                boolean z17 = o0Var2 instanceof bi4.h0;
                mj4.h hVar = b1Var.f41910c;
                if (z17) {
                    bi4.o0 o0Var3 = ((sj4.v0) ((bi4.h0) o0Var2)).f408897c;
                    if (o0Var3 != null) {
                        java.lang.String l17 = ((mj4.k) hVar).l();
                        java.util.LinkedList jumpInfos4 = o0Var.f355216g;
                        kotlin.jvm.internal.o.f(jumpInfos4, "jumpInfos");
                        o0Var3.m(l17, sj4.a1.a(jumpInfos4));
                    }
                } else {
                    java.lang.String l18 = ((mj4.k) hVar).l();
                    java.util.LinkedList jumpInfos5 = o0Var.f355216g;
                    kotlin.jvm.internal.o.f(jumpInfos5, "jumpInfos");
                    o0Var2.m(l18, sj4.a1.a(jumpInfos5));
                }
                mj4.k kVar = (mj4.k) hVar;
                ai4.b.g(ai4.m0.f5173a, kVar.o(), kVar.l(), ni4.z.a(hVar), 2, null, 0L, 0.0f, null, null, false, 1008, null);
                cj4.i1 i1Var = b1Var.f41911d;
                i1Var.C(hVar);
                i1Var.D();
            }
        }
        this.f133274h = null;
    }
}
