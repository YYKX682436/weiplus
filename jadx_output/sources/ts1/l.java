package ts1;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ts1.o f421585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ts1.o oVar) {
        super(0);
        this.f421585d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ts1.o oVar = this.f421585d;
        java.lang.String str = oVar.f421598k;
        if (str != null) {
            return str;
        }
        r45.o97 a17 = ts1.o.a(oVar);
        java.lang.String str2 = a17 != null ? a17.f382070w : null;
        return str2 == null ? "" : str2;
    }
}
