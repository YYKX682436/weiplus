package com.tencent.mm.plugin.recordvideo.plugin.filter;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0014B\u0019\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0086D¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000204038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010@\u001a\u0002048\u0006X\u0086D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006G"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin;", "Landroid/widget/RelativeLayout;", "Lyt3/r2;", "Lju3/d0;", "status", "Ljz5/f0;", "setStatus", "Landroid/graphics/Bitmap;", "bitmap", "setPreImage", "", "visibility", "setVisibility", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "", "Lcu3/d;", "f", "Ljava/util/List;", "getItemViews", "()Ljava/util/List;", "itemViews", "Landroid/view/ViewGroup;", "g", "Landroid/view/ViewGroup;", "getSeekBarLayout", "()Landroid/view/ViewGroup;", "seekBarLayout", "Landroid/widget/SeekBar;", "h", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getProgressDescTv", "()Landroid/widget/TextView;", "progressDescTv", "m", "I", "getLastSelectedIndex", "()I", "setLastSelectedIndex", "(I)V", "lastSelectedIndex", "", "", "n", "Ljava/util/Map;", "getWeightMap", "()Ljava/util/Map;", "setWeightMap", "(Ljava/util/Map;)V", "weightMap", "o", "F", "getDefaultWeight", "()F", "defaultWeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class PhotoFilterPlugin extends android.widget.RelativeLayout implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public ju3.d0 f155746e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final java.util.List itemViews;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.view.ViewGroup seekBarLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final android.widget.SeekBar seekBar;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView progressDescTv;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int lastSelectedIndex;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public java.util.Map weightMap;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final float defaultWeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoFilterPlugin(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.PhotoFilterPlugin";
        this.itemViews = new java.util.ArrayList();
        this.weightMap = new java.util.LinkedHashMap();
        this.defaultWeight = 0.8f;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c9p, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mhq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.seekBarLayout = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.e4v);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) findViewById2;
        this.seekBar = seekBar;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.e4w);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.progressDescTv = (android.widget.TextView) findViewById3;
        cu3.e eVar = new cu3.e(this);
        seekBar.setOnSeekBarChangeListener(new cu3.b(this));
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.kv7);
        oj0.c cVar = oj0.c.f345726a;
        for (oj0.a aVar : oj0.c.f345727b) {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c9o, (android.view.ViewGroup) linearLayout, false);
            linearLayout.addView(inflate);
            java.util.List list = this.itemViews;
            kotlin.jvm.internal.o.d(inflate);
            list.add(new cu3.d(inflate, aVar.f345721a, aVar.f345722b, eVar));
        }
    }

    public static final void a(com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin photoFilterPlugin, int i17, float f17) {
        photoFilterPlugin.getClass();
        com.tencent.mars.xlog.Log.i(photoFilterPlugin.TAG, "postFuncType " + i17 + ", " + f17);
        photoFilterPlugin.lastSelectedIndex = i17;
        photoFilterPlugin.weightMap.put(java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("EDIT_FILTER_INDEX_INT", i17);
        bundle.putFloat("EDIT_FILTER_COLOR_WEIGHT_FLOAT", f17);
        ju3.d0 d0Var = photoFilterPlugin.f155746e;
        if (d0Var != null) {
            d0Var.w(ju3.c0.X1, bundle);
        }
    }

    public final float getDefaultWeight() {
        return this.defaultWeight;
    }

    public final java.util.List<cu3.d> getItemViews() {
        return this.itemViews;
    }

    public final int getLastSelectedIndex() {
        return this.lastSelectedIndex;
    }

    public final android.widget.TextView getProgressDescTv() {
        return this.progressDescTv;
    }

    public final android.widget.SeekBar getSeekBar() {
        return this.seekBar;
    }

    public final android.view.ViewGroup getSeekBarLayout() {
        return this.seekBarLayout;
    }

    public final java.lang.String getTAG() {
        return this.TAG;
    }

    public final java.util.Map<java.lang.Integer, java.lang.Float> getWeightMap() {
        return this.weightMap;
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(8);
        return true;
    }

    public final void setLastSelectedIndex(int i17) {
        this.lastSelectedIndex = i17;
    }

    public final void setPreImage(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        ((ku5.t0) ku5.t0.f312615d).g(new cu3.g(this, bitmap));
    }

    public final void setStatus(ju3.d0 status) {
        kotlin.jvm.internal.o.g(status, "status");
        this.f155746e = status;
    }

    @Override // android.view.View, yt3.r2
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            ((cu3.d) ((java.util.ArrayList) this.itemViews).get(this.lastSelectedIndex)).a();
        }
    }

    public final void setWeightMap(java.util.Map<java.lang.Integer, java.lang.Float> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.weightMap = map;
    }
}
