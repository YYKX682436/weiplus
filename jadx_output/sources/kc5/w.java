package kc5;

/* loaded from: classes9.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc5.x f306587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(kc5.x xVar) {
        super(1);
        this.f306587d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r26.m m17 = (r26.m) obj;
        kotlin.jvm.internal.o.g(m17, "m");
        java.lang.String c17 = ((r26.q) m17).c();
        r26.t tVar = this.f306587d.f306589e;
        tVar.getClass();
        java.lang.String replaceAll = tVar.f368917d.matcher(c17).replaceAll("\n");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }
}
