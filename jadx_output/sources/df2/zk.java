package df2;

/* loaded from: classes3.dex */
public final class zk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f231974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f231975e;

    public zk(df2.pl plVar, android.widget.TextView textView) {
        this.f231974d = plVar;
        this.f231975e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f231974d.e7(this.f231975e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
