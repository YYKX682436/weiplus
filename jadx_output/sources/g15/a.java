package g15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f267586d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "msgId"), com.tencent.mm.protobuf.i.i(-1, "hintType"), com.tencent.mm.protobuf.i.i(-1, "clearRule"), com.tencent.mm.protobuf.i.n(-1, "time")});
        this.f267586d = appendAttrs;
        super.set__serialName("ConvRedHint");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, 0, 0, 0L});
    }

    public long getCreateTime() {
        return super.getLong(this.f267586d + 3);
    }

    public int j() {
        return super.getInteger(this.f267586d + 2);
    }

    public int k() {
        return super.getInteger(this.f267586d + 1);
    }

    public long l() {
        return super.getLong(this.f267586d + 0);
    }

    public void n(int i17) {
        super.set(this.f267586d + 2, java.lang.Integer.valueOf(i17));
    }

    public void o(long j17) {
        super.set(this.f267586d + 3, java.lang.Long.valueOf(j17));
    }

    public void p(int i17) {
        super.set(this.f267586d + 1, java.lang.Integer.valueOf(i17));
    }

    public void q(long j17) {
        super.set(this.f267586d + 0, java.lang.Long.valueOf(j17));
    }
}
