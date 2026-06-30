package com.tencent.mm.plugin.finder.ui;

@db5.a(16)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderCropAvatarUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderCropAvatarUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int H = 0;
    public android.app.Dialog F;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f128556u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f128557v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout f128558w;

    /* renamed from: z, reason: collision with root package name */
    public int f128561z;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f128555t = "Finder.FinderCropAvatarUI";

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f128559x = jz5.h.b(new com.tencent.mm.plugin.finder.ui.k4(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f128560y = jz5.h.b(new com.tencent.mm.plugin.finder.ui.l4(this));
    public final double A = 1.7777777777777777d;
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.finder.ui.y4(this));
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.ui.x4(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.ui.m4(this));
    public final jz5.g E = jz5.h.b(new com.tencent.mm.plugin.finder.ui.j4(this));
    public final java.lang.Runnable G = new com.tencent.mm.plugin.finder.ui.w4(this);

    public final android.graphics.RectF c7() {
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(getContext());
        float dimension = h17.x - getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
        float f17 = (h17.y - dimension) / 2;
        return new android.graphics.RectF(getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz), f17, getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz) + dimension, dimension + f17);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.afw;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        float f17;
        float f18;
        float f19;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f486712m81);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = (com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout) findViewById;
        this.f128558w = wxMediaCropLayout;
        wxMediaCropLayout.setShowBorder(false);
        jz5.g gVar = this.f128559x;
        if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 0) {
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout2 = this.f128558w;
            if (wxMediaCropLayout2 == null) {
                kotlin.jvm.internal.o.o("roundCropLayout");
                throw null;
            }
            wxMediaCropLayout2.f(c7(), ru3.o.f399763d);
        } else if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 1) {
            if (((java.lang.Number) ((jz5.n) this.f128560y).getValue()).intValue() == 1) {
                com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout3 = this.f128558w;
                if (wxMediaCropLayout3 == null) {
                    kotlin.jvm.internal.o.o("roundCropLayout");
                    throw null;
                }
                float dimension = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
                float dimension2 = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
                float f27 = 2;
                float f28 = getContext().getResources().getDisplayMetrics().heightPixels / f27;
                float f29 = getContext().getResources().getDisplayMetrics().widthPixels - (f27 * dimension);
                float f37 = ((float) (this.A / 2)) * f29;
                if (f28 >= f37 + dimension2) {
                    dimension2 = f28 - f37;
                    f19 = f28 + f37;
                } else {
                    f19 = getContext().getResources().getDisplayMetrics().heightPixels - dimension2;
                }
                wxMediaCropLayout3.f(new android.graphics.RectF(dimension, dimension2, f29 + dimension, f19), ru3.o.f399765f);
            } else {
                com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout4 = this.f128558w;
                if (wxMediaCropLayout4 == null) {
                    kotlin.jvm.internal.o.o("roundCropLayout");
                    throw null;
                }
                wxMediaCropLayout4.f(c7(), ru3.o.f399765f);
            }
        } else if (((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() == 2) {
            float dimension3 = getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout5 = this.f128558w;
            if (wxMediaCropLayout5 == null) {
                kotlin.jvm.internal.o.o("roundCropLayout");
                throw null;
            }
            float f38 = 2;
            float c17 = r4.c(null) - (f38 * dimension3);
            float f39 = (1.0f * c17) / f38;
            float a17 = com.tencent.mm.plugin.finder.assist.e8.f102131a.a() / 2;
            if (f39 + dimension3 > a17) {
                f18 = (r4 * 2) - dimension3;
                f17 = dimension3;
            } else {
                f17 = a17 - f39;
                f18 = f39 + a17;
            }
            wxMediaCropLayout5.f(new android.graphics.RectF(dimension3, f17, c17 + dimension3, f18), ru3.o.f399765f);
        } else {
            com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout6 = this.f128558w;
            if (wxMediaCropLayout6 == null) {
                kotlin.jvm.internal.o.o("roundCropLayout");
                throw null;
            }
            wxMediaCropLayout6.f(c7(), ru3.o.f399764e);
        }
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout7 = this.f128558w;
        if (wxMediaCropLayout7 == null) {
            kotlin.jvm.internal.o.o("roundCropLayout");
            throw null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = this.f128556u;
        kotlin.jvm.internal.o.d(str);
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout.g(wxMediaCropLayout7, currentTimeMillis, str, true, null, null, 24, null);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setFlags(201327616, 201327616);
        setLightNavigationbarIcon();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.cmu);
        findViewById.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(getContext()));
        findViewById.post(new com.tencent.mm.plugin.finder.ui.n4(findViewById, this));
        setActionbarColor(com.tencent.mm.R.color.a9e);
        this.f128556u = getIntent().getStringExtra("key_source_img_path");
        this.f128557v = getIntent().getStringExtra("key_result_file_name");
        this.f128561z = getIntent().getIntExtra("key_crop_source", 0);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.BW_0));
        initView();
        jz5.g gVar = this.D;
        android.widget.Button button = (android.widget.Button) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(button, "<get-finishBtn>(...)");
        com.tencent.mm.ui.fk.a(button);
        ((android.widget.Button) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.ui.q4(this));
        setBackBtn(new com.tencent.mm.plugin.finder.ui.r4(this));
        ((android.view.View) ((jz5.n) this.C).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.ui.s4(this));
        jz5.g gVar2 = this.E;
        android.widget.Button button2 = (android.widget.Button) ((jz5.n) gVar2).getValue();
        kotlin.jvm.internal.o.f(button2, "<get-cancelBtn>(...)");
        com.tencent.mm.ui.fk.a(button2);
        ((android.widget.Button) ((jz5.n) gVar2).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.ui.t4(this));
        ((android.view.View) ((jz5.n) this.B).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.ui.u4(this));
    }
}
