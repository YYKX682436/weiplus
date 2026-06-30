package xt2;

/* loaded from: classes.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f457087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f457088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f457089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f457090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(kotlinx.coroutines.r2 r2Var, kotlin.jvm.internal.h0 h0Var, yz5.p pVar, boolean z17) {
        super(3);
        this.f457087d = r2Var;
        this.f457088e = h0Var;
        this.f457089f = pVar;
        this.f457090g = z17;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g((r45.o12) obj3, "<anonymous parameter 2>");
        kotlinx.coroutines.p2.a(this.f457087d, null, 1, null);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f457088e.f310123d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f457089f.invoke(java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(this.f457090g));
        return jz5.f0.f302826a;
    }
}
