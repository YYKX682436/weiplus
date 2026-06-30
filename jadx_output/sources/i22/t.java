package i22;

/* loaded from: classes15.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.v f288029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i22.n0 f288030e;

    public t(i22.v vVar, i22.n0 n0Var) {
        this.f288029d = vVar;
        this.f288030e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i22.v vVar = this.f288029d;
        i22.p0 p0Var = vVar.f288044n;
        if (p0Var != null) {
            p0Var.b(vVar, vVar.getAdapterPosition(), this.f288030e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3HomeMainHolder$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
