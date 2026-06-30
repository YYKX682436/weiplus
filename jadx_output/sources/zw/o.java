package zw;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final zw.o f476536a = new zw.o();

    /* renamed from: b, reason: collision with root package name */
    public static final kotlinx.coroutines.y0 f476537b = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));

    public final void a(android.content.Context context, int i17, int i18, boolean z17, boolean z18, int i19, yz5.l asyncResult, boolean z19) {
        kotlin.jvm.internal.o.g(asyncResult, "asyncResult");
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "jumpMediaTabPicker: " + i18 + ", " + context);
        if (context instanceof androidx.activity.ComponentActivity) {
            int i27 = i17 == 45 ? 5 : 1;
            ((androidx.activity.ComponentActivity) context).getIntent().putExtra("intent_bottom_navigationbar_height", com.tencent.mm.ui.bl.c(context));
            boolean z27 = i18 <= 1;
            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
            boolean z28 = z17 && qp.b.f365678e;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("max_select_count", i18);
            intent.putExtra("query_media_type", 1);
            intent.putExtra("query_source_type", i17);
            intent.putExtra("show_header_view", false);
            intent.putExtra("key_can_select_video_and_pic", false);
            intent.putExtra("key_force_hide_smart_gallery_entry", true);
            intent.putExtra("key_send_raw_image", ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_publish_select_origin_image, 0) == 1);
            ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).getClass();
            boolean z29 = qp.b.f365678e;
            if (z28 && z29) {
                intent.putExtra("Gallery_LivePhoto_Need_Query", true);
            }
            intent.addFlags(67108864);
            intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.plugin.gallery.ui.GalleryEntryUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(new jz5.l(1, intent));
            if (!z27) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("album_select_count_limit", i18);
                arrayList.add(new jz5.l(3, intent2));
            }
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider e17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.e();
            e17.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.MediaTabCameraKitPluginLayout");
            e17.M.putBoolean("key_forbit_edit_inset_layout", true);
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("KEY_PARAMS_CONFIG", e17);
            intent3.putExtra("KEY_PARAMS_TO_WHERE", 0);
            intent3.putExtra("key_params_pageid", "MediaTabCaptureUI");
            arrayList.add(new jz5.l(2, intent3));
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            if (z19 && !z27) {
                java.util.Iterator it = arrayList.iterator();
                int i28 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i28 = -1;
                        break;
                    } else {
                        if (((java.lang.Number) ((jz5.l) it.next()).f302833d).intValue() == 3) {
                            break;
                        } else {
                            i28++;
                        }
                    }
                }
                if (i28 != -1) {
                    f0Var.f310116d = i28;
                }
            }
            kotlinx.coroutines.l.d(f476537b, kotlinx.coroutines.internal.b0.f310484a, null, new zw.m(z18, context, i27, arrayList, f0Var, i19, z17, asyncResult, null), 2, null);
        }
    }
}
