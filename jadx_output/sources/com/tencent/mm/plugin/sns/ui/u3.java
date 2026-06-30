package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f170564e;

    public u3(com.tencent.mm.plugin.sns.ui.p3 p3Var, android.content.Context context) {
        this.f170564e = p3Var;
        this.f170563d = context;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.content.Context context = this.f170563d;
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f170564e;
        if (action == 0) {
            p3Var.f170138d.f167829l.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479551ab2));
            p3Var.f170138d.f167825h.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479551ab2));
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
            return false;
        }
        p3Var.f170138d.f167829l.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        p3Var.f170138d.f167825h.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$4");
        return false;
    }
}
