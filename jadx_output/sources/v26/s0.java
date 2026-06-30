package v26;

/* loaded from: classes14.dex */
public final class s0 extends kotlinx.coroutines.flow.q2 implements kotlinx.coroutines.flow.f3 {
    public s0(int i17) {
        super(1, Integer.MAX_VALUE, u26.u.DROP_OLDEST);
        e(java.lang.Integer.valueOf(i17));
    }

    @Override // kotlinx.coroutines.flow.f3
    public java.lang.Object getValue() {
        java.lang.Integer valueOf;
        synchronized (this) {
            java.lang.Object[] objArr = this.f310375n;
            kotlin.jvm.internal.o.d(objArr);
            valueOf = java.lang.Integer.valueOf(((java.lang.Number) objArr[((int) ((this.f310376o + ((int) ((p() + this.f310378q) - this.f310376o))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }
}
