package tn0;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420755d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tn0.w0 w0Var) {
        super(2);
        this.f420755d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        tn0.w0 w0Var = this.f420755d;
        w0Var.f420771r.i(intValue, intValue2);
        w0Var.f420771r.c();
        return null;
    }
}
