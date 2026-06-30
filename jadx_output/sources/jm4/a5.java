package jm4;

/* loaded from: classes11.dex */
public class a5 extends com.tencent.unit_rc.BaseProxyObject implements jm4.z4 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f300372f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f300373d = {false};

    /* renamed from: e, reason: collision with root package name */
    public boolean f300374e;

    public boolean a() {
        synchronized (this) {
            if (this.f300373d[0]) {
                return this.f300374e;
            }
            boolean UR_5008 = urgen.ur_0025.UR_6F99.UR_5008(getCppPointer());
            synchronized (this) {
                this.f300374e = UR_5008;
                this.f300373d[0] = true;
            }
            return UR_5008;
        }
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f300373d[i17] = false;
        }
    }
}
