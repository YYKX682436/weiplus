package yt3;

/* loaded from: classes10.dex */
public final class a3 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f465341d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465342e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f465343f;

    /* renamed from: g, reason: collision with root package name */
    public int f465344g;

    public a3(android.widget.ImageView view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465341d = view;
        this.f465342e = status;
        view.setOnClickListener(this);
        view.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_album, -1));
        this.f465343f = true;
    }

    @Override // yt3.r2
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordAlbumPlugin", "onActivityResult requestCode:" + i17 + " resultCode:" + i18 + " data:" + intent);
        if (i17 == 1000) {
            if (i18 == -1) {
                android.os.Bundle bundle = new android.os.Bundle();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("key_select_video_list") : null;
                java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent != null ? intent.getStringArrayListExtra("key_select_image_list") : null;
                bundle.putInt("PARAM_ROUTER_INT", jt3.h.f301628l.a(-1, stringArrayListExtra2, stringArrayListExtra));
                bundle.putStringArrayList("PARAM_VIDEO_LIST", stringArrayListExtra);
                bundle.putStringArrayList("PARAM_PHOTO_LIST", stringArrayListExtra2);
                this.f465342e.w(ju3.c0.f301903t, bundle);
                return;
            }
            return;
        }
        if (i17 == 1001 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
            java.lang.Integer valueOf = stringArrayListExtra3 != null ? java.lang.Integer.valueOf(stringArrayListExtra3.size()) : null;
            kotlin.jvm.internal.o.d(valueOf);
            if (valueOf.intValue() > 0) {
                java.lang.String str2 = stringArrayListExtra3.get(0);
                kotlin.jvm.internal.o.f(str2, "get(...)");
                str = str2;
            } else {
                str = "";
            }
            java.lang.String str3 = str;
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordAlbumPlugin", "onActivityResult outputPhotoPath:".concat(str3));
            ut3.f fVar = ut3.f.f431176c;
            android.content.Context context = this.f465341d.getContext();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            fVar.a(context, new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", str3, -1L, bool, null));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordAlbumPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordAlbumPlugin", "click RecordAlbumPlugin");
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f465344g;
        tt3.b bVar = tt3.b.f422037b;
        android.widget.ImageView imageView = this.f465341d;
        if (i17 == 3) {
            intent.putExtra("key_edit_video_max_time_length", ((tt3.a) bVar.a()).f422036i);
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            intent.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_story_enable_vlog, false)));
            if (((tt3.a) bVar.a()).f422034g) {
                android.content.Context context = imageView.getContext();
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context, 1000, 9, 22, 3, false, intent);
            } else {
                android.content.Context context2 = imageView.getContext();
                kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
                com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context2, 1000, 1, 22, 2, false, intent);
            }
            nu3.i.f340221d.f60876k = 0L;
        } else if (i17 == 11) {
            intent.putExtra("album_business_tag", "album_business_media");
            android.content.Context context3 = imageView.getContext();
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
            com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context3, 1000, 9, 25, 3, false, intent);
        } else if (i17 == 15) {
            intent.putExtra("key_edit_video_max_time_length", ((tt3.a) bVar.a()).f422036i);
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            android.content.Context context4 = imageView.getContext();
            kotlin.jvm.internal.o.e(context4, "null cannot be cast to non-null type android.app.Activity");
            com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context4, 1000, 1, 22, 3, false, intent);
            nu3.i.f340221d.f60876k = 0L;
        } else if (i17 != 16) {
            intent.putExtra("album_business_tag", "album_business_media");
            android.content.Context context5 = imageView.getContext();
            kotlin.jvm.internal.o.e(context5, "null cannot be cast to non-null type android.app.Activity");
            com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context5, 1000, 1, 23, 3, false, intent);
        } else {
            intent.putExtra("album_business_tag", "album_business_media");
            android.content.Context context6 = imageView.getContext();
            kotlin.jvm.internal.o.e(context6, "null cannot be cast to non-null type android.app.Activity");
            com.tencent.mm.pluginsdk.ui.tools.l7.c((android.app.Activity) context6, 1001, 1, 29, 1, false, intent);
        }
        nu3.i.f340218a.d(4);
        nu3.i.f340224g.f60950j = 1L;
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/RecordAlbumPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f465343f) {
            this.f465341d.setVisibility(i17);
        }
    }
}
