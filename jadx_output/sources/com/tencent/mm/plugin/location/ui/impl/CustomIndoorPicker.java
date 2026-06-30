package com.tencent.mm.plugin.location.ui.impl;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u001d\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/location/ui/impl/CustomIndoorPicker;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "visibility", "Ljz5/f0;", "setVisibility", "q2", "I", "getClickTimes", "()I", "setClickTimes", "(I)V", "clickTimes", "r2", "getShowTimes", "setShowTimes", "showTimes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/location/ui/impl/g", "com/tencent/mm/plugin/location/ui/impl/h", "com/tencent/mm/plugin/location/ui/impl/i", "plugin-map_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class CustomIndoorPicker extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: j2, reason: collision with root package name */
    public com.tencent.tencentmap.mapsdk.map.TencentMap f144693j2;

    /* renamed from: k2, reason: collision with root package name */
    public java.lang.String f144694k2;

    /* renamed from: l2, reason: collision with root package name */
    public java.lang.String f144695l2;

    /* renamed from: m2, reason: collision with root package name */
    public int f144696m2;

    /* renamed from: n2, reason: collision with root package name */
    public java.lang.String f144697n2;

    /* renamed from: o2, reason: collision with root package name */
    public java.lang.String f144698o2;

    /* renamed from: p2, reason: collision with root package name */
    public float f144699p2;

    /* renamed from: q2, reason: collision with root package name and from kotlin metadata */
    public int clickTimes;

    /* renamed from: r2, reason: collision with root package name and from kotlin metadata */
    public int showTimes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomIndoorPicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
    }

    public final void g1(com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap, com.tencent.mm.plugin.location.ui.impl.g gVar) {
        kotlin.jvm.internal.o.g(tencentMap, "tencentMap");
        this.f144693j2 = tencentMap;
        tencentMap.setOnIndoorStateChangeListener(new com.tencent.mm.plugin.location.ui.impl.m(this, tencentMap, gVar));
        tencentMap.setOnScaleViewChangedListener(new com.tencent.mm.plugin.location.ui.impl.n(this));
    }

    public final int getClickTimes() {
        return this.clickTimes;
    }

    public final int getShowTimes() {
        return this.showTimes;
    }

    public final void h1(java.lang.String str, java.lang.String str2) {
        com.tencent.tencentmap.mapsdk.map.TencentMap tencentMap;
        this.f144694k2 = str;
        this.f144695l2 = str2;
        if (this.f144696m2 == 1 && kotlin.jvm.internal.o.b(this.f144697n2, str) && (tencentMap = this.f144693j2) != null) {
            tencentMap.setIndoorFloor(this.f144694k2, this.f144695l2);
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(i65.a.b(getContext(), 200), Integer.MIN_VALUE));
    }

    public final void setClickTimes(int i17) {
        this.clickTimes = i17;
    }

    public final void setShowTimes(int i17) {
        this.showTimes = i17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            this.showTimes++;
        }
    }
}
