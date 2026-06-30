package mm3;

/* loaded from: classes5.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI f329623d;

    public e0(com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI) {
        this.f329623d = musicMvFreeMakerPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.free.MusicMvFreeMakerPreviewUI musicMvFreeMakerPreviewUI = this.f329623d;
        pm0.v.K(null, new mm3.d0(musicMvFreeMakerPreviewUI, db5.e1.Q(musicMvFreeMakerPreviewUI.getContext(), "", musicMvFreeMakerPreviewUI.getContext().getString(com.tencent.mm.R.string.ggc), true, false, null)));
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/free/MusicMvFreeMakerPreviewUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
