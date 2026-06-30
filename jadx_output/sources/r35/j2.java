package r35;

/* loaded from: classes11.dex */
public class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f369145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r35.k2 f369147f;

    public j2(r35.k2 k2Var, android.view.ViewGroup viewGroup, int i17) {
        this.f369147f = k2Var;
        this.f369145d = viewGroup;
        this.f369146e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/ContactListRow$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lz.h hVar = this.f369147f.f369167f;
        if (hVar != null) {
            ((r35.s1) hVar).a(this.f369145d, view, this.f369146e);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/ContactListRow$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
