package k23;

/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.p2 f303647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(k23.p2 p2Var) {
        super(0);
        this.f303647d = p2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List i17 = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.v_6), java.lang.Integer.valueOf(com.tencent.mm.R.id.v_5), java.lang.Integer.valueOf(com.tencent.mm.R.id.v_7), java.lang.Integer.valueOf(com.tencent.mm.R.id.v_4), java.lang.Integer.valueOf(com.tencent.mm.R.id.v_r));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(i17, 10));
        java.util.Iterator it = i17.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f303647d.findViewById(((java.lang.Number) it.next()).intValue()));
        }
        return arrayList;
    }
}
