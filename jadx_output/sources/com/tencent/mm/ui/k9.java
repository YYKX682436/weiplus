package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LiveBizSessionTipsBar f209038e;

    public k9(com.tencent.mm.ui.LiveBizSessionTipsBar liveBizSessionTipsBar, int i17) {
        this.f209038e = liveBizSessionTipsBar;
        this.f209037d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LiveBizSessionTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.LiveBizSessionTipsBar liveBizSessionTipsBar = this.f209038e;
        yb5.d dVar = liveBizSessionTipsBar.f196867e;
        if (dVar != null) {
            liveBizSessionTipsBar.f196868f = dVar.x();
        }
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        java.lang.String e17 = b0Var.e(liveBizSessionTipsBar.f196868f);
        java.lang.String str = liveBizSessionTipsBar.f196868f;
        int o17 = str == null ? 0 : com.tencent.mm.pluginsdk.model.b0.f189199c.o("live_scene-".concat(str), 0);
        int i17 = com.tencent.mm.storage.c2.f193803a;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(23044, 2, liveBizSessionTipsBar.f196868f, java.lang.Integer.valueOf(this.f209037d), java.lang.Integer.valueOf(i17), e17, java.lang.Integer.valueOf(o17), 0, "");
        b0Var.q(liveBizSessionTipsBar.f196867e.g(), liveBizSessionTipsBar.f196868f, e17, null, 4, o17, null, null, null, null, null, null, null);
        g0Var.d(15721, liveBizSessionTipsBar.f196868f, 0L, 26, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)), java.lang.Integer.valueOf(com.tencent.mm.storage.c2.f193803a));
        yj0.a.h(this, "com/tencent/mm/ui/LiveBizSessionTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
