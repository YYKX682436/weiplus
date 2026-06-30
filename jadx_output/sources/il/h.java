package il;

/* loaded from: classes13.dex */
public class h {

    /* renamed from: g, reason: collision with root package name */
    public static il.h f291992g;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f291993a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f291994b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public final long f291995c = 10000000;

    /* renamed from: d, reason: collision with root package name */
    public int f291996d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f291997e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f291998f = 0;

    public static il.h a() {
        if (f291992g == null) {
            synchronized (il.i.class) {
                if (f291992g == null) {
                    f291992g = new il.h();
                }
            }
        }
        return f291992g;
    }

    public hl.e b() {
        synchronized (this.f291994b) {
            if (this.f291993a.size() > 0) {
                java.util.ArrayList arrayList = this.f291993a;
                return (hl.e) arrayList.remove(arrayList.size() - 1);
            }
            int i17 = this.f291996d;
            if (i17 >= this.f291995c) {
                int i18 = this.f291998f + 1;
                this.f291998f = i18;
                if (i18 % 100 == 0) {
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmDataTrackFixedSizePool", "size >= FIX_SIZE, size:%d", objArr);
                }
                return null;
            }
            int i27 = this.f291997e + 1;
            this.f291997e = i27;
            this.f291996d = i27 * 3536;
            java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i27)};
            int i28 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmDataTrackFixedSizePool", "pool tract count:%d", objArr2);
            if (this.f291998f > 0) {
                this.f291998f = 0;
            }
            hl.e eVar = new hl.e();
            eVar.f282039g = true;
            return eVar;
        }
    }

    public void c(hl.e eVar) {
        if (eVar == null || eVar.f282038f == null || !eVar.f282039g) {
            return;
        }
        eVar.a();
        synchronized (this.f291994b) {
            this.f291993a.add(0, eVar);
        }
    }
}
