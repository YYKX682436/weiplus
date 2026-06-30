package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151987d;

    public x2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151987d = musicMvLyricView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$MusicMvLyricConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f151987d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.mv.ui.uic.s1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).S6();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$MusicMvLyricConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
