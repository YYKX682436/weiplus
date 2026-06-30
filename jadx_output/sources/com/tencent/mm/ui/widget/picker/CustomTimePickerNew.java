package com.tencent.mm.ui.widget.picker;

/* loaded from: classes15.dex */
public class CustomTimePickerNew extends android.widget.FrameLayout {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f212221s = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f212222d;

    /* renamed from: e, reason: collision with root package name */
    public final w51.g f212223e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f212224f;

    /* renamed from: g, reason: collision with root package name */
    public int f212225g;

    /* renamed from: h, reason: collision with root package name */
    public int f212226h;

    /* renamed from: i, reason: collision with root package name */
    public int f212227i;

    /* renamed from: m, reason: collision with root package name */
    public int f212228m;

    /* renamed from: n, reason: collision with root package name */
    public int f212229n;

    /* renamed from: o, reason: collision with root package name */
    public int f212230o;

    /* renamed from: p, reason: collision with root package name */
    public int f212231p;

    /* renamed from: q, reason: collision with root package name */
    public int f212232q;

    /* renamed from: r, reason: collision with root package name */
    public v51.e f212233r;

    public CustomTimePickerNew(android.content.Context context) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve));
        this.f212222d = null;
        this.f212225g = -1;
        this.f212226h = -1;
        this.f212227i = -1;
        this.f212228m = -1;
        this.f212229n = -1;
        this.f212230o = -1;
        this.f212224f = context;
        this.f212223e = new w51.g(context);
    }

    public android.view.View getView() {
        if (this.f212222d == null) {
            this.f212222d = this.f212223e.d();
        }
        return this.f212222d;
    }

    public void setOnTimeSelectListener(v51.f fVar) {
    }

    public void setTimeSelectChangeListener(v51.e eVar) {
        this.f212233r = eVar;
    }

    public CustomTimePickerNew(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(new android.view.ContextThemeWrapper(context, com.tencent.mm.R.style.f494756ve), attributeSet);
        this.f212222d = null;
        this.f212225g = -1;
        this.f212226h = -1;
        this.f212227i = -1;
        this.f212228m = -1;
        this.f212229n = -1;
        this.f212230o = -1;
        this.f212224f = context;
        this.f212223e = new w51.g(context);
    }

    public CustomTimePickerNew(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f212222d = null;
        this.f212225g = -1;
        this.f212226h = -1;
        this.f212227i = -1;
        this.f212228m = -1;
        this.f212229n = -1;
        this.f212230o = -1;
        this.f212224f = context;
        this.f212223e = new w51.g(context);
    }
}
