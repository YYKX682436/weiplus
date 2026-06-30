package com.tencent.mm.sdk.observer;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0096\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0017¨\u0006\u000b"}, d2 = {"com/tencent/mm/sdk/observer/MvvmObserverOwner$LifecycleBoundObserver", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onLifecycleDestroy", "Landroidx/lifecycle/y;", "owner", "observer", "", "threadTag", "<init>", "(Le75/g;Landroidx/lifecycle/y;Le75/a;Ljava/lang/String;)V", "wechat-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public class MvvmObserverOwner$LifecycleBoundObserver implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f192405d;

    /* renamed from: e, reason: collision with root package name */
    public final e75.a f192406e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f192407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e75.g f192408g;

    public MvvmObserverOwner$LifecycleBoundObserver(e75.g gVar, androidx.lifecycle.y owner, e75.a observer, java.lang.String str) {
        kotlin.jvm.internal.o.g(owner, "owner");
        kotlin.jvm.internal.o.g(observer, "observer");
        this.f192408g = gVar;
        this.f192405d = owner;
        this.f192406e = observer;
        this.f192407f = str;
    }

    public final void a(java.util.List eventList) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(eventList, "eventList");
        if (b()) {
            java.lang.String str = this.f192407f;
            if (str != null) {
                e75.g gVar = this.f192408g;
                if (kotlin.jvm.internal.o.b(str, e75.g.MainThread)) {
                    d75.b.g(new e75.e(this, eventList));
                    obj = jz5.f0.f302826a;
                } else {
                    ku5.u0 u0Var = ku5.t0.f312615d;
                    e75.f fVar = new e75.f(this, eventList, gVar);
                    ku5.t0 t0Var = (ku5.t0) u0Var;
                    t0Var.getClass();
                    obj = t0Var.l(fVar, 0L, str);
                }
            } else {
                obj = null;
            }
            if (obj == null) {
                java.util.Iterator it = eventList.iterator();
                while (it.hasNext()) {
                    this.f192406e.onChanged(it.next());
                }
            }
        }
    }

    public final boolean b() {
        return this.f192405d.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED;
    }

    public int hashCode() {
        return this.f192406e.hashCode();
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onLifecycleDestroy() {
        e75.g gVar = this.f192408g;
        gVar.getLogTag();
        this.f192405d.hashCode();
        e75.a aVar = this.f192406e;
        aVar.hashCode();
        gVar.removeObserver(aVar);
    }

    public /* synthetic */ MvvmObserverOwner$LifecycleBoundObserver(e75.g gVar, androidx.lifecycle.y yVar, e75.a aVar, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(gVar, yVar, aVar, (i17 & 4) != 0 ? null : str);
    }
}
