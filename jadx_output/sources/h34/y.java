package h34;

/* loaded from: classes11.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.h0 f278572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f278573e;

    public y(h34.h0 h0Var, android.content.Context context) {
        this.f278572d = h0Var;
        this.f278573e = context;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        h34.z.a(this.f278572d, this.f278573e, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/shake/shakemedia/model/ShakeTVLogic$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
