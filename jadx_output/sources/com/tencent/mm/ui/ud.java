package com.tencent.mm.ui;

/* loaded from: classes10.dex */
public class ud implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMNewPhotoEditUI f211086d;

    public ud(com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI) {
        this.f211086d = mMNewPhotoEditUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMNewPhotoEditUI", "connected!!!");
        int i17 = com.tencent.mm.ui.MMNewPhotoEditUI.f196899t;
        com.tencent.mm.ui.MMNewPhotoEditUI mMNewPhotoEditUI = this.f211086d;
        android.content.Intent intent = mMNewPhotoEditUI.getIntent();
        mMNewPhotoEditUI.f196901e = intent.getStringExtra("raw_photo_path");
        mMNewPhotoEditUI.f196902f = intent.getLongExtra("raw_photo_img_id", -1L);
        mMNewPhotoEditUI.f196903g = intent.getStringExtra("after_photo_edit");
        mMNewPhotoEditUI.f196906m = intent.getIntExtra("from_scene", 0);
        mMNewPhotoEditUI.f196907n = intent.getBooleanExtra("from_scene_small_preview", false);
        mMNewPhotoEditUI.f196905i = mMNewPhotoEditUI.f196909p.isAutoSave();
        mMNewPhotoEditUI.initView();
    }
}
