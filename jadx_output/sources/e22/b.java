package e22;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI f246616d;

    public b(com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI emojiMediaPickerUI) {
        this.f246616d = emojiMediaPickerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicked the title of gallery tab, selectedTabPosition: ");
        com.tencent.mm.plugin.emoji.ui.picker.EmojiMediaPickerUI emojiMediaPickerUI = this.f246616d;
        sb6.append(emojiMediaPickerUI.X6().getSelectedTabPosition());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAlbumPickerUI", sb6.toString());
        boolean z17 = false;
        if (emojiMediaPickerUI.X6().getSelectedTabPosition() == 0) {
            e33.f2 f2Var = emojiMediaPickerUI.f98144f;
            if (f2Var != null && ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var).f138540r.f138565m) {
                z17 = true;
            }
            if (z17) {
                emojiMediaPickerUI.W6().a();
            } else {
                emojiMediaPickerUI.W6().f98153e.animate().rotation(180.0f).setDuration(300L).start();
            }
            e33.f2 f2Var2 = emojiMediaPickerUI.f98144f;
            if (f2Var2 != null) {
                ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var2).f138540r.d();
            }
        } else {
            oa.i k17 = emojiMediaPickerUI.X6().k(0);
            if (k17 != null) {
                k17.b();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/EmojiMediaPickerUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
