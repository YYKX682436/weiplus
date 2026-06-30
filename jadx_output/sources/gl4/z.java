package gl4;

/* loaded from: classes11.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f272899a = jz5.h.b(gl4.k.f272866d);

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f272900b;

    public static final void a(qk.y8 y8Var) {
        if (y8Var != null) {
            y8Var.a(new qk.ea(qk.ga.f364135e, qk.da.f364084f));
        }
    }

    public static void c(gl4.z zVar, android.content.Context context, bw5.r70 r70Var, java.lang.String str, android.widget.ImageView imageView, hl4.a aVar, int i17, android.view.View.OnClickListener onClickListener, android.view.View.OnClickListener onClickListener2, android.view.View.OnClickListener onClickListener3, android.content.DialogInterface.OnCancelListener onCancelListener, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            str = null;
        }
        if ((i18 & 8) != 0) {
            imageView = null;
        }
        if ((i18 & 16) != 0) {
            aVar = hl4.a.f282101d;
        }
        if ((i18 & 32) != 0) {
            i17 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479737du);
        }
        if ((i18 & 64) != 0) {
            onClickListener = null;
        }
        if ((i18 & 128) != 0) {
            onClickListener2 = null;
        }
        if ((i18 & 256) != 0) {
            onClickListener3 = null;
        }
        if ((i18 & 512) != 0) {
            onCancelListener = null;
        }
        zVar.getClass();
        if (r70Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "showTipsDialog");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.ting.membership.view.TingMembershipInfoDialog tingMembershipInfoDialog = new com.tencent.mm.plugin.ting.membership.view.TingMembershipInfoDialog(context, null);
        tingMembershipInfoDialog.setOnCancelListener(new gl4.v(onCancelListener));
        hl4.b bVar = new hl4.b();
        boolean[] zArr = r70Var.f32434i;
        java.lang.String str2 = zArr[1] ? r70Var.f32429d : "";
        kotlin.jvm.internal.o.f(str2, "getTitle(...)");
        bVar.f282104a = str2;
        java.lang.String str3 = zArr[2] ? r70Var.f32430e : "";
        kotlin.jvm.internal.o.f(str3, "getDescription(...)");
        bVar.f282105b = str3;
        java.lang.String str4 = zArr[3] ? r70Var.f32431f : "";
        kotlin.jvm.internal.o.f(str4, "getConfirmText(...)");
        bVar.f282106c = str4;
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        bVar.f282107d = aVar;
        bVar.f282108e = new gl4.s(onClickListener);
        bVar.f282109f = new gl4.t(onClickListener2);
        bVar.f282110g = i17;
        if (str == null || str.length() == 0) {
            bVar.f282111h = false;
        } else {
            bVar.f282111h = true;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            bVar.f282112i = str;
        }
        bVar.f282113j = new gl4.u(onClickListener3);
        bVar.f282114k = imageView;
        tingMembershipInfoDialog.f174711z = bVar;
        tingMembershipInfoDialog.L(bVar);
        tingMembershipInfoDialog.show();
    }

    public final java.lang.Object b(bw5.u80 u80Var, int i17, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "doJoinMembership joinType: " + i17);
        bw5.x80 x80Var = new bw5.x80();
        java.lang.String str = "";
        if (u80Var != null) {
            java.lang.String str2 = u80Var.f33807q[1] ? u80Var.f33797d : "";
            if (str2 != null) {
                str = str2;
            }
        }
        x80Var.f35002e = str;
        boolean[] zArr = x80Var.f35005h;
        zArr[3] = true;
        x80Var.f35001d = i17;
        zArr[2] = true;
        jm4.c2 c2Var = (jm4.c2) ((jz5.n) this.f272899a).getValue();
        if (c2Var != null) {
            gl4.d dVar = new gl4.d(nVar);
            byte[] byteArray = x80Var.toByteArray();
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f300448n = dVar;
            long cppPointer = ((jm4.d2) c2Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
            urgen.ur_0025.UR_B0D8.UR_B317(cppPointer, byteArray, x1Var);
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final void d(androidx.fragment.app.FragmentActivity context, com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest, bw5.w80 joinMembershipInfo, qk.y8 y8Var) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(joinMembershipInfo, "joinMembershipInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "showWecoinSubscribeView request: " + tingMemberShipSubscribeRequest + ", jumpType: " + joinMembershipInfo.f34606e);
        gl4.a aVar = new gl4.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = joinMembershipInfo.b().f34214f;
        kotlin.jvm.internal.o.f(linkedList, "getPackages(...)");
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            bw5.u80 u80Var = (bw5.u80) it.next();
            boolean[] zArr = u80Var.f33807q;
            boolean z17 = zArr[1];
            java.lang.String str3 = zArr[3] ? u80Var.f33799f : "";
            kotlin.jvm.internal.o.f(str3, "getPackageWording(...)");
            pr4.h hVar = new pr4.h(str3, (int) u80Var.f33798e, u80Var.f33800g ? pr4.i.f358009d : pr4.i.f358010e, new gl4.w(this, u80Var, aVar, null), null);
            hVar.f358006f = (int) u80Var.f33801h;
            hVar.f358005e = u80Var.f33804n;
            if (zArr[12]) {
                str = u80Var.f33805o;
            }
            hVar.f358008h = str;
            arrayList.add(hVar);
        }
        bw5.v80 b17 = joinMembershipInfo.b();
        java.lang.String str4 = b17.f34218m[1] ? b17.f34212d : "";
        kotlin.jvm.internal.o.f(str4, "getTitle(...)");
        bw5.v80 b18 = joinMembershipInfo.b();
        java.lang.String str5 = b18.f34218m[2] ? b18.f34213e : "";
        bw5.v80 b19 = joinMembershipInfo.b();
        java.lang.String str6 = b19.f34218m[4] ? b19.f34215g : "";
        kotlin.jvm.internal.o.f(str6, "getAgreementWording(...)");
        pr4.e eVar = new pr4.e(context, str4, str5, arrayList, str6, kz5.p0.f313996d);
        if (tingMemberShipSubscribeRequest != null && (str2 = tingMemberShipSubscribeRequest.f53214g) != null) {
            str = str2;
        }
        eVar.f357994h = str;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        weImageView.s(com.tencent.mm.R.raw.ting_membership_wechat_qqmusic_union_regular, com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.BW_100_Alpha_0_5_5 : com.tencent.mm.R.color.UN_BW_0_Alpha_0_2);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479736dt), context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1));
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9);
        marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
        weImageView.setLayoutParams(marginLayoutParams);
        eVar.f357993g = weImageView;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new gl4.x(arrayList, eVar, aVar, y8Var, null), 3, null);
    }

    public final void e(androidx.fragment.app.FragmentActivity fragmentActivity, com.tencent.mm.api.TingMemberShipSubscribeRequest request, bw5.w80 w80Var, qk.y8 y8Var) {
        int i17 = w80Var.f34606e;
        if (i17 == 4) {
            d(fragmentActivity, request, w80Var, y8Var);
            return;
        }
        if (i17 != 5) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingMembershipHelper", "startMembershipSubscribe invalid jumpType: " + w80Var.f34606e);
            if (y8Var != null) {
                y8Var.a(new qk.ea(qk.ga.f364136f, null));
            }
        } else {
            boolean[] zArr = w80Var.f34613o;
            if ((zArr[5] ? w80Var.f34609h : new bw5.r70()) != null) {
                kotlin.jvm.internal.o.g(request, "request");
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "tyt_vip_qmusic_authent_panel");
                hashMap.put("buy_vip_session", request.f53214g);
                hashMap.put("currscene", java.lang.Integer.valueOf(request.f53215h));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap, 5, false);
                bw5.r70 r70Var = zArr[5] ? w80Var.f34609h : new bw5.r70();
                java.lang.String string = fragmentActivity.getString(com.tencent.mm.R.string.lgf);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(fragmentActivity);
                weImageView.s(com.tencent.mm.R.raw.ting_membership_wechat_qqmusic_union_regular, com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.BW_100_Alpha_0_5_5 : com.tencent.mm.R.color.UN_BW_0_Alpha_0_2);
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(fragmentActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479736dt), fragmentActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1));
                marginLayoutParams.topMargin = fragmentActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479716d9);
                marginLayoutParams.bottomMargin = fragmentActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479693cs);
                weImageView.setLayoutParams(marginLayoutParams);
                c(this, fragmentActivity, r70Var, string, weImageView, null, fragmentActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj), new gl4.o(request, this, fragmentActivity, y8Var), new gl4.p(y8Var), new gl4.q(request, this, fragmentActivity, w80Var, y8Var), new gl4.r(y8Var), 16, null);
            }
        }
    }
}
