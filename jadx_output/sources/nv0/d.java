package nv0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f340427a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final kz5.q f340428b = new kz5.q();

    public final void a(nv0.f change) {
        kotlin.jvm.internal.o.g(change, "change");
        java.util.ArrayList arrayList = this.f340427a;
        if (arrayList.contains(change)) {
            return;
        }
        arrayList.add(change);
    }
}
