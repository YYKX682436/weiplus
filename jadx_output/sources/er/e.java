package er;

/* loaded from: classes12.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er.f f255928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f255929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(er.f fVar, boolean z17) {
        super(0);
        this.f255928d = fVar;
        this.f255929e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "thread pool, " + this.f255928d.f255930f.getMd5());
        java.util.LinkedList<dr.s> linkedList = new java.util.LinkedList();
        java.util.List list = this.f255928d.f255937p;
        kotlin.jvm.internal.o.f(list, "access$getRequests$p(...)");
        er.f fVar = this.f255928d;
        synchronized (list) {
            linkedList.addAll(fVar.f255937p);
            fVar.f255937p.clear();
        }
        boolean z17 = this.f255929e;
        for (dr.s sVar : linkedList) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IEmojiLoadTask", "fotEach onLoad " + sVar.f242400a.getMd5());
            sVar.c(z17);
        }
        return jz5.f0.f302826a;
    }
}
