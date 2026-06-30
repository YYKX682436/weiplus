package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsUploadBrowseUI extends com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI {
    public java.util.ArrayList S = new java.util.ArrayList();
    public java.util.ArrayList T = new java.util.ArrayList();
    public int U = 0;
    public final java.util.HashMap V = new java.util.HashMap();
    public boolean W = false;

    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
            r7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return true;
        }
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchKeyEvent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        return dispatchKeyEvent;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        return com.tencent.mm.R.layout.cqv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5 = "initView";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        boolean booleanExtra = getIntent().getBooleanExtra("k_need_delete", true);
        java.lang.String stringExtra = getIntent().getStringExtra("sns_gallery_userName");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str7 = stringExtra == null ? "" : stringExtra;
        this.S = getIntent().getStringArrayListExtra("sns_gallery_temp_paths");
        java.util.ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("sns_temp_multi_pic_items");
        this.T = parcelableArrayListExtra;
        if (this.S == null && parcelableArrayListExtra == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return;
        }
        boolean z18 = (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) ? false : true;
        this.W = z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadBrowseUI", "initView >> isMultiItems: %b", java.lang.Boolean.valueOf(z18));
        this.U = getIntent().getIntExtra("sns_gallery_position", 0);
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = new com.tencent.mm.plugin.sns.ui.SnsInfoFlip(this);
        this.f166810o = snsInfoFlip;
        snsInfoFlip.setEnableHorLongBmpMode(false);
        this.f166810o.setShowTitle(true);
        this.f166810o.setUIFromScene(c7());
        if (this.W) {
            java.util.ArrayList arrayList2 = this.T;
            int i17 = com.tencent.mm.plugin.sns.model.s5.f164676d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (arrayList2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
                str = "initView";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI";
            } else {
                java.util.Iterator it6 = arrayList2.iterator();
                int i18 = 0;
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) it6.next();
                    r45.m33 m33Var = new r45.m33();
                    r45.jj4 jj4Var = new r45.jj4();
                    if (snsPublishBaseMultiPicItem.e()) {
                        com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem) snsPublishBaseMultiPicItem;
                        boolean m17 = snsPublishLivePhotoItem.m();
                        it = it6;
                        str3 = str5;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoStorageLogic", "getUploadsList >> livePhotoItem: id: %d, isParseFinish, %b", java.lang.Long.valueOf(snsPublishLivePhotoItem.g()), java.lang.Boolean.valueOf(m17));
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pre_temp_sns_live_photo");
                        str4 = str6;
                        sb6.append(snsPublishLivePhotoItem.g());
                        jj4Var.f377855d = sb6.toString();
                        jj4Var.f377860i = snsPublishLivePhotoItem.b();
                        r45.jj4 jj4Var2 = new r45.jj4();
                        if (m17) {
                            jj4Var2.f377858g = snsPublishLivePhotoItem.i();
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                            java.lang.String str8 = snsPublishLivePhotoItem.f171220t;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTempVideoPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem");
                            jj4Var2.f377858g = str8;
                        }
                        jj4Var.X = jj4Var2;
                    } else {
                        it = it6;
                        str3 = str5;
                        str4 = str6;
                        jj4Var.f377855d = "pre_temp_extend_pic" + snsPublishBaseMultiPicItem.b();
                    }
                    m33Var.f380109d = jj4Var;
                    m33Var.f380110e = "";
                    m33Var.f380112g = i18;
                    arrayList3.add(m33Var);
                    i18++;
                    it6 = it;
                    str5 = str3;
                    str6 = str4;
                }
                str = str5;
                str2 = str6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
            arrayList = arrayList3;
        } else {
            str = "initView";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI";
            com.tencent.mm.plugin.sns.model.l4.Ni();
            java.util.ArrayList<java.lang.String> arrayList4 = this.S;
            int i19 = com.tencent.mm.plugin.sns.model.s5.f164676d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            if (arrayList4 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            } else {
                arrayList5.clear();
                int i27 = 0;
                for (java.lang.String str9 : arrayList4) {
                    r45.m33 m33Var2 = new r45.m33();
                    r45.jj4 jj4Var3 = new r45.jj4();
                    jj4Var3.f377855d = "pre_temp_extend_pic" + str9;
                    m33Var2.f380109d = jj4Var3;
                    m33Var2.f380110e = "";
                    m33Var2.f380112g = i27;
                    arrayList5.add(m33Var2);
                    i27++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUploadsList", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
            }
            arrayList = arrayList5;
        }
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = this.f166810o;
        android.view.View contentView = getContentView();
        snsInfoFlip2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSetTouchScalePreviewLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip2.f167188b2 = true;
        snsInfoFlip2.f167189c2 = contentView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSetTouchScalePreviewLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f166802d) {
            this.f166810o.X(arrayList, str7, this.U, b7(), this);
        } else {
            this.f166810o.X(arrayList, str7, this.U, a7(), this);
        }
        this.f166810o.setOnPageSelectListener(this);
        addView(this.f166810o);
        setBackBtn(new com.tencent.mm.plugin.sns.ui.vt(this));
        if (booleanExtra) {
            addIconOptionMenu(0, com.tencent.mm.R.string.f490367t0, com.tencent.mm.R.raw.icons_outlined_delete, new com.tencent.mm.plugin.sns.ui.yt(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadBrowseUI", "onAcvityResult requestCode:" + i17);
        if (i18 != -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        }
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mm.ui.bk.u0(this);
        super.onCreate(bundle);
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mm.plugin.sns.model.l4.hj().N(this);
        super.onDestroy();
        dx1.g.f244489a.j("SnsPublishProcess", "mediaPreviewPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.b0();
        }
        super.onPause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        super.onResume();
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            snsInfoFlip.c0(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.ak
    public void q6(r45.jj4 jj4Var, int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        super.q6(jj4Var, i17, str);
        this.V.put(java.lang.Integer.valueOf(i17), java.lang.Boolean.TRUE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPageChange", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    public void r7() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        android.content.Intent intent = new android.content.Intent();
        java.util.List<r45.m33> flipList = this.f166810o.getFlipList();
        if (flipList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadBrowseUI", "finishWithIntent >> isMultiItems: %b", java.lang.Boolean.valueOf(this.W));
        if (this.W) {
            this.T.clear();
            for (r45.m33 m33Var : flipList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadBrowseUI", "finishWithIntent >> mediaId: %s", m33Var.f380109d.f377855d);
                if (m33Var.f380109d.f377855d.startsWith("pre_temp_sns_live_photo")) {
                    this.T.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem(m33Var.f380109d.f377860i, 0, 0, 0L, 0L, 0L, "", "", "", 0, 0, 0, "", "", new com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem(com.tencent.mm.plugin.recordvideo.report.SnsCameraEditorReportItem.f155866u)));
                } else {
                    java.lang.String str = com.tencent.mm.plugin.sns.model.l4.Ni() + m33Var.f380109d.f377855d;
                    if (m33Var.f380109d.f377855d.startsWith("pre_temp_extend_pic")) {
                        str = m33Var.f380109d.f377855d.substring(19);
                    }
                    this.T.add(new com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishImageItem(str, 0, 0, 0));
                }
            }
            intent.putParcelableArrayListExtra("sns_temp_multi_pic_items", this.T);
        } else {
            this.S.clear();
            for (r45.m33 m33Var2 : flipList) {
                java.lang.String str2 = com.tencent.mm.plugin.sns.model.l4.Ni() + m33Var2.f380109d.f377855d;
                if (m33Var2.f380109d.f377855d.startsWith("pre_temp_extend_pic")) {
                    str2 = m33Var2.f380109d.f377855d.substring(19);
                }
                this.S.add(str2);
            }
            intent.putExtra("sns_gallery_temp_paths", this.S);
        }
        java.util.HashMap hashMap = this.V;
        intent.putExtra("sns_update_preview_image_count", hashMap.size());
        hashMap.clear();
        setResult(-1, intent);
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishWithIntent", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void s3(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = this.f166810o;
        if (snsInfoFlip != null) {
            if (z17) {
                snsInfoFlip.c0(true);
            } else {
                snsInfoFlip.W();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyData", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseGalleryUI, com.tencent.mm.plugin.sns.ui.n4
    public void y1(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectedId", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
    }
}
