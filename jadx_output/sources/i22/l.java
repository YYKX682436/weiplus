package i22;

/* loaded from: classes15.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i22.m f287999d;

    public l(i22.m mVar) {
        this.f287999d = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i22.m mVar = this.f287999d;
        i22.o0 o0Var = mVar.f288002d;
        if (o0Var != null) {
            o0Var.a(mVar, mVar.getAdapterPosition(), mVar.f288003e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreV3BaseHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
