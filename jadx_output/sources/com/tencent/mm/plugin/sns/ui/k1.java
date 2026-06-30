package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class k1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f169602d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f169603e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.CharSequence f169604f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.e86 f169605g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.l1 f169606h;

    public k1(com.tencent.mm.plugin.sns.ui.l1 l1Var, r45.e86 e86Var, java.lang.String str, java.lang.CharSequence charSequence, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        this.f169606h = l1Var;
        this.f169604f = "";
        this.f169603e = str;
        this.f169605g = e86Var;
        this.f169602d = baseViewHolder;
        this.f169604f = charSequence;
    }

    public static /* synthetic */ r45.e86 a(com.tencent.mm.plugin.sns.ui.k1 k1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        r45.e86 e86Var = k1Var.f169605g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        return e86Var;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder b(com.tencent.mm.plugin.sns.ui.k1 k1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = k1Var.f169602d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        return baseViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169602d;
        if (!com.tencent.mm.plugin.sns.storage.w2.h(baseViewHolder.f169264d)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        baseViewHolder.M = view;
        r45.e86 e86Var = this.f169605g;
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f169606h;
        if (e86Var != null && l1Var.f169709j.c(baseViewHolder.f169262c) != null) {
            com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.c(ca4.z0.t0(l1Var.f169709j.c(baseViewHolder.f169262c).field_snsId), e86Var);
        }
        if (e86Var != null && (str2 = e86Var.f373126d) != null && str2.equals(l1Var.f169716q)) {
            com.tencent.mm.plugin.sns.ui.zx zxVar = l1Var.f169712m;
            if (zxVar != null && zxVar.f171725f) {
                l1Var.g();
                l1Var.f169712m.f171725f = false;
            }
            rl5.r rVar = new rl5.r(com.tencent.mm.plugin.sns.ui.l1.a(l1Var));
            com.tencent.mm.plugin.sns.ui.h1 h1Var = new com.tencent.mm.plugin.sns.ui.h1(this);
            com.tencent.mm.plugin.sns.ui.j1 j1Var = new com.tencent.mm.plugin.sns.ui.j1(this);
            int[] iArr = new int[2];
            if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
                iArr = (int[]) view.getTag(com.tencent.mm.R.id.ohu);
            }
            rVar.h(view, h1Var, j1Var, iArr[0], iArr[1]);
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        new com.tencent.mm.plugin.sns.storage.SnsInfo();
        com.tencent.mm.plugin.sns.storage.SnsInfo c17 = l1Var.f169709j.c(baseViewHolder.f169262c);
        if (c17.isInValid()) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        if (!ha4.k.a(c17)) {
            ja4.d.a(baseViewHolder.T.getContext(), baseViewHolder.T.g(0));
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
            return;
        }
        m21.w.d(742);
        com.tencent.mm.plugin.sns.model.s5.e(c17);
        ca4.z0.T(c17);
        c17.isAd();
        c17.getUxinfo();
        if (e86Var.f373132m == 0) {
            long j17 = e86Var.f373137r;
        }
        java.lang.String str3 = e86Var.f373126d;
        java.lang.String str4 = com.tencent.mm.plugin.sns.ui.l1.a(l1Var).getString(com.tencent.mm.R.string.f493233je0) + this.f169603e;
        l1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        java.lang.String str5 = baseViewHolder.f169264d + str4;
        l1Var.f169715p = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseTimeLine", "[performCommentClick] onCommentClick:  commentkey " + l1Var.f169715p + " " + baseViewHolder.f169264d + " position:" + baseViewHolder.f169262c);
        l1Var.f169710k.setTag(c17);
        l1Var.e();
        l1Var.f169710k.setVisibility(0);
        l1Var.f169710k.H(l1Var.d(str5, 0));
        l1Var.f169710k.setCommentHint(str4 + l1Var.f169700a.getString(com.tencent.mm.R.string.j8z));
        l1Var.f169710k.setSnsInfo(c17);
        if (c17.isAd() && e86Var != null && (str = e86Var.f373126d) != null && str.equals(c17.getUserName())) {
            l1Var.f169710k.H(l1Var.d(str5, 1));
        }
        l1Var.b(c17);
        l1Var.f169710k.setCommentInfo(e86Var);
        l1Var.f169710k.N(com.tencent.mm.plugin.sns.ui.l1.A, str5);
        l1Var.f169710k.post(new com.tencent.mm.plugin.sns.ui.b1(l1Var));
        l1Var.f169710k.O(false);
        l1Var.j(baseViewHolder);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/BaseTimeLine$CommentClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener");
    }
}
