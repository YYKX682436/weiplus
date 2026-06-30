package on2;

/* loaded from: classes3.dex */
public final class v0 extends com.tencent.mm.ui.component.UIComponent implements android.view.View.OnClickListener {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public com.tencent.mm.plugin.finder.view.c1 G;
    public com.tencent.mm.ui.widget.dialog.j0 H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public long f347028J;
    public long K;
    public int L;
    public int M;
    public byte[] N;
    public int P;
    public java.lang.String Q;
    public r45.ht1 R;
    public on2.f S;
    public on2.e T;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f347029d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f347030e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f347031f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f347032g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f347033h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f347034i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f347035m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f347036n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f347037o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f347038p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f347039q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f347040r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f347041s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f347042t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f347043u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f347044v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f347045w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f347046x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f347047y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f347048z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f347029d = jz5.h.b(new on2.h(this));
        this.f347030e = jz5.h.b(new on2.u0(this));
        this.f347031f = jz5.h.b(new on2.o(this));
        this.f347032g = jz5.h.b(new on2.i(this));
        this.f347033h = jz5.h.b(new on2.o0(this));
        this.f347034i = jz5.h.b(new on2.j(this));
        this.f347035m = jz5.h.b(new on2.n(this));
        this.f347036n = jz5.h.b(new on2.k(this));
        this.f347037o = jz5.h.b(new on2.l(this));
        this.f347038p = jz5.h.b(new on2.g(this));
        this.f347039q = jz5.h.b(new on2.x(this));
        this.f347040r = jz5.h.b(new on2.z(this));
        this.f347041s = jz5.h.b(new on2.y(this));
        this.f347042t = jz5.h.b(new on2.p0(this));
        this.f347043u = jz5.h.b(new on2.r0(this));
        this.f347044v = jz5.h.b(new on2.m0(this));
        this.f347045w = jz5.h.b(new on2.t(this));
        this.f347046x = jz5.h.b(new on2.m(this));
        this.f347047y = jz5.h.b(new on2.s(this));
        this.f347048z = jz5.h.b(new on2.r(this));
        this.A = jz5.h.b(new on2.u(this));
        this.B = jz5.h.b(new on2.p(this));
        this.C = jz5.h.b(new on2.q(this));
        this.D = jz5.h.b(new on2.s0(this));
        this.E = jz5.h.b(new on2.t0(this));
        this.F = jz5.h.b(new on2.a0(this));
        this.I = "";
        this.M = 1;
        this.Q = "";
        this.S = on2.f.f346895d;
        this.T = on2.e.f346880d;
    }

    public static final void O6(on2.v0 v0Var) {
        v0Var.getClass();
        ek2.a1 a1Var = new ek2.a1(v0Var.L, "", v0Var.K, v0Var.f347028J, v0Var.N, "", v0Var.I, null, null);
        a1Var.t(v0Var.getActivity(), v0Var.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = a1Var.l();
        if (v0Var.getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = v0Var.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) activity);
        }
        l17.K(new on2.n0(v0Var));
    }

    public final void P6(boolean z17) {
        r45.yy1 yy1Var;
        r45.ht1 ht1Var = this.R;
        if (ht1Var != null) {
            int i17 = 1;
            r45.cz1 cz1Var = (r45.cz1) ht1Var.getCustom(1);
            if (cz1Var == null || (yy1Var = (r45.yy1) cz1Var.getCustom(13)) == null) {
                return;
            }
            com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
            if (!z17) {
                java.lang.String str = this.Q;
                java.lang.String str2 = str != null ? str : "";
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b17 = b52.b.b();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt("lottery_type", java.lang.Integer.valueOf(yy1Var.getInteger(0)));
                n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
                long j17 = this.f347028J;
                ((m30.m) rVar).getClass();
                jSONObject.putOpt("object_id", b52.b.q(j17));
                int i18 = this.M;
                if (i18 != 1) {
                    i17 = 3;
                    if (i18 != 2) {
                        i17 = i18 != 3 ? 0 : 2;
                    }
                }
                jSONObject.putOpt("source_type", java.lang.Integer.valueOf(i17));
                if (yy1Var.getInteger(0) == 0) {
                    jSONObject.putOpt("lottery_status", 4);
                } else {
                    jSONObject.putOpt("lottery_status", java.lang.Integer.valueOf(yy1Var.getInteger(8)));
                }
                a4Var.b(str2, b17, "live_lottery_details_button", jSONObject.toString());
                return;
            }
            java.lang.String str3 = this.Q;
            if (str3 == null) {
                str3 = "";
            }
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            java.lang.String b18 = b52.b.b();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("lottery_type", java.lang.Integer.valueOf(yy1Var.getInteger(0)));
            n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
            long j18 = this.f347028J;
            ((m30.m) rVar2).getClass();
            jSONObject2.putOpt("object_id", b52.b.q(j18));
            int i19 = this.M;
            if (i19 != 1) {
                i17 = 3;
                if (i19 != 2) {
                    i17 = i19 != 3 ? 0 : 2;
                }
            }
            jSONObject2.putOpt("source_type", java.lang.Integer.valueOf(i17));
            if (yy1Var.getInteger(0) == 0) {
                jSONObject2.putOpt("lottery_status", 4);
            } else {
                jSONObject2.putOpt("lottery_status", java.lang.Integer.valueOf(yy1Var.getInteger(8)));
            }
            a4Var.a(str3, "", b18, "live_lottery_details_button", jSONObject2.toString());
        }
    }

    public final android.widget.TextView Q6() {
        java.lang.Object value = ((jz5.n) this.f347038p).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.ImageView R6() {
        java.lang.Object value = ((jz5.n) this.f347029d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }

    public final android.widget.TextView S6() {
        java.lang.Object value = ((jz5.n) this.f347034i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView T6() {
        java.lang.Object value = ((jz5.n) this.f347035m).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView U6() {
        java.lang.Object value = ((jz5.n) this.f347031f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final java.lang.String V6() {
        r45.cz1 cz1Var;
        r45.wy1 wy1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.ht1 ht1Var = this.R;
        java.lang.String nickname = (ht1Var == null || (cz1Var = (r45.cz1) ht1Var.getCustom(1)) == null || (wy1Var = (r45.wy1) cz1Var.getCustom(16)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) wy1Var.getCustom(1)) == null) ? null : finderContact.getNickname();
        return nickname == null ? "" : nickname;
    }

    public final java.lang.String W6() {
        r45.cz1 cz1Var;
        r45.wy1 wy1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.ht1 ht1Var = this.R;
        java.lang.String username = (ht1Var == null || (cz1Var = (r45.cz1) ht1Var.getCustom(1)) == null || (wy1Var = (r45.wy1) cz1Var.getCustom(16)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) wy1Var.getCustom(1)) == null) ? null : finderContact.getUsername();
        return username == null ? "" : username;
    }

    public final android.widget.TextView X6() {
        java.lang.Object value = ((jz5.n) this.f347039q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView Y6() {
        java.lang.Object value = ((jz5.n) this.f347041s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView Z6() {
        java.lang.Object value = ((jz5.n) this.f347040r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView a7() {
        java.lang.Object value = ((jz5.n) this.f347033h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView b7() {
        java.lang.Object value = ((jz5.n) this.f347030e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void c7(r45.yy1 yy1Var) {
        if (yy1Var.getInteger(0) == 4) {
            S6().setVisibility(8);
            return;
        }
        android.widget.TextView S6 = S6();
        java.lang.String string = yy1Var.getString(2);
        if (string == null) {
            string = "";
        }
        S6.setText(string);
        if (yy1Var.getInteger(5) == 1) {
            S6().setText(S6().getContext().getResources().getString(com.tencent.mm.R.string.dqh));
            S6().setBackground(null);
            S6().setTextColor(S6().getContext().getResources().getColor(com.tencent.mm.R.color.f479070p1, null));
            S6().setEnabled(false);
            return;
        }
        int integer = yy1Var.getInteger(3);
        jz5.g gVar = this.f347036n;
        if (integer == 0) {
            S6().setBackgroundResource(com.tencent.mm.R.drawable.a09);
            S6().setTextColor(S6().getContext().getResources().getColor(com.tencent.mm.R.color.f478553an, null));
            S6().setVisibility(0);
            S6().setEnabled(true);
            java.lang.Object value = ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (yy1Var.getInteger(0) == 3) {
            jz5.g gVar2 = this.f347044v;
            java.lang.Object value2 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            ((android.widget.TextView) value2).setVisibility(0);
            java.lang.Object value3 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value3, "getValue(...)");
            android.widget.TextView textView = (android.widget.TextView) value3;
            java.lang.String string2 = yy1Var.getString(2);
            java.lang.String str = string2 == null ? "" : string2;
            try {
                java.lang.String string3 = textView.getContext().getString(com.tencent.mm.R.string.dkv, str);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                int L = r26.n0.L(string3, str, 0, false, 6, null);
                int length = string3.length();
                android.text.SpannableString spannableString = new android.text.SpannableString(string3);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Link_100)), L, length, 33);
                textView.setText(spannableString);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LotteryUtil", e17, "set order detail text failed", new java.lang.Object[0]);
            }
            java.lang.Object value4 = ((jz5.n) gVar2).getValue();
            kotlin.jvm.internal.o.f(value4, "getValue(...)");
            ((android.widget.TextView) value4).setOnClickListener(new on2.q0(yy1Var, this));
        }
        S6().setVisibility(8);
        java.lang.Object value5 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        android.view.View view2 = (android.view.View) value5;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaim", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveLotteryClaimMethod;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value6 = ((jz5.n) this.f347037o).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) value6;
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        on2.y0 y0Var = new on2.y0();
        java.util.LinkedList<r45.we2> list = yy1Var.getList(6);
        kotlin.jvm.internal.o.f(list, "getClaim_info(...)");
        java.util.LinkedList linkedList = y0Var.f347073d;
        linkedList.clear();
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.we2 we2Var : list) {
                java.lang.String string4 = we2Var.getString(0);
                if (string4 == null) {
                    string4 = "";
                }
                java.lang.String string5 = we2Var.getString(1);
                if (string5 == null) {
                    string5 = "";
                }
                arrayList3.add(new on2.w0(y0Var, string4, string5));
            }
            linkedList.addAll(arrayList3);
        }
        y0Var.notifyDataSetChanged();
        recyclerView.setAdapter(y0Var);
    }

    public final void d7(r45.ul4 ul4Var) {
        java.lang.String str;
        if (ul4Var == null || (str = ul4Var.f387458e) == null) {
            str = "";
        }
        boolean z17 = ul4Var != null && ul4Var.f387459f == 0;
        boolean z18 = ul4Var != null && ul4Var.f387461h == 1;
        S6().setVisibility(0);
        if (z18) {
            S6().setText(S6().getContext().getResources().getString(com.tencent.mm.R.string.dqh));
            S6().setBackground(null);
            S6().setTextColor(S6().getContext().getResources().getColor(com.tencent.mm.R.color.f479070p1, null));
            S6().setEnabled(false);
            return;
        }
        if (z17) {
            S6().setText(str);
            S6().setBackgroundResource(com.tencent.mm.R.drawable.a09);
            S6().setTextColor(S6().getContext().getResources().getColor(com.tencent.mm.R.color.f478553an, null));
            S6().setVisibility(0);
            S6().setEnabled(true);
            return;
        }
        S6().setVisibility(8);
        java.util.LinkedList<r45.lm4> detailList = ul4Var != null ? ul4Var.f387462i : null;
        if (detailList != null && (detailList.isEmpty() ^ true)) {
            java.lang.Object value = ((jz5.n) this.f347036n).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            android.view.View view = (android.view.View) value;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaimForMilestone", "(Lcom/tencent/mm/protocal/protobuf/MilestoneLotteryClaimInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "setClaimForMilestone", "(Lcom/tencent/mm/protocal/protobuf/MilestoneLotteryClaimInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object value2 = ((jz5.n) this.f347037o).getValue();
            kotlin.jvm.internal.o.f(value2, "getValue(...)");
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) value2;
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
            on2.y0 y0Var = new on2.y0();
            kotlin.jvm.internal.o.g(detailList, "detailList");
            java.util.LinkedList linkedList = y0Var.f347073d;
            linkedList.clear();
            if (!detailList.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(detailList, 10));
                for (r45.lm4 lm4Var : detailList) {
                    java.lang.String str2 = lm4Var.f379620d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    java.lang.String str3 = lm4Var.f379621e;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList2.add(new on2.w0(y0Var, str2, str3));
                }
                linkedList.addAll(arrayList2);
            }
            y0Var.notifyDataSetChanged();
            recyclerView.setAdapter(y0Var);
        }
    }

    public final void e7(on2.f fVar) {
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", "clickForPageChange " + fVar);
        this.S = fVar;
    }

    public final void f7(java.lang.String str, boolean z17) {
        if (z17) {
            str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwd);
        } else {
            if (str == null || str.length() == 0) {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dwc);
            }
        }
        kotlin.jvm.internal.o.d(str);
        S6().setText(str);
        S6().setVisibility(0);
        if (z17) {
            S6().setBackground(null);
            S6().setTextColor(S6().getContext().getResources().getColor(com.tencent.mm.R.color.f479070p1, null));
            S6().setEnabled(false);
        } else {
            S6().setBackgroundResource(com.tencent.mm.R.drawable.a09);
            S6().setTextColor(S6().getContext().getResources().getColor(com.tencent.mm.R.color.f478553an, null));
            S6().setEnabled(true);
        }
    }

    public final void g7(boolean z17) {
        on2.e eVar = z17 ? on2.e.f346882f : on2.e.f346881e;
        if (eVar != this.T) {
            int ordinal = eVar.ordinal();
            if (ordinal == 1) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).sk(ml2.u1.J1, W6(), java.lang.String.valueOf(this.K), this.I, this.P);
            } else if (ordinal == 2) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).sk(ml2.u1.I1, W6(), java.lang.String.valueOf(this.K), this.I, this.P);
            }
        }
        this.T = eVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489012b15;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        s71.b bVar;
        byte[] byteArrayExtra;
        if (i17 == 1001 && i18 == -1) {
            if (intent == null || (byteArrayExtra = intent.getByteArrayExtra("launch_from_select_addr")) == null) {
                bVar = null;
            } else {
                bVar = new s71.b();
                bVar.parseFrom(byteArrayExtra);
            }
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "request addr but result is empty!");
                return;
            }
            androidx.appcompat.app.AppCompatActivity context = getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
            u1Var.g(context.getResources().getString(com.tencent.mm.R.string.dpc));
            u1Var.n(context.getResources().getString(com.tencent.mm.R.string.dpb));
            u1Var.j(context.getResources().getString(com.tencent.mm.R.string.dpa));
            u1Var.i(new on2.b3(u1Var));
            u1Var.l(new on2.b0(this, bVar));
            u1Var.q(false);
            this.H = u1Var.f211998c;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        r45.gm4 gm4Var;
        r45.wc5 wc5Var;
        r45.cz1 cz1Var;
        com.tencent.mm.protobuf.g byteString;
        r45.y23 y23Var;
        r45.ce0 ce0Var;
        r45.ht1 ht1Var;
        r45.cz1 cz1Var2;
        r45.wy1 wy1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        r45.im4 im4Var;
        r45.en5 en5Var;
        r45.zl4 zl4Var;
        r45.am4 am4Var;
        r45.yl4 yl4Var;
        r45.zl4 zl4Var2;
        r45.am4 am4Var2;
        r45.yl4 yl4Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.fpo) {
            P6(false);
            r45.ht1 ht1Var2 = this.R;
            java.lang.Integer valueOf2 = ht1Var2 != null ? java.lang.Integer.valueOf(ht1Var2.getInteger(10)) : null;
            if (valueOf2 != null && valueOf2.intValue() == 1) {
                e7(on2.f.f346898g);
                r45.ht1 ht1Var3 = this.R;
                com.tencent.mm.protobuf.g byteString2 = (ht1Var3 == null || (zl4Var2 = (r45.zl4) ht1Var3.getCustom(11)) == null || (am4Var2 = (r45.am4) zl4Var2.getCustom(1)) == null || (yl4Var2 = (r45.yl4) am4Var2.getCustom(0)) == null) ? null : yl4Var2.getByteString(3);
                r45.ht1 ht1Var4 = this.R;
                java.lang.Integer valueOf3 = (ht1Var4 == null || (zl4Var = (r45.zl4) ht1Var4.getCustom(11)) == null || (am4Var = (r45.am4) zl4Var.getCustom(1)) == null || (yl4Var = (r45.yl4) am4Var.getCustom(0)) == null) ? null : java.lang.Integer.valueOf(yl4Var.getInteger(1));
                if (byteString2 == null) {
                    com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "setCouponClaimClick jumpInfo is null!");
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                if (valueOf3 != null && valueOf3.intValue() == 1) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).rk(ml2.t1.Q1, W6(), java.lang.String.valueOf(this.K), this.I, this.P);
                    r45.ce0 ce0Var2 = new r45.ce0();
                    try {
                        ce0Var2.parseFrom(byteString2.g());
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                    }
                    byte[] s07 = com.tencent.mm.sdk.platformtools.t8.s0();
                    java.lang.String str3 = "milestone_lottery_history::" + W6() + ":::" + s07 + "::";
                    st2.c2 c2Var = st2.c2.f412249a;
                    android.app.Activity context = getContext();
                    kotlin.jvm.internal.o.d(s07);
                    l81.b1 d17 = c2Var.d(context, ce0Var2, com.tencent.mm.plugin.appbrand.jsapi.contact.u0.CTRL_INDEX, s07, str3, null);
                    android.app.Activity context2 = getContext();
                    java.lang.String appId = d17.f317014b;
                    kotlin.jvm.internal.o.f(appId, "appId");
                    java.lang.String string = ce0Var2.getString(2);
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String string2 = ce0Var2.getString(3);
                    d17.f317037o = new st2.j2(context2, appId, string, string2 != null ? string2 : "");
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(getContext(), d17);
                } else if (valueOf3 != null && valueOf3.intValue() == 2) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).rk(ml2.t1.P1, W6(), java.lang.String.valueOf(this.K), this.I, this.P);
                    lr2.b bVar = lr2.b.f320718a;
                    java.lang.Object value = ((jz5.n) this.f347042t).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    android.content.Context context3 = ((android.view.View) value).getContext();
                    kotlin.jvm.internal.o.f(context3, "getContext(...)");
                    r45.mg0 mg0Var = new r45.mg0();
                    try {
                        mg0Var.parseFrom(byteString2.g());
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                    }
                    bVar.a(context3, mg0Var, com.tencent.mm.plugin.appbrand.jsapi.contact.u0.CTRL_INDEX);
                }
            } else {
                if (valueOf2 == null || valueOf2.intValue() != 2) {
                    if (valueOf2 == null) {
                        str = "(Landroid/view/View;)V";
                    } else {
                        str = "(Landroid/view/View;)V";
                        if (valueOf2.intValue() == 3) {
                            r45.ht1 ht1Var5 = this.R;
                            if ((ht1Var5 == null || (gm4Var = (r45.gm4) ht1Var5.getCustom(13)) == null || (wc5Var = (r45.wc5) gm4Var.getCustom(1)) == null || wc5Var.getInteger(0) != 4) ? false : true) {
                                androidx.appcompat.app.AppCompatActivity context4 = getActivity();
                                kotlin.jvm.internal.o.g(context4, "context");
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("launch_from_select_addr", true);
                                intent.putExtra("enter_scene_address", 3);
                                j45.l.o(context4, "address", ".ui.WalletSelectAddrUI", intent, 1001, false);
                            }
                            str2 = "onClick";
                            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", str2, str);
                        }
                    }
                    if (valueOf2 != null && valueOf2.intValue() == 0) {
                        e7(on2.f.f346896e);
                        r45.ht1 ht1Var6 = this.R;
                        if (ht1Var6 != null && (cz1Var = (r45.cz1) ht1Var6.getCustom(1)) != null) {
                            r45.yy1 yy1Var = (r45.yy1) cz1Var.getCustom(13);
                            java.lang.Integer valueOf4 = yy1Var != null ? java.lang.Integer.valueOf(yy1Var.getInteger(0)) : null;
                            on2.l3 l3Var = on2.l3.f346966a;
                            if (valueOf4 == null || valueOf4.intValue() != 0) {
                                if (valueOf4 == null) {
                                    str2 = "onClick";
                                } else {
                                    str2 = "onClick";
                                    if (valueOf4.intValue() == 1) {
                                        androidx.appcompat.app.AppCompatActivity context5 = getActivity();
                                        kotlin.jvm.internal.o.g(context5, "context");
                                        android.content.Intent intent2 = new android.content.Intent();
                                        intent2.putExtra("launch_from_select_addr", true);
                                        intent2.putExtra("enter_scene_address", 3);
                                        j45.l.o(context5, "address", ".ui.WalletSelectAddrUI", intent2, 1001, false);
                                        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", str2, str);
                                    }
                                }
                                if (valueOf4 != null && valueOf4.intValue() == 2) {
                                    this.G = l3Var.a(getActivity(), cz1Var, new on2.f0(this, cz1Var));
                                } else if (valueOf4 != null && valueOf4.intValue() == 3) {
                                    r45.yy1 yy1Var2 = (r45.yy1) cz1Var.getCustom(13);
                                    if (yy1Var2 != null && (byteString = yy1Var2.getByteString(7)) != null) {
                                        l81.b1 b1Var = new l81.b1();
                                        r45.y23 y23Var2 = new r45.y23();
                                        try {
                                            y23Var2.parseFrom(byteString.g());
                                            y23Var = y23Var2;
                                        } catch (java.lang.Exception e19) {
                                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
                                            y23Var = null;
                                        }
                                        if (y23Var != null && (ce0Var = (r45.ce0) y23Var.getCustom(9)) != null) {
                                            java.lang.String string3 = ce0Var.getString(0);
                                            if (string3 == null) {
                                                string3 = "";
                                            }
                                            b1Var.f317014b = string3;
                                            java.lang.String string4 = ce0Var.getString(1);
                                            b1Var.f317022f = string4 != null ? string4 : "";
                                            b1Var.f317037o = new on2.c0(this);
                                            com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", "claim prize appid = " + b1Var.f317014b + ", path = " + b1Var.f317022f);
                                            b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.contact.u0.CTRL_INDEX;
                                            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
                                            b1Var.f317016c = zl2.q4.f473933a.x();
                                            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(getContext(), b1Var);
                                        }
                                    }
                                } else {
                                    com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "onClaimClick but claim type is error!");
                                }
                                yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", str2, str);
                            }
                            int i17 = this.M;
                            if (i17 == 1) {
                                getActivity().finish();
                            } else if ((i17 == 2 || i17 == 3) && (ht1Var = this.R) != null && (cz1Var2 = (r45.cz1) ht1Var.getCustom(1)) != null && (wy1Var = (r45.wy1) cz1Var2.getCustom(16)) != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) wy1Var.getCustom(1)) != null && (username = finderContact.getUsername()) != null) {
                                java.lang.String str4 = username.length() > 0 ? username : null;
                                if (str4 != null) {
                                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                                    r45.j55 j55Var = (r45.j55) cz1Var.getCustom(11);
                                    l3Var.c(activity, str4, j55Var != null ? j55Var.getInteger(0) : 0, this.I, this.f347028J, null);
                                    i95.m c17 = i95.n0.c(ml2.r0.class);
                                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                                    ml2.r0.ek((ml2.r0) c17, ml2.p4.f327803q, "", null, 0, null, 28, null);
                                }
                            }
                        }
                    }
                    str2 = "onClick";
                    yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", str2, str);
                }
                e7(on2.f.f346897f);
                r45.ht1 ht1Var7 = this.R;
                java.lang.String string5 = (ht1Var7 == null || (im4Var = (r45.im4) ht1Var7.getCustom(12)) == null || (en5Var = (r45.en5) im4Var.getCustom(1)) == null) ? null : en5Var.getString(1);
                if (string5 == null || string5.length() == 0) {
                    com.tencent.mars.xlog.Log.e("FinderLiveLotteryAudienceUIC", "claim red packet,but red packet uri is empty!");
                } else {
                    i95.m c18 = i95.n0.c(c61.yb.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    c61.yb ybVar = (c61.yb) c18;
                    android.content.Context context6 = view.getContext();
                    kotlin.jvm.internal.o.f(context6, "getContext(...)");
                    r45.ac4 ac4Var = new r45.ac4();
                    com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                    com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
                    html5Info.setUrl(string5);
                    finderJumpInfo.setHtml5_info(html5Info);
                    finderJumpInfo.setJumpinfo_type(2);
                    ac4Var.set(1, finderJumpInfo);
                    c61.yb.Yi(ybVar, context6, ac4Var, null, null, 8, null);
                }
            }
        }
        str = "(Landroid/view/View;)V";
        str2 = "onClick";
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/FinderLiveLotteryAudienceUIC", "android/view/View$OnClickListener", str2, str);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
        android.content.Intent intent = getActivity().getIntent();
        this.K = intent.getLongExtra("KEY_LOTTERY_HISTORY_LIVE_ID", 0L);
        this.f347028J = intent.getLongExtra("KEY_LOTTERY_HISTORY_OBJECT_ID", 0L);
        java.lang.String stringExtra = intent.getStringExtra("KEY_LOTTERY_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.I = stringExtra;
        this.L = intent.getIntExtra("KEY_SCENE", 0);
        this.M = intent.getIntExtra("FROM_SCENE", 1);
        this.N = intent.getByteArrayExtra("KEY_LIVE_COOKIES");
        java.lang.String stringExtra2 = intent.getStringExtra("KEY_FROM_COMMENT_SCENE");
        this.Q = stringExtra2 != null ? stringExtra2 : "";
        this.P = intent.getIntExtra("KEY_LOTTERY_HISTORY_SOURCE", 0);
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", "source:" + this.P + "! fromScene: " + this.M);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484708f82);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 14.0f, 0.0f, 8, null);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f89);
        android.content.Context context2 = textView2.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        d92.f.a(fVar, context2, textView2, 14.0f, 0.0f, 8, null);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f8m);
        android.content.Context context3 = textView3.getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        d92.f.a(fVar, context3, textView3, 14.0f, 0.0f, 8, null);
        android.widget.TextView textView4 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f8a);
        android.content.Context context4 = textView4.getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        d92.f.a(fVar, context4, textView4, 14.0f, 0.0f, 8, null);
        java.lang.Object value = ((jz5.n) this.f347032g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.View) value).setOnClickListener(new on2.v(this));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(S6(), "finder_live_lottery_call_anchor");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(S6(), um2.x5.f429020x1.a());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(S6(), 8, 25561);
        ek2.a1 a1Var = new ek2.a1(this.L, "", this.K, this.f347028J, this.N, "", this.I, null, null);
        a1Var.t(getActivity(), getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        pq5.g l17 = a1Var.l();
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) activity2);
        }
        l17.K(new on2.w(this));
        java.lang.Object value2 = ((jz5.n) this.f347042t).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.view.View) value2).setPadding(0, com.tencent.mm.ui.bl.h(getActivity()), 0, 0);
        jz5.g gVar = this.f347043u;
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.widget.TextView) value3).setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(getActivity()));
        on2.l3 l3Var = on2.l3.f346966a;
        java.lang.Object value4 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        l3Var.f((android.widget.TextView) value4);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.view.c1 c1Var = this.G;
        if (c1Var != null) {
            c1Var.q();
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.H;
        if (j0Var != null) {
            j0Var.dismiss();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        r45.zl4 zl4Var;
        r45.am4 am4Var;
        r45.yl4 yl4Var;
        r45.zl4 zl4Var2;
        r45.am4 am4Var2;
        r45.yl4 yl4Var2;
        r45.zl4 zl4Var3;
        r45.am4 am4Var3;
        r45.yl4 yl4Var3;
        r45.zl4 zl4Var4;
        r45.am4 am4Var4;
        r45.yl4 yl4Var4;
        r45.im4 im4Var;
        r45.en5 en5Var;
        java.lang.Integer num = null;
        boolean z17 = false;
        if (this.S == on2.f.f346897f) {
            r45.ht1 ht1Var = this.R;
            if ((ht1Var != null ? (r45.im4) ht1Var.getCustom(12) : null) != null) {
                r45.ht1 ht1Var2 = this.R;
                if (ht1Var2 != null && (im4Var = (r45.im4) ht1Var2.getCustom(12)) != null && (en5Var = (r45.en5) im4Var.getCustom(1)) != null && en5Var.getBoolean(0)) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", "page resume,red packet is_received!");
                    return;
                } else {
                    pf5.e.launchUI$default(this, null, null, new on2.g0(this, null), 3, null);
                    return;
                }
            }
        }
        if (this.S == on2.f.f346898g) {
            r45.ht1 ht1Var3 = this.R;
            if ((ht1Var3 != null ? (r45.zl4) ht1Var3.getCustom(11) : null) != null) {
                r45.ht1 ht1Var4 = this.R;
                if (!((ht1Var4 == null || (zl4Var4 = (r45.zl4) ht1Var4.getCustom(11)) == null || (am4Var4 = (r45.am4) zl4Var4.getCustom(1)) == null || (yl4Var4 = (r45.yl4) am4Var4.getCustom(0)) == null || !yl4Var4.getBoolean(4)) ? false : true)) {
                    r45.ht1 ht1Var5 = this.R;
                    if (!((ht1Var5 == null || (zl4Var3 = (r45.zl4) ht1Var5.getCustom(11)) == null || (am4Var3 = (r45.am4) zl4Var3.getCustom(1)) == null || (yl4Var3 = (r45.yl4) am4Var3.getCustom(0)) == null || yl4Var3.getInteger(1) != 2) ? false : true)) {
                        pf5.e.launchUI$default(this, null, null, new on2.h0(this, null), 3, null);
                        return;
                    }
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("page resume,coupon_is_expired:");
                r45.ht1 ht1Var6 = this.R;
                sb6.append((ht1Var6 == null || (zl4Var2 = (r45.zl4) ht1Var6.getCustom(11)) == null || (am4Var2 = (r45.am4) zl4Var2.getCustom(1)) == null || (yl4Var2 = (r45.yl4) am4Var2.getCustom(0)) == null) ? null : java.lang.Boolean.valueOf(yl4Var2.getBoolean(4)));
                sb6.append(",coupon_status:");
                r45.ht1 ht1Var7 = this.R;
                if (ht1Var7 != null && (zl4Var = (r45.zl4) ht1Var7.getCustom(11)) != null && (am4Var = (r45.am4) zl4Var.getCustom(1)) != null && (yl4Var = (r45.yl4) am4Var.getCustom(0)) != null) {
                    num = java.lang.Integer.valueOf(yl4Var.getInteger(1));
                }
                sb6.append(num);
                sb6.append('!');
                com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", sb6.toString());
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveLotteryAudienceUIC", "page resume clickForPageChange:" + this.S + '!');
    }
}
