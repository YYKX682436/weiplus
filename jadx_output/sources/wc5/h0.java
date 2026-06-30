package wc5;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f444575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.HashSet hashSet) {
        super(1);
        this.f444575d = hashSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        uc5.l0 row = (uc5.l0) obj;
        kotlin.jvm.internal.o.g(row, "row");
        return java.lang.Boolean.valueOf(this.f444575d.contains(row.v()));
    }
}
