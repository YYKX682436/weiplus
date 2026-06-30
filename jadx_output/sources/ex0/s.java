package ex0;

/* loaded from: classes5.dex */
public final class s implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final ex0.s f257172d = new ex0.s();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ex0.r rVar = (ex0.r) obj;
        ex0.r rVar2 = (ex0.r) obj2;
        if (rVar.k().smallThan(rVar2.k())) {
            return -1;
        }
        if (!rVar.k().bigThan(rVar2.k())) {
            if (rVar.j().smallThan(rVar2.j())) {
                return -1;
            }
            if (!rVar.j().bigThan(rVar2.j())) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                return 0;
            }
        }
        return 1;
    }
}
