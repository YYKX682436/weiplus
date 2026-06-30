package jw2;

/* loaded from: classes9.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView f302311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f302312e;

    public c(com.tencent.mm.plugin.finder.video.plugin.view.RecordTypeSelectView recordTypeSelectView, int i17) {
        this.f302311d = recordTypeSelectView;
        this.f302312e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$RecordTypeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((jw2.f) this.f302311d.f130797m).invoke(java.lang.Integer.valueOf(this.f302312e));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/plugin/view/RecordTypeSelectView$RecordTypeAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
