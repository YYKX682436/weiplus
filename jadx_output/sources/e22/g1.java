package e22;

/* loaded from: classes10.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI f246655d;

    public g1(com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI) {
        this.f246655d = multiEmojiMediaPickerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        oa.i k17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clicked the title of gallery tab, selectedTabPosition: ");
        com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI = this.f246655d;
        sb6.append(multiEmojiMediaPickerUI.X6().getSelectedTabPosition());
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiEmojiMediaPickerUI", sb6.toString());
        boolean z17 = false;
        if (multiEmojiMediaPickerUI.X6().getSelectedTabPosition() == 0) {
            e33.f2 f2Var = multiEmojiMediaPickerUI.f98144f;
            if (f2Var != null && ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var).f138540r.f138565m) {
                z17 = true;
            }
            if (z17) {
                multiEmojiMediaPickerUI.W6().a();
            } else {
                multiEmojiMediaPickerUI.W6().f98153e.animate().rotation(180.0f).setDuration(300L).start();
            }
            e33.f2 f2Var2 = multiEmojiMediaPickerUI.f98144f;
            if (f2Var2 != null) {
                ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var2).f138540r.d();
            }
        } else if (multiEmojiMediaPickerUI.c7(0) && (k17 = multiEmojiMediaPickerUI.X6().k(0)) != null) {
            k17.b();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
