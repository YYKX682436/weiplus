package jm3;

/* loaded from: classes4.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI f300290d;

    public a(com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI musicMvAlbumPreviewUI) {
        this.f300290d = musicMvAlbumPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvAlbumPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.MusicMvAlbumPreviewUI activity = this.f300290d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.mv.ui.uic.c0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.c0.class)).Q6(0);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvAlbumPreviewUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
