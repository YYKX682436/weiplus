package k93;

/* loaded from: classes11.dex */
public class m implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f93.d5 f305917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k93.j f305919f;

    public m(k93.j jVar, f93.d5 d5Var, int i17) {
        this.f305919f = jVar;
        this.f305917d = d5Var;
        this.f305918e = i17;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/widget/LabelAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        this.f305919f.E.T(this.f305917d.f260315f, this.f305918e);
        yj0.a.i(true, this, "com/tencent/mm/plugin/label/ui/widget/LabelAdapter$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
