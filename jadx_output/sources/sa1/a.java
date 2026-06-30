package sa1;

/* loaded from: classes7.dex */
public abstract class a implements yg.b0 {

    /* renamed from: d, reason: collision with root package name */
    public final ae.a f405259d;

    public a(ae.a logicImpl) {
        kotlin.jvm.internal.o.g(logicImpl, "logicImpl");
        this.f405259d = logicImpl;
    }

    @Override // yg.b0
    public void M(com.tencent.magicbrush.ui.MagicBrushView view, float[] left, float[] top, float[] width, float[] height) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(top, "top");
        kotlin.jvm.internal.o.g(width, "width");
        kotlin.jvm.internal.o.g(height, "height");
    }

    @Override // yg.b0
    public com.tencent.magicbrush.ui.MagicBrushView Z() {
        ae.a aVar = this.f405259d;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) aVar.F();
        android.content.Context f147807d = yVar != null ? yVar.getF147807d() : null;
        kotlin.jvm.internal.o.d(f147807d);
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = new com.tencent.magicbrush.ui.MagicBrushView(f147807d, gh.y.TextureView);
        magicBrushView.setContentDescription("ScreenCanvasMagicBrushView");
        magicBrushView.setMagicBrush(aVar.w());
        magicBrushView.setUseRawAxisTouchEvent(true);
        return magicBrushView;
    }
}
