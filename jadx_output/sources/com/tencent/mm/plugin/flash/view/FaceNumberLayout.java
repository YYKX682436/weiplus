package com.tencent.mm.plugin.flash.view;

/* loaded from: classes14.dex */
public class FaceNumberLayout extends android.widget.LinearLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int f137268h;

    /* renamed from: d, reason: collision with root package name */
    public int f137269d;

    /* renamed from: e, reason: collision with root package name */
    public int f137270e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f137271f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f137272g;

    static {
        java.lang.String str = rz2.g.f401802a;
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_face_flash_read_number_interval, 1000);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerConfig", "getFaceReadNumberTimeInterval %d", java.lang.Integer.valueOf(Ni));
        f137268h = Ni;
    }

    public FaceNumberLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "release");
        wu5.c cVar = this.f137271f;
        if (cVar != null && !cVar.isDone() && !this.f137271f.isCancelled()) {
            this.f137271f.cancel(false);
        }
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            com.tencent.mm.plugin.flash.view.FaceNumberView faceNumberView = (com.tencent.mm.plugin.flash.view.FaceNumberView) getChildAt(i17);
            faceNumberView.getClass();
            faceNumberView.post(new yz2.c(faceNumberView));
        }
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "startShowNumber");
        wu5.c cVar = this.f137271f;
        if (cVar != null && !cVar.isDone() && !this.f137271f.isCancelled()) {
            this.f137271f.cancel(false);
        }
        this.f137271f = ((ku5.t0) ku5.t0.f312615d).B(this.f137272g);
    }

    public void setNumbers(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerNumberView", "setNumbers %s", str);
        this.f137270e = str.length();
        this.f137269d = getChildCount();
        setWeightSum(this.f137270e);
        for (int i17 = 0; i17 < this.f137270e; i17++) {
            com.tencent.mm.plugin.flash.view.FaceNumberView faceNumberView = new com.tencent.mm.plugin.flash.view.FaceNumberView(getContext(), null);
            faceNumberView.setNumber(java.lang.String.valueOf(str.charAt(i17)));
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            layoutParams.gravity = 1;
            addView(faceNumberView, layoutParams);
        }
    }

    public FaceNumberLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f137269d = 0;
        this.f137270e = 0;
        this.f137272g = new yz2.b(this);
    }
}
