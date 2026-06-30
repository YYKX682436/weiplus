package ir2;

/* loaded from: classes2.dex */
public abstract class p extends ir2.e1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.List feeds) {
        super(feeds, false);
        kotlin.jvm.internal.o.g(feeds, "feeds");
    }

    @Override // ir2.e1
    public ym5.s3 a() {
        return new ym5.s3(0);
    }

    @Override // ir2.e1
    public void b(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        ((ir2.d) ((jz5.n) this.f294131c).getValue()).a(dataList, this.f294129a);
    }

    @Override // ir2.e1
    public int c() {
        return 1;
    }
}
