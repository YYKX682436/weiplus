package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.j f168218f;

    public e(com.tencent.mm.plugin.sns.ui.j jVar, android.view.View view, android.view.View view2) {
        this.f168218f = jVar;
        this.f168216d = view;
        this.f168217e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$1");
        android.view.View view = this.f168217e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        com.tencent.mm.plugin.sns.ui.j jVar = this.f168218f;
        jVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommentView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        android.view.View view2 = this.f168216d;
        ca4.j jVar2 = (ca4.j) view2.getTag();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/AdNotLikeHelper", "initCommentView", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jVar.f169466h = true;
        com.tencent.mm.plugin.sns.ui.f fVar = new com.tencent.mm.plugin.sns.ui.f(jVar);
        android.view.animation.Animation animation = jVar.f169464f;
        animation.setAnimationListener(fVar);
        view.startAnimation(animation);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482682l4);
        jVar.f169472n = textView;
        textView.setTag(jVar2);
        ca4.i iVar = jVar2.f39952a;
        if (iVar == null || iVar.f39939a == null) {
            z17 = false;
        } else {
            com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = iVar.f39940b;
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            java.lang.String str = "zh_CN".equals(f17) ? aDInfo.adDislikeInfoTitle_cn : ("zh_TW".equals(f17) || "zh_HK".equals(f17)) ? aDInfo.adDislikeInfoTitle_tw : aDInfo.adDislikeInfoTitle_en;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                jVar.f169472n.setText(str);
            }
            z17 = aDInfo.forbidClick;
        }
        android.widget.ListView listView = (android.widget.ListView) view.findViewById(com.tencent.mm.R.id.f482677kz);
        jVar.f169473o = listView;
        listView.setAdapter((android.widget.ListAdapter) new com.tencent.mm.plugin.sns.ui.k(jVar.f169459a, (ca4.j) view2.getTag()));
        if (z17) {
            jVar.f169473o.setClickable(false);
            jVar.f169473o.setOnItemClickListener(null);
        } else {
            jVar.f169473o.setClickable(true);
            jVar.f169473o.setOnItemClickListener(jVar.f169460b.P);
        }
        jVar.f169472n.setClickable(false);
        jVar.f169474p = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommentView", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper$1");
    }
}
