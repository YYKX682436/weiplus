package rn4;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn4.c f397961d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f397962e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn4.d f397963f;

    public a(rn4.d dVar, rn4.c cVar, int i17) {
        this.f397963f = dVar;
        this.f397961d = cVar;
        this.f397962e = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/transvoice/ui/adapter/LanguageChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn4.d dVar = this.f397963f;
        android.widget.ImageView imageView = dVar.f397970f;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        rn4.c cVar = this.f397961d;
        cVar.f397967e.setVisibility(0);
        dVar.f397970f = cVar.f397967e;
        dVar.f397969e = this.f397962e;
        yj0.a.h(this, "com/tencent/mm/plugin/transvoice/ui/adapter/LanguageChoiceAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
