package uf5;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f427220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f427221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f427222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ uf5.h f427223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uf5.k f427224h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f427225i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f427226m;

    public f(androidx.recyclerview.widget.k3 k3Var, java.util.ArrayList arrayList, java.util.HashSet hashSet, uf5.h hVar, uf5.k kVar, android.widget.ImageView imageView, android.widget.Button button) {
        this.f427220d = k3Var;
        this.f427221e = arrayList;
        this.f427222f = hashSet;
        this.f427223g = hVar;
        this.f427224h = kVar;
        this.f427225i = imageView;
        this.f427226m = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$adapter$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f427220d.getAdapterPosition();
        if (adapterPosition == -1) {
            yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$adapter$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.util.ArrayList arrayList2 = this.f427221e;
        java.lang.String str = (java.lang.String) arrayList2.get(adapterPosition);
        java.util.HashSet hashSet = this.f427222f;
        if (hashSet.contains(str)) {
            hashSet.remove(str);
        } else {
            hashSet.add(str);
        }
        this.f427223g.notifyItemChanged(adapterPosition);
        android.widget.ImageView selectAllCb = this.f427225i;
        kotlin.jvm.internal.o.f(selectAllCb, "$selectAllCb");
        uf5.k kVar = this.f427224h;
        uf5.k.a(kVar, selectAllCb, hashSet, arrayList2);
        android.widget.Button setLabelBtn = this.f427226m;
        kotlin.jvm.internal.o.f(setLabelBtn, "$setLabelBtn");
        uf5.k.b(kVar, setLabelBtn, hashSet);
        kVar.f427255b.invoke(arrayList2, hashSet);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelHalfScreenHelper$show$1$createView$adapter$1$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
