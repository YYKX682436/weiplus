package com.tencent.mm.plugin.mv.ui;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvRouterUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lut3/d;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MusicMvRouterUI extends com.tencent.mm.plugin.mv.ui.BaseMusicMvUI implements ut3.d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f150889g = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f150890e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f150891f = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));

    public final void U6(android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvMainUI.class);
        intent2.addFlags(67108864);
        byte[] byteArrayExtra = intent.getByteArrayExtra("key_track_data");
        if (byteArrayExtra != null) {
            intent2.putExtra("key_track_data", byteArrayExtra);
        }
        intent2.putExtra("key_seek_to_start", intent.getBooleanExtra("key_seek_to_start", false));
        overridePendingTransition(com.tencent.mm.R.anim.f477886ea, -1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMainUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMainUI", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void V6() {
        int i17 = this.f150890e;
        ut3.m mVar = ut3.m.f431182a;
        ll3.t1 t1Var = ll3.t1.f319240a;
        if (i17 == 1) {
            com.tencent.mm.modelcontrol.VideoTransPara Bi = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "videoParams " + Bi);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g(t1Var.a(), t1Var.b(), Bi, Bi.f71195h * 1000, 14);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            g17.f155684v = bool;
            g17.f155681s = bool;
            java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
            g17.f155683u = bool2;
            int intExtra = getIntent().getIntExtra("KEY_MIN_RECORD_DURATION", 1000);
            int intExtra2 = getIntent().getIntExtra("KEY_MAX_RECORD_DURATION", 1000);
            boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_FIX_CLIP_MODE", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "record require duration:" + intExtra + ", maxVideoDuration:" + intExtra2);
            g17.f155686x = intExtra;
            g17.f155685w = intExtra2;
            if (intExtra > 0 && booleanExtra) {
                g17.R = getContext().getString(com.tencent.mm.R.string.ht9, java.lang.String.valueOf((int) (intExtra / 1000.0f)));
            }
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_effect_finder_enable_beautify, true);
            com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig = g17.Q;
            xEffectConfig.f188597e = fj6;
            xEffectConfig.f188599g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_skin_smooth, -1);
            xEffectConfig.f188600h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_eye_morph, -1);
            xEffectConfig.f188601i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_face_morph, -1);
            xEffectConfig.f188602m = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_skin_bright, -1);
            xEffectConfig.f188603n = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_effect_finder_beautify_eye_bright, -1);
            hp.b bVar = new hp.b();
            bVar.e(true);
            bVar.g(true);
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam = bVar.f282904a;
            ((java.util.HashMap) uICustomParam.f64779h).put("plugin_photo_crop", bool2);
            bVar.c(false);
            bVar.b(true);
            bVar.d(true);
            bVar.h(true);
            bVar.a(true);
            bVar.f(true);
            g17.f155677o = uICustomParam;
            g17.f155678p = com.tencent.mm.pluginsdk.ui.e1.CONTAIN;
            g17.a(2, "com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditVideoPluginLayout");
            ut3.f.f431176c.f431177a = this;
            mVar.c(this, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, g17);
            return;
        }
        if (i17 == 2) {
            com.tencent.mm.modelcontrol.VideoTransPara Bi2 = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Bi();
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "videoParams " + Bi2);
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g18 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g(t1Var.a(), t1Var.b(), Bi2, 0, 14);
            java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
            g18.f155684v = bool3;
            java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
            g18.f155681s = bool4;
            g18.f155682t = bool3;
            g18.f155687y = true;
            com.tencent.mm.component.api.jumper.UICustomParam uICustomParam2 = new com.tencent.mm.component.api.jumper.UICustomParam((hp.a) null);
            java.util.HashMap hashMap = (java.util.HashMap) uICustomParam2.f64779h;
            hashMap.put("plugin_filter", bool4);
            hashMap.put("plugin_video_crop", bool4);
            hashMap.put("plugin_photo_crop", bool4);
            g18.f155677o = uICustomParam2;
            g18.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.MusicMvEditPhotoPluginLayout");
            ut3.f.f431176c.f431177a = this;
            mVar.c(this, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477877e1, g18);
            return;
        }
        if (i17 == 3) {
            android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.class);
            byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_track_data");
            if (byteArrayExtra != null) {
                intent.putExtra("key_track_data", byteArrayExtra);
            }
            pm0.v.g(intent, getIntent(), "key_mv_music_duration", 0);
            pm0.v.g(intent, getIntent(), "key_mv_from_scene", 0);
            pm0.v.g(intent, getIntent(), "key_mv_enter_maker_ui_from_scene", 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (i17 == 5) {
            U6(getIntent());
            finish();
            return;
        }
        if (i17 == 6) {
            kotlinx.coroutines.l.d(this.f150891f, null, null, new jm3.c1(this, this, null), 3, null);
            return;
        }
        if (i17 != 7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMvRouterUI", "unknown router: " + this.f150890e);
            finish();
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvPostUI.class);
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("key_track_data");
        if (byteArrayExtra2 != null) {
            intent2.putExtra("key_track_data", byteArrayExtra2);
        }
        pm0.v.g(intent2, getIntent(), "key_mv_music_duration", 0);
        pm0.v.g(intent2, getIntent(), "key_mv_from_scene", 0);
        pm0.v.g(intent2, getIntent(), "key_mv_enter_maker_ui_from_scene", 0);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createPostMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/mv/ui/MusicMvRouterUI", "createPostMv", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onMediaGenerated");
        if (captureDataManager$CaptureVideoNormalModel == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "record video path:" + captureDataManager$CaptureVideoNormalModel.f155661e + ' ' + captureDataManager$CaptureVideoNormalModel.f155662f);
        boolean z17 = true;
        if (this.f150890e == 1) {
            java.lang.String str = captureDataManager$CaptureVideoNormalModel.f155661e;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_RECORD_VIDEO_PATH", captureDataManager$CaptureVideoNormalModel.f155661e);
                intent.putExtra("KEY_RECORD_VIDEO_THUMB_PATH", captureDataManager$CaptureVideoNormalModel.f155662f);
                setResult(-1, intent);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
                finish();
            }
        }
        if (this.f150890e == 2) {
            java.lang.Boolean bool = captureDataManager$CaptureVideoNormalModel.f155664h;
            kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
            if (bool.booleanValue()) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("KEY_RECORD_PHOTO_PATH", captureDataManager$CaptureVideoNormalModel.f155662f);
                setResult(-1, intent2);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
                finish();
            }
        }
        setResult(0);
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).finish();
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 233 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "cancel take photo");
            setResult(0);
            finish();
        }
    }

    @Override // com.tencent.mm.plugin.mv.ui.BaseMusicMvUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f150890e = getIntent().getIntExtra("KEY_MUSIC_ROUTER", -1);
        V6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onDestroy");
        super.onDestroy();
        kotlinx.coroutines.z0.e(this.f150891f, null, 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            int intExtra = intent.getIntExtra("KEY_MUSIC_ROUTER", -1);
            if (intExtra == 4) {
                overridePendingTransition(com.tencent.mm.R.anim.f477886ea, -1);
                finish();
            } else {
                if (intExtra != 5) {
                    return;
                }
                U6(intent);
                finish();
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onPause");
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (grantResults.length == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 16) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                V6();
                return;
            } else {
                db5.e1.C(getContext(), i65.a.r(getContext(), com.tencent.mm.R.string.hh8), i65.a.r(getContext(), com.tencent.mm.R.string.hht), i65.a.r(getContext(), com.tencent.mm.R.string.g6z), i65.a.r(getContext(), com.tencent.mm.R.string.hh9), false, new jm3.e1(this), new jm3.f1(this));
                return;
            }
        }
        if (i17 != 80) {
            return;
        }
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            V6();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvRouterUI", "onResume");
        super.onResume();
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
