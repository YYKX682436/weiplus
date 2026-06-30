package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class eu implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f168264d;

    /* renamed from: e, reason: collision with root package name */
    public float f168265e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f168266f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter f168267g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.WrapScollview f168268h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.hu f168269i;

    public eu(com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter absSnsUploadSayFooter, com.tencent.mm.plugin.sns.ui.WrapScollview wrapScollview, com.tencent.mm.plugin.sns.ui.hu huVar) {
        this.f168267g = absSnsUploadSayFooter;
        this.f168268h = wrapScollview;
        this.f168269i = huVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(event, "event");
        if (v17.getId() != com.tencent.mm.R.id.n7y) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
            return false;
        }
        boolean z17 = this.f168267g.getVisibility() == 0;
        int action = event.getAction();
        com.tencent.mm.plugin.sns.ui.hu huVar = this.f168269i;
        if (action == 0) {
            event.getX();
            this.f168264d = event.getY();
            this.f168265e = 0.0f;
        } else {
            int action2 = event.getAction();
            com.tencent.mm.plugin.sns.ui.WrapScollview wrapScollview = this.f168268h;
            if (action2 == 2) {
                if (z17) {
                    wrapScollview.setCheckInterceptTouchEventByCheckArea(true);
                    float y17 = this.f168265e + (event.getY() - this.f168264d);
                    this.f168265e = y17;
                    if (java.lang.Math.abs(y17) >= 50.0f) {
                        huVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper");
                        android.content.Context context = huVar.f168534a;
                        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = context instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI ? (com.tencent.mm.plugin.sns.ui.SnsUploadUI) context : null;
                        if (snsUploadUI != null) {
                            snsUploadUI.l7();
                        }
                        this.f168266f = true;
                        this.f168265e = 0.0f;
                        z17 = false;
                    }
                }
                if (!z17) {
                    wrapScollview.setCheckInterceptTouchEventByCheckArea(false);
                }
            } else if (event.getAction() == 1) {
                wrapScollview.setCheckInterceptTouchEventByCheckArea(false);
            }
        }
        com.tencent.mm.plugin.sns.ui.hu.c(huVar);
        event.getAction();
        boolean z18 = this.f168266f;
        yj0.a.i(z18, this, "com/tencent/mm/plugin/sns/ui/SnsUploadInputScrollHelper$setUpView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SnsUploadInputScrollHelper$setUpView$1");
        return z18;
    }
}
