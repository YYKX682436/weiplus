package o72;

/* loaded from: classes12.dex */
public class e2 extends dm.j3 {
    public static final l75.e0 U = dm.j3.initAutoDBInfo(o72.e2.class);

    @Override // dm.j3, l75.f0
    public l75.e0 getDBInfo() {
        return U;
    }

    public float v0() {
        return java.lang.Math.max(0.0f, java.lang.Math.min(99.0f, this.field_offset / this.field_totalLen) * 100.0f);
    }

    public boolean w0() {
        return this.field_status == 3;
    }

    public boolean y0() {
        return this.field_dataType == 4;
    }
}
