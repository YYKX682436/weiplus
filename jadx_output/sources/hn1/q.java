package hn1;

/* loaded from: classes11.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn1.s f282475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282477f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282478g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hn1.s sVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f282475d = sVar;
        this.f282476e = str;
        this.f282477f = str2;
        this.f282478g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.Iterator it = ((java.util.LinkedList) ((jz5.n) this.f282475d.f282486h).getValue()).iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (it.hasNext()) {
            hn1.z zVar = (hn1.z) ((d75.c) it.next()).get();
            if (zVar == null) {
                it.remove();
            } else {
                zVar.b(this.f282476e, this.f282477f, this.f282478g);
            }
        }
        return jz5.f0.f302826a;
    }
}
