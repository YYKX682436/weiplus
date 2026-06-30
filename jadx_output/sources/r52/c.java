package r52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static final r52.b f392629h = new r52.b(null);

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f392630i = "";

    /* renamed from: j, reason: collision with root package name */
    public static boolean f392631j;

    /* renamed from: a, reason: collision with root package name */
    public q52.e f392632a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f392633b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f392634c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f392635d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f392636e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392637f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f392638g;

    public final java.lang.String a() {
        r45.c45 e17;
        java.lang.String lastSessionId;
        int i17;
        if (!this.f392635d || (e17 = x52.c.e()) == null) {
            return null;
        }
        r52.b bVar = f392629h;
        if (bVar.a(e17.f371278o, e17.f371273g) && (i17 = e17.f371274h) != -1) {
            return com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a.d(i17);
        }
        if (!bVar.b(e17.f371278o) || (lastSessionId = e17.f371285v) == null) {
            return com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a.c();
        }
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.b bVar2 = com.tencent.mm.plugin.expt.hellhound.ext.session.config.c.f99783a;
        kotlin.jvm.internal.o.f(lastSessionId, "lastSessionId");
        return bVar2.a(lastSessionId);
    }

    public final q52.e b(r45.d45 d45Var, int i17) {
        q52.e eVar = new q52.e(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
        eVar.f360164a = d45Var.f372097d;
        java.lang.String str = d45Var.f372098e;
        eVar.f360165b = str;
        if (kotlin.jvm.internal.o.b(str, "FinderTopicFeedUI")) {
            p52.c cVar = p52.h.f352016a;
            int i18 = p52.h.f352038w;
            p52.f[] fVarArr = p52.f.f352009d;
            eVar.f360172i = i18 == 2;
        } else {
            eVar.f360172i = false;
        }
        eVar.f360166c = d45Var.f372100g;
        eVar.f360167d = d45Var.f372101h;
        eVar.f360168e = d45Var.f372102i;
        eVar.f360169f = d45Var.f372103m;
        eVar.f360170g = d45Var.f372104n;
        eVar.f360171h = i17;
        eVar.f360173j = d45Var.f372107q;
        eVar.f360174k = d45Var.f372108r;
        eVar.f360180q = d45Var.f372099f;
        return eVar;
    }
}
