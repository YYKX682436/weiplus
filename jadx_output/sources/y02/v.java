package y02;

/* loaded from: classes9.dex */
public class v extends com.tencent.unit_rc.BaseProxyObject implements y02.u {

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f458633d;

    public v() {
        boolean[] zArr = new boolean[4];
        for (int i17 = 0; i17 < 4; i17++) {
            zArr[i17] = false;
        }
        this.f458633d = zArr;
        bw5.h7 h7Var = bw5.h7.values()[0];
        new bw5.g7();
    }

    @Override // com.tencent.unit_rc.BaseObject, com.tencent.unit_rc.BaseObjectDef
    public void notifyFieldUpdated(int i17) {
        synchronized (this) {
            this.f458633d[i17] = false;
        }
    }
}
