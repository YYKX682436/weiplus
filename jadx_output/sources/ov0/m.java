package ov0;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ov0.t f349140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ov0.t tVar) {
        super(0);
        this.f349140d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f349140d.getContentContainer().setTranslationY(-(r0.getPanelTransparentHeight() * 1.0f));
        return jz5.f0.f302826a;
    }
}
