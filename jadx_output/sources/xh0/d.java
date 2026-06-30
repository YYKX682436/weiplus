package xh0;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final p75.d f454483a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f454484b = new java.util.HashMap(4);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh0.b f454485c;

    public d(xh0.b bVar, p75.d dVar, xh0.c cVar) {
        this.f454485c = bVar;
        this.f454483a = dVar;
        ((java.util.HashMap) xh0.b.f454473r).put(dVar.f352625a, this);
    }

    public synchronized java.lang.Object a(java.lang.String str) {
        boolean z17;
        java.lang.Object obj;
        if (((java.util.HashMap) this.f454484b).containsKey(str)) {
            z17 = true;
        } else {
            b(str);
            z17 = false;
        }
        obj = ((java.util.HashMap) this.f454484b).get(str);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotConfigStorage", "[+] get '%s' from db cache, username: %s, value: %s", this.f454483a.f352625a, str, obj);
        }
        return obj;
    }

    public void b(java.lang.String str) {
        p75.n0 n0Var = dm.w1.f240718q;
        p75.d dVar = this.f454483a;
        p75.i0 h17 = n0Var.h(dVar);
        h17.f352657d = dm.w1.f240719r.j(str);
        dm.w1 w1Var = (dm.w1) h17.a().o(this.f454485c.f454474d, dm.w1.class);
        if (w1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBotConfigStorage", "[-] fail to load '%s' from db.");
            return;
        }
        java.lang.Object obj = w1Var.t0().get(dVar.f352625a);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotConfigStorage", "[+] get '%s' from db, username: %s, value: %s", dVar.f352625a, str, obj);
        ((java.util.HashMap) this.f454484b).put(str, obj);
    }
}
