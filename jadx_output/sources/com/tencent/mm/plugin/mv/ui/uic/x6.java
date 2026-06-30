package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class x6 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f151530d;

    /* renamed from: e, reason: collision with root package name */
    public final int f151531e;

    /* renamed from: f, reason: collision with root package name */
    public final int f151532f;

    /* renamed from: g, reason: collision with root package name */
    public final int f151533g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ss4 f151534h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f151535i;

    /* renamed from: m, reason: collision with root package name */
    public final int f151536m;

    /* renamed from: n, reason: collision with root package name */
    public int f151537n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151530d = "MicroMsg.Mv.MusicMvSaveDraftUIC";
        this.f151531e = 1;
        this.f151532f = 2;
        this.f151533g = 10031;
        this.f151537n = 2;
        this.f151536m = getIntent().getIntExtra("key_mv_from_scene", 0);
    }

    public final void O6(r45.ss4 ss4Var, boolean z17, int i17) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject3;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc3;
        r45.ef2 mvInfo;
        this.f151537n = i17;
        if (!z17) {
            int i18 = this.f151536m;
            if (i17 == 7 && i18 != 1) {
                getActivity().finish();
                return;
            }
            android.content.Intent intent = new android.content.Intent(getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.class);
            intent.addFlags(67108864);
            intent.putExtra("KEY_MUSIC_ROUTER", 4);
            getActivity().overridePendingTransition(-1, com.tencent.mm.R.anim.f477889ed);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doBack", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doBack", "(Lcom/tencent/mm/protocal/protobuf/MusicMvData;ZI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            getActivity().finish();
            if (i18 == 1) {
                kl3.t.g().a().stopPlay();
            }
            com.tencent.mm.plugin.finder.report.p2.f125237a.C(i17, null);
            return;
        }
        this.f151534h = ss4Var;
        boolean z18 = !((ss4Var == null || (finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var.getCustom(0)) == null || (objectDesc3 = finderObject3.getObjectDesc()) == null || (mvInfo = objectDesc3.getMvInfo()) == null || mvInfo.getInteger(6) != 1) ? false : true);
        if (i17 == 2 || z18) {
            r45.ss4 ss4Var2 = this.f151534h;
            r45.ef2 mvInfo2 = (ss4Var2 == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var2.getCustom(0)) == null || (objectDesc = finderObject.getObjectDesc()) == null) ? null : objectDesc.getMvInfo();
            if (mvInfo2 != null) {
                mvInfo2.set(7, 0);
            }
        } else if (i17 == 4 || i17 == 7) {
            r45.ss4 ss4Var3 = this.f151534h;
            r45.ef2 mvInfo3 = (ss4Var3 == null || (finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var3.getCustom(0)) == null || (objectDesc2 = finderObject2.getObjectDesc()) == null) ? null : objectDesc2.getMvInfo();
            if (mvInfo3 != null) {
                mvInfo3.set(7, 2);
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) getActivity(), 1, true);
        k0Var.t(true);
        k0Var.r(getResources().getString(com.tencent.mm.R.string.h4p), 17, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja), null);
        k0Var.l(getContext().getResources().getColor(com.tencent.mm.R.color.f478518a0));
        k0Var.f211872n = new com.tencent.mm.plugin.mv.ui.uic.u6(this);
        k0Var.f211881s = new com.tencent.mm.plugin.mv.ui.uic.v6(this, ss4Var, k0Var);
        k0Var.f211854d = com.tencent.mm.plugin.mv.ui.uic.w6.f151517d;
        k0Var.v();
    }

    public final void P6(boolean z17, boolean z18, r45.ss4 ss4Var) {
        r45.za4 za4Var;
        java.util.LinkedList list;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media2;
        com.tencent.mm.plugin.finder.storage.x80 b17;
        if (z17) {
            if (xy2.c.e(getContext()).length() == 0) {
                i95.m c17 = i95.n0.c(zy2.b6.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                if (zy2.b6.Mh((zy2.b6) c17, getActivity(), null, null, null, 12, null)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(getActivity(), "com.tencent.mm.plugin.finder.ui.FinderCreateContactUI");
                    intent.putExtra("key_create_scene", 7);
                    intent.putExtra("key_router_to_profile", false);
                    intent.putExtra("key_mv_status", 1);
                    getActivity().startActivityForResult(intent, this.f151533g);
                    return;
                }
                return;
            }
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(this.f151537n, null);
        if (ss4Var != null) {
            r45.ss4 ss4Var2 = z18 ? ss4Var : null;
            if (ss4Var2 != null) {
                jm3.h1.f300322a.b(ss4Var2);
                long j17 = (ss4Var2.getLong(4) <= 0 || (b17 = com.tencent.mm.plugin.finder.storage.a90.f126393a.b(ss4Var2.getLong(4))) == null) ? 0L : b17.field_objectId;
                com.tencent.mars.xlog.Log.i("Finder.FinderDraftLogic", "saveDraftItem :" + ss4Var2.getLong(4));
                com.tencent.mm.plugin.finder.storage.x80 x80Var = new com.tencent.mm.plugin.finder.storage.x80();
                x80Var.field_objectId = j17;
                x80Var.field_createTime = c01.id.e();
                x80Var.field_localFlag = 1;
                r45.ec1 ec1Var = new r45.ec1();
                ec1Var.set(0, (com.tencent.mm.protocal.protobuf.FinderObject) ss4Var2.getCustom(0));
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ec1Var.getCustom(0);
                if (finderObject != null) {
                    finderObject.setId(0L);
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ec1Var.getCustom(0);
                if (finderObject2 != null) {
                    finderObject2.setCreatetime(c01.id.e());
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ec1Var.getCustom(0);
                if (finderObject3 != null && (objectDesc2 = finderObject3.getObjectDesc()) != null && (media2 = objectDesc2.getMedia()) != null) {
                    media2.clear();
                }
                java.lang.String string = ss4Var2.getString(2);
                if (!(string == null || string.length() == 0)) {
                    com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
                    finderMedia.setUrl(ss4Var2.getString(2));
                    finderMedia.setThumbUrl(ss4Var2.getString(2));
                    finderMedia.setMediaType(2);
                    com.tencent.mars.xlog.Log.i("Finder.FinderDraftLogic", "saveDraftItem :" + finderMedia.getUrl() + " thumbUrl:" + finderMedia.getThumbUrl());
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ec1Var.getCustom(0);
                    if (finderObject4 != null && (objectDesc = finderObject4.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null) {
                        media.add(finderMedia);
                    }
                }
                ec1Var.set(1, new r45.ar0());
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list2 = ss4Var2.getList(1);
                if (!(list2 == null || list2.isEmpty())) {
                    r45.ar0 ar0Var = (r45.ar0) ec1Var.getCustom(1);
                    if (ar0Var != null) {
                        ar0Var.set(8, new r45.za4());
                    }
                    if (list2 != null) {
                        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject5 : list2) {
                            r45.ec1 ec1Var2 = new r45.ec1();
                            ec1Var2.set(0, finderObject5);
                            r45.ar0 ar0Var2 = (r45.ar0) ec1Var.getCustom(1);
                            if (ar0Var2 != null && (za4Var = (r45.za4) ar0Var2.getCustom(8)) != null && (list = za4Var.getList(0)) != null) {
                                list.add(ec1Var2);
                            }
                        }
                    }
                }
                x80Var.field_finderItem = ec1Var;
                r45.qb4 Vi = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Vi();
                com.tencent.mm.plugin.finder.storage.FinderItem t07 = x80Var.t0();
                Vi.set(6, java.lang.Long.valueOf(c01.id.a()));
                t07.setPostInfo(Vi);
                x80Var.field_originMvInfo = (r45.ef2) ss4Var2.getCustom(5);
                x80Var.field_objectType = 2;
                java.lang.String string2 = ss4Var2.getString(2);
                if (string2 != null && r26.i0.y(string2, "http", false)) {
                    cu2.o.f222430a.a(x80Var);
                }
                long L0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().L0(x80Var);
                com.tencent.mm.autogen.events.FinderDraftOpEvent finderDraftOpEvent = new com.tencent.mm.autogen.events.FinderDraftOpEvent();
                am.ab abVar = finderDraftOpEvent.f54270g;
                abVar.f6144a = 100;
                abVar.f6145b = L0;
                finderDraftOpEvent.e();
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
                mv2.f0.f331561a.c();
                db5.t7.i(getActivity(), getString(com.tencent.mm.R.string.f490548y7), com.tencent.mm.R.raw.icons_filled_done);
            }
        }
        android.content.Intent intent2 = new android.content.Intent(getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.class);
        intent2.addFlags(67108864);
        intent2.putExtra("KEY_MUSIC_ROUTER", 4);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doDraft", "(ZZLcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSaveDraftUIC", "doDraft", "(ZZLcom/tencent/mm/protocal/protobuf/MusicMvData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        getActivity().finish();
        if (this.f151536m == 1) {
            kl3.t.g().a().stopPlay();
        }
        fm3.g0 g0Var = fm3.g0.f264070a;
        boolean z19 = this.f151535i;
        java.lang.String a17 = fm3.h0.a(ss4Var);
        com.tencent.mm.autogen.mmdata.rpt.MvCreateActionStruct c18 = g0Var.c();
        c18.f59483l = z18 ? 1L : 0L;
        c18.f59488q = c18.b("PartList", a17, true);
        c18.f59487p = z19 ? 1L : 0L;
        c18.f59482k = 9L;
        c18.k();
        c18.o();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == this.f151533g) {
            com.tencent.mars.xlog.Log.i(this.f151530d, "callback create finder contact draft");
            r45.ss4 ss4Var = this.f151534h;
            if (ss4Var != null) {
                P6(false, true, ss4Var);
            }
        }
    }
}
