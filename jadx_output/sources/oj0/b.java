package oj0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f345724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f345725e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.Object obj, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f345724d = obj;
        this.f345725e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object obj2 = this.f345724d;
        kotlin.jvm.internal.h0 h0Var = this.f345725e;
        synchronized (obj2) {
            h0Var.f310123d = it;
            obj2.notifyAll();
        }
        return jz5.f0.f302826a;
    }
}
