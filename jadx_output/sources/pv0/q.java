package pv0;

/* loaded from: classes5.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final pv0.q f358543d = new pv0.q();

    public q() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pv0.g timbreManager = (pv0.g) obj;
        dw0.c timbreInfo = (dw0.c) obj2;
        kotlin.jvm.internal.o.g(timbreManager, "timbreManager");
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.mars.xlog.Log.i("TimbrePanelUIC", "cancelTimbre: timbreInfo " + timbreInfo);
        pv0.n nVar = (pv0.n) timbreManager.f358520a;
        nVar.getClass();
        nVar.f358538a.g(timbreInfo);
        return java.lang.Boolean.TRUE;
    }
}
