package sj3;

/* loaded from: classes14.dex */
public class m1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f408631d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f408632e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f408633f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f408634g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f408635h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f408636i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f408637m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f408638n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f408639o = false;

    public m1(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI) {
        this.f408631d = multiTalkMainUI;
        this.f408632e = multiTalkMainUI.findViewById(com.tencent.mm.R.id.f485368hf2);
        android.view.View findViewById = multiTalkMainUI.findViewById(com.tencent.mm.R.id.n0_);
        this.f408638n = findViewById;
        android.view.View findViewById2 = multiTalkMainUI.findViewById(com.tencent.mm.R.id.hf7);
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) findViewById2.getLayoutParams();
        layoutParams.topMargin = (int) ((i65.a.k(multiTalkMainUI) * 15.9d) / 100.0d);
        findViewById2.setLayoutParams(layoutParams);
        this.f408634g = (android.widget.TextView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.hf8);
        this.f408636i = (android.widget.ImageView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.hf6);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.n0a);
        this.f408637m = recyclerView;
        this.f408633f = multiTalkMainUI.findViewById(com.tencent.mm.R.id.jwj);
        i65.a.k(multiTalkMainUI);
        i65.a.b(multiTalkMainUI, 412);
        i65.a.k(multiTalkMainUI);
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(multiTalkMainUI);
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams2.bottomMargin = (int) ((i65.a.k(multiTalkMainUI) * 21.9d) / 100.0d);
        findViewById.setLayoutParams(layoutParams2);
        android.view.View findViewById3 = multiTalkMainUI.findViewById(com.tencent.mm.R.id.hel);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) findViewById3.getLayoutParams();
        layoutParams3.bottomMargin = (int) ((i65.a.k(multiTalkMainUI) * 3.6d) / 100.0d);
        findViewById3.setLayoutParams(layoutParams3);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new sj3.s5(multiTalkMainUI));
        recyclerView.post(new sj3.j1(this));
        recyclerView.setOnScrollListener(new sj3.k1(this));
        this.f408635h = (android.widget.TextView) multiTalkMainUI.findViewById(com.tencent.mm.R.id.hef);
        android.widget.ImageButton imageButton = (android.widget.ImageButton) multiTalkMainUI.findViewById(com.tencent.mm.R.id.hf9);
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) multiTalkMainUI.findViewById(com.tencent.mm.R.id.f485367hf1);
        imageButton.setOnClickListener(this);
        imageButton2.setOnClickListener(this);
    }

    public void a() {
        android.view.View view = this.f408632e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "dismissInviteUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "dismissInviteUI", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup T6 = this.f408631d.T6();
        if (T6 != null) {
            T6.removeView(this.f408632e);
        }
    }

    public void b(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        android.view.View view = this.f408632e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f408633f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "inflateInvitingUI", "(Lcom/tencent/mm/modeltalkroom/MultiTalkGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String d17 = com.tencent.mm.plugin.multitalk.model.o2.d(com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(d17);
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408631d;
        if (!K0) {
            for (int i17 = 0; i17 < multiTalkGroup.f71611i.size(); i17++) {
                if (!((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) multiTalkGroup.f71611i.get(i17)).f71612d.equals(d17)) {
                    arrayList3.add(((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) multiTalkGroup.f71611i.get(i17)).f71612d);
                }
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(d17);
            ((ke0.e) xVar).getClass();
            this.f408634g.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(multiTalkMainUI, e17));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e18 = c01.a2.e(d17);
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString i18 = com.tencent.mm.pluginsdk.ui.span.c0.i(multiTalkMainUI, e18);
            android.widget.ImageView imageView = this.f408636i;
            imageView.setContentDescription(i18);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.tencent.mm.pluginsdk.ui.u.b(imageView, d17, 0.1f, true);
        }
        if (multiTalkMainUI.T6() != null && multiTalkMainUI.T6().findViewById(com.tencent.mm.R.id.m7w) != null) {
            android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = com.tencent.mm.ui.bl.c(multiTalkMainUI);
            multiTalkMainUI.T6().findViewById(com.tencent.mm.R.id.m7w).setLayoutParams(layoutParams);
        }
        int size = arrayList3.size();
        android.widget.TextView textView = this.f408635h;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f408637m;
        if (size <= 0) {
            textView.setVisibility(8);
            recyclerView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(com.tencent.mm.R.string.f492588h22);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(multiTalkMainUI.getContext().getString(com.tencent.mm.R.string.f492589h23));
        for (int i19 = 0; i19 < arrayList3.size(); i19++) {
            if (!((sj3.s5) recyclerView.getAdapter()).x((java.lang.String) arrayList3.get(i19))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                java.lang.String str = (java.lang.String) arrayList3.get(i19);
                ((sg3.a) v0Var).getClass();
                sb6.append(c01.a2.e(str));
                sb6.append(",");
                stringBuffer.append(sb6.toString());
            }
        }
        this.f408638n.setTag(com.tencent.mm.R.id.nww, stringBuffer.toString());
        recyclerView.setVisibility(0);
        recyclerView.removeAllViews();
        for (int i27 = 0; i27 < arrayList3.size(); i27++) {
            if (!((sj3.s5) recyclerView.getAdapter()).x((java.lang.String) arrayList3.get(i27))) {
                sj3.s5 s5Var = (sj3.s5) recyclerView.getAdapter();
                java.lang.String userName = (java.lang.String) arrayList3.get(i27);
                s5Var.getClass();
                kotlin.jvm.internal.o.g(userName, "userName");
                java.util.ArrayList arrayList4 = s5Var.f408742e;
                if (arrayList4.size() <= i27) {
                    arrayList4.add(userName);
                } else {
                    arrayList4.set(i27, userName);
                }
            }
        }
        recyclerView.getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == com.tencent.mm.R.id.f485367hf1) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().f(true, false);
            android.content.Context context = view.getContext();
            if (context != null && !((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                sj3.l1 l1Var = new sj3.l1(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(l1Var, 2000L, false);
            }
        } else if (view.getId() == com.tencent.mm.R.id.hf9) {
            com.tencent.mm.plugin.multitalk.model.e3.Ri().a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkInvitingUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
