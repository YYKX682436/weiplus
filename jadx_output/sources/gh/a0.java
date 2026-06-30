package gh;

/* loaded from: classes7.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.ui.MagicBrushView f271790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f271791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.magicbrush.ui.MagicBrushView magicBrushView, com.tencent.magicbrush.MagicBrush magicBrush) {
        super(0);
        this.f271790d = magicBrushView;
        this.f271791e = magicBrush;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = this.f271790d;
        gh.y viewType = magicBrushView.getViewType();
        gh.p pVar = com.tencent.magicbrush.ui.MagicBrushView.f48649r;
        android.content.Context context = magicBrushView.getContext();
        kotlin.jvm.internal.o.f(context, "context");
        magicBrushView.setRendererView(pVar.a(context, viewType));
        int virtualElementId = magicBrushView.getVirtualElementId();
        com.tencent.magicbrush.MagicBrush magicBrush = this.f271791e;
        magicBrushView.d(magicBrush, virtualElementId);
        magicBrush.f();
        return jz5.f0.f302826a;
    }
}
