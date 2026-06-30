package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, com.tencent.mm.plugin.finder.ui.qm qmVar) {
        super(2);
        this.f129304d = finderShareFeedRelUI;
        this.f129305e = qmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed feed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
        kotlin.jvm.internal.o.g(feedObject, "feedObject");
        kotlin.jvm.internal.o.g(feed, "feed");
        zy2.i5 i5Var = com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.f128766p2;
        feed.G1(7);
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129304d;
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.qj(finderShareFeedRelUI));
        finderShareFeedRelUI.G = feed;
        finderShareFeedRelUI.J7();
        finderShareFeedRelUI.R7(false);
        finderShareFeedRelUI.S7(false);
        finderShareFeedRelUI.U1 = feedObject.getContact();
        finderShareFeedRelUI.V1 = feedObject;
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader E7 = finderShareFeedRelUI.E7();
        com.tencent.mm.protocal.protobuf.FinderContact contact = feedObject.getContact();
        java.lang.String username = contact != null ? contact.getUsername() : null;
        if (username == null) {
            username = "";
        }
        E7.M = username;
        boolean z17 = finderShareFeedRelUI.Q1;
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.f129305e;
        if (z17 || qmVar.f106421d.getIntent().hasExtra("key_extra_info")) {
            qmVar.C = feedObject.getId();
            r45.dm2 object_extend = feedObject.getObject_extend();
            qmVar.D = object_extend != null ? object_extend.getString(62) : null;
            finderShareFeedRelUI.f128784p0 = feedObject.getId();
            r45.dm2 object_extend2 = feedObject.getObject_extend();
            finderShareFeedRelUI.f128786x0 = object_extend2 != null ? object_extend2.getString(62) : null;
            finderShareFeedRelUI.E7().f107433d = feedObject.getId();
            com.tencent.mm.ui.MMActivity context = qmVar.f106421d;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            str = "";
            if (nyVar != null) {
                long j17 = finderShareFeedRelUI.f128784p0;
                r45.dm2 object_extend3 = feedObject.getObject_extend();
                java.lang.String string = object_extend3 != null ? object_extend3.getString(62) : null;
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = feedObject.getContact();
                nyVar.t7(j17, string, contact2 != null ? contact2.getUsername() : null);
            }
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader E72 = finderShareFeedRelUI.E7();
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            E72.setContextObj(nyVar2 != null ? nyVar2.V6() : null);
            com.tencent.mm.plugin.finder.feed.v9 v9Var = finderShareFeedRelUI.X1;
            if (v9Var != null) {
                v9Var.f110883l = finderShareFeedRelUI.U1;
            }
        } else {
            str = "";
        }
        p52.h.f352016a.f(qmVar.f106421d.getIntent().getStringExtra("key_extra_info"), finderShareFeedRelUI.E7().M);
        finderShareFeedRelUI.Q7(feedObject.getContact());
        jz5.g gVar = finderShareFeedRelUI.L;
        if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) ((jz5.n) gVar).getValue())) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str2 = (java.lang.String) ((jz5.n) gVar).getValue();
            ((ke0.e) xVar).getClass();
            finderShareFeedRelUI.setMMTitle(com.tencent.mm.pluginsdk.ui.span.c0.i(context2, str2));
        }
        com.tencent.mm.plugin.finder.feed.i0 i0Var = qmVar.f106424g;
        androidx.recyclerview.widget.RecyclerView recyclerView = i0Var != null ? i0Var.getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
        }
        boolean z18 = true;
        if (qmVar.M != 0 && !finderShareFeedRelUI.Y1) {
            boolean z19 = finderShareFeedRelUI.Q1;
            com.tencent.mm.ui.MMActivity context3 = qmVar.f106421d;
            if (z19) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long j18 = qmVar.C;
                int i17 = qmVar.M;
                java.lang.String str3 = finderShareFeedRelUI.S;
                java.lang.String str4 = str3 == null ? str : str3;
                int i18 = finderShareFeedRelUI.Q;
                kotlin.jvm.internal.o.g(context3, "activity");
                o3Var.Qj(j18, i17, 4L, str4, 1, i18, null, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p, finderShareFeedRelUI.f128776i2, finderShareFeedRelUI.K1, finderShareFeedRelUI.L1);
            } else {
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long j19 = qmVar.C;
                int i19 = qmVar.M;
                java.lang.String str5 = finderShareFeedRelUI.S;
                java.lang.String str6 = str5 == null ? str : str5;
                int i27 = finderShareFeedRelUI.Q;
                kotlin.jvm.internal.o.g(context3, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                o3Var2.Rj(j19, i19, str6, 1, i27, nyVar3 != null ? nyVar3.V6().getString(1) : null, finderShareFeedRelUI.f128776i2, finderShareFeedRelUI.K1, finderShareFeedRelUI.L1);
            }
            finderShareFeedRelUI.Y1 = true;
        }
        com.tencent.mm.plugin.finder.feed.model.l0 C7 = finderShareFeedRelUI.C7();
        long id6 = feedObject.getId();
        java.lang.String w17 = feed.w();
        java.lang.String objectNonceId = feedObject.getObjectNonceId();
        int i28 = qmVar.f106422e;
        boolean z27 = feedObject.getSecondaryShowFlag() != 1;
        java.lang.String username2 = feedObject.getUsername();
        C7.O0(id6, w17, objectNonceId, i28, z27, username2 == null ? str : username2, (i19 & 64) != 0 ? -1 : 0, (i19 & 128) != 0 ? com.tencent.mm.plugin.finder.feed.model.z.f108496d : null);
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.w7(finderShareFeedRelUI);
        boolean z28 = feedObject.getPreview_flag() == 1;
        qmVar.f129747p0 = z28;
        if (z28) {
            finderShareFeedRelUI.setMMTitle(com.tencent.mm.R.string.f2g);
            android.view.View findViewById = finderShareFeedRelUI.findViewById(com.tencent.mm.R.id.f483315aa4);
            if (findViewById instanceof com.tencent.mm.ui.widget.imageview.WeImageView) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById;
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_close);
                weImageView.setIconColor(finderShareFeedRelUI.getResources().getColor(com.tencent.mm.R.color.f479261ud));
            }
        } else {
            java.lang.String str7 = qmVar.P;
            if (str7 != null && str7.length() != 0) {
                z18 = false;
            }
            if (z18) {
                finderShareFeedRelUI.B7().f434668d.setVisibility(0);
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(finderShareFeedRelUI).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).T6();
        }
        finderShareFeedRelUI.J7();
        return jz5.f0.f302826a;
    }
}
