package q01;

/* loaded from: classes12.dex */
public final class j implements q01.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f359295d;

    public j(com.tencent.mm.modelbase.u0 onSceneEnd) {
        kotlin.jvm.internal.o.g(onSceneEnd, "onSceneEnd");
        this.f359295d = onSceneEnd;
    }

    public int hashCode() {
        return this.f359295d.hashCode();
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        q01.g event = (q01.g) obj;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f359279a == q01.f.f359276e) {
            this.f359295d.onSceneEnd(event.f359280b, event.f359281c, event.f359282d, event.f359283e);
        }
    }
}
