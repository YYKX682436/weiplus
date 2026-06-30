package t65;

/* loaded from: classes12.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f416021d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "pid"), com.tencent.mm.protobuf.i.i(-1, "status"), com.tencent.mm.protobuf.i.i(-1, "totalCount"), com.tencent.mm.protobuf.i.i(-1, "tickCount"), com.tencent.mm.protobuf.i.g(-1, "tickRate"), com.tencent.mm.protobuf.i.i(-1, "networkTickCount"), com.tencent.mm.protobuf.i.g(-1, "networkTickRate"), com.tencent.mm.protobuf.i.n(-1, "fromTimestamp"), com.tencent.mm.protobuf.i.u(-1, "fromTimestampFormat"), com.tencent.mm.protobuf.i.i(-1, "fromCurrentProcessMin"), com.tencent.mm.protobuf.i.i(-1, "fromLastProcessMin"), com.tencent.mm.protobuf.i.i(-1, "fromLastDeepBackgroundMin"), com.tencent.mm.protobuf.i.i(-1, "fromLastForegroundMin"), com.tencent.mm.protobuf.i.i(-1, "fromLastScreenMin"), com.tencent.mm.protobuf.i.i(-1, "fromLastNetworkMin"), com.tencent.mm.protobuf.i.i(-1, "fromLastTickMin")});
        this.f416021d = appendAttrs;
        super.set__serialName("ProcessStatus");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0, 0, 0, valueOf, 0, valueOf, -1L, "", -1, -1, -1, -1, -1, -1, -1});
    }

    public void A(int i17) {
        super.set(this.f416021d + 11, java.lang.Integer.valueOf(i17));
    }

    public void B(int i17) {
        super.set(this.f416021d + 12, java.lang.Integer.valueOf(i17));
    }

    public void C(int i17) {
        super.set(this.f416021d + 14, java.lang.Integer.valueOf(i17));
    }

    public void E(int i17) {
        super.set(this.f416021d + 10, java.lang.Integer.valueOf(i17));
    }

    public void F(int i17) {
        super.set(this.f416021d + 13, java.lang.Integer.valueOf(i17));
    }

    public void G(int i17) {
        super.set(this.f416021d + 15, java.lang.Integer.valueOf(i17));
    }

    public void H(long j17) {
        super.set(this.f416021d + 7, java.lang.Long.valueOf(j17));
    }

    public void I(java.lang.String str) {
        super.set(this.f416021d + 8, str);
    }

    public void J(int i17) {
        super.set(this.f416021d + 5, java.lang.Integer.valueOf(i17));
    }

    public void K(float f17) {
        super.set(this.f416021d + 6, java.lang.Float.valueOf(f17));
    }

    public void L(int i17) {
        super.set(this.f416021d + 0, java.lang.Integer.valueOf(i17));
    }

    public void N(int i17) {
        super.set(this.f416021d + 1, java.lang.Integer.valueOf(i17));
    }

    public void O(int i17) {
        super.set(this.f416021d + 3, java.lang.Integer.valueOf(i17));
    }

    public void P(float f17) {
        super.set(this.f416021d + 4, java.lang.Float.valueOf(f17));
    }

    public void Q(int i17) {
        super.set(this.f416021d + 2, java.lang.Integer.valueOf(i17));
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public int j() {
        return super.getInteger(this.f416021d + 9);
    }

    public int k() {
        return super.getInteger(this.f416021d + 11);
    }

    public int l() {
        return super.getInteger(this.f416021d + 12);
    }

    public int n() {
        return super.getInteger(this.f416021d + 14);
    }

    public int o() {
        return super.getInteger(this.f416021d + 10);
    }

    public int p() {
        return super.getInteger(this.f416021d + 13);
    }

    public int q() {
        return super.getInteger(this.f416021d + 15);
    }

    public long r() {
        return super.getLong(this.f416021d + 7);
    }

    public int s() {
        return super.getInteger(this.f416021d + 5);
    }

    public float t() {
        return super.getFloat(this.f416021d + 6);
    }

    public int u() {
        return super.getInteger(this.f416021d + 1);
    }

    public int w() {
        return super.getInteger(this.f416021d + 3);
    }

    public float x() {
        return super.getFloat(this.f416021d + 4);
    }

    public int y() {
        return super.getInteger(this.f416021d + 2);
    }

    public void z(int i17) {
        super.set(this.f416021d + 9, java.lang.Integer.valueOf(i17));
    }
}
