package r15;

/* loaded from: classes5.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f368647d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "svrid"), com.tencent.mm.protobuf.i.u(-1, "signature"), com.tencent.mm.protobuf.i.u(-1, "strid"), com.tencent.mm.protobuf.i.n(-1, "createtime"), com.tencent.mm.protobuf.i.r(-1, "partialtext", r15.g.class)});
        this.f368647d = appendAttrs;
        super.set__serialName("refermsg");
        super.set__xmlPrefixTag("extcommoninfo");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, "", "", 0L, null});
    }

    public long getCreateTime() {
        return super.getLong(this.f368647d + 3);
    }

    public java.lang.String getSignature() {
        return super.getString(this.f368647d + 1);
    }

    public r15.g j() {
        return (r15.g) super.getCustom(this.f368647d + 4);
    }

    public java.lang.String k() {
        return super.getString(this.f368647d + 2);
    }

    public long l() {
        return super.getLong(this.f368647d + 0);
    }

    public void n(long j17) {
        super.set(this.f368647d + 3, java.lang.Long.valueOf(j17));
    }

    public void o(r15.g gVar) {
        super.set(this.f368647d + 4, gVar);
    }

    public void p(java.lang.String str) {
        super.set(this.f368647d + 1, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f368647d + 2, str);
    }

    public void r(long j17) {
        super.set(this.f368647d + 0, java.lang.Long.valueOf(j17));
    }
}
