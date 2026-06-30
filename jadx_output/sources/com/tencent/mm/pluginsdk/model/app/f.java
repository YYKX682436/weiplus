package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes8.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f188883d = new java.util.HashMap();

    public f() {
        gm0.j1.n().f273288b.a(452, this);
    }

    public void a(int i17, com.tencent.mm.pluginsdk.model.app.h3 h3Var) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.pluginsdk.model.app.h(this, i17, h3Var));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(final int i17, final int i18, final java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (!(m1Var instanceof com.tencent.mm.pluginsdk.model.app.v3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppCenterNetSceneService", "onSceneEnd, the scene is not a instance of NetSceneAppCenter");
            return;
        }
        final com.tencent.mm.pluginsdk.model.app.v3 v3Var = (com.tencent.mm.pluginsdk.model.app.v3) m1Var;
        java.util.Set set = (java.util.Set) ((java.util.HashMap) this.f188883d).get(java.lang.Integer.valueOf(v3Var.f189108f));
        if (set != null && set.size() > 0) {
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.addAll(set);
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.tencent.mm.pluginsdk.model.app.h3 h3Var = (com.tencent.mm.pluginsdk.model.app.h3) it.next();
                if (h3Var != null && set.contains(h3Var)) {
                    h3Var.a(i17, i18, str, v3Var.f189109g);
                }
            }
        }
        fs.g.c(com.tencent.mm.pluginsdk.model.app.m3.class, java.lang.Integer.valueOf(v3Var.f189108f), new fs.o(i17, i18, str, v3Var) { // from class: com.tencent.mm.pluginsdk.model.app.f$$a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f188884a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f188885b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.v3 f188886c;

            {
                this.f188886c = v3Var;
            }

            @Override // fs.o
            public final boolean a(fs.n nVar) {
                boolean z17;
                com.tencent.mm.pluginsdk.model.app.u3 u3Var = this.f188886c.f189109g;
                ((mt.t) ((com.tencent.mm.pluginsdk.model.app.m3) nVar)).getClass();
                com.tencent.mm.pluginsdk.model.app.x5 c17 = com.tencent.mm.pluginsdk.model.app.x5.c();
                c17.getClass();
                if (gm0.j1.a()) {
                    c17.f189143a = false;
                    if (u3Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "scene == null");
                    } else if (this.f188884a == 0 && this.f188885b == 0 && u3Var.b() == 4) {
                        com.tencent.mm.pluginsdk.model.app.z3 z3Var = (com.tencent.mm.pluginsdk.model.app.z3) u3Var;
                        int i19 = ((r45.uo3) z3Var.f189090d.f70711b.f70700a).f387526d;
                        java.util.LinkedList linkedList = z3Var.f189179e;
                        if (linkedList == null || linkedList.size() <= 0) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SuggestionAppListLogic", "empty suggestAppList");
                        } else if (com.tencent.mm.sdk.platformtools.x2.f193071a == null || ap3.e.a() == null) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.SuggestionAppListLogic", "wrong environment");
                        } else {
                            java.util.LinkedList linkedList2 = new java.util.LinkedList();
                            java.util.Iterator it6 = linkedList.iterator();
                            while (it6.hasNext()) {
                                com.tencent.mm.pluginsdk.model.app.m mVar = (com.tencent.mm.pluginsdk.model.app.m) it6.next();
                                java.lang.String str2 = mVar.field_appName;
                                linkedList2.add(mVar.field_appId);
                            }
                            ((kt.a) ap3.e.a()).getClass();
                            zo3.p.Ni().c(linkedList2);
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            if (ap3.e.a() == null) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoLogic", "getISubCorePluginBase() == null");
                            } else {
                                ((kt.a) ap3.e.a()).getClass();
                                com.tencent.mm.pluginsdk.model.app.z Ri = zo3.p.Ri();
                                Ri.getClass();
                                android.database.Cursor rawQuery = Ri.rawQuery("select * from AppInfo where status = 5 order by modifyTime asc", new java.lang.String[0]);
                                if (rawQuery == null) {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.AppInfoStorage", "getAppByStatus : cursor is null");
                                    rawQuery = null;
                                }
                                if (rawQuery != null) {
                                    while (rawQuery.moveToNext()) {
                                        com.tencent.mm.pluginsdk.model.app.m mVar2 = new com.tencent.mm.pluginsdk.model.app.m();
                                        mVar2.convertFrom(rawQuery);
                                        if (mVar2.field_status == 1) {
                                            if (!com.tencent.mm.pluginsdk.model.app.w.r(context, mVar2.field_appId)) {
                                                mVar2.field_status = 4;
                                                ((kt.a) ap3.e.a()).getClass();
                                                zo3.p.Ri().update(mVar2, new java.lang.String[0]);
                                            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(mVar2.field_signature)) {
                                                arrayList.add(mVar2);
                                            }
                                        } else if (mVar2.field_signature != null) {
                                            arrayList.add(mVar2);
                                        }
                                    }
                                    rawQuery.close();
                                }
                            }
                            if (arrayList.size() > 0) {
                                ((kt.a) ap3.e.a()).getClass();
                                com.tencent.mm.pluginsdk.model.app.z Ri2 = zo3.p.Ri();
                                java.util.Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    com.tencent.mm.pluginsdk.model.app.m mVar3 = (com.tencent.mm.pluginsdk.model.app.m) it7.next();
                                    if (mVar3.field_appId != null) {
                                        java.util.Iterator it8 = linkedList.iterator();
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                z17 = false;
                                                break;
                                            }
                                            java.lang.String str3 = ((com.tencent.mm.pluginsdk.model.app.m) it8.next()).field_appId;
                                            if (str3 != null && mVar3.field_appId.equals(str3)) {
                                                z17 = true;
                                                break;
                                            }
                                        }
                                        if (!z17) {
                                            if (com.tencent.mm.pluginsdk.model.app.w.q(com.tencent.mm.sdk.platformtools.x2.f193071a, mVar3)) {
                                                mVar3.field_status = 1;
                                            } else {
                                                mVar3.field_status = 4;
                                            }
                                            Ri2.update(mVar3, new java.lang.String[0]);
                                        }
                                    }
                                }
                            }
                            gm0.j1.i();
                            gm0.j1.u().c().A(352275, java.lang.System.currentTimeMillis());
                            c17.f189147e = java.lang.System.currentTimeMillis();
                        }
                    }
                }
                return false;
            }
        });
    }
}
