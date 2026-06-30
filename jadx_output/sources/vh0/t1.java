package vh0;

/* loaded from: classes.dex */
public final class t1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f436967d;

    public t1(android.view.View view) {
        this.f436967d = view;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.view.View view2 = this.f436967d;
        if (action == 0) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.og7);
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(linearLayout.getContext().getColor(com.tencent.mm.R.color.f478489a));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.co6);
            if (weImageView != null) {
                weImageView.setIconColor(weImageView.getContext().getResources().getColor(com.tencent.mm.R.color.f478489a));
            }
        } else if (action == 1) {
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.og7);
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundColor(linearLayout2.getContext().getColor(com.tencent.mm.R.color.f478492d));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.co6);
            if (weImageView2 != null) {
                weImageView2.setIconColor(weImageView2.getContext().getResources().getColor(com.tencent.mm.R.color.f478492d));
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/feature/yuanbao/YuanBaoAdTipService$attachAdTipView$1$2$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
