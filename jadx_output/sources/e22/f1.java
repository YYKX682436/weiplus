package e22;

/* loaded from: classes10.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI f246653d;

    public f1(com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI) {
        this.f246653d = multiEmojiMediaPickerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$initUnifiedFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI = this.f246653d;
        if (multiEmojiMediaPickerUI.X6().getSelectedTabPosition() == 0) {
            e33.f2 f2Var = multiEmojiMediaPickerUI.f98144f;
            java.util.ArrayList y76 = f2Var != null ? ((com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI) f2Var).y7() : null;
            if (y76 == null || y76.isEmpty()) {
                yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$initUnifiedFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            multiEmojiMediaPickerUI.d7("clk_next_button", e22.e1.a(com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI.f98154p, y76));
            multiEmojiMediaPickerUI.getClass();
            if (!y76.isEmpty()) {
                java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                int size = y76.size();
                int[] iArr = new int[size];
                int i17 = 0;
                for (java.lang.Object obj : y76) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) obj;
                    arrayList2.add(galleryItem$MediaItem.f138430e);
                    int i19 = 2;
                    if (galleryItem$MediaItem.getType() != 2) {
                        i19 = kotlin.jvm.internal.o.b(galleryItem$MediaItem.f138438p, "image/gif") ? 1 : 0;
                    }
                    iArr[i17] = i19;
                    i17 = i18;
                }
                if (!arrayList2.isEmpty()) {
                    if (!(size == 0)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClass(multiEmojiMediaPickerUI, com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity.class);
                        intent.putStringArrayListExtra("media_path_list", arrayList2);
                        intent.putExtra("media_type_list", iArr);
                        intent.putExtra("query_source_type", intent.getIntExtra("query_source_type", 11));
                        java.lang.String str = multiEmojiMediaPickerUI.f98158o;
                        if (str == null) {
                            str = "";
                        }
                        intent.putExtra("addstickers_sessionid", str);
                        intent.putExtra("key_from_scene", multiEmojiMediaPickerUI.f98146h);
                        multiEmojiMediaPickerUI.startActivityForResult(intent, 256);
                        multiEmojiMediaPickerUI.overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477729q);
                    }
                }
            }
        } else {
            multiEmojiMediaPickerUI.d7("clk_next_button", kz5.b0.c(new or.a(1, 2, 3, null, 8, null)));
            com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = multiEmojiMediaPickerUI.f98157n;
            if (multiSelectFinderTabFragment == null) {
                kotlin.jvm.internal.o.o("multiFinderTabFragment");
                throw null;
            }
            e22.d1 d1Var = multiSelectFinderTabFragment.f98160i;
            if (d1Var == null) {
                kotlin.jvm.internal.o.o("findersFeedViewModel");
                throw null;
            }
            x0.i0 i0Var = d1Var.f246639m;
            if (!i0Var.isEmpty()) {
                multiSelectFinderTabFragment.j0(((com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.X(i0Var)).toByteArray());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/picker/MultiEmojiMediaPickerUI$initUnifiedFooter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
