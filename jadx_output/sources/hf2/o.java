package hf2;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f281128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hf2.x xVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f281127d = xVar;
        this.f281128e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList;
        r45.ji0 ji0Var;
        hf2.x xVar = this.f281127d;
        hf2.b2 h76 = xVar.h7();
        r45.ei0 ei0Var = xVar.f281185q;
        float f17 = (ei0Var == null || (linkedList = ei0Var.f373529d) == null || (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) == null) ? 1.0f : ji0Var.f377827i;
        android.graphics.Bitmap bitmap = this.f281128e;
        h76.d("setTextBitmap", bitmap, f17);
        xVar.f7().c("setTextBitmap", bitmap);
        return jz5.f0.f302826a;
    }
}
