package wr;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.j f448738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(wr.j jVar, java.lang.String str) {
        super(0);
        this.f448738d = jVar;
        this.f448739e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.p pVar;
        wr.j jVar = this.f448738d;
        wr.c cVar = jVar.f448752c;
        if (cVar != null && (pVar = cVar.f448735c) != null) {
            pVar.invoke(cVar.f448733a, this.f448739e);
        }
        jVar.f448751b = false;
        wr.j.a(jVar);
        return jz5.f0.f302826a;
    }
}
