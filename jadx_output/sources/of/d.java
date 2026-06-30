package of;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of.h f344825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(of.h hVar) {
        super(0);
        this.f344825d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<of.t> list = this.f344825d.f344828a;
        of.t tVar = new of.t("", 0L, 0L, "");
        long j17 = 0;
        for (of.t tVar2 : list) {
            long j18 = tVar2.f344859b;
            long j19 = tVar.f344860c;
            long j27 = j18 - j19;
            j17 += j27;
            arrayList.add(new of.c(j27, j19, j18));
            tVar = tVar2;
        }
        return new of.a(j17, kz5.n0.E0(arrayList));
    }
}
