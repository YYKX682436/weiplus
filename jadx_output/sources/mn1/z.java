package mn1;

/* loaded from: classes12.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f329896a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f329897b;

    /* renamed from: e, reason: collision with root package name */
    public final kn1.g f329900e;

    /* renamed from: f, reason: collision with root package name */
    public final mn1.c0 f329901f;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f329898c = "";

    /* renamed from: d, reason: collision with root package name */
    public long f329899d = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f329902g = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new mn1.a0(this), true);

    /* renamed from: h, reason: collision with root package name */
    public final android.content.BroadcastReceiver f329903h = new mn1.b0(this);

    public z(mn1.c0 c0Var, kn1.g gVar) {
        this.f329901f = c0Var;
        this.f329900e = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final mn1.z r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mn1.z.a(mn1.z, boolean):void");
    }

    public final void b() {
        java.lang.String ticket = mn1.d.i().f329835n;
        java.util.LinkedList addressList = this.f329896a;
        java.lang.String wifiName = this.f329897b;
        java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: mn1.z$$a
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                sn1.j jVar = (sn1.j) obj;
                mn1.z zVar = mn1.z.this;
                zVar.getClass();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(jVar.f410032b);
                int i17 = jVar.f410033c;
                com.tencent.mars.xlog.Log.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createOffilineQrcode response.[%d,%d,%s]", valueOf, java.lang.Integer.valueOf(i17), jVar.f410034d);
                bw5.p2 p2Var = (bw5.p2) jVar.f410031a;
                int i18 = jVar.f410032b;
                mn1.c0 c0Var = zVar.f329901f;
                kn1.g gVar = zVar.f329900e;
                if (i18 != 0 || i17 != 0 || p2Var == null) {
                    gVar.f309609a = -11;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    ((mn1.x) c0Var).a(-11, null);
                    return;
                }
                boolean[] zArr = p2Var.f31442i;
                boolean z18 = zArr[2];
                if (z18) {
                    if ((z18 ? p2Var.f31438e : new r45.cu5()).f371839d > 0) {
                        gVar.f309609a = 51;
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        ((mn1.x) c0Var).a(51, (zArr[2] ? p2Var.f31438e : new r45.cu5()).f371841f.f192156a);
                    }
                }
            }
        };
        kotlin.jvm.internal.o.g(addressList, "addressList");
        kotlin.jvm.internal.o.g(wifiName, "wifiName");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, null, null, new sn1.p(addressList, wifiName, ticket, consumer, null), 3, null);
        } else {
            consumer.accept(new sn1.j(null, 3, -1, "No account scope"));
        }
    }
}
