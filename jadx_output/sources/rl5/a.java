package rl5;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f397304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397305e;

    public a(rl5.r rVar, int i17) {
        this.f397305e = rVar;
        this.f397304d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rl5.r rVar = this.f397305e;
        db5.t4 t4Var = rVar.f397354x;
        if (t4Var != null) {
            db5.g4 g4Var = rVar.f397356z;
            int i17 = this.f397304d;
            t4Var.onMMMenuItemSelected(g4Var.getItem(i17), i17);
        }
        rVar.f397344o.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
