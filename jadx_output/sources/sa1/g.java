package sa1;

/* loaded from: classes7.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sa1.i f405283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f405284e;

    public g(sa1.i iVar, com.tencent.magicbrush.ui.MagicBrushView magicBrushView) {
        this.f405283d = iVar;
        this.f405284e = magicBrushView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sa1.i iVar = this.f405283d;
        hh.g gVar = iVar.f405293f;
        gVar.getClass();
        com.tencent.magicbrush.ui.MagicBrushView view = this.f405284e;
        kotlin.jvm.internal.o.g(view, "view");
        gVar.f281441a.remove(view);
        android.widget.FrameLayout frameLayout = iVar.f405292e;
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.removeView(view);
    }
}
