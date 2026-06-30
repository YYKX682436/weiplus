package p1;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f350817a;

    /* renamed from: b, reason: collision with root package name */
    public final p1.v f350818b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350819c;

    public g(java.util.Map changes, p1.v pointerInputEvent) {
        kotlin.jvm.internal.o.g(changes, "changes");
        kotlin.jvm.internal.o.g(pointerInputEvent, "pointerInputEvent");
        this.f350817a = changes;
        this.f350818b = pointerInputEvent;
    }

    public final boolean a(long j17) {
        java.lang.Object obj;
        java.util.List list = this.f350818b.f350903a;
        int size = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i17);
            if (p1.r.a(((p1.w) obj).f350909a, j17)) {
                break;
            }
            i17++;
        }
        p1.w wVar = (p1.w) obj;
        if (wVar != null) {
            return wVar.f350915g;
        }
        return false;
    }
}
