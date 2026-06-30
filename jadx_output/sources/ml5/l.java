package ml5;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.CropLayout f328435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.ui.widget.cropview.CropLayout cropLayout) {
        super(0);
        this.f328435d = cropLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.cropview.CropLayout cropLayout = this.f328435d;
        cropLayout.getContentRectF().round(cropLayout.getContentCenterRect());
        return jz5.f0.f302826a;
    }
}
