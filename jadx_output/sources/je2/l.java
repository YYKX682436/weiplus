package je2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ je2.n f299242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ je2.j f299243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(je2.n nVar, je2.j jVar) {
        super(0);
        this.f299242d = nVar;
        this.f299243e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        je2.j jVar;
        java.lang.Object obj;
        je2.n nVar = this.f299242d;
        java.util.Iterator it = nVar.Q6().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f0Var = null;
            jVar = this.f299243e;
            if (!hasNext) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((je2.j) obj).f299237a, jVar.f299237a)) {
                break;
            }
        }
        je2.j jVar2 = (je2.j) obj;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        kotlinx.coroutines.flow.i2 i2Var = nVar.f299250n;
        java.lang.String str = nVar.f299245f;
        if (jVar2 != null) {
            if (jVar.f299238b.getLong(2) > jVar2.f299238b.getLong(2)) {
                com.tencent.mars.xlog.Log.i(str, "addGameDataBanner update game data:" + jVar2 + " to version:" + jVar.f299238b.getLong(2) + '!');
                r45.wq1 wq1Var = jVar.f299238b;
                kotlin.jvm.internal.o.g(wq1Var, "<set-?>");
                jVar2.f299238b = wq1Var;
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = jVar.f299239c;
                kotlin.jvm.internal.o.g(finderJumpInfo, "<set-?>");
                jVar2.f299239c = finderJumpInfo;
                if (jVar.a()) {
                    ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.TRUE);
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "addGameDataBanner fail, old game data:" + jVar2 + " \n new game data:" + jVar + '!');
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            nVar.Q6().add(jVar);
            com.tencent.mars.xlog.Log.i(str, "addGameDataBanner add game data " + jVar + '!');
            if (jVar.a()) {
                ((kotlinx.coroutines.flow.q2) i2Var).e(java.lang.Boolean.TRUE);
            }
        }
        return f0Var2;
    }
}
