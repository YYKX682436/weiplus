package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class m6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n6 f151293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151294e;

    public m6(com.tencent.mm.plugin.mv.ui.uic.n6 n6Var, int i17) {
        this.f151293d = n6Var;
        this.f151294e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.f8 f8Var = this.f151293d.f151330e;
        if (f8Var != null) {
            f8Var.select(this.f151294e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
