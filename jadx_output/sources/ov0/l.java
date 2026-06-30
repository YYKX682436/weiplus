package ov0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.t f349139d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ov0.t tVar) {
        super(1);
        this.f349139d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        this.f349139d.getContentContainer().setTranslationY(-(r0.getPanelTransparentHeight() * floatValue));
        return jz5.f0.f302826a;
    }
}
