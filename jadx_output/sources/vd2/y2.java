package vd2;

/* loaded from: classes2.dex */
public abstract class y2 extends com.tencent.mm.plugin.finder.feed.model.internal.p0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f436028d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader f436029e;

    public y2(com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader) {
        this.f436029e = finderLiveRelatedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void alive() {
        super.alive();
        gm0.j1.d().a(6479, this);
    }

    public abstract com.tencent.mm.modelbase.m1 b();

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void dead() {
        super.dead();
        gm0.j1.d().q(6479, this);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetch(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (obj == null || !(obj instanceof com.tencent.mm.modelbase.m1)) {
            return;
        }
        this.f436028d.put(obj, callback);
        gm0.j1.d().g((com.tencent.mm.modelbase.m1) obj);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchInit(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.internal.b0 b0Var = new com.tencent.mm.plugin.finder.feed.model.internal.b0();
        b0Var.setPullType(1000);
        callback.onFetchDone(b0Var);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchLoadMore(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback, boolean z17) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.modelbase.m1 b17 = b();
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader = this.f436029e;
        r45.gy0 gy0Var = finderLiveRelatedLoader.f111733n.f309209n;
        if (gy0Var != null && gy0Var.getInteger(0) == 3) {
            ((db2.q5) b17).f228136r = true;
        }
        km2.r rVar = finderLiveRelatedLoader.f111733n;
        if (rVar.f309214s) {
            rVar.f309214s = false;
            ((db2.q5) b17).O(3);
        } else {
            ((db2.q5) b17).O(2);
        }
        android.content.Context context = finderLiveRelatedLoader.f111480p;
        if (context != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            im2.s6 s6Var = (im2.s6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(im2.s6.class);
            if (s6Var != null) {
                s6Var.O6((db2.q5) b17);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, b17, callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchPreload(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.modelbase.m1 b17 = b();
        com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader = this.f436029e;
        r45.gy0 gy0Var = finderLiveRelatedLoader.f111733n.f309209n;
        boolean z17 = false;
        if (gy0Var != null && gy0Var.getInteger(0) == 3) {
            z17 = true;
        }
        if (z17) {
            ((db2.q5) b17).f228136r = true;
        }
        db2.q5 q5Var = (db2.q5) b17;
        q5Var.O(3);
        android.content.Context context = finderLiveRelatedLoader.f111480p;
        if (context != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            im2.s6 s6Var = (im2.s6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(im2.s6.class);
            if (s6Var != null) {
                s6Var.O6(q5Var);
            }
        }
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, b17, callback, false, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.p0
    public void fetchRefresh(com.tencent.mm.plugin.finder.feed.model.internal.n0 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.modelbase.m1 b17 = b();
        r45.gy0 gy0Var = this.f436029e.f111733n.f309209n;
        boolean z17 = false;
        if (gy0Var != null && gy0Var.getInteger(0) == 3) {
            z17 = true;
        }
        if (z17) {
            ((db2.q5) b17).f228136r = true;
        }
        ((db2.q5) b17).O(4);
        com.tencent.mm.plugin.finder.feed.model.internal.p0.fetch$default(this, b17, callback, false, 4, null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        vd2.z2 z2Var;
        boolean z17;
        r45.v74 v74Var;
        kotlin.jvm.internal.o.g(scene, "scene");
        java.util.Map map = this.f436028d;
        com.tencent.mm.plugin.finder.feed.model.internal.n0 n0Var = (com.tencent.mm.plugin.finder.feed.model.internal.n0) ((java.util.LinkedHashMap) map).get(scene);
        if (n0Var != null) {
            map.remove(scene);
            boolean z18 = scene instanceof db2.q5;
            com.tencent.mm.plugin.finder.live.FinderLiveRelatedLoader finderLiveRelatedLoader = this.f436029e;
            if (z18) {
                if (i17 == 0 && i18 == 0) {
                    com.tencent.mm.modelbase.o oVar = ((db2.q5) scene).f228128g;
                    if (oVar == null) {
                        kotlin.jvm.internal.o.o("rr");
                        throw null;
                    }
                    com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                    z17 = ((r45.z71) fVar).getInteger(3) != 0;
                } else {
                    z17 = true;
                }
                r45.gy0 gy0Var = finderLiveRelatedLoader.f111733n.f309209n;
                if (gy0Var != null && gy0Var.getInteger(0) == 3) {
                    r45.gy0 gy0Var2 = finderLiveRelatedLoader.f111733n.f309209n;
                    if (gy0Var2 != null) {
                        gy0Var2.set(1, null);
                    }
                    r45.gy0 gy0Var3 = finderLiveRelatedLoader.f111733n.f309209n;
                    if (gy0Var3 != null) {
                        gy0Var3.set(0, 0);
                    }
                }
                db2.q5 q5Var = (db2.q5) scene;
                boolean z19 = z17;
                vd2.z2 z2Var2 = new vd2.z2(q5Var.f228132n, i17, i18, str, q5Var.f228136r);
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> M = q5Var.M();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
                for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : M) {
                    ya2.g.m(ya2.h.f460484a, finderObject.getContact(), false, 2, null);
                    bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384), bu2.i.f24531l);
                    km2.m mVar = new km2.m(finderObject);
                    r45.v74 v74Var2 = mVar.f309129d.f68546p0;
                    java.lang.String string = v74Var2 != null ? v74Var2.getString(3) : null;
                    if ((string == null || string.length() == 0) && (v74Var = mVar.f309129d.f68546p0) != null) {
                        ml2.q1 q1Var = ml2.q1.f327812e;
                        v74Var.set(3, "temp_2");
                    }
                    arrayList.add(mVar);
                }
                z2Var2.setIncrementList(arrayList);
                z2Var2.setPullType(q5Var.f228133o);
                com.tencent.mm.modelbase.o oVar2 = q5Var.f228128g;
                if (oVar2 == null) {
                    kotlin.jvm.internal.o.o("rr");
                    throw null;
                }
                com.tencent.mm.modelbase.n nVar = oVar2.f70711b;
                com.tencent.mm.protobuf.f fVar2 = nVar.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                z2Var2.setLastBuffer(((r45.z71) fVar2).getByteString(2));
                z2Var2.setHasMore(z19);
                java.util.HashMap hashMap = km2.n.f309147p;
                com.tencent.mm.protobuf.f fVar3 = nVar.f70700a;
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRelatedListResponse");
                km2.n.f309148q = ((r45.z71) fVar3).getInteger(5) * 1000;
                java.lang.String tag = getTAG();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("incrementList size: ");
                java.util.List incrementList = z2Var2.getIncrementList();
                sb6.append(incrementList != null ? java.lang.Integer.valueOf(incrementList.size()) : null);
                sb6.append(",refresh_interval:");
                sb6.append(km2.n.f309148q);
                com.tencent.mars.xlog.Log.i(tag, sb6.toString());
                z2Var = z2Var2;
            } else {
                z2Var = null;
            }
            if (z2Var != null) {
                n0Var.onFetchDone(z2Var);
                return;
            }
            yz5.l lVar = finderLiveRelatedLoader.f111726d;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }
}
