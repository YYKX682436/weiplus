package sa1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f405285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f405286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f405287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f405288g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sa1.i f405289h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f405290i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f405291m;

    public h(int i17, int i18, int i19, int i27, sa1.i iVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView, int i28) {
        this.f405285d = i17;
        this.f405286e = i18;
        this.f405287f = i19;
        this.f405288g = i27;
        this.f405289h = iVar;
        this.f405290i = magicBrushView;
        this.f405291m = i28;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(this.f405285d, this.f405286e);
        layoutParams.setMargins(this.f405287f, this.f405288g, 0, 0);
        sa1.i iVar = this.f405289h;
        hh.g gVar = iVar.f405293f;
        android.widget.FrameLayout frameLayout = iVar.f405292e;
        kotlin.jvm.internal.o.d(frameLayout);
        int i17 = this.f405291m;
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f405290i;
        int a17 = gVar.a(frameLayout, magicBrushView, i17);
        if (a17 == -2) {
            magicBrushView.setLayoutParams(layoutParams);
            magicBrushView.requestLayout();
        } else {
            android.widget.FrameLayout frameLayout2 = iVar.f405292e;
            kotlin.jvm.internal.o.d(frameLayout2);
            frameLayout2.removeView(magicBrushView);
            android.widget.FrameLayout frameLayout3 = iVar.f405292e;
            kotlin.jvm.internal.o.d(frameLayout3);
            frameLayout3.addView(magicBrushView, a17, layoutParams);
        }
        magicBrushView.setOpaque(false);
    }
}
