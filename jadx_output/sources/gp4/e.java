package gp4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f274399d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ju3.d0 d0Var) {
        super(1);
        this.f274399d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wu3.h it = (wu3.h) obj;
        kotlin.jvm.internal.o.g(it, "it");
        r45.is currentCaption = it.getCurrentCaption();
        if (currentCaption != null) {
            it.setVisibility(4);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("PARAM_1_BYTEARRAY", currentCaption.toByteArray());
            this.f274399d.w(ju3.c0.f301904t2, bundle);
        }
        return jz5.f0.f302826a;
    }
}
