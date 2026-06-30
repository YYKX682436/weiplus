package m21;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f323002l = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f323005c;

    /* renamed from: d, reason: collision with root package name */
    public long f323006d;

    /* renamed from: e, reason: collision with root package name */
    public int f323007e;

    /* renamed from: f, reason: collision with root package name */
    public int f323008f;

    /* renamed from: g, reason: collision with root package name */
    public final int f323009g;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f323003a = null;

    /* renamed from: b, reason: collision with root package name */
    public int f323004b = 1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.StringBuffer f323010h = new java.lang.StringBuffer();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.StringBuffer f323011i = new java.lang.StringBuffer();

    /* renamed from: j, reason: collision with root package name */
    public java.lang.StringBuffer f323012j = new java.lang.StringBuffer();

    /* renamed from: k, reason: collision with root package name */
    public java.lang.StringBuffer f323013k = new java.lang.StringBuffer();

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public w(int i17, int i18) {
        this.f323005c = 0;
        this.f323005c = i17;
        this.f323009g = i18;
    }

    public static m21.w b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        r45.qd6 qd6Var = new r45.qd6();
        try {
            qd6Var.parseFrom(bArr);
            m21.w wVar = new m21.w(qd6Var.f383865d, qd6Var.f383866e);
            wVar.f323004b = qd6Var.f383867f;
            wVar.f323006d = qd6Var.f383868g;
            wVar.f323007e = qd6Var.f383869h;
            wVar.f323008f = qd6Var.f383870i;
            wVar.f323010h = new java.lang.StringBuffer(qd6Var.f383871m);
            wVar.f323013k = new java.lang.StringBuffer(qd6Var.f383872n);
            wVar.f323011i = new java.lang.StringBuffer(qd6Var.f383873o);
            wVar.f323012j = new java.lang.StringBuffer(qd6Var.f383874p);
            return wVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatisticsOplog", "putIntent " + e17.getMessage());
            return null;
        }
    }

    public static m21.w c(int i17) {
        return new m21.w(i17, 4);
    }

    public static m21.w d(int i17) {
        return new m21.w(i17, 1);
    }

    public static m21.w f(android.content.Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("intent_key_StatisticsOplog");
        if (byteArrayExtra == null) {
            return null;
        }
        return b(byteArrayExtra);
    }

    public boolean a(int i17) {
        this.f323003a = java.lang.Integer.valueOf(i17);
        return true;
    }

    public byte[] e() {
        r45.qd6 qd6Var = new r45.qd6();
        qd6Var.f383865d = this.f323005c;
        qd6Var.f383866e = this.f323009g;
        qd6Var.f383867f = this.f323004b;
        qd6Var.f383868g = this.f323006d;
        qd6Var.f383869h = this.f323007e;
        qd6Var.f383870i = this.f323008f;
        qd6Var.f383871m = this.f323010h.toString();
        qd6Var.f383872n = this.f323013k.toString();
        qd6Var.f383873o = this.f323011i.toString();
        qd6Var.f383874p = this.f323012j.toString();
        try {
            return qd6Var.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StatisticsOplog", "putIntent " + e17.getMessage());
            return null;
        }
    }

    public void g(android.content.Intent intent) {
        byte[] e17 = e();
        if (e17 == null) {
            return;
        }
        intent.putExtra("intent_key_StatisticsOplog", e17);
    }
}
