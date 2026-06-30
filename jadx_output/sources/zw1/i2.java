package zw1;

/* loaded from: classes15.dex */
public class i2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f476660a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f476661b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectMainUI f476662c;

    public i2(com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI, zw1.c1 c1Var) {
        this.f476662c = collectMainUI;
    }

    public void a() {
        boolean z17 = this.f476660a;
        java.util.LinkedList linkedList = this.f476661b;
        if (z17) {
            linkedList.size();
            return;
        }
        if (linkedList.isEmpty()) {
            return;
        }
        zw1.f2 f2Var = (zw1.f2) linkedList.poll();
        this.f476660a = true;
        int i17 = com.tencent.mm.plugin.collect.ui.CollectMainUI.f96385e2;
        com.tencent.mm.plugin.collect.ui.CollectMainUI collectMainUI = this.f476662c;
        collectMainUI.n7();
        collectMainUI.C.setLayoutParams(new android.widget.LinearLayout.LayoutParams(collectMainUI.f96413y.getWidth(), collectMainUI.f96413y.getHeight() + i65.a.b(collectMainUI.getContext(), 8)));
        android.widget.TextView textView = collectMainUI.E;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context = collectMainUI.getContext();
        java.lang.String str = f2Var.f450202n;
        float textSize = collectMainUI.E.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(collectMainUI.D, f2Var.f450195d, null);
        collectMainUI.F.setText(com.tencent.mm.wallet_core.ui.r1.n(f2Var.f450197f, f2Var.f450198g));
        android.view.View view = collectMainUI.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        int i18 = 0;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper", "doAnimation", "(Lcom/tencent/mm/plugin/collect/ui/CollectMainUI$PayerMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/CollectMainUI$ToastAnimationHelper", "doAnimation", "(Lcom/tencent/mm/plugin/collect/ui/CollectMainUI$PayerMsgWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.AnimationSet animationSet = new android.view.animation.AnimationSet(false);
        animationSet.addAnimation(new android.view.animation.ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.5f, 1, 0.5f));
        int i19 = 0;
        while (true) {
            java.util.List list = collectMainUI.R;
            if (i18 >= ((java.util.LinkedList) list).size()) {
                break;
            }
            if (((zw1.f2) ((java.util.LinkedList) list).get(i18)).f450196e.equals(f2Var.f450196e)) {
                i19 = i18;
            }
            i18++;
        }
        float f17 = com.tencent.mm.plugin.collect.ui.CollectMainUI.f96386f2;
        float height = (collectMainUI.f96413y.getHeight() / 2) + 0.0f;
        if (collectMainUI.f96408v.getVisibility() == 0) {
            height += collectMainUI.f96408v.getHeight();
        }
        int i27 = com.tencent.mm.plugin.collect.ui.CollectMainUI.f96387g2;
        float f18 = height + (i19 * i27) + (i27 / 2);
        collectMainUI.f96413y.getLocationInWindow(new int[2]);
        animationSet.addAnimation(new android.view.animation.TranslateAnimation(0.0f, f17, 0.0f, (int) (f18 + (r4[1] - com.tencent.mm.plugin.collect.ui.CollectMainUI.f96385e2))));
        animationSet.setDuration(300L);
        animationSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        animationSet.setAnimationListener(new zw1.g2(this, f2Var));
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        scaleAnimation.setAnimationListener(new zw1.h2(this, animationSet));
        collectMainUI.C.startAnimation(scaleAnimation);
    }
}
