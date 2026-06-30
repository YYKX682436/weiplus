package nu4;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentLinkedDeque f340287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(nu4.b0 b0Var, java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque, java.lang.String str) {
        super(1);
        this.f340286d = b0Var;
        this.f340287e = concurrentLinkedDeque;
        this.f340288f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        nu4.b0 b0Var = this.f340286d;
        java.lang.String str = b0Var.C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke create done, drain queue size=");
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f340287e;
        sb6.append(concurrentLinkedDeque.size());
        sb6.append(": id=");
        java.lang.String str2 = this.f340288f;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        b0Var.I.remove(str2);
        java.util.Iterator it = concurrentLinkedDeque.iterator();
        while (it.hasNext()) {
            ((yz5.a) it.next()).invoke();
        }
        return jz5.f0.f302826a;
    }
}
