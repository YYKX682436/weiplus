package qn2;

/* loaded from: classes3.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.z f365159d;

    public u(qn2.z zVar) {
        this.f365159d = zVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qn2.z zVar = this.f365159d;
        zVar.K0(8);
        qo0.c.a(zVar.f365220p, qo0.b.f365404q3, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/FinderLiveLotteryCardPlugin$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
