package pr3;

/* loaded from: classes8.dex */
public final class n extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.e3l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        int i19;
        pr3.c item = (pr3.c) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.profile.ui.ProfileNormalItemView profileNormalItemView = (com.tencent.mm.plugin.profile.ui.ProfileNormalItemView) holder.p(com.tencent.mm.R.id.f485378hh0);
        profileNormalItemView.setVisibility(8);
        profileNormalItemView.setVisibility(0);
        profileNormalItemView.f153777e = profileNormalItemView.getContext().getString(item.f357955f);
        android.view.ViewGroup.LayoutParams layoutParams = profileNormalItemView.f153781i.getLayoutParams();
        java.lang.Integer num = item.f357961o;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (num != null) {
            layoutParams.width = i65.a.h(profileNormalItemView.getContext(), num.intValue());
            profileNormalItemView.f153781i.setLayoutParams(layoutParams);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            layoutParams.width = -2;
            profileNormalItemView.f153781i.setLayoutParams(layoutParams);
        }
        android.widget.TextView mTitleTv = profileNormalItemView.f153781i;
        kotlin.jvm.internal.o.f(mTitleTv, "mTitleTv");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        mTitleTv.setSingleLine(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        profileNormalItemView.f153782m.setGravity(8388613);
        profileNormalItemView.f153778f = item.f357956g;
        java.lang.Integer num2 = item.f357960n;
        if (num2 != null) {
            profileNormalItemView.f153782m.setTextColor(num2.intValue());
        } else {
            profileNormalItemView.f153782m.setTextColor(i65.a.d(profileNormalItemView.getContext(), com.tencent.mm.R.color.FG_1));
        }
        boolean z18 = true;
        if (item.f357963q == pr3.f.f357971d) {
            profileNormalItemView.f153780h = true;
        } else {
            profileNormalItemView.f153780h = false;
        }
        boolean z19 = item.f357958i;
        android.view.View view = profileNormalItemView.f153783n;
        int i27 = z19 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ProfileNormalItemView", "setRightArrow", "(Z)Lcom/tencent/mm/plugin/profile/ui/ProfileNormalItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/ProfileNormalItemView", "setRightArrow", "(Z)Lcom/tencent/mm/plugin/profile/ui/ProfileNormalItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Integer num3 = item.f357959m;
        if (num3 != null) {
            com.tencent.mm.ui.kk.d(profileNormalItemView, profileNormalItemView.getResources().getDimensionPixelSize(num3.intValue()));
        } else {
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.tencent.mm.ui.kk.d(profileNormalItemView, 0);
        }
        profileNormalItemView.f153779g = new pr3.j(item);
        if (item.f357957h == 1) {
            profileNormalItemView.f153782m.setSingleLine(true);
        } else {
            profileNormalItemView.f153782m.setSingleLine(false);
            profileNormalItemView.f153782m.setMaxLines(item.f357957h);
            profileNormalItemView.f153782m.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        profileNormalItemView.setClickable(true);
        float g17 = i65.a.g(profileNormalItemView.getContext());
        com.tencent.mars.xlog.Log.i("MicroMsg.InfoItemConvert", "reload, " + ((java.lang.Object) item.f357956g) + ", images: " + item.f357964r.size());
        java.util.List list2 = item.f357964r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a((java.lang.String) obj);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            java.lang.CharSequence charSequence = item.f357956g;
            if (charSequence == null || r26.n0.N(charSequence)) {
                android.widget.LinearLayout mExtraGroup = profileNormalItemView.f153784o;
                kotlin.jvm.internal.o.f(mExtraGroup, "mExtraGroup");
                com.tencent.mm.ui.kk.f(mExtraGroup, 0);
            } else {
                android.widget.LinearLayout mExtraGroup2 = profileNormalItemView.f153784o;
                kotlin.jvm.internal.o.f(mExtraGroup2, "mExtraGroup");
                com.tencent.mm.ui.kk.f(mExtraGroup2, profileNormalItemView.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.aih));
            }
            profileNormalItemView.f153784o.setVisibility(0);
            if (profileNormalItemView.f153784o.getChildCount() < 1) {
                android.content.Context context = profileNormalItemView.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.ui.base.MMGridLayout mMGridLayout = new com.tencent.mm.ui.base.MMGridLayout(context, null, 0, 6, null);
                mMGridLayout.setOnCreateView(new pr3.k(profileNormalItemView));
                mMGridLayout.setOnBindView(new pr3.m(g17, item, mMGridLayout));
                profileNormalItemView.f153784o.addView(mMGridLayout);
            }
            android.view.View childAt = profileNormalItemView.f153784o.getChildAt(0);
            com.tencent.mm.ui.base.MMGridLayout mMGridLayout2 = childAt instanceof com.tencent.mm.ui.base.MMGridLayout ? (com.tencent.mm.ui.base.MMGridLayout) childAt : null;
            if (mMGridLayout2 != null) {
                mMGridLayout2.setData(kz5.n0.V0(arrayList2));
                mMGridLayout2.b();
            }
        } else {
            profileNormalItemView.f153784o.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) profileNormalItemView.findViewById(com.tencent.mm.R.id.szb);
        java.lang.String str2 = item.f357962p;
        if (str2 != null && !r26.n0.N(str2)) {
            z18 = false;
        }
        if (z18) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        profileNormalItemView.f153781i.setText(profileNormalItemView.f153777e);
        if (!com.tencent.mm.sdk.platformtools.t8.J0(profileNormalItemView.f153778f) || profileNormalItemView.f153780h) {
            profileNormalItemView.setVisibility(0);
            profileNormalItemView.f153782m.setText(profileNormalItemView.f153778f);
            java.lang.CharSequence charSequence2 = profileNormalItemView.f153778f;
            if (charSequence2 == null || charSequence2.length() <= 0) {
                i19 = 8;
                profileNormalItemView.f153782m.setVisibility(8);
            } else {
                profileNormalItemView.f153782m.setVisibility(0);
                i19 = 8;
            }
            profileNormalItemView.setOnClickListener(profileNormalItemView.f153779g);
        } else {
            profileNormalItemView.setVisibility(8);
            i19 = 8;
        }
        if (item.j()) {
            profileNormalItemView.setVisibility(0);
        } else {
            profileNormalItemView.setVisibility(i19);
        }
    }
}
