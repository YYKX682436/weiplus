package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.t f150959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.r f150960e;

    public q(com.tencent.mm.plugin.mv.ui.shake.t tVar, com.tencent.mm.plugin.mv.ui.shake.r rVar) {
        this.f150959d = tVar;
        this.f150960e = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricAdapter$MusicLyricViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.shake.s sVar = this.f150959d.f150962d;
        this.f150960e.getAdapterPosition();
        sVar.getClass();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/shake/MusicShakeLyricAdapter$MusicLyricViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
