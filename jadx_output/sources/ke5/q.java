package ke5;

/* loaded from: classes9.dex */
public final class q implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f307116a;

    public q(ld5.b model, java.util.List msgInfos) {
        kotlin.jvm.internal.o.g(model, "model");
        kotlin.jvm.internal.o.g(msgInfos, "msgInfos");
        this.f307116a = msgInfos;
    }

    @Override // he5.t
    public int a() {
        return this.f307116a.size();
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        if (list != null) {
            list.addAll(this.f307116a);
        }
        if (list != null) {
            list.size();
        }
        if (sVar != null) {
            ((hd5.f) sVar).a();
        }
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        java.util.Objects.toString(oVar);
        if (oVar != null) {
            oVar.next();
        }
    }

    @Override // he5.t
    public void close() {
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
