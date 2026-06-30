package com.tencent.mm.plugin.game.ui;

@db5.a(19)
/* loaded from: classes8.dex */
public class GameGalleryUI extends com.tencent.mm.ui.MMActivity implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public androidx.viewpager.widget.ViewPager f140845d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMDotView f140846e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140847f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f140848g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f140849h = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489150bg5;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        this.f140845d = (androidx.viewpager.widget.ViewPager) findViewById(com.tencent.mm.R.id.gl_);
        this.f140846e = (com.tencent.mm.ui.base.MMDotView) findViewById(com.tencent.mm.R.id.gld);
        java.lang.String[] stringArrayExtra = getIntent().getStringArrayExtra("URLS");
        if (stringArrayExtra == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("CURRENT", 0);
        if (intExtra < 0 || intExtra >= stringArrayExtra.length) {
            intExtra = 0;
        }
        this.f140847f = getIntent().getStringExtra("REPORT_APPID");
        this.f140848g = getIntent().getIntExtra("REPORT_SCENE", -1);
        this.f140849h = getIntent().getIntExtra("SOURCE_SCENE", 0);
        this.f140845d.setAdapter(new com.tencent.mm.plugin.game.ui.p3(this, stringArrayExtra));
        this.f140845d.setOnPageChangeListener(this);
        this.f140845d.setCurrentItem(intExtra, false);
        this.f140846e.setInvertedStyle(true);
        this.f140846e.setDotCount(stringArrayExtra.length);
        this.f140846e.setSelectedDot(intExtra);
        com.tencent.mm.plugin.game.commlib.util.i.a(this);
        if (intExtra == 0) {
            com.tencent.mm.game.report.l.f(this, this.f140848g, com.tencent.liteav.TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, 1, 12, this.f140847f, this.f140849h, null);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.game.commlib.util.i.f(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i17) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        this.f140846e.setSelectedDot(i17);
        com.tencent.mm.game.report.l.f(this, this.f140848g, com.tencent.liteav.TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY, i17 + 1, 12, this.f140847f, this.f140849h, null);
    }
}
