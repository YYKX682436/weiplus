package com.tencent.mm.plugin.vlog.ui.video;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/video/VideoCompositionRemuxUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class VideoCompositionRemuxUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: f, reason: collision with root package name */
    public rp4.f0 f176102f;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f176104h;

    /* renamed from: i, reason: collision with root package name */
    public ct0.b f176105i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f176106m;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f176101e = "MicroMsg.VideoCompositionRemuxUI[" + hashCode() + ']';

    /* renamed from: g, reason: collision with root package name */
    public final rp4.x f176103g = new rp4.x();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        android.os.Bundle bundle2;
        android.os.Bundle bundleExtra;
        super.onCreate(bundle);
        java.lang.String str2 = this.f176101e;
        com.tencent.mars.xlog.Log.i(str2, "onCreate");
        setContentView(com.tencent.mm.R.layout.d39);
        com.tencent.mars.xlog.Log.i(str2, "initData");
        this.f176102f = new rp4.f0(this, null);
        ut3.f fVar = ut3.f.f431176c;
        fVar.f431177a = new qt3.a();
        android.os.Bundle bundle3 = fVar.f431178b;
        bundle3.clear();
        if (getIntent().hasExtra("key_extra_data") && (bundleExtra = getIntent().getBundleExtra("key_extra_data")) != null && bundleExtra.containsKey("key_edit_video_bgm_listen_id") && bundleExtra.containsKey("key_edit_video_bgm_is_major_owned")) {
            java.lang.String string = bundleExtra.getString("key_edit_video_bgm_listen_id");
            com.tencent.mars.xlog.Log.i(str2, "listenId:%s", string);
            bundle3.putString("key_edit_video_bgm_listen_id", string);
            bundle3.putBoolean("key_edit_video_bgm_is_major_owned", bundleExtra.getBoolean("key_edit_video_bgm_is_major_owned"));
        }
        this.f176104h = (com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        com.tencent.mars.xlog.Log.i(str2, "initMediaInfoFromProvider");
        ct0.b bVar = new ct0.b(null, null, false, 0, 0, null, null, 0, 0, null, null, null, false, null, null, 0, 65535, null);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f176104h;
        if (recordConfigProvider != null) {
            java.util.ArrayList arrayList = recordConfigProvider.H;
            if (arrayList != null) {
                bVar.f222215l = arrayList;
            }
            java.util.ArrayList arrayList2 = recordConfigProvider.G;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                if (!(arrayList == null || arrayList.isEmpty()) && arrayList.size() == 1) {
                    java.lang.Object obj = arrayList.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    java.lang.String str3 = (java.lang.String) obj;
                    bVar.f222204a = str3;
                    bVar.f222208e = com.tencent.mm.plugin.sight.base.e.d(str3, true).f162382a;
                    java.lang.String thumbPath = recordConfigProvider.C;
                    kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
                    bVar.f222205b = thumbPath;
                }
            }
            bVar.f222217n = recordConfigProvider.M;
            if (!android.text.TextUtils.isEmpty(recordConfigProvider.A) && com.tencent.mm.vfs.w6.j(recordConfigProvider.A)) {
                java.lang.String inputVideoPath = recordConfigProvider.A;
                kotlin.jvm.internal.o.f(inputVideoPath, "inputVideoPath");
                bVar.f222204a = inputVideoPath;
                bVar.f222208e = com.tencent.mm.plugin.sight.base.e.d(recordConfigProvider.A, true).f162382a;
                java.lang.String thumbPath2 = recordConfigProvider.C;
                kotlin.jvm.internal.o.f(thumbPath2, "thumbPath");
                bVar.f222205b = thumbPath2;
            }
        }
        this.f176105i = bVar;
        nu3.m mVar = nu3.m.f340229a;
        mVar.k(android.os.SystemClock.elapsedRealtime());
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider2 = this.f176104h;
        mVar.h(recordConfigProvider2 != null ? recordConfigProvider2.F : 0);
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider3 = this.f176104h;
        mVar.u((recordConfigProvider3 == null || (bundle2 = recordConfigProvider3.M) == null) ? 0 : bundle2.getInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", 0));
        mVar.f(this.f176104h);
        ct0.b bVar2 = this.f176105i;
        if (bVar2 == null || (str = bVar2.f222204a) == null) {
            str = "";
        }
        mVar.o(str);
        com.tencent.mars.xlog.Log.i(str2, "init media model");
        this.f176103g.d(vt3.q.f440037a, vt3.q.f440038b);
        ct0.b bVar3 = this.f176105i;
        kotlin.jvm.internal.o.d(bVar3);
        java.util.List c17 = kz5.b0.c(bVar3.d());
        java.util.List c18 = kz5.b0.c(2);
        java.lang.Integer[] numArr = new java.lang.Integer[1];
        ct0.b bVar4 = this.f176105i;
        numArr[0] = java.lang.Integer.valueOf((bVar4 == null || !bVar4.f222206c) ? 0 : 1);
        this.f176106m = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310570c, null, new rp4.h0(this, c17, c18, numArr, null), 2, null);
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i(this.f176101e, "onDestroy");
        kotlinx.coroutines.r2 r2Var = this.f176106m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        ut3.f.f431176c.f431177a = null;
        nu3.m.f340229a.a();
        rm5.l.f397520a.a();
    }
}
