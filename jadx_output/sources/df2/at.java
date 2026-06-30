package df2;

/* loaded from: classes10.dex */
public final class at implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f229750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f229751e;

    public at(df2.lt ltVar, java.lang.String str) {
        this.f229750d = ltVar;
        this.f229751e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.bm1 bm1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalStatusHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lt ltVar = this.f229750d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = ltVar.S;
        if (e3Var != null) {
            e3Var.h();
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) ltVar.business(mm2.c1.class)).f328846n;
        java.lang.String str = null;
        if (finderObject != null) {
            p52.c cVar = p52.h.f352016a;
            java.lang.String str2 = ((mm2.c1) ltVar.business(mm2.c1.class)).f328852o;
            if (str2 == null && (str2 = finderObject.getUsername()) == null) {
                str2 = "";
            }
            p52.h.f352019d = str2;
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 16384);
            a17.setEcSource(((mm2.c1) ltVar.business(mm2.c1.class)).f328786c3);
            mm2.c1 c1Var = (mm2.c1) ltVar.business(mm2.c1.class);
            if (c1Var != null) {
                c1Var.O1 = false;
            }
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.view.ViewGroup viewGroup = ltVar.f230704J;
            android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
            so2.h1 h1Var = new so2.h1(a17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("FINDER_LIVE_SHARE_KEY_STATUS_VERIFY", ((mm2.c1) ltVar.business(mm2.c1.class)).f328777a4);
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
            if (hc2.o0.d(h1Var.getFeedObject().getFeedObject()) && hc2.o0.f(h1Var.getFeedObject().getFeedObject())) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share finderObject ");
                sb6.append(h1Var.getFeedObject().getId());
                sb6.append(' ');
                com.tencent.mm.protocal.protobuf.FinderObject feedObject = h1Var.getFeedObject().getFeedObject();
                sb6.append(feedObject != null ? java.lang.Integer.valueOf(feedObject.getForward_style()) : null);
                sb6.append(" to status,liveId:");
                r45.nw1 liveInfo = h1Var.getFeedObject().getLiveInfo();
                sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
                sb6.append(",desc:");
                sb6.append(h1Var.getFeedObject().getDescription());
                sb6.append(",liveStatus:");
                r45.nw1 liveInfo2 = h1Var.getFeedObject().getLiveInfo();
                sb6.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderShareManager", sb6.toString());
                ((ee0.t4) ((fe0.n4) i95.n0.c(fe0.n4.class))).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
                m21.h hVar = new m21.h();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSnsFinderShareLive", "com.tencent.mm.feature.sns.SnsShareObjectService");
                hVar.e(h1Var.getFeedObject().getFinderLive());
                java.lang.String string = bundle.getString("FINDER_LIVE_SHARE_KEY_STATUS_VERIFY");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                pj4.j0 j0Var = new pj4.j0();
                j0Var.f355139d = "2";
                j0Var.f355141f = hVar.a();
                arrayList2.add(j0Var);
                bi4.c1 c1Var2 = new bi4.c1();
                java.lang.String str3 = this.f229751e;
                if (str3 == null || str3.length() == 0) {
                    c1Var2.b("1020");
                } else {
                    c1Var2.b(str3);
                }
                c1Var2.g(appCompatActivity.getResources().getString(com.tencent.mm.R.string.dew, hVar.b().getString(3)));
                c1Var2.f("live_player@inner");
                java.lang.String string2 = hVar.b().getString(0);
                c1Var2.d(string2 != null ? string2 : "");
                bi4.d1 d1Var = c1Var2.f21034a;
                d1Var.f354937d.E = 4;
                c1Var2.h(string);
                c1Var2.c(arrayList2);
                ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ni(appCompatActivity, 1008, d1Var);
            } else {
                java.lang.String string3 = appCompatActivity.getString(com.tencent.mm.R.string.exu);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                hc2.f1.B(appCompatActivity, string3);
            }
        }
        in5.c cVar2 = ltVar.f230710r;
        dk2.h hVar2 = cVar2 instanceof dk2.h ? (dk2.h) cVar2 : null;
        if (hVar2 != null && (bm1Var = hVar2.f233545h) != null) {
            str = bm1Var.getString(0);
        }
        ltVar.t7(ltVar.k7(str, 7));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalStatusHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
