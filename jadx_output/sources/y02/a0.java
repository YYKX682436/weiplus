package y02;

/* loaded from: classes9.dex */
public class a0 extends com.tencent.unit_rc.BaseProxyObject implements y02.z {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f458592d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.k8 f458593e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f458594f;

    /* renamed from: g, reason: collision with root package name */
    public long f458595g;

    /* renamed from: h, reason: collision with root package name */
    public y02.b0 f458596h;

    public a0() {
        boolean[] zArr = new boolean[6];
        for (int i17 = 0; i17 < 6; i17++) {
            zArr[i17] = false;
        }
        this.f458592d = zArr;
        this.f458593e = bw5.k8.values()[0];
        this.f458594f = "";
    }

    public bw5.k8 a() {
        synchronized (this) {
            if (this.f458592d[0]) {
                return this.f458593e;
            }
            bw5.k8 a17 = bw5.k8.a(urgen.ur_E2DE.UR_49D9.UR_CC5C(getCppPointer()));
            synchronized (this) {
                this.f458593e = a17;
                this.f458592d[0] = true;
            }
            kotlin.jvm.internal.o.d(a17);
            return a17;
        }
    }

    public long d() {
        synchronized (this) {
            if (this.f458592d[2]) {
                return this.f458595g;
            }
            long UR_007D = urgen.ur_E2DE.UR_49D9.UR_007D(getCppPointer());
            synchronized (this) {
                this.f458595g = UR_007D;
                this.f458592d[2] = true;
            }
            return UR_007D;
        }
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f458592d[i17] = false;
        }
    }
}
