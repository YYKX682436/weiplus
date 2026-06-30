package li1;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f318754a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f318755b = new java.util.ArrayList();

    public final void a() {
        this.f318754a = true;
        java.util.ArrayList arrayList = this.f318755b;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        arrayList.clear();
    }
}
