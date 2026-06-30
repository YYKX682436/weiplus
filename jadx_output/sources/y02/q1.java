package y02;

/* loaded from: classes9.dex */
public class q1 extends com.tencent.unit_rc.BaseProxyObject implements y02.p1 {
    @Override // y02.p1
    public y02.f0[] Bf() {
        com.tencent.unit_rc.BaseObjectDef[] UR_2D11 = urgen.ur_E2DE.UR_E8BB.UR_2D11(getCppPointer());
        java.util.ArrayList arrayList = new java.util.ArrayList(UR_2D11.length);
        for (com.tencent.unit_rc.BaseObjectDef baseObjectDef : UR_2D11) {
            arrayList.add((y02.f0) baseObjectDef);
        }
        return (y02.f0[]) arrayList.toArray(new y02.f0[0]);
    }

    @Override // y02.p1
    public java.lang.String[] Cc() {
        return urgen.ur_E2DE.UR_E8BB.UR_D878(getCppPointer());
    }

    @Override // y02.p1
    public java.lang.String[] T1() {
        return urgen.ur_E2DE.UR_E8BB.UR_B227(getCppPointer());
    }
}
