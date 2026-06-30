package f0;

/* loaded from: classes5.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.k1 f258070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0.y1 f258071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(f0.k1 k1Var, f0.y1 y1Var) {
        super(1);
        this.f258070d = k1Var;
        this.f258071e = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f0.i1 b17 = this.f258070d.b(((f0.i2) obj).f258118a);
        java.util.List list = b17.f258117b;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        int i17 = b17.f258116a;
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            int i27 = (int) ((f0.d) list.get(i19)).f258040a;
            arrayList.add(new jz5.l(java.lang.Integer.valueOf(i17), ((f0.x1) this.f258071e.f258280g).invoke(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i27))));
            i17++;
            i18 += i27;
        }
        return arrayList;
    }
}
