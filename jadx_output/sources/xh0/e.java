package xh0;

/* loaded from: classes11.dex */
public class e implements vh0.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454486a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.ContentValues f454487b = new android.content.ContentValues(8);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh0.b f454488c;

    public e(xh0.b bVar, java.lang.String str, xh0.c cVar) {
        this.f454488c = bVar;
        this.f454486a = str;
    }

    public boolean a() {
        dm.w1 w1Var = new dm.w1();
        w1Var.convertFrom(this.f454487b, true);
        w1Var.setUserName(this.f454486a);
        java.lang.String str = this.f454486a;
        p75.d dVar = dm.w1.f240719r;
        p75.i0 h17 = dm.w1.f240718q.h(dVar);
        h17.f352657d = dVar.j(str);
        h17.f352656c = "MicroMsg.SDK.BaseChatBotConfig";
        h17.c(1, 0);
        if (!(!h17.a().h(this.f454488c.f454474d) ? super/*l75.n0*/.insert(w1Var) : super/*l75.n0*/.update(w1Var, new java.lang.String[0]))) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.f454487b.valueSet()) {
            xh0.d dVar2 = (xh0.d) ((java.util.HashMap) xh0.b.f454473r).get(entry.getKey());
            if (dVar2 == null) {
                throw new java.lang.NullPointerException("cannot find corresponding CachedValue of db column '" + entry.getKey() + '\"');
            }
            java.lang.String str2 = this.f454486a;
            java.lang.Object value = entry.getValue();
            synchronized (dVar2) {
                ((java.util.HashMap) dVar2.f454484b).put(str2, value);
            }
        }
        return true;
    }

    public vh0.f1 b(java.lang.String str) {
        this.f454487b.put("shortcutList", str);
        return this;
    }
}
