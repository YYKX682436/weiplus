package q01;

/* loaded from: classes12.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f359335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f359336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j17, java.util.LinkedList linkedList) {
        super(1);
        this.f359335d = j17;
        this.f359336e = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (this.f359335d - ((q01.s0) it.getValue()).f359331c < 600000) {
            return java.lang.Boolean.FALSE;
        }
        this.f359336e.add(it.getValue());
        return java.lang.Boolean.TRUE;
    }
}
