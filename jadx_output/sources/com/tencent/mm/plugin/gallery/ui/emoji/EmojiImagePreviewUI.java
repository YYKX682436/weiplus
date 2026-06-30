package com.tencent.mm.plugin.gallery.ui.emoji;

@ul5.d(0)
/* loaded from: classes10.dex */
public class EmojiImagePreviewUI extends com.tencent.mm.plugin.gallery.ui.ImagePreviewUI {

    /* renamed from: n2, reason: collision with root package name */
    public static final /* synthetic */ int f138641n2 = 0;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f138642l2;

    /* renamed from: m2, reason: collision with root package name */
    public f33.b f138643m2 = f33.b.ENABLED;

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public void E7(java.lang.String str) {
        this.f138602v.setVisibility(8);
        this.f138603w.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public void K7(com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
    }

    public final void L7(android.view.View view) {
        super.o7(view);
        java.util.ArrayList arrayList = this.f138592n;
        X6((arrayList == null || arrayList.isEmpty()) ? false : true);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public java.lang.String e7() {
        int size = this.f138592n.size();
        if (size == 0 || this.A <= 1) {
            return getString(com.tencent.mm.R.string.f490502ww);
        }
        return getString(com.tencent.mm.R.string.f490502ww) + "(" + size + ")";
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public void n7(int i17, java.lang.String str, com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem) {
        com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a76 = a7();
        if (a76 == null) {
            return;
        }
        boolean isEmpty = this.f138592n.isEmpty();
        f33.b bVar = f33.b.ENABLED;
        if (isEmpty || a76.getType() != 1 || this.f138592n.size() < this.A || this.f138592n.contains(a76)) {
            if (!this.f138592n.isEmpty() && ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138592n.get(0)).getType() != a76.getType()) {
                this.f138643m2 = f33.b.DISABLED_BY_MIXED_TYPE;
            } else if (this.f138592n.isEmpty() || ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138592n.get(0)).getType() != 2 || a76.getType() != 2 || this.f138592n.contains(a76)) {
                this.f138643m2 = bVar;
            } else {
                this.f138643m2 = f33.b.DISABLED_BY_VIDEO_LIMIT;
            }
        } else if (this.A < 9) {
            this.f138643m2 = f33.b.DISABLED_BY_CUSTOM_LIMIT;
        } else {
            this.f138643m2 = f33.b.DISABLED_BY_LIMIT;
        }
        if (this.f138643m2 != bVar) {
            this.D.setAlpha(0.5f);
            this.F.setAlpha(0.5f);
        } else {
            this.D.setAlpha(1.0f);
            this.F.setAlpha(1.0f);
        }
        java.util.ArrayList arrayList = this.f138592n;
        X6((arrayList == null || arrayList.isEmpty()) ? false : true);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public void o7(android.view.View view) {
        java.lang.String string;
        int i17;
        if (this.f138643m2 == f33.b.ENABLED) {
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem a76 = a7();
            if (a76 == null) {
                return;
            }
            if (!"image/gif".equals(a76.f138438p)) {
                L7(view);
                return;
            }
            ck5.c cVar = new ck5.c(a76.f138430e);
            cVar.f42550b = ip.c.b();
            int c17 = ip.c.c();
            cVar.f42551c = c17;
            cVar.f42552d = c17;
            cVar.a(new f33.a(this, view));
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int ordinal = this.f138643m2.ordinal();
        if (ordinal != 1) {
            i17 = 2;
            if (ordinal == 2) {
                string = context.getString(com.tencent.mm.R.string.obe);
            } else if (ordinal == 3) {
                string = context.getString(com.tencent.mm.R.string.obk, 1);
                i17 = 4;
            } else if (ordinal != 4) {
                i17 = 0;
                string = "";
            } else {
                string = context.getString(com.tencent.mm.R.string.obf, java.lang.Integer.valueOf(this.A));
            }
        } else {
            string = context.getString(com.tencent.mm.R.string.obi, java.lang.Integer.valueOf(this.A));
            i17 = 1;
        }
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        if (!android.text.TextUtils.isEmpty(this.f138642l2)) {
            or.d.b(this.f138642l2, 5, 1, null, or.c.b("warning_pup_win", this.f138642l2, null, null, java.lang.Integer.valueOf(i17)));
        }
        db5.e1.s(context, "", string);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiImagePreviewUI", "onActivityResult, resultCode: " + i18);
        if (i18 == -1) {
            setResult(-1, new android.content.Intent());
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("addstickers_sessionid");
        this.f138642l2 = stringExtra;
        if (!android.text.TextUtils.isEmpty(stringExtra) && !android.text.TextUtils.isEmpty(this.f138642l2)) {
            java.util.ArrayList arrayList = this.f138592n;
            int size = arrayList != null ? arrayList.size() : 0;
            java.lang.String sessionId = this.f138642l2;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(size);
            kotlin.jvm.internal.o.g(sessionId, "sessionId");
            or.d.b(this.f138642l2, 5, 1, null, or.c.c("clk_preview", sessionId, valueOf, null, null, 24, null));
        }
        java.util.ArrayList arrayList2 = this.f138592n;
        X6((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }

    @Override // com.tencent.mm.plugin.gallery.ui.ImagePreviewUI
    public boolean p7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiImagePreviewUI", "onSendItemClick");
        java.util.ArrayList arrayList = this.f138592n;
        if (arrayList != null && !arrayList.isEmpty() && !android.text.TextUtils.isEmpty(this.f138642l2)) {
            int size = this.f138592n.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i17 = 0;
            int i18 = 0;
            while (i17 < this.f138592n.size()) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138592n.get(i17);
                int i19 = galleryItem$MediaItem.getType() == 2 ? 3 : "image/gif".equals(galleryItem$MediaItem.f138438p) ? 4 : 1;
                i17++;
                arrayList2.add(new or.a(i17, 1, i19));
                if (i18 == 0) {
                    i18 = i19;
                }
            }
            or.d.b(this.f138642l2, 5, 1, java.lang.Integer.valueOf(i18), or.c.a("clk_next_button", this.f138642l2, java.lang.Integer.valueOf(size), or.c.d(arrayList2)));
        }
        java.util.ArrayList arrayList3 = this.f138592n;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            int[] iArr = new int[this.f138592n.size()];
            for (int i27 = 0; i27 < this.f138592n.size(); i27++) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem2 = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) this.f138592n.get(i27);
                arrayList4.add(galleryItem$MediaItem2.f138430e);
                if (galleryItem$MediaItem2.getType() == 2) {
                    iArr[i27] = 2;
                } else if ("image/gif".equals(galleryItem$MediaItem2.f138438p)) {
                    iArr[i27] = 1;
                } else {
                    iArr[i27] = 0;
                }
            }
            if (arrayList4.isEmpty()) {
                return true;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("media_path_list", arrayList4);
            intent.putExtra("media_type_list", iArr);
            intent.setClassName(this, "com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity");
            intent.putExtra("query_source_type", getIntent().getIntExtra("query_source_type", 0));
            intent.putExtra("key_from_scene", getIntent().getIntExtra("key_from_scene", 0));
            if (!android.text.TextUtils.isEmpty(this.f138642l2)) {
                intent.putExtra("addstickers_sessionid", this.f138642l2);
            }
            startActivityForResult(intent, 4387);
        }
        return true;
    }
}
