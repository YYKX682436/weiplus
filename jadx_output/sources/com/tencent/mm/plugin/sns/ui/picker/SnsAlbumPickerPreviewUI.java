package com.tencent.mm.plugin.sns.ui.picker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseGalleryUI;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsAlbumPickerPreviewUI extends com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI {
    public static final /* synthetic */ int B1 = 0;
    public int A1;
    public final java.lang.String S = "MicroMsg.SnsAlbumPickerPreviewUI";
    public final jz5.g T;
    public final jz5.g U;
    public final jz5.g V;
    public final jz5.g W;
    public final jz5.g X;
    public final jz5.g Y;
    public final jz5.g Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f170219l1;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f170220p0;

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f170221p1;

    /* renamed from: x0, reason: collision with root package name */
    public int f170222x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f170223x1;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f170224y0;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f170225y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f170226z1;

    public SnsAlbumPickerPreviewUI() {
        jz5.h.b(new td4.v0(this));
        this.T = jz5.h.b(new td4.y0(this));
        this.U = jz5.h.b(new td4.z0(this));
        this.V = jz5.h.b(new td4.u0(this));
        this.W = jz5.h.b(new td4.s0(this));
        this.X = jz5.h.b(new td4.x0(this));
        this.Y = jz5.h.b(new td4.t0(this));
        this.Z = jz5.h.b(new td4.w0(this));
        this.f170220p0 = jz5.h.b(td4.a1.f417631d);
        this.f170224y0 = "";
        this.f170221p1 = "";
        this.f170225y1 = "--/--";
        this.f170226z1 = -1;
        this.A1 = 10;
    }

    public static final /* synthetic */ java.util.ArrayList r7(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        java.util.ArrayList w76 = snsAlbumPickerPreviewUI.w7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return w76;
    }

    public final void A7(java.lang.String mediaObjId, boolean z17, java.util.List mediaObjIdList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        kotlin.jvm.internal.o.g(mediaObjId, "mediaObjId");
        kotlin.jvm.internal.o.g(mediaObjIdList, "mediaObjIdList");
        if (z17) {
            if (!mediaObjIdList.contains(mediaObjId)) {
                mediaObjIdList.add(mediaObjId);
            } else if (mediaObjIdList.remove(mediaObjId)) {
                mediaObjIdList.add(mediaObjId);
            }
        } else if (mediaObjIdList.contains(mediaObjId)) {
            mediaObjIdList.remove(mediaObjId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return com.tencent.mm.R.layout.c_v;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void h6(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPageTitleTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.X).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPageTitleTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (textView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            java.lang.String str3 = this.f170225y1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentPageTitleText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            textView.setText(str3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateTitle", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.u0(this);
        hideTitleView();
        getWindow().addFlags(128);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handlerIntentData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        this.f170219l1 = getIntent().getIntExtra("sns_video_scene", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("sns_gallery_userName");
        if (stringExtra == null) {
            stringExtra = c01.z1.r();
            kotlin.jvm.internal.o.f(stringExtra, "getUsernameFromUserInfo(...)");
        }
        this.f170224y0 = stringExtra;
        getIntent().getIntExtra("sns_gallery_localId", 0);
        getIntent().getBooleanExtra("sns_gallery_is_self", false);
        this.f170222x0 = getIntent().getIntExtra("sns_gallery_position", 0);
        this.f170226z1 = getIntent().getIntExtra("sns_album_select_limit_count", 9);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("sns_album_select_mediaobj_id_list");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        w7().addAll(stringArrayListExtra);
        this.A1 = getIntent().getIntExtra("album_show_source_type", 10);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handlerIntentData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        enableOptionMenu(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mars.xlog.Log.i(this.S, "onDestroy: ");
        getWindow().clearFlags(128);
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 4 && event.getRepeatCount() == 0) {
            y7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            return true;
        }
        boolean onKeyDown = super.onKeyDown(i17, event);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return onKeyDown;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            r45.jj4 cntMedia = snsInfoFlip.getCntMedia();
            this.f166810o.c0(cntMedia != null && cntMedia.f377856e == 6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onStart();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFlipView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip(this);
        snsInfoFlip.setVideoScene(this.f170219l1);
        snsInfoFlip.setNeedOCRImg(false);
        snsInfoFlip.setNeedScanImage(false);
        snsInfoFlip.setNeedTranslationImg(false);
        snsInfoFlip.setShowTitle(false);
        snsInfoFlip.setEnableHorLongBmpMode(false);
        snsInfoFlip.setUIFromScene(getIntent().getIntExtra("key_from_scene", 0));
        snsInfoFlip.setFromScene(com.tencent.mm.storage.s7.a());
        snsInfoFlip.f166286q = this.f170224y0;
        this.f166810o = snsInfoFlip;
        com.tencent.mm.plugin.sns.model.d6 Kj = com.tencent.mm.plugin.sns.model.l4.Kj();
        java.lang.String str = this.f170224y0;
        Kj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.HashMap) Kj.f164156p).get(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsGalleryItems", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (this.f166802d) {
            this.f166810o.X(arrayList2, this.f170224y0, this.f170222x0, b7(), this);
        } else {
            this.f166810o.X(arrayList2, this.f170224y0, this.f170222x0, a7(), this);
        }
        this.f166810o.setOnPageSelectListener(this);
        addView(this.f166810o);
        td4.n0 n0Var = new td4.n0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
        if (snsInfoFlip2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        } else {
            snsInfoFlip2.getGallery().setSingleClickOverListener(n0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateGalleryClickListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        }
        td4.o0 o0Var = new td4.o0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGalleryPageChangeListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        this.G = o0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGalleryPageChangeListener", "com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFlipView", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSelectArea", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSelectTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.U).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSelectTv", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (textView != null) {
            textView.setOnClickListener(new td4.q0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) ((jz5.n) this.T).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (imageButton != null) {
            imageButton.setOnClickListener(new td4.r0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSelectArea", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f479163rn));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.Button v76 = v7();
        if (v76 != null) {
            v76.setText(x7(w7().size()));
            v76.setContentDescription(v7().getText());
            v76.setOnClickListener(new td4.p0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initBackButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBackBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.Y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBackBtn", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new td4.m0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBackButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        super.onStop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (this.f166810o != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && i17 != 3) {
                this.f166810o.i0(str);
            }
            if (z17) {
                this.f166810o.c0(true);
            } else {
                this.f166810o.W();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public final void s7(java.lang.String mediaObjId, java.util.List mediaObjIdList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        kotlin.jvm.internal.o.g(mediaObjId, "mediaObjId");
        kotlin.jvm.internal.o.g(mediaObjIdList, "mediaObjIdList");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        boolean contains = mediaObjIdList.contains(mediaObjId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaObjSelected", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        java.lang.String str = this.S;
        if (contains) {
            com.tencent.mars.xlog.Log.i(str, "changeSelectState: unselect:".concat(mediaObjId));
            z7(false);
            A7(mediaObjId, false, mediaObjIdList);
            java.lang.String x76 = x7(w7().size());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            android.widget.Button v76 = v7();
            if (v76 != null) {
                v76.setEnabled(true);
                v76.setText(x76);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        } else {
            if (mediaObjIdList.size() >= this.f170226z1) {
                com.tencent.mars.xlog.Log.i(str, "changeSelectState: limit:" + this.f170226z1 + ", selected:" + mediaObjIdList.size());
                td4.a.f417629a.a(this, this.A1, this.f170226z1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
                return;
            }
            z7(true);
            A7(mediaObjId, true, mediaObjIdList);
            java.lang.String x77 = x7(w7().size());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            android.widget.Button v77 = v7();
            if (v77 != null) {
                v77.setEnabled(true);
                v77.setText(x77);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSelectState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public final android.widget.RelativeLayout t7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMActionBarLayout", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) this.W).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMActionBarLayout", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return relativeLayout;
    }

    public final android.widget.RelativeLayout u7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMBottomBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) ((jz5.n) this.V).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMBottomBar", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return relativeLayout;
    }

    public final android.widget.Button v7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.Button button = (android.widget.Button) ((jz5.n) this.Z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNextButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return button;
    }

    public final java.util.ArrayList w7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        java.util.ArrayList arrayList = (java.util.ArrayList) ((jz5.n) this.f170220p0).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSelectedMediaObjIdList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return arrayList;
    }

    public final java.lang.String x7(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (i17 <= 0) {
            java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.f490502ww);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            return string;
        }
        java.lang.String str = getContext().getResources().getString(com.tencent.mm.R.string.f490502ww) + '(' + i17 + '/' + this.f170226z1 + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNextButtonText", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        return str;
    }

    public final void y7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        com.tencent.mars.xlog.Log.i(this.S, "goBack: selected=" + w7());
        android.content.Intent intent = new android.content.Intent();
        intent.putStringArrayListExtra("sns_album_select_mediaobj_id_list", w7());
        setResult(0, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goBack", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }

    public final void z7(boolean z17) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSelectButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            i17 = com.tencent.mm.R.raw.checkbox_selected_orange;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheckBoxSelectedResource", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            i17 = com.tencent.mm.R.raw.radio_off;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) ((jz5.n) this.T).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSelectButton", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        if (imageButton != null) {
            imageButton.setImageResource(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSelectButtonState", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
    }
}
