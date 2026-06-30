package on2;

/* loaded from: classes3.dex */
public final class l3 {

    /* renamed from: a, reason: collision with root package name */
    public static final on2.l3 f346966a = new on2.l3();

    public static final void b(android.widget.TextView textView, boolean z17) {
        textView.setEnabled(z17);
        if (z17) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
    }

    public final com.tencent.mm.plugin.finder.view.c1 a(android.app.Activity activity, r45.cz1 lotteryInfo, yz5.l claimCallback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(lotteryInfo, "lotteryInfo");
        kotlin.jvm.internal.o.g(claimCallback, "claimCallback");
        com.tencent.mm.plugin.finder.view.c1 c1Var = new com.tencent.mm.plugin.finder.view.c1(activity);
        android.view.View inflate = android.view.LayoutInflater.from(activity).inflate(com.tencent.mm.R.layout.f489010b13, (android.view.ViewGroup) new android.widget.FrameLayout(activity), false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_x);
        kotlin.jvm.internal.o.d(textView);
        b(textView, false);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.f483739bx0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.hdg);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        zl2.r4.f473950a.Z2(editText, textView2, 96, 48, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new on2.d3(h0Var, editText, textView));
        android.content.res.Resources resources = editText.getContext().getResources();
        java.lang.Object[] objArr = new java.lang.Object[1];
        r45.yy1 yy1Var = (r45.yy1) lotteryInfo.getCustom(13);
        if (yy1Var == null || (str = yy1Var.getString(1)) == null) {
            str = "";
        }
        objArr[0] = str;
        editText.setHint(resources.getString(com.tencent.mm.R.string.dpm, objArr));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.b5w)).setOnClickListener(new on2.e3(c1Var));
        textView.setOnClickListener(new on2.f3(c1Var, claimCallback, h0Var));
        c1Var.k(inflate);
        c1Var.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/LotteryUtil", "claimByCustomize", "(Landroid/app/Activity;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/view/CustomInputBottomPage;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/finder/lottery/LotteryUtil", "claimByCustomize", "(Landroid/app/Activity;Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryInfo;Lkotlin/jvm/functions/Function1;)Lcom/tencent/mm/plugin/finder/view/CustomInputBottomPage;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.animate().alpha(1.0f).start();
        c1Var.s();
        inflate.postDelayed(new on2.c3(inflate), 300L);
        return c1Var;
    }

    public final boolean c(android.content.Context context, java.lang.String finderUsername, int i17, java.lang.String lotteryId, long j17, r45.qt2 qt2Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(lotteryId, "lotteryId");
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.G().r()).intValue() <= 0) {
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.cn9), 0).show();
            return false;
        }
        r45.zy1 zy1Var = new r45.zy1();
        zy1Var.set(0, finderUsername);
        zy1Var.set(5, java.lang.Boolean.FALSE);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Vi(context, i17, zy1Var, lotteryId, j17, qt2Var, false);
        return true;
    }

    public final java.lang.String d(s71.b obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (!android.text.TextUtils.isEmpty(obj.f403972f)) {
            sb6.append(obj.f403972f);
        }
        if (!android.text.TextUtils.isEmpty(obj.f403973g)) {
            sb6.append(" ");
            sb6.append(obj.f403973g);
        }
        if (!android.text.TextUtils.isEmpty(obj.f403974h)) {
            sb6.append(" ");
            sb6.append(obj.f403974h);
        }
        if (!android.text.TextUtils.isEmpty(obj.f403980q)) {
            sb6.append(" ");
            sb6.append(obj.f403980q);
        }
        if (!android.text.TextUtils.isEmpty(obj.f403976m)) {
            sb6.append(" ");
            sb6.append(obj.f403976m);
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final java.lang.Object e(long j17, byte[] bArr, android.content.Context context, java.lang.String str, r45.p30 p30Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("LotteryUtil", str + " postClaim!");
        r45.az1 az1Var = new r45.az1();
        az1Var.set(1, db2.t4.f228171a.a(11486));
        az1Var.set(2, java.lang.Long.valueOf(j17));
        az1Var.set(3, com.tencent.mm.protobuf.g.b(bArr));
        az1Var.set(4, str2 == null ? "" : str2);
        az1Var.set(5, p30Var);
        az1Var.set(6, java.lang.Boolean.TRUE);
        az2.j jVar = (az2.j) az1Var.d();
        az2.j.u(jVar, context, null, 0L, 6, null);
        pq5.g l17 = jVar.l();
        if (l17 != null) {
            l17.K(new on2.h3(str, nVar, context));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    public final void f(android.widget.TextView tv6) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        try {
            java.lang.String string = tv6.getContext().getResources().getString(com.tencent.mm.R.string.drt);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String str = tv6.getContext().getResources().getString(com.tencent.mm.R.string.drs) + string;
            int L = r26.n0.L(str, string, 0, false, 6, null);
            int length = string.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new on2.a3(new java.lang.ref.WeakReference(tv6.getContext())), L, length, 33);
            tv6.setHighlightColor(tv6.getContext().getResources().getColor(android.R.color.transparent));
            tv6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            tv6.setText(spannableString);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LotteryUtil-normalLotteryLicense");
        }
    }

    public final void g(android.widget.TextView tv6, r45.cz1 lotteryInfo) {
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(lotteryInfo, "lotteryInfo");
        java.lang.String string = lotteryInfo.getString(17);
        if (string == null || string.length() == 0) {
            f(tv6);
            return;
        }
        com.tencent.mars.xlog.Log.i("LotteryUtil", "normalLotteryLicense wording:" + string);
        try {
            java.lang.String string2 = tv6.getContext().getResources().getString(com.tencent.mm.R.string.drt);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String v17 = r26.i0.v(string, "%@", string2, false, 4, null);
            int L = r26.n0.L(v17, string2, 0, false, 6, null);
            int length = string2.length() + L;
            android.text.SpannableString spannableString = new android.text.SpannableString(v17);
            spannableString.setSpan(new on2.a3(new java.lang.ref.WeakReference(tv6.getContext())), L, length, 33);
            tv6.setHighlightColor(tv6.getContext().getResources().getColor(android.R.color.transparent));
            tv6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            tv6.setText(spannableString);
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LotteryUtil-normalLotteryLicense");
        }
    }

    public final java.lang.Object h(long j17, byte[] bArr, android.content.Context context, java.lang.String str, r45.p30 p30Var, r45.cz1 cz1Var, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        com.tencent.mars.xlog.Log.i("LotteryUtil", str + " postClaim!");
        r45.az1 az1Var = new r45.az1();
        az1Var.set(1, db2.t4.f228171a.a(11486));
        az1Var.set(2, java.lang.Long.valueOf(j17));
        az1Var.set(3, com.tencent.mm.protobuf.g.b(bArr));
        az1Var.set(4, cz1Var.getString(0));
        az1Var.set(5, p30Var);
        pq5.g l17 = ((az2.j) az1Var.d()).l();
        if (l17 != null) {
            l17.K(new on2.j3(str, nVar, context));
        }
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }
}
