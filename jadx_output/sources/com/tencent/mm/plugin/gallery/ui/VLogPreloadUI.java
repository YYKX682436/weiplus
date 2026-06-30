package com.tencent.mm.plugin.gallery.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/gallery/ui/VLogPreloadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "e33/n6", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class VLogPreloadUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final e33.n6 f138639d = new e33.n6(null);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489602d45;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        setSelfNavigationBarVisible(8);
        ai3.d.f5107a = true;
        getWindow().setFormat(-3);
        db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.gga), true, false, null);
        getIntent().getStringArrayListExtra("key_select_video_list");
        getIntent().getStringArrayListExtra("key_select_image_list");
        getIntent().getIntArrayExtra(ya.b.INDEX);
        android.graphics.Point i17 = com.tencent.mm.ui.bk.i(this);
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadUI", "screen x:" + i17.x + " y:" + i17.y + "  realScreen x:" + h17.x + " y:" + h17.y + ", previewSize:" + getIntent().getIntExtra("KEY_PREVIEW_WIDTH", -1) + ',' + getIntent().getIntExtra("KEY_PREVIEW_HEIGHT", -1));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogPreloadUI", "VLogPreloadUI onDestroy");
    }
}
