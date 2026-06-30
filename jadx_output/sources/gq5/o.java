package gq5;

/* loaded from: classes5.dex */
public final class o extends gq5.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f274655m;

    /* renamed from: n, reason: collision with root package name */
    public long f274656n;

    /* renamed from: o, reason: collision with root package name */
    public long f274657o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f274658p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f274659q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f274660r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f274655m = "MicroMsg.WeDrop.WeDropSendUIC";
        this.f274658p = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00d0 -> B:10:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b7(gq5.o r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq5.o.b7(gq5.o, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gq5.e
    public java.lang.String T6() {
        return this.f274655m;
    }

    @Override // gq5.e
    public int U6() {
        if (jq5.b.f301255a.b().i("is_first_send", true)) {
            return 13;
        }
        jq5.l lVar = jq5.n.f301282a;
        if (!(lVar.c() && lVar.e())) {
            return 14;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("decryptKeyResp");
        bw5.ud0 parseFrom = new bw5.ud0().parseFrom(byteArrayExtra);
        java.lang.String stringExtra = getIntent().getStringExtra("qrCode");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init: decryptKeyResp size ");
        sb6.append(byteArrayExtra != null ? java.lang.Integer.valueOf(byteArrayExtra.length) : null);
        com.tencent.mars.xlog.Log.i(this.f274655m, sb6.toString());
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f274622g).getValue(), null, new gq5.j(parseFrom, stringExtra, this, null), 1, null);
        return 1;
    }

    @Override // gq5.e
    public void V6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(5));
        }
    }

    @Override // gq5.e
    public void W6(int i17) {
        if (this.f274660r) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.i(11));
                return;
            }
            return;
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
        }
        j75.f Q63 = Q6();
        if (Q63 != null) {
            Q63.B3(new eq5.i(3));
        }
    }

    @Override // gq5.e
    public void Y6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new eq5.i(7));
        }
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f274622g).getValue(), null, new gq5.l(this, null), 1, null);
    }

    @Override // gq5.e
    public void a7(int i17, byte[] data, r45.y77 fileInfo) {
        android.view.Window window;
        android.view.View decorView;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(fileInfo, "fileInfo");
        long length = this.f274657o + data.length;
        this.f274657o = length;
        long j17 = this.f274656n;
        java.lang.String str = this.f274655m;
        if (length == j17) {
            com.tencent.mars.xlog.Log.i(str, "all file send success, totalOffset:" + this.f274657o);
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new eq5.i(9));
            }
            jq5.b.f301255a.b().B("last_select_time", c01.id.c());
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                android.os.VibrationEffect createPredefined = android.os.VibrationEffect.createPredefined(0);
                kotlin.jvm.internal.o.f(createPredefined, "createPredefined(...)");
                java.lang.Object systemService = activity != null ? activity.getSystemService("vibrator") : null;
                android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(createPredefined);
                }
            } else if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                decorView.performHapticFeedback(3);
            }
        } else if (j17 > 0) {
            int i18 = (int) ((length * 100) / j17);
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new eq5.e(i18));
            }
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f274658p;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (l17 == null) {
            l17 = 0L;
        }
        long longValue = l17.longValue() + data.length;
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(longValue));
        com.tencent.mars.xlog.Log.i(str, "onSendFile index:" + i17 + " file offset:" + longValue + ", filelen " + fileInfo.f390844e + " ,total offset:" + this.f274657o + " totalLen:" + this.f274656n);
    }

    @Override // gq5.e, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new gq5.k(this));
        }
    }
}
