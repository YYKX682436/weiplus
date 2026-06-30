package kq3;

/* loaded from: classes12.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f311278a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public kq3.k f311279b = new kq3.k(this, "Priority.PriorityTaskRunner");

    public void a(tq3.a aVar) {
        kq3.k kVar = this.f311279b;
        if (kVar != null) {
            this.f311279b.sendMessage(kVar.obtainMessage(1, aVar));
        }
    }
}
