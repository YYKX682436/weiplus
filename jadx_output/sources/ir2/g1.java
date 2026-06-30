package ir2;

/* loaded from: classes2.dex */
public final class g1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir2.p1 f294141d;

    public g1(ir2.p1 p1Var) {
        this.f294141d = p1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ir2.x event = (ir2.x) obj;
        ir2.p1 p1Var = this.f294141d;
        p1Var.f294210e.getClass();
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("Finder.LoaderEventMachine", "transfer event:" + event + " refreshEvent:null loadMoreEvent:null");
        com.tencent.mars.xlog.Log.i("Finder.DataMerger", "receive transferResult:" + event + " event:" + event);
        if (!(event instanceof ir2.r)) {
            ir2.p1.a(p1Var, event);
        } else if (((java.util.ArrayList) p1Var.f294206a.f294091d).isEmpty()) {
            ir2.p1.a(p1Var, event);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.DataMerger", "ignore firstScreen data!");
        }
        return jz5.f0.f302826a;
    }
}
