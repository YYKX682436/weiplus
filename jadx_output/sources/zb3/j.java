package zb3;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zb3.k f471273d;

    public j(zb3.k kVar) {
        this.f471273d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb3.k kVar = this.f471273d;
        android.view.View view = kVar.f471274d.f145766t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/sns/SnsLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kVar.f471274d.U6();
    }
}
