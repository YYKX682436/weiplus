package r16;

/* loaded from: classes13.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o06.b f368653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o06.b f368654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o06.b bVar, o06.b bVar2) {
        super(2);
        this.f368653d = bVar;
        this.f368654e = bVar2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b((o06.m) obj, this.f368653d) && kotlin.jvm.internal.o.b((o06.m) obj2, this.f368654e));
    }
}
