package rk3;

/* loaded from: classes8.dex */
public class i implements ak3.d {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f396521a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager f396522b;

    /* renamed from: c, reason: collision with root package name */
    public jk3.e f396523c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f396524d;

    /* renamed from: e, reason: collision with root package name */
    public int f396525e;

    public i(android.app.Activity activity) {
        this.f396521a = activity;
    }

    public void a(ak3.c cVar, jk3.e eVar) {
        r45.fr4 fr4Var;
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapViewWrapper multiTaskSnapViewWrapper = null;
        android.view.View contentView = cVar != null ? cVar.getContentView() : null;
        if (contentView == null || contentView.getParent() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, contentView is null");
            return;
        }
        android.graphics.Bitmap b17 = eVar != null ? eVar.b() : null;
        if (b17 == null || b17.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, bitmap is null or recycle");
            return;
        }
        if (contentView.getParent() == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskWrapper", "addMultiTaskWrapper, contentView parent is null");
            return;
        }
        this.f396523c = eVar;
        android.view.ViewParent parent = contentView.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int indexOfChild = viewGroup.indexOfChild(contentView);
        viewGroup.removeView(contentView);
        android.view.ViewGroup.LayoutParams layoutParams = contentView.getLayoutParams();
        android.view.View view = new android.view.View(contentView.getContext());
        android.app.Activity activity = this.f396521a;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(com.tencent.mm.ui.zk.a(activity, 15), -1);
        layoutParams2.gravity = 5;
        view.setLayoutParams(layoutParams2);
        rk3.g gVar = new rk3.g(this, view, contentView.getContext());
        this.f396524d = gVar;
        gVar.addView(contentView);
        gVar.addView(view);
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager = new com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager(activity);
        multiTaskViewPager.setCanSlide(true);
        r45.w60 w60Var = ((jk3.b) eVar).f300078b;
        int integer = (w60Var == null || (fr4Var = (r45.fr4) w60Var.getCustom(0)) == null) ? 0 : fr4Var.getInteger(9);
        boolean z17 = integer != 0 ? integer == 1 : !(((jk3.b) eVar) instanceof com.tencent.mm.plugin.wenote.multitask.e);
        if (activity != null) {
            multiTaskSnapViewWrapper = new com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapViewWrapper(activity);
            multiTaskSnapViewWrapper.setFullScreen(z17);
        }
        if (multiTaskSnapViewWrapper != null) {
            multiTaskSnapViewWrapper.setBackgroundColor(b3.l.getColor(multiTaskViewPager.getContext(), com.tencent.mm.R.color.f478490b));
        }
        kotlin.jvm.internal.o.e(multiTaskSnapViewWrapper, "null cannot be cast to non-null type com.tencent.mm.plugin.multitask.ui.base.IMultiTaskView");
        multiTaskSnapViewWrapper.setBitmap(b17);
        multiTaskViewPager.setAdapter(new rk3.f(this, gVar, multiTaskSnapViewWrapper.getView()));
        multiTaskViewPager.addView(this.f396524d);
        al3.b bVar = al3.b.f5849a;
        multiTaskViewPager.setPageMargin(al3.b.f5850b);
        multiTaskViewPager.setPageMarginDrawable(com.tencent.mm.R.color.f479444zh);
        multiTaskViewPager.setCurrentItem(0, false);
        this.f396522b = multiTaskViewPager;
        java.lang.Boolean i17 = eVar.i();
        boolean booleanValue = i17 != null ? i17.booleanValue() : false;
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager2 = this.f396522b;
        if (multiTaskViewPager2 != null) {
            multiTaskViewPager2.setCanOnlySlideBySide(!booleanValue);
        }
        viewGroup.addView(this.f396522b, indexOfChild, layoutParams);
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager3 = this.f396522b;
        if (multiTaskViewPager3 != null) {
            multiTaskViewPager3.setOnPageChangeListener(new rk3.h(this));
        }
    }
}
