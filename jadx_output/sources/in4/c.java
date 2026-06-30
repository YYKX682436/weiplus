package in4;

/* loaded from: classes9.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in4.g f292949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in4.h f292950e;

    public c(in4.h hVar, in4.g gVar) {
        this.f292950e = hVar;
        this.f292949d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in4.h hVar = this.f292950e;
        if (((java.util.HashSet) hVar.f292965e).isEmpty()) {
            ((java.util.HashSet) hVar.f292965e).add(hVar.f292971n);
        }
        this.f292949d.a(hVar.f292965e);
        hVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/topstory/ui/widget/FeedbackPopupWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
