package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class x3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f171480d;

    public x3(com.tencent.mm.plugin.sns.ui.p3 p3Var, android.content.Context context) {
        this.f171480d = context;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.content.Context context = this.f171480d;
        if (action == 0) {
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487023n81)).setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479551ab2));
            ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.n7z)).setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479551ab2));
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
            return false;
        }
        if (motionEvent.getAction() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
            return false;
        }
        ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487023n81)).setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.n7z)).setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f478553an));
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/GalleryFooterNew$7", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.GalleryFooterNew$7");
        return false;
    }
}
