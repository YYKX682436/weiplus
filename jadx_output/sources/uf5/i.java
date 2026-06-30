package uf5;

/* loaded from: classes8.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f427240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f427241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf5.h f427242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uf5.k f427243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f427244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f427245i;

    public i(java.util.HashSet hashSet, java.util.ArrayList arrayList, uf5.h hVar, uf5.k kVar, android.widget.ImageView imageView, android.widget.Button button) {
        this.f427240d = hashSet;
        this.f427241e = arrayList;
        this.f427242f = hVar;
        this.f427243g = kVar;
        this.f427244h = imageView;
        this.f427245i = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$selectAllListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.HashSet hashSet = this.f427240d;
        int size = hashSet.size();
        java.util.ArrayList arrayList2 = this.f427241e;
        if (size < arrayList2.size()) {
            hashSet.addAll(arrayList2);
        } else {
            hashSet.clear();
        }
        this.f427242f.notifyItemRangeChanged(0, arrayList2.size());
        android.widget.ImageView selectAllCb = this.f427244h;
        kotlin.jvm.internal.o.f(selectAllCb, "$selectAllCb");
        uf5.k kVar = this.f427243g;
        uf5.k.a(kVar, selectAllCb, hashSet, arrayList2);
        android.widget.Button setLabelBtn = this.f427245i;
        kotlin.jvm.internal.o.f(setLabelBtn, "$setLabelBtn");
        uf5.k.b(kVar, setLabelBtn, hashSet);
        kVar.f427255b.invoke(arrayList2, hashSet);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$selectAllListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
