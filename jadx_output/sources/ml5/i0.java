package ml5;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.cropview.RoundCropLayout f328428e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(java.lang.String str, com.tencent.mm.ui.widget.cropview.RoundCropLayout roundCropLayout) {
        super(0);
        this.f328427d = str;
        this.f328428e = roundCropLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f328427d, null);
        if (J2 != null) {
            com.tencent.mm.ui.widget.cropview.RoundCropLayout roundCropLayout = this.f328428e;
            roundCropLayout.post(new ml5.h0(roundCropLayout, J2));
        }
        return jz5.f0.f302826a;
    }
}
