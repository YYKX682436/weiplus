package kp3;

/* loaded from: classes14.dex */
public final class p0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f311021d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f311022e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.palm.ui.PalmPrintVerifyMask f311023f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f311024g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f311025h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f311026i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f311027m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f311028n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f311029o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f311030p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f311031q;

    /* renamed from: r, reason: collision with root package name */
    public final kp3.e0 f311032r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f311033s;

    /* renamed from: t, reason: collision with root package name */
    public int f311034t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f311021d = jz5.h.b(new kp3.n0(activity));
        this.f311022e = jz5.h.b(new kp3.o0(activity));
        this.f311030p = true;
        this.f311031q = true;
        this.f311032r = new kp3.e0(this);
        this.f311034t = com.tencent.youtu.YTBizPalmRegister.HandType.UNKNOWN;
    }

    public final void O6(com.tencent.mm.view.MMPAGView mMPAGView, java.lang.String str, boolean z17) {
        mMPAGView.n();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(jp3.s.f301025b.b() + "/PalmRegister/assets/pag/");
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        if (!mMPAGView.m(sb7)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PalmPrintPreviewUIC", "[doPlayPag] pagView set path fail, pagFilePath is %s", sb7);
            return;
        }
        mMPAGView.setAlpha(1.0f);
        mMPAGView.setVisibility(0);
        mMPAGView.setProgress(0.0d);
        mMPAGView.d();
        if (z17) {
            mMPAGView.g();
        }
    }

    public final boolean P6(java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("style", str);
        boolean b17 = com.tencent.mm.ui.jk.f209011a.b(jSONObject.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.PalmPrintPreviewUIC", "[doPlayVibrate] doVibrateSuccess : " + b17);
        return b17;
    }

    public final com.tencent.mm.view.MMPAGView Q6() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f311029o;
        if (mMPAGView != null) {
            return mMPAGView;
        }
        kotlin.jvm.internal.o.o("centerCirclePagView");
        throw null;
    }

    public final com.tencent.mm.plugin.palm.ui.PalmPrintVerifyMask R6() {
        com.tencent.mm.plugin.palm.ui.PalmPrintVerifyMask palmPrintVerifyMask = this.f311023f;
        if (palmPrintVerifyMask != null) {
            return palmPrintVerifyMask;
        }
        kotlin.jvm.internal.o.o("previewMask");
        throw null;
    }

    public final com.tencent.mm.view.MMPAGView S6() {
        com.tencent.mm.view.MMPAGView mMPAGView = this.f311028n;
        if (mMPAGView != null) {
            return mMPAGView;
        }
        kotlin.jvm.internal.o.o("tipsPagView");
        throw null;
    }

    public final android.widget.TextView T6() {
        android.widget.TextView textView = this.f311026i;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("tipsTv");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        S6().n();
        Q6().n();
    }
}
