package yj3;

/* loaded from: classes14.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj3.g f462671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yj3.g gVar) {
        super(0);
        this.f462671d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yj3.g gVar = this.f462671d;
        ((is0.c) ((jz5.n) gVar.f462686l).getValue()).close();
        os0.c cVar = gVar.f462680f;
        if (cVar != null) {
            cVar.n();
        }
        rs0.h hVar = gVar.f462684j;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        return jz5.f0.f302826a;
    }
}
