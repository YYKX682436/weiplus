package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class im implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.v1 f168621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f168622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f168623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f168624g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f168625h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.v1 f168626i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.bm f168627m;

    public im(com.tencent.mm.plugin.sns.ui.bm bmVar, com.tencent.mm.plugin.sns.storage.v1 v1Var, android.view.ViewGroup viewGroup, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, android.view.ViewGroup viewGroup2, com.tencent.mm.plugin.sns.storage.v1 v1Var2) {
        this.f168627m = bmVar;
        this.f168621d = v1Var;
        this.f168622e = viewGroup;
        this.f168623f = weImageView;
        this.f168624g = weImageView2;
        this.f168625h = viewGroup2;
        this.f168626i = v1Var2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMsgUI", "bless sns id:%s cmt id:%d", ca4.z0.t0(this.f168621d.field_snsID), java.lang.Integer.valueOf(this.f168621d.S));
        this.f168621d.field_springWishFlag = 1;
        this.f168622e.performHapticFeedback(0, 3);
        this.f168623f.setVisibility(4);
        this.f168624g.setVisibility(0);
        xa4.g.f452830d.F(this.f168624g, null, new com.tencent.mm.plugin.sns.ui.gm(this), 150L);
        ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.ui.hm(this));
        xa4.b.f452821a.e("view_clk", com.tencent.mm.plugin.sns.ui.SnsMsgUI.Z6(this.f168627m.f167962w, this.f168626i), this.f168626i, false);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$SnsMsgAdapter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$5");
    }
}
