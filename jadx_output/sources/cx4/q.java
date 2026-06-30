package cx4;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f224648a = new java.util.ArrayList();

    public final void a(cx4.p info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.util.ArrayList arrayList = this.f224648a;
        if (arrayList.size() > 0) {
            info.f224647d = info.f224645b - ((cx4.p) arrayList.get(arrayList.size() - 1)).f224645b;
        }
        arrayList.add(info);
    }
}
