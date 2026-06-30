package cw2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f223780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(android.graphics.Matrix matrix) {
        super(1);
        this.f223780d = matrix;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.set(this.f223780d);
        return java.lang.Boolean.TRUE;
    }
}
