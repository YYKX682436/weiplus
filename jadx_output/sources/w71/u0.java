package w71;

/* loaded from: classes11.dex */
public class u0 extends com.tencent.unit_rc.BaseProxyObject implements w71.t0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f443455d = {false};

    /* renamed from: e, reason: collision with root package name */
    public bw5.j20 f443456e = new bw5.j20();

    @Override // w71.t0
    public void Jg(bw5.j20 openParams) {
        kotlin.jvm.internal.o.g(openParams, "openParams");
        byte[] byteArray = openParams.toByteArray();
        long cppPointer = getCppPointer();
        kotlin.jvm.internal.o.d(byteArray);
        urgen.ur_C563.UR_A284.UR_B8F6(cppPointer, byteArray);
    }

    @Override // w71.t0
    public bw5.j20 Pa() {
        synchronized (this) {
            if (this.f443455d[0]) {
                return this.f443456e;
            }
            bw5.j20 j20Var = (bw5.j20) w71.l.b(urgen.ur_C563.UR_A284.UR_727F(getCppPointer()), new bw5.j20());
            synchronized (this) {
                this.f443456e = j20Var;
                this.f443455d[0] = true;
            }
            return j20Var;
        }
    }

    @Override // w71.t0
    public bw5.g20 nb() {
        return (bw5.g20) w71.l.b(urgen.ur_C563.UR_A284.UR_F3EE(getCppPointer()), new bw5.g20());
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f443455d[i17] = false;
        }
    }

    @Override // w71.t0
    public java.lang.String r() {
        return urgen.ur_C563.UR_A284.UR_907B(getCppPointer());
    }
}
