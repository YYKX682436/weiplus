package oj5;

/* loaded from: classes14.dex */
public final class i extends oj5.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oj5.o f345853b;

    public i(oj5.o oVar) {
        this.f345853b = oVar;
    }

    @Override // oj5.b
    public void a(androidx.recyclerview.widget.f2 adapter) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        java.util.HashMap hashMap = oj5.r.f345877h;
        java.util.HashMap hashMap2 = oj5.r.f345877h;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(adapter.hashCode());
        oj5.o oVar = this.f345853b;
        hashMap2.put(valueOf, oVar.f345862a);
        adapter.registerAdapterDataObserver(oVar.f345871j);
        if (oVar.f345866e) {
            if (!(adapter instanceof com.tencent.mm.ui.recyclerview.SynchronizedAdapter)) {
                throw new java.lang.RuntimeException("If you select isSerialOnBind=true, your adapter need extend of SynchronizedAdapter.");
            }
            ((com.tencent.mm.ui.recyclerview.SynchronizedAdapter) adapter).setEnableSynchronized(true);
        }
        oj5.o.a(oVar);
        oj5.o.b(this.f345853b, false, "setAdapter", 0L, 4, null);
    }
}
