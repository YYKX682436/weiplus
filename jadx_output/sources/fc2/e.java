package fc2;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final fc2.c f260942a;

    public e(fc2.c cVar) {
        this.f260942a = cVar;
    }

    public void a(fc2.a event) {
        kotlin.jvm.internal.o.g(event, "event");
        fc2.c cVar = this.f260942a;
        if (cVar != null) {
            cVar.b(event);
        }
    }
}
