package tn0;

/* loaded from: classes3.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f420749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(tn0.w0 w0Var) {
        super(2);
        this.f420749d = w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        this.f420749d.f420771r.i(intValue, intValue2);
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        boolean z17 = intValue < intValue2;
        ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
        dk2.ef.f233372a.d0(0, 0, z17, false);
        return jz5.f0.f302826a;
    }
}
