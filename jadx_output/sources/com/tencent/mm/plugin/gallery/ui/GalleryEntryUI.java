package com.tencent.mm.plugin.gallery.ui;

@db5.a(7)
/* loaded from: classes10.dex */
public final class GalleryEntryUI extends com.tencent.mm.hellhoundlib.activities.HellActivity {

    /* renamed from: e, reason: collision with root package name */
    public int f138556e;

    /* renamed from: f, reason: collision with root package name */
    public int f138557f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f138555d = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f138558g = false;

    @Override // android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = intent == null ? "" : intent.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "on activity result, requestCode %d resultCode %d, data:%s", objArr);
        if (this.f138558g) {
            db5.f.c(this, null);
        }
        if (i18 != -1) {
            if (i18 == 0) {
                setResult(0);
            } else if (i18 == 1) {
                setResult(1);
            }
        } else if (intent == null) {
            return;
        } else {
            setResult(-1, intent);
        }
        finish();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "on create");
        super.onCreate(bundle);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "checktask onCreate:%s#0x%x task:%s", "GalleryEntryUI", valueOf, new com.tencent.mm.sdk.platformtools.q8(this));
        this.f138556e = getIntent().getIntExtra("query_source_type", 3);
        this.f138557f = getIntent().getIntExtra("query_media_type", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "query souce: " + this.f138556e + ", queryType: " + this.f138557f);
        t23.p0.k().g(this.f138557f);
        t23.p0.k().f415297f = this.f138556e;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f138555d = true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "on resume, init %B", java.lang.Boolean.valueOf(this.f138555d));
        super.onResume();
        if (this.f138555d) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "doRedirect %s", new com.tencent.mm.sdk.platformtools.z3());
        android.content.Intent intent = getIntent();
        if (intent.getBooleanExtra("preview_image", false)) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("preview_image_list");
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.gallery.ui.ImagePreviewUI.class);
            intent2.addFlags(67108864);
            intent2.putExtra("max_select_count", intent.getIntExtra("max_select_count", 9));
            intent2.putExtra("query_source_type", this.f138556e);
            intent2.putExtra("isPreviewPhoto", intent.getBooleanExtra("isPreviewPhoto", false));
            intent2.putExtra("preview_image", intent.getBooleanExtra("preview_image", false));
            intent2.putExtra("key_force_hide_edit_image_button", getIntent().getBooleanExtra("key_force_hide_edit_image_button", false));
            intent2.putExtra("key_force_show_raw_image_button", getIntent().getBooleanExtra("key_force_show_raw_image_button", false));
            intent2.putExtra("key_is_raw_image_button_disable", getIntent().getBooleanExtra("key_is_raw_image_button_disable", false));
            java.lang.Object a17 = ok5.d.a(getIntent(), "key_quote_extcommon");
            if (a17 instanceof r15.b) {
                ok5.d.b(intent2, "key_quote_extcommon", a17, new ok5.h());
            }
            java.lang.String stringExtra = getIntent().getStringExtra("GalleryUI_FromUser");
            java.lang.String stringExtra2 = getIntent().getStringExtra("GalleryUI_ToUser");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                intent2.putExtra("GalleryUI_FromUser", stringExtra);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                intent2.putExtra("GalleryUI_ToUser", stringExtra2);
            }
            intent2.putStringArrayListExtra("preview_image_list", stringArrayListExtra);
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("preview_image_media_id_list");
            if (stringArrayListExtra2 != null) {
                intent2.putStringArrayListExtra("preview_image_media_id_list", stringArrayListExtra2);
            }
            intent2.putExtra("Gallery_LivePhoto_Auto_Enable", intent.getBooleanExtra("Gallery_LivePhoto_Auto_Enable", true));
            intent2.putExtra("key_from_c2c_recently_quickly_send", intent.getBooleanExtra("key_from_c2c_recently_quickly_send", false));
            startActivityForResult(intent2, 1);
        } else {
            intent.setClass(this, com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI.class);
            if (intent.getBooleanExtra("is_multi_tab_with_record", false)) {
                intent.setClass(this, com.tencent.mm.plugin.gallery.ui.MediaTabAlbumUI.class);
            }
            if (intent.getBooleanExtra("need_to_clear_top", false)) {
                intent.addFlags(67108864);
            }
            java.lang.String stringExtra3 = intent.getStringExtra("album_business_by_real_scene");
            if (stringExtra3 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryEntryUI", "liteapp business scene:%s", stringExtra3);
                intent.putExtra("album_business_by_real_scene", stringExtra3);
            }
            intent.putExtra("key_edit_text_color", getIntent().getStringExtra("key_edit_text_color"));
            intent.putExtra("key_force_preview_on_confirm", getIntent().getBooleanExtra("key_force_preview_on_confirm", false));
            intent.putExtra("send_btn_string", getIntent().getStringExtra("send_btn_string"));
            intent.putExtra("max_select_count", getIntent().getIntExtra("max_select_count", 9));
            intent.putExtra("GalleryUI_FromUser", getIntent().getStringExtra("GalleryUI_FromUser"));
            intent.putExtra("GalleryUI_ToUser", getIntent().getStringExtra("GalleryUI_ToUser"));
            intent.putExtra("key_send_raw_image", getIntent().getBooleanExtra("key_send_raw_image", false));
            intent.putExtra("key_force_hide_edit_image_button", getIntent().getBooleanExtra("key_force_hide_edit_image_button", false));
            intent.putExtra("key_force_show_raw_image_button", getIntent().getBooleanExtra("key_force_show_raw_image_button", false));
            intent.putExtra("key_is_raw_image_button_disable", getIntent().getBooleanExtra("key_is_raw_image_button_disable", false));
            intent.putExtra("GalleryUI_SkipVideoSizeLimit", getIntent().getBooleanExtra("GalleryUI_SkipVideoSizeLimit", false));
            intent.putExtra("album_business_tag", getIntent().getStringExtra("album_business_tag"));
            intent.putExtra("album_video_max_duration", getIntent().getIntExtra("album_video_max_duration", 10));
            intent.putExtra("album_video_min_duration", getIntent().getIntExtra("album_video_min_duration", 0));
            intent.putExtra("album_template_info", getIntent().getByteArrayExtra("album_template_info"));
            intent.putExtra("album_support_landscape_mode", getIntent().getBooleanExtra("album_support_landscape_mode", false));
            startActivityForResult(intent, 0);
            if (intent.hasExtra("liteAppUuid")) {
                overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
            }
        }
        this.f138555d = true;
    }

    @Override // android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
        int i18 = this.f138556e;
        if (i18 == 8 || i18 == 7 || i18 == 43) {
            android.content.res.TypedArray obtainStyledAttributes = getTheme().obtainStyledAttributes(new int[]{android.R.attr.windowIsTranslucent});
            try {
                if (obtainStyledAttributes.getBoolean(0, false)) {
                    db5.f.b(this);
                    this.f138558g = true;
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
