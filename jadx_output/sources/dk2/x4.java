package dk2;

/* loaded from: classes3.dex */
public final class x4 {
    public static final dk2.w4 C = new dk2.w4(null);
    public static final java.util.concurrent.ConcurrentHashMap D = new java.util.concurrent.ConcurrentHashMap();
    public long A;
    public r45.ta4 B;

    /* renamed from: a, reason: collision with root package name */
    public r45.h32 f234307a;

    /* renamed from: b, reason: collision with root package name */
    public r45.uy1 f234308b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.LinkedList f234309c;

    /* renamed from: d, reason: collision with root package name */
    public r45.fd2 f234310d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f234311e;

    /* renamed from: f, reason: collision with root package name */
    public int f234312f;

    /* renamed from: g, reason: collision with root package name */
    public int f234313g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f234314h;

    /* renamed from: i, reason: collision with root package name */
    public int f234315i;

    /* renamed from: k, reason: collision with root package name */
    public int f234317k;

    /* renamed from: o, reason: collision with root package name */
    public int f234321o;

    /* renamed from: p, reason: collision with root package name */
    public r45.kd1 f234322p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f234323q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f234324r;

    /* renamed from: s, reason: collision with root package name */
    public r45.gy0 f234325s;

    /* renamed from: t, reason: collision with root package name */
    public int f234326t;

    /* renamed from: w, reason: collision with root package name */
    public r45.q92 f234329w;

    /* renamed from: x, reason: collision with root package name */
    public android.os.Bundle f234330x;

    /* renamed from: j, reason: collision with root package name */
    public int f234316j = -1;

    /* renamed from: l, reason: collision with root package name */
    public java.util.ArrayList f234318l = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public int f234319m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f234320n = -1;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f234327u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f234328v = new java.util.HashMap();

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f234331y = "";

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f234332z = "";

    public final void a(android.content.Intent intent, long j17) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("key_enter_live_export_id") : null;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            this.f234328v.put(java.lang.Long.valueOf(j17), stringExtra);
        }
        java.util.ArrayList arrayList = this.f234327u;
        arrayList.clear();
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("key_enter_live_export_id_list") : null;
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            return;
        }
        arrayList.addAll(stringArrayListExtra);
    }

    public final void b(android.content.Intent intent) {
        java.lang.String str;
        int intExtra = intent != null ? intent.getIntExtra("key_enter_live_param_by_pass_type", 0) : 0;
        if (intent == null || (str = intent.getStringExtra("key_enter_live_param_by_pass_info")) == null) {
            str = "";
        }
        r45.gy0 gy0Var = new r45.gy0();
        gy0Var.set(0, java.lang.Integer.valueOf(intExtra));
        gy0Var.set(1, com.tencent.mm.protobuf.g.c(str));
        this.f234325s = gy0Var;
    }

    public final void c(android.content.Intent intent) {
        int i17 = 1;
        if (intent != null && intent.hasExtra("key_enter_live_param_pull_more_type")) {
            this.f234320n = intent.getIntExtra("key_enter_live_param_pull_more_type", -1);
            return;
        }
        int intExtra = intent != null ? intent.getIntExtra("key_enter_live_param_visitor_enter_scene", 0) : 0;
        this.f234326t = intExtra;
        if (intExtra != 3 && intExtra != 4) {
            i17 = this.f234320n;
        }
        this.f234320n = i17;
    }

    public final com.tencent.mm.live.api.LiveConfig d() {
        return (com.tencent.mm.live.api.LiveConfig) kz5.n0.a0(this.f234318l, this.f234315i);
    }

    public java.lang.String toString() {
        java.lang.String stringBuffer;
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveConfig:");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[tabType:");
        sb7.append(this.f234316j);
        sb7.append(",commentScene:");
        sb7.append(this.f234317k);
        sb7.append(",curPos:");
        sb7.append(this.f234315i);
        sb7.append(",bindShop:false,nicknameOption:");
        sb7.append(this.f234331y);
        sb7.append(", dataList:");
        int size = this.f234318l.size();
        if (size <= 0) {
            stringBuffer = "empty";
        } else {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
            stringBuffer2.append("count:" + size + ' ');
            int i17 = 0;
            for (java.lang.Object obj : this.f234318l) {
                int i18 = i17 + 1;
                java.lang.String str2 = null;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.live.api.LiveConfig liveConfig = (com.tencent.mm.live.api.LiveConfig) obj;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("##live_");
                sb8.append(i17);
                sb8.append(":username:");
                sb8.append(liveConfig != null ? liveConfig.f68542m : null);
                sb8.append(",liveId:");
                sb8.append(liveConfig != null ? java.lang.Long.valueOf(liveConfig.f68537e) : null);
                sb8.append(", nick:");
                sb8.append(liveConfig != null ? liveConfig.M : null);
                sb8.append(" desc:");
                sb8.append(liveConfig != null ? liveConfig.f68551u : null);
                sb8.append(" sessionBuffer:");
                sb8.append((liveConfig == null || (str = liveConfig.F) == null) ? null : pm0.v.e0(str, 0, 10));
                sb8.append("...,streamUrl:");
                if (liveConfig != null) {
                    str2 = liveConfig.f68545p;
                }
                sb8.append(str2);
                sb8.append(';');
                stringBuffer2.append(sb8.toString());
                i17 = i18;
            }
            stringBuffer = stringBuffer2.toString();
            kotlin.jvm.internal.o.f(stringBuffer, "toString(...)");
        }
        sb7.append(stringBuffer);
        sb7.append(",pullMoreType:");
        sb7.append(this.f234320n);
        sb6.append(sb7.toString());
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }
}
