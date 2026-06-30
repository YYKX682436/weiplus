package kz0;

/* loaded from: classes14.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f313790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f313791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f313792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var, float f17, int i17) {
        super(2);
        this.f313790d = m7Var;
        this.f313791e = f17;
        this.f313792f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f313792f | 1;
        kz0.k1.d(this.f313790d, this.f313791e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
