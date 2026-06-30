package hf2;

/* loaded from: classes10.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.l2 f281067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f281068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(hf2.l2 l2Var, android.graphics.Bitmap bitmap) {
        super(0);
        this.f281067d = l2Var;
        this.f281068e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        hf2.l2 l2Var = this.f281067d;
        hf2.b2 h76 = l2Var.f281104a.h7();
        hf2.x xVar = l2Var.f281104a;
        r45.ei0 ei0Var = xVar.f281185q;
        float f17 = (ei0Var == null || (linkedList = ei0Var.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? 1.0f : ji0Var.f377827i;
        android.graphics.Bitmap bitmap = this.f281068e;
        h76.d("select_editor", bitmap, f17);
        xVar.f7().c("select_editor", bitmap);
        return jz5.f0.f302826a;
    }
}
