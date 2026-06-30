package oa1;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.plugin.appbrand.widget.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f343808a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageButton f343809b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageButton f343810c;

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public int a() {
        return com.tencent.mm.R.id.hbt;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(onWidgetCreated, "onWidgetCreated");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        layoutParams.leftMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        return layoutParams;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f23do, (android.view.ViewGroup) null);
        this.f343809b = (android.widget.ImageButton) inflate.findViewById(com.tencent.mm.R.id.ham);
        this.f343810c = (android.widget.ImageButton) inflate.findViewById(com.tencent.mm.R.id.hqb);
        this.f343808a = inflate;
        return inflate;
    }

    public final void e(com.tencent.mm.plugin.appbrand.o6 runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        android.widget.ImageButton imageButton = this.f343809b;
        if (imageButton != null) {
            imageButton.setOnClickListener(new oa1.b(runtime));
        }
        android.widget.ImageButton imageButton2 = this.f343810c;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new oa1.c(runtime));
        }
    }
}
