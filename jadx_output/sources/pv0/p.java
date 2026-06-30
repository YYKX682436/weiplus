package pv0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final pv0.p f358542d = new pv0.p();

    public p() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pv0.g timbreManager = (pv0.g) obj;
        dw0.c timbreInfo = (dw0.c) obj2;
        kotlin.jvm.internal.o.g(timbreManager, "timbreManager");
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.mars.xlog.Log.i("TimbrePanelUIC", "applyTimbre: timbreInfo " + timbreInfo);
        pv0.n nVar = (pv0.n) timbreManager.f358520a;
        nVar.getClass();
        return java.lang.Boolean.valueOf(nVar.f358538a.f(timbreInfo));
    }
}
