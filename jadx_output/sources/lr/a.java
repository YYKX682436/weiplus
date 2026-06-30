package lr;

/* loaded from: classes13.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr.b f320490d;

    public a(lr.b bVar) {
        this.f320490d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/adapter/CaptureEmptyViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lr.b bVar = this.f320490d;
        lr.k0 k0Var = bVar.f320580d;
        if (k0Var != null) {
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            k0Var.b(view, context, bVar.getAdapterPosition(), bVar.f320581e);
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/adapter/CaptureEmptyViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
