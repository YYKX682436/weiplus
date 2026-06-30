package mg3;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer f326231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer) {
        super(1);
        this.f326231d = previewGestureContainer;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.postTranslate(0.0f, 0.0f);
        com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer previewGestureContainer = this.f326231d;
        mg3.l scaleConfig = previewGestureContainer.getScaleConfig();
        if (scaleConfig != null) {
            previewGestureContainer.setMinScaleValue(scaleConfig.f326244b);
            previewGestureContainer.setMaxScaleValue(scaleConfig.f326245c);
        }
        return java.lang.Boolean.TRUE;
    }
}
