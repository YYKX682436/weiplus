package mm1;

/* loaded from: classes3.dex */
public final class o extends com.tencent.unit_rc.BaseObject implements jm4.i1 {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f328683e;

    /* renamed from: d, reason: collision with root package name */
    public static final mm1.o f328682d = new mm1.o();

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f328684f = true;

    @Override // jm4.i1
    public void Dd(long j17, yz5.a aVar) {
        if (f328684f) {
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            try {
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new mm1.n(j17, aVar, null), 3, null);
            } catch (kotlinx.coroutines.x3 unused) {
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
    }

    @Override // jm4.i1
    public void o2(boolean z17) {
        f328684f = z17;
    }

    @Override // jm4.i1
    public boolean yd() {
        return f328684f;
    }
}
