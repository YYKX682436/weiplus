package gm3;

/* loaded from: classes10.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gm3.h f273553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gm3.c f273555f;

    public g(gm3.h hVar, int i17, gm3.c cVar) {
        this.f273553d = hVar;
        this.f273554e = i17;
        this.f273555f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/model/flex/MusicMvFlexVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        gm3.f fVar = this.f273553d.f273556e;
        if (fVar != null) {
            fVar.a(this.f273554e, this.f273555f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/model/flex/MusicMvFlexVideoItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
