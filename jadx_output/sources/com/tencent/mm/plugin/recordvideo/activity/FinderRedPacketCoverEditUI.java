package com.tencent.mm.plugin.recordvideo.activity;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/activity/FinderRedPacketCoverEditUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Ldn/k;", "<init>", "()V", "it3/a", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes10.dex */
public final class FinderRedPacketCoverEditUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements dn.k {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f155611t = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f155613e;

    /* renamed from: f, reason: collision with root package name */
    public int f155614f;

    /* renamed from: g, reason: collision with root package name */
    public int f155615g;

    /* renamed from: m, reason: collision with root package name */
    public it3.a f155618m;

    /* renamed from: o, reason: collision with root package name */
    public rm5.k f155620o;

    /* renamed from: p, reason: collision with root package name */
    public long f155621p;

    /* renamed from: q, reason: collision with root package name */
    public long f155622q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f155623r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f155624s;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f155612d = "";

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f155616h = jz5.h.b(new it3.x(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f155617i = jz5.h.b(new it3.w(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f155619n = jz5.h.b(new it3.t(this));

    public static final void U6(com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI finderRedPacketCoverEditUI, java.lang.String str) {
        finderRedPacketCoverEditUI.getClass();
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        long k17 = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[onThumbFetchEnd] isFileExist:" + j17 + " fileSize:" + k17 + " thumbPath:" + str);
        if (!j17 || k17 <= 0) {
            finderRedPacketCoverEditUI.X6();
            return;
        }
        finderRedPacketCoverEditUI.runOnUiThread(new it3.v(finderRedPacketCoverEditUI));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("upload_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b(str.getBytes()));
        java.lang.String sb7 = sb6.toString();
        finderRedPacketCoverEditUI.f155623r = sb7;
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FinderUploadTask_2";
        mVar.f241787f = finderRedPacketCoverEditUI;
        mVar.field_mediaId = sb7;
        mVar.field_fullpath = str;
        mVar.field_thumbpath = str;
        mVar.field_talker = "";
        mVar.field_needStorage = true;
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "upload thumb, file length " + com.tencent.mm.vfs.w6.k(str));
        mVar.field_fileType = 20304;
        mVar.field_appType = 251;
        mVar.field_bzScene = 2;
        mVar.A = 120;
        mVar.B = 300;
        mVar.field_priority = 2;
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar);
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    public final com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend V6() {
        return (com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend) ((jz5.n) this.f155619n).getValue();
    }

    public final int W6() {
        return ((java.lang.Number) ((jz5.n) this.f155616h).getValue()).intValue();
    }

    public final void X6() {
        java.lang.String string = getResources().getString(com.tencent.mm.R.string.f492786m23);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dlq;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "onBackPressed");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rk(new r45.ic4());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setStatusBarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        java.lang.String stringExtra = getIntent().getStringExtra("key_feed_video_path");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f155612d = stringExtra;
        this.f155613e = getIntent().getLongExtra("key_feed_video_duration_ms", 0L);
        this.f155614f = getIntent().getIntExtra("key_duration_min_limit", 1) * 1000;
        this.f155615g = getIntent().getIntExtra("key_duration_max_limit", 3) * 1000;
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[initData] videoPath:" + this.f155612d + " videoDuration:" + this.f155613e + " durationMinLimit:" + this.f155614f + " durationMaxLimit:" + this.f155615g);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.qsj);
        if (findViewById != null) {
            findViewById.setOnClickListener(new it3.i(this));
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qsm);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        com.tencent.mm.plugin.mmsight.segment.FinderTouchEventLayout finderTouchEventLayout = (com.tencent.mm.plugin.mmsight.segment.FinderTouchEventLayout) findViewById(com.tencent.mm.R.id.qsn);
        int W6 = (W6() * com.tencent.mm.plugin.appbrand.jsapi.liteapp.d.CTRL_INDEX) / 957;
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "[initViews] with:" + W6() + " height:" + W6);
        if (finderTouchEventLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = finderTouchEventLayout.getLayoutParams();
            layoutParams.width = W6();
            layoutParams.height = W6;
            finderTouchEventLayout.setLayoutParams(layoutParams);
        }
        finderTouchEventLayout.setEnableTouch(true);
        finderTouchEventLayout.setEnableScale(false);
        finderTouchEventLayout.setEnableOverScroll(false);
        finderTouchEventLayout.setOnScrollListener(new it3.j(this));
        finderTouchEventLayout.setOutlineProvider(new it3.k(this));
        finderTouchEventLayout.setClipToOutline(true);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.qsk);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new it3.l(this));
        }
        java.lang.String path = this.f155612d;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        it3.a aVar = new it3.a(context);
        this.f155618m = aVar;
        aVar.setOnVideoSizeChange(it3.m.f294569d);
        it3.a aVar2 = this.f155618m;
        if (aVar2 != null) {
            aVar2.setOnProgressChange(new it3.n(this));
        }
        it3.a aVar3 = this.f155618m;
        if (aVar3 != null) {
            aVar3.setOnPreparedListener(new it3.p(this, path));
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(W6(), (W6() * eh1.e.CTRL_INDEX) / 957);
        jz5.g gVar = this.f155617i;
        ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).addView(this.f155618m, layoutParams2);
        ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).requestLayout();
        it3.a aVar4 = this.f155618m;
        if (aVar4 != null) {
            kotlin.jvm.internal.o.g(path, "path");
            rh3.q qVar = new rh3.q();
            char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
            java.lang.String b17 = com.tencent.mm.sdk.platformtools.w2.b(path.getBytes());
            kotlin.jvm.internal.o.d(b17);
            wh3.a aVar5 = new wh3.a(b17, path);
            qVar.d(aVar5, ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Bi(qVar, aVar5, b17, b17));
            aVar4.a(qVar, aVar5);
            com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.p(aVar4, true, 0, 0, 0, 0, null, 62, null);
            com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(aVar4, null, 0L, 3, null);
        }
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(W6(), ((W6() * com.tencent.mm.plugin.appbrand.jsapi.appdownload.q.CTRL_INDEX) / 957) + 1);
        layoutParams3.gravity = 80;
        ((android.widget.FrameLayout) ((jz5.n) gVar).getValue()).addView(imageView, layoutParams3);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        wo0.c b18 = e17.b(ya2.l.f460502a.e("https://res.wx.qq.com/t/fed_upload/def05e11-0a81-44c1-ac59-bc77ca3437d8/hb_bottom_opengray.png", com.tencent.mm.plugin.finder.storage.y90.f128355e), g1Var.h(mn2.f1.f329965s));
        it3.b bVar = it3.b.f294551a;
        b18.getClass();
        b18.f447873d = bVar;
        b18.f447879j = it3.c.f294553a;
        b18.f447878i = it3.d.f294554a;
        b18.c(imageView);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.mmsight.segment.g0 g0Var;
        super.onDestroy();
        it3.a aVar = this.f155618m;
        if (aVar != null) {
            aVar.t();
        }
        it3.a aVar2 = this.f155618m;
        if (aVar2 != null) {
            aVar2.t();
            aVar2.getPlayer().release();
        }
        com.tencent.mm.plugin.mmsight.segment.RecyclerThumbSeekBarExtend V6 = V6();
        if (V6 != null) {
            V6.f148889e = -1;
            V6.f148888d = null;
            V6.f148902u.b();
            com.tencent.mm.plugin.mmsight.segment.f0 f0Var = V6.f148894m;
            if (f0Var != null && (g0Var = f0Var.f149013e) != null) {
                com.tencent.mm.sdk.platformtools.n3[] n3VarArr = g0Var.f149023c;
                if (!(n3VarArr.length == 0)) {
                    int length = n3VarArr.length;
                    for (int i17 = 0; i17 < length; i17++) {
                        com.tencent.mm.sdk.platformtools.n3 n3Var = n3VarArr[i17];
                        if (n3Var != null) {
                            n3Var.getSerial().f457303b.g();
                            n3VarArr[i17] = null;
                        }
                    }
                }
                com.tencent.mm.plugin.mmsight.segment.f0 f0Var2 = V6.f148894m;
                if (f0Var2 != null) {
                    f0Var2.f149013e = null;
                }
                V6.f148894m = null;
            }
            com.tencent.mm.plugin.mmsight.segment.FinderSliderSeekBar finderSliderSeekBar = V6.f148898q;
            if (finderSliderSeekBar == null) {
                kotlin.jvm.internal.o.o("innerSeekBar");
                throw null;
            }
            finderSliderSeekBar.d();
        }
        rm5.k kVar = this.f155620o;
        if (kVar != null) {
            kVar.destroy();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        it3.a aVar = this.f155618m;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        it3.a aVar = this.f155618m;
        if (aVar != null) {
            com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout.r(aVar, null, 0L, 3, null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        super.onSwipeBack();
        com.tencent.mars.xlog.Log.i("FinderRedPacketCoverEditUI", "onSwipeBack");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rk(new r45.ic4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r3 == true) goto L19;
     */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r4(java.lang.String r3, int r4, dn.g r5, dn.h r6, boolean r7) {
        /*
            r2 = this;
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "[callback] mediaId:"
            r5.<init>(r7)
            r5.append(r3)
            java.lang.String r7 = " startRet:"
            r5.append(r7)
            r5.append(r4)
            java.lang.String r7 = " sceneResult:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "FinderRedPacketCoverEditUI"
            com.tencent.mars.xlog.Log.i(r7, r5)
            r5 = 0
            if (r6 == 0) goto L29
            int r7 = r6.field_retCode
            goto L2a
        L29:
            r7 = r5
        L2a:
            java.lang.String r0 = ""
            if (r4 == 0) goto L32
            r1 = -21005(0xffffffffffffadf3, float:NaN)
            if (r4 != r1) goto L34
        L32:
            if (r7 == 0) goto L3d
        L34:
            it3.g r3 = new it3.g
            r3.<init>(r2, r0)
            r2.runOnUiThread(r3)
            return r5
        L3d:
            java.lang.String r4 = r2.f155623r
            if (r4 == 0) goto L49
            boolean r3 = r4.equals(r3)
            r4 = 1
            if (r3 != r4) goto L49
            goto L4a
        L49:
            r4 = r5
        L4a:
            if (r4 == 0) goto L5c
            if (r6 == 0) goto L5c
            java.lang.String r3 = r6.field_fileUrl
            if (r3 != 0) goto L53
            goto L54
        L53:
            r0 = r3
        L54:
            it3.g r3 = new it3.g
            r3.<init>(r2, r0)
            r2.runOnUiThread(r3)
        L5c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.activity.FinderRedPacketCoverEditUI.r4(java.lang.String, int, dn.g, dn.h, boolean):int");
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
