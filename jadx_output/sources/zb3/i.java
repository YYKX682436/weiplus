package zb3;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI f471272d;

    public i(com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI) {
        this.f471272d = snsLuckyMoneyPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.sns.SnsLuckyMoneyPrepareUI snsLuckyMoneyPrepareUI = this.f471272d;
        android.view.View view = snsLuckyMoneyPrepareUI.f145766t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$15", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(800L);
        scaleAnimation.setStartOffset(200L);
        scaleAnimation.setInterpolator(new android.view.animation.BounceInterpolator());
        snsLuckyMoneyPrepareUI.findViewById(com.tencent.mm.R.id.j5h).startAnimation(scaleAnimation);
    }
}
