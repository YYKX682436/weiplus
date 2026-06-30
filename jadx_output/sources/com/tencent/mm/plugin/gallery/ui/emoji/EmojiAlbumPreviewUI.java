package com.tencent.mm.plugin.gallery.ui.emoji;

@db5.a(19)
/* loaded from: classes10.dex */
public class EmojiAlbumPreviewUI extends com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI {

    /* renamed from: u2, reason: collision with root package name */
    public java.lang.String f138640u2;

    public static int f8(java.util.ArrayList arrayList, int i17) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) arrayList.get(i17);
        if (galleryItem$MediaItem.getType() == 2) {
            return 3;
        }
        return "image/gif".equals(galleryItem$MediaItem.f138438p) ? 4 : 1;
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void J7() {
        if (android.text.TextUtils.isEmpty(this.f138640u2)) {
            return;
        }
        java.util.ArrayList y76 = y7();
        int i17 = 0;
        int size = y76 != null ? y76.size() : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (y76 != null) {
            int i18 = 0;
            while (i17 < y76.size()) {
                int f86 = f8(y76, i17);
                i17++;
                arrayList.add(new or.a(i17, 1, f86));
                if (i18 == 0) {
                    i18 = f86;
                }
            }
            i17 = i18;
        }
        or.d.b(this.f138640u2, 5, 1, java.lang.Integer.valueOf(i17), or.c.a("clk_close_button", this.f138640u2, java.lang.Integer.valueOf(size), or.c.d(arrayList)));
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void M7(int i17, android.view.View view, int i18) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem E = this.f138528m.E(i17);
        if (E == null || com.tencent.mm.sdk.platformtools.t8.K0(E.f138430e)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiAlbumPreviewUI", "item is null or path is null");
            return;
        }
        int z17 = i17 - this.f138528m.z();
        if (this.f138528m.J() != 0) {
            if (E.getType() != ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138528m.f247131g.get(0)).getType()) {
                if (!android.text.TextUtils.isEmpty(this.f138640u2)) {
                    or.d.b(this.f138640u2, 5, 1, null, or.c.b("warning_pup_win", this.f138640u2, null, null, 2));
                }
                db5.e1.s(this, "", i65.a.r(this, com.tencent.mm.R.string.obe));
                return;
            }
            if (E.getType() == 2 && !this.f138528m.f247131g.contains(E)) {
                if (!android.text.TextUtils.isEmpty(this.f138640u2)) {
                    or.d.b(this.f138640u2, 5, 1, null, or.c.b("warning_pup_win", this.f138640u2, null, null, 4));
                }
                db5.e1.s(this, "", getString(com.tencent.mm.R.string.obk, 1));
                return;
            }
        }
        t23.p0.p(this.f138528m.f247130f);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.emoji.EmojiImagePreviewUI.class);
        intent.putExtra("query_source_type", this.E1);
        intent.putExtra("preview_all", true);
        intent.putExtra("preview_position", z17);
        intent.putStringArrayListExtra("preview_image_list", this.f138528m.K());
        intent.putParcelableArrayListExtra("preview_media_item_list", this.f138528m.f247131g);
        intent.putExtra("max_select_count", this.Q);
        intent.putExtra("key_force_hide_edit_image_button", true);
        intent.putExtra("key_force_hide_edit_video_button", true);
        intent.putExtra("album_video_max_duration", 9999);
        intent.putExtra("select_type_tag", this.J1);
        intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
        if (!android.text.TextUtils.isEmpty(this.f138640u2)) {
            intent.putExtra("addstickers_sessionid", this.f138640u2);
        }
        H7(z17, true);
        startActivityForResult(intent, 0);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public boolean N7() {
        java.util.ArrayList y76 = y7();
        if (y76 != null && !y76.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int size = y76.size();
            int[] iArr = new int[size];
            for (int i17 = 0; i17 < y76.size(); i17++) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) y76.get(i17);
                java.lang.String str = galleryItem$MediaItem.f138430e;
                if (str != null) {
                    arrayList.add(str);
                    if (galleryItem$MediaItem.getType() == 2) {
                        iArr[i17] = 2;
                    } else if ("image/gif".equals(galleryItem$MediaItem.f138438p)) {
                        iArr[i17] = 1;
                    } else {
                        iArr[i17] = 0;
                    }
                }
            }
            if (!arrayList.isEmpty() && size != 0) {
                if (!android.text.TextUtils.isEmpty(this.f138640u2)) {
                    int size2 = y76.size();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < y76.size()) {
                        int f86 = f8(y76, i18);
                        i18++;
                        arrayList2.add(new or.a(i18, 1, f86));
                        if (i19 == 0) {
                            i19 = f86;
                        }
                    }
                    or.d.b(this.f138640u2, 5, 1, java.lang.Integer.valueOf(i19), or.c.a("clk_next_button", this.f138640u2, java.lang.Integer.valueOf(size2), or.c.d(arrayList2)));
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("media_path_list", arrayList);
                intent.putExtra("media_type_list", iArr);
                intent.setClassName(this, "com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity");
                intent.putExtra("query_source_type", this.E1);
                if (!android.text.TextUtils.isEmpty(this.f138640u2)) {
                    intent.putExtra("addstickers_sessionid", this.f138640u2);
                }
                intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
                startActivityForResult(intent, 4387);
                overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477729q);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void a8(int i17) {
        java.lang.String string;
        i33.g gVar = (i33.g) pf5.z.f353948a.a(this).a(i33.g.class);
        if (i17 == 0 || this.Q <= 1) {
            string = getString(com.tencent.mm.R.string.f490502ww);
        } else {
            string = getString(com.tencent.mm.R.string.f490502ww) + "(" + i17 + ")";
        }
        gVar.Y0(string);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public void c8(int i17) {
        super.c8(i17);
        e33.e2 e2Var = this.f138521h2;
        if (e2Var != null) {
            com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI = ((e22.h1) e2Var).f246661a;
            if (multiEmojiMediaPickerUI.X6().getSelectedTabPosition() == 0) {
                multiEmojiMediaPickerUI.e7();
            }
        }
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        a8(this.f138528m.J());
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI
    public e33.b0 o7(boolean z17, e33.i2 i2Var) {
        f33.e eVar = new f33.e(z17, this, i2Var, this.f138640u2);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f138516f;
        eVar.D = true;
        recyclerView.P(eVar.F);
        return eVar;
    }

    @Override // com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.f138640u2 = getIntent().getStringExtra("addstickers_sessionid");
        super.onCreate(bundle);
    }
}
