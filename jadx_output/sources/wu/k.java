package wu;

/* loaded from: classes9.dex */
public final class k extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        s15.c j17;
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.mvvm.MvvmView mvvmView = (com.tencent.mm.mvvm.MvvmView) containerView.findViewById(com.tencent.mm.R.id.uxi);
        if (mvvmView == null) {
            return;
        }
        z01.g gVar = new z01.g();
        s15.x C = item.f284997e.C();
        if (C != null && (j17 = C.j()) != null) {
            java.lang.String j18 = j17.j();
            if (j18 == null) {
                j18 = "";
            }
            gVar.f469014e = j18;
            java.lang.String n17 = j17.n();
            if (n17 == null) {
                n17 = "";
            }
            gVar.f469019m = n17;
            java.lang.String title = j17.getTitle();
            kotlin.jvm.internal.o.g(title, "<set-?>");
            gVar.f469016g = title;
            java.lang.String thumbUrl = j17.getThumbUrl();
            gVar.f469015f = thumbUrl != null ? thumbUrl : "";
            java.lang.String l17 = j17.l();
            kotlin.jvm.internal.o.g(l17, "<set-?>");
            gVar.f469023q = l17;
            gVar.f469020n = j17.getCount();
            gVar.f469022p = gVar.c(j17.k());
            java.lang.String str = gVar.f469014e;
            gVar.f469013d = kotlin.jvm.internal.o.b(str, "photo") ? z01.f.f469004d : kotlin.jvm.internal.o.b(str, "video") ? z01.f.f469005e : z01.f.f469006f;
            gVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.odg));
        if (gVar.f469019m.length() > 0) {
            sb6.append(" · ");
            sb6.append(gVar.f469019m);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        gVar.f469018i = sb7;
        gVar.f469024r = new wu.g(item, this);
        gVar.f469025s = new wu.i(item, this);
        gVar.f469027u = com.tencent.mm.R.drawable.d87;
        gVar.f469030x = wu.j.f449587d;
        mvvmView.setOnClickListener(new wu.f(this, mvvmView, item));
        mvvmView.setViewModel(gVar);
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String l17;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.x C = item.f284997e.C();
        q80.d0 d0Var = new q80.d0();
        java.lang.String str3 = "";
        if (C == null || (str = C.getAppId()) == null) {
            str = "";
        }
        d0Var.f360649a = str;
        if (C == null || (str2 = C.getPath()) == null) {
            str2 = "";
        }
        d0Var.f360650b = str2;
        if (C != null && (l17 = C.l()) != null) {
            str3 = l17;
        }
        d0Var.f360651c = str3;
        d0Var.f360652d = java.lang.Boolean.valueOf(C != null && C.n() == 1);
        com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
        if ((C != null ? C.j() : null) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("shareImageCardFlag", 1);
            liteAppReferrerInfo.extraData = jSONObject;
            d0Var.f360674z = liteAppReferrerInfo;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new wu.e(d0Var));
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        ((q31.t) ((q31.r) i95.n0.c(q31.r.class))).Ai();
        android.content.Context context = containerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView chattingAskShareMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView(context, null, 0, 6, null);
        chattingAskShareMvvmView.setId(com.tencent.mm.R.id.uxi);
        containerView.addView(chattingAskShareMvvmView, -2, -2);
    }
}
