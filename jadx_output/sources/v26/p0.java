package v26;

/* loaded from: classes14.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v26.m0 f433041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(v26.m0 m0Var) {
        super(2);
        this.f433041d = m0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        oz5.i iVar = (oz5.i) obj2;
        oz5.j key = iVar.getKey();
        oz5.i iVar2 = this.f433041d.f433030e.get(key);
        int i17 = kotlinx.coroutines.r2.O0;
        if (key != kotlinx.coroutines.q2.f310571d) {
            return java.lang.Integer.valueOf(iVar != iVar2 ? Integer.MIN_VALUE : intValue + 1);
        }
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) iVar2;
        kotlinx.coroutines.r2 r2Var2 = (kotlinx.coroutines.r2) iVar;
        while (true) {
            if (r2Var2 != null) {
                if (r2Var2 == r2Var || !(r2Var2 instanceof kotlinx.coroutines.internal.h0)) {
                    break;
                }
                kotlinx.coroutines.w O = ((kotlinx.coroutines.internal.h0) r2Var2).O();
                r2Var2 = O != null ? O.getParent() : null;
            } else {
                r2Var2 = null;
                break;
            }
        }
        if (r2Var2 == r2Var) {
            if (r2Var != null) {
                intValue++;
            }
            return java.lang.Integer.valueOf(intValue);
        }
        throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + r2Var2 + ", expected child of " + r2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
