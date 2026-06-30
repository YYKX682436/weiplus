package ih3;

/* loaded from: classes4.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg3.j1 f291582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih3.e f291583f;

    public g(ih3.e eVar, java.lang.String str, tg3.j1 j1Var) {
        this.f291583f = eVar;
        this.f291581d = str;
        this.f291582e = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f291581d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateImp", "hy: removing Received listener: %s", str);
        ih3.e eVar = this.f291583f;
        java.util.HashSet hashSet = (java.util.HashSet) ((java.util.HashMap) eVar.f291568f).get(str);
        if (hashSet == null) {
            return;
        }
        hashSet.remove(this.f291582e);
        if (hashSet.size() == 0) {
            ((java.util.HashMap) eVar.f291568f).remove(str);
        } else {
            ((java.util.HashMap) eVar.f291568f).put(str, hashSet);
        }
    }
}
