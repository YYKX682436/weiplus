package com.tencent.mm.plugin.sns.cover.edit;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class SnsCoverFinderPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview f163990d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        return com.tencent.mm.R.layout.f488697a35;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWindowStyle", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ai3.d.f5107a = true;
        getWindow().setFormat(-3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWindowStyle", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("SELECT_OBJECT");
        int intExtra = getIntent().getIntExtra("SELECT_TAB_TYPE", 0);
        int intExtra2 = getIntent().getIntExtra("KEY_ENTER_SOURCE", 0);
        if (byteArrayExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverFinderPreviewUI", "finderObj bytes == null");
            finish();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
        finderObject.parseFrom(byteArrayExtra);
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        int i17 = objectDesc != null && (media = objectDesc.getMedia()) != null && (first = media.getFirst()) != null && first.getMediaType() == 4 ? 3 : 4;
        aa4.a aVar = aa4.a.f2635a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBackViewByType$default", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview a17 = aVar.a(this, i17, 1, i65.a.h(this, com.tencent.mm.R.dimen.aa_));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBackViewByType$default", "com.tencent.mm.plugin.sns.cover.preview.SnsBackPreviewFactory");
        this.f163990d = a17;
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.fwq)).addView(this.f163990d, 0);
        com.tencent.mm.plugin.sns.cover.api.IAbsSnsBackPreview iAbsSnsBackPreview = this.f163990d;
        v94.f fVar = iAbsSnsBackPreview instanceof v94.f ? (v94.f) iAbsSnsBackPreview : null;
        if (fVar != null) {
            fVar.loadFinderObject(finderObject);
        }
        findViewById(com.tencent.mm.R.id.ckw).setOnClickListener(new x94.a(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ckx);
        findViewById.setOnClickListener(new x94.b(this, finderObject, i17, intExtra2, intExtra));
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).getClass();
        com.tencent.mm.plugin.finder.assist.y4.b0(com.tencent.mm.plugin.finder.assist.y4.f102714a, this, findViewById, "friend_circle_cover_preview", kz5.b1.e(new jz5.l("feed_id", pm0.v.u(finderObject.getId()))), false, null, 48, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onDestroy();
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163990d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onDestroy();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onPause();
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163990d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
        super.onResume();
        com.tencent.mm.plugin.sns.cover.api.AbsSnsBackPreview absSnsBackPreview = this.f163990d;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onResume();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI");
    }
}
