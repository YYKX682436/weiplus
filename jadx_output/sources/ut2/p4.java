package ut2;

/* loaded from: classes3.dex */
public final class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f431052d;

    public p4(ut2.j5 j5Var) {
        this.f431052d = j5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int i17;
        r45.k74 k74Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ml2.f4 f4Var = ml2.f4.B;
        ut2.j5 j5Var = this.f431052d;
        ut2.j5.a(j5Var, f4Var);
        gk2.e eVar = j5Var.f430938f;
        r45.e56 e56Var = ((mm2.f6) eVar.a(mm2.f6.class)).K;
        if (e56Var != null) {
            r45.c33 c33Var = (r45.c33) e56Var.getCustom(2);
            if (c33Var == null || (str5 = c33Var.getString(0)) == null) {
                str5 = "";
            }
            r45.c33 c33Var2 = (r45.c33) e56Var.getCustom(2);
            if (c33Var2 == null || (str6 = c33Var2.getString(1)) == null) {
                str6 = "";
            }
            java.lang.String str7 = str5;
            long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
            java.lang.String anchorUserName = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            java.lang.String sessionId = java.lang.String.valueOf(((mm2.c1) eVar.a(mm2.c1.class)).f328861p2);
            java.lang.String requestId = ((mm2.c1) eVar.a(mm2.c1.class)).P3;
            java.lang.String str8 = ((mm2.c1) eVar.a(mm2.c1.class)).f328786c3;
            java.lang.String str9 = str8 != null ? str8 : "";
            kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            kotlin.jvm.internal.o.g(requestId, "requestId");
            java.lang.String obj = com.tencent.mm.sdk.platformtools.t8.s0().toString();
            l81.b1 b1Var = new l81.b1();
            str3 = "android/view/View$OnClickListener";
            b1Var.f317014b = str7;
            b1Var.f317022f = str6;
            b1Var.f317028i = new dk2.ah();
            b1Var.f317032k = 1177;
            b1Var.f317034l = "shop_window:" + j17 + ':' + anchorUserName + "::" + sessionId + ':' + obj + ':' + requestId + ':' + str9;
            zl2.q4 q4Var = zl2.q4.f473933a;
            b1Var.f317016c = q4Var.x();
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            java.lang.String sceneNote = b1Var.f317034l;
            kotlin.jvm.internal.o.f(sceneNote, "sceneNote");
            y4Var.getClass();
            y4Var.f328306n = sceneNote;
            p52.c cVar = p52.h.f352016a;
            kotlin.jvm.internal.o.g(obj, "<set-?>");
            p52.h.f352029n = obj;
            zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
            java.lang.String appId = b1Var.f317014b;
            kotlin.jvm.internal.o.f(appId, "appId");
            ((com.tencent.mm.plugin.finder.report.o3) qaVar).Ck(3L, appId, obj, 1177L, sessionId, "shop_window", requestId);
            st2.c2.f412249a.k(b1Var);
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            int integer = e56Var.getInteger(1);
            android.view.ViewGroup viewGroup = j5Var.f430937e;
            if (integer == 0) {
                if (e56Var.getInteger(16) == 2) {
                    b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(false, 0, null, false, null, false, null, k91.t2.f305766d, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -130, 2047, null);
                }
                android.content.Context context = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.v9.class))).U6(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), b1Var);
                dk2.q4 q4Var2 = dk2.q4.f233938a;
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                dk2.q4.m(q4Var2, context2, j5Var.f430938f, b1Var, true, null, 16, null);
            } else if (e56Var.getInteger(1) == 1) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context3 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                finderJumpInfo.setJumpinfo_type(6);
                r45.o74 o74Var = (r45.o74) e56Var.getCustom(3);
                if (o74Var != null) {
                    k74Var = new r45.k74();
                    str4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
                    k74Var.set(0, o74Var.getString(0));
                    k74Var.set(1, o74Var.getString(1));
                    i17 = 2;
                    k74Var.set(2, java.net.URLDecoder.decode(o74Var.getString(2), com.tencent.mapsdk.internal.rv.f51270c));
                } else {
                    str4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
                    i17 = 2;
                    k74Var = null;
                }
                finderJumpInfo.setLite_app_info(k74Var);
                com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo = new com.tencent.mm.protocal.protobuf.MiniAppInfo();
                miniAppInfo.setApp_id(b1Var.f317014b);
                miniAppInfo.setPath(b1Var.f317022f);
                r45.c33 c33Var3 = (r45.c33) e56Var.getCustom(i17);
                miniAppInfo.setAppusername(c33Var3 != null ? c33Var3.getString(i17) : null);
                miniAppInfo.setVersion_type(q4Var.x());
                finderJumpInfo.setMini_app_info(miniAppInfo);
                android.content.Context context4 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar2.a((androidx.appcompat.app.AppCompatActivity) context4).c(zy2.v9.class))).T6(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), finderJumpInfo);
                c61.yb.nd(ybVar, context3, finderJumpInfo, b1Var, 0, null, 24, null);
                j5Var.f430936d.u();
                yj0.a.h(this, str4, str3, str2, str);
            }
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "android/view/View$OnClickListener";
        }
        str4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
        j5Var.f430936d.u();
        yj0.a.h(this, str4, str3, str2, str);
    }
}
