package ih3;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg3.j1 f291579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih3.e f291580f;

    public f(ih3.e eVar, java.lang.String str, tg3.j1 j1Var) {
        this.f291580f = eVar;
        this.f291578d = str;
        this.f291579e = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f291578d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateImp", "hy: adding Received listener: %s", str);
        ih3.e eVar = this.f291580f;
        java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) eVar.f291568f).get(str);
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
        }
        tg3.j1 j1Var = this.f291579e;
        if (!hashSet.contains(j1Var)) {
            hashSet.add(j1Var);
        }
        ((java.util.HashMap) eVar.f291568f).put(str, hashSet);
    }
}
