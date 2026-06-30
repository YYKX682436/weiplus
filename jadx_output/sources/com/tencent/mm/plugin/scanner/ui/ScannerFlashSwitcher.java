package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes13.dex */
public class ScannerFlashSwitcher extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f159462d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f159463e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f159464f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f159465g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f159466h;

    public ScannerFlashSwitcher(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f159464f = false;
        c();
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerFlashSwitcher", "closeFlashStatus");
        this.f159465g = false;
        this.f159462d.setImageResource(com.tencent.mm.R.raw.scanner_flash_open_normal);
        this.f159463e.setText(com.tencent.mm.R.string.i9k);
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerFlashSwitcher", "hide");
        setEnabled(false);
        this.f159466h = false;
        this.f159462d.animate().alpha(0.0f).setDuration(500L);
        this.f159463e.animate().alpha(0.0f).setDuration(500L).setListener(new com.tencent.mm.plugin.scanner.ui.b4(this));
        this.f159465g = false;
    }

    public final void c() {
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489429ci3, (android.view.ViewGroup) this, true);
        this.f159462d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.g87);
        this.f159463e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.g7y);
        this.f159464f = true;
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScannerFlashSwitcher", "show, isFirstShow: %s", java.lang.Boolean.valueOf(this.f159464f));
        this.f159466h = true;
        if (this.f159464f) {
            this.f159462d.setAlpha(0.0f);
            this.f159463e.setAlpha(0.0f);
            setVisibility(0);
            this.f159463e.animate().alpha(1.0f).setListener(null).setDuration(500L);
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new com.tencent.mm.plugin.scanner.ui.z3(this));
            ofFloat.setRepeatCount(3);
            ofFloat.setRepeatMode(2);
            ofFloat.setDuration(500L);
            ofFloat.addListener(new com.tencent.mm.plugin.scanner.ui.a4(this));
            ofFloat.start();
            this.f159464f = false;
        } else {
            setVisibility(0);
            this.f159463e.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
            this.f159462d.animate().alpha(1.0f).setDuration(500L).setListener(null).start();
        }
        setEnabled(true);
    }

    public ScannerFlashSwitcher(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f159464f = false;
        c();
    }
}
