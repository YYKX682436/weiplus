package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class t3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p3 f170497e;

    public t3(com.tencent.mm.plugin.sns.ui.p3 p3Var, android.content.Context context) {
        this.f170497e = p3Var;
        this.f170496d = context;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.content.Context context = this.f170496d;
        com.tencent.mm.plugin.sns.ui.p3 p3Var = this.f170497e;
        if (action == 0) {
            p3Var.f170138d.f167828k.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479551ab2));
            com.tencent.mm.plugin.sns.ui.b4 b4Var = p3Var.f170138d;
            if (!b4Var.f167824g) {
                b4Var.f167823f.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479551ab2));
            }
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
            return false;
        }
        p3Var.f170138d.f167828k.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        com.tencent.mm.plugin.sns.ui.b4 b4Var2 = p3Var.f170138d;
        if (!b4Var2.f167824g) {
            b4Var2.f167823f.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$3");
        return false;
    }
}
