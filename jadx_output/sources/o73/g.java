package o73;

/* loaded from: classes8.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o73.j f343546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343547e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(o73.j jVar, java.lang.String str) {
        super(0);
        this.f343546d = jVar;
        this.f343547e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        o73.b Y6 = o73.j.Y6(this.f343546d, this.f343547e);
        if (Y6 != null) {
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(this.f343546d, Y6, false, false, 6, null);
            o73.f fVar = this.f343546d.f343555n;
            java.lang.String userName = this.f343547e;
            fVar.getClass();
            kotlin.jvm.internal.o.g(userName, "userName");
            synchronized (fVar.f343545a) {
                java.util.Iterator it = fVar.f343545a.iterator();
                kotlin.jvm.internal.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    if (kotlin.jvm.internal.o.b(((o73.b) next).field_UserName, userName)) {
                        it.remove();
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
