package jm4;

/* loaded from: classes11.dex */
public class r2 extends com.tencent.unit_rc.BaseProxyObject implements jm4.q2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f300416d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.eq0 f300417e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300418f;

    /* renamed from: g, reason: collision with root package name */
    public jm4.q3 f300419g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f300420h;

    public r2() {
        boolean[] zArr = new boolean[4];
        for (int i17 = 0; i17 < 4; i17++) {
            zArr[i17] = false;
        }
        this.f300416d = zArr;
        this.f300417e = bw5.eq0.values()[0];
        this.f300418f = "";
        this.f300419g = jm4.q3.f300412n;
    }

    @Override // jm4.q2
    public void K(jm4.q3 playTaskType) {
        kotlin.jvm.internal.o.g(playTaskType, "playTaskType");
        urgen.ur_0025.UR_F591.UR_633D(getCppPointer(), playTaskType.f300414d);
    }

    @Override // jm4.q2
    public java.lang.String M4() {
        synchronized (this) {
            if (this.f300416d[1]) {
                return this.f300418f;
            }
            java.lang.String UR_030E = urgen.ur_0025.UR_F591.UR_030E(getCppPointer());
            synchronized (this) {
                this.f300418f = UR_030E;
                this.f300416d[1] = true;
            }
            return UR_030E;
        }
    }

    @Override // jm4.q2
    public void W5(boolean z17) {
        urgen.ur_0025.UR_F591.UR_17D4(getCppPointer(), z17);
    }

    @Override // jm4.q2
    public void aa(bw5.eq0 appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        urgen.ur_0025.UR_F591.UR_2E33(getCppPointer(), appId.f27025d);
    }

    @Override // jm4.q2
    public bw5.eq0 getAppId() {
        synchronized (this) {
            if (this.f300416d[0]) {
                return this.f300417e;
            }
            bw5.eq0 a17 = bw5.eq0.a(urgen.ur_0025.UR_F591.UR_D5ED(getCppPointer()));
            synchronized (this) {
                this.f300417e = a17;
                this.f300416d[0] = true;
            }
            kotlin.jvm.internal.o.d(a17);
            return a17;
        }
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f300416d[i17] = false;
        }
    }

    @Override // jm4.q2
    public void pf(java.lang.String appName) {
        kotlin.jvm.internal.o.g(appName, "appName");
        urgen.ur_0025.UR_F591.UR_18DB(getCppPointer(), appName);
    }

    @Override // jm4.q2
    public boolean u1() {
        synchronized (this) {
            if (this.f300416d[3]) {
                return this.f300420h;
            }
            boolean UR_F29D = urgen.ur_0025.UR_F591.UR_F29D(getCppPointer());
            synchronized (this) {
                this.f300420h = UR_F29D;
                this.f300416d[3] = true;
            }
            return UR_F29D;
        }
    }

    @Override // jm4.q2
    public jm4.q3 z3() {
        synchronized (this) {
            if (this.f300416d[2]) {
                return this.f300419g;
            }
            jm4.q3 a17 = jm4.q3.f300406e.a(urgen.ur_0025.UR_F591.UR_4AB1(getCppPointer()));
            synchronized (this) {
                this.f300419g = a17;
                this.f300416d[2] = true;
            }
            return a17;
        }
    }
}
