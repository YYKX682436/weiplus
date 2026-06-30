package y02;

/* loaded from: classes9.dex */
public class e0 extends com.tencent.unit_rc.BaseProxyObject implements y02.d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f458599h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f458600d;

    /* renamed from: e, reason: collision with root package name */
    public y02.z f458601e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.h8 f458602f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f458603g;

    public e0() {
        boolean[] zArr = new boolean[3];
        for (int i17 = 0; i17 < 3; i17++) {
            zArr[i17] = false;
        }
        this.f458600d = zArr;
        this.f458602f = new bw5.h8();
    }

    public y02.z a() {
        synchronized (this) {
            if (this.f458600d[0]) {
                return this.f458601e;
            }
            com.tencent.unit_rc.BaseObjectDef UR_FBA4 = urgen.ur_E2DE.UR_3301.UR_FBA4(getCppPointer());
            synchronized (this) {
                this.f458601e = (y02.z) UR_FBA4;
                this.f458600d[0] = true;
            }
            return (y02.z) UR_FBA4;
        }
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f458600d[i17] = false;
        }
    }
}
