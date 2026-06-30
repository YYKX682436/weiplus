package mm2;

/* loaded from: classes3.dex */
public final class w6 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f329518f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f329519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329518f = new java.util.LinkedList();
    }

    public final java.lang.Object N6(kotlin.coroutines.Continuation continuation) {
        java.lang.Object f17;
        com.tencent.mars.xlog.Log.i("LiveToastManagerSlice", "runState isStateDoing: " + this.f329519g);
        boolean z17 = this.f329519g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        return (!z17 && (f17 = kotlinx.coroutines.z0.f(new mm2.v6(this, null), continuation)) == pz5.a.f359186d) ? f17 : f0Var;
    }
}
