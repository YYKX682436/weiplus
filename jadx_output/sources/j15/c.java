package j15;

/* loaded from: classes12.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f297195d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "duration"), com.tencent.mm.protobuf.i.n(-1, "size"), com.tencent.mm.protobuf.i.u(-1, "md5"), com.tencent.mm.protobuf.i.u(-1, "fileid"), com.tencent.mm.protobuf.i.n(-1, "hdsize"), com.tencent.mm.protobuf.i.u(-1, "hdmd5"), com.tencent.mm.protobuf.i.u(-1, "hdfileid"), com.tencent.mm.protobuf.i.n(-1, "stillimagetimems")});
        this.f297195d = appendAttrs;
        super.set__serialName("live");
        super.set__xmlPrefixTag("img");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, 0L, null, null, 0L, null, null, 0L});
    }

    public java.lang.String getMd5() {
        return super.getString(this.f297195d + 2);
    }

    public long getSize() {
        return super.getLong(this.f297195d + 1);
    }

    public int j() {
        return super.getInteger(this.f297195d + 0);
    }

    public java.lang.String k() {
        return super.getString(this.f297195d + 3);
    }

    public java.lang.String l() {
        return super.getString(this.f297195d + 6);
    }

    public java.lang.String n() {
        return super.getString(this.f297195d + 5);
    }

    public long o() {
        return super.getLong(this.f297195d + 4);
    }

    public long p() {
        return super.getLong(this.f297195d + 7);
    }

    public void q(int i17) {
        super.set(this.f297195d + 0, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f297195d + 3, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f297195d + 6, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f297195d + 5, str);
    }

    public void u(long j17) {
        super.set(this.f297195d + 4, java.lang.Long.valueOf(j17));
    }

    public void w(java.lang.String str) {
        super.set(this.f297195d + 2, str);
    }

    public void x(long j17) {
        super.set(this.f297195d + 1, java.lang.Long.valueOf(j17));
    }

    public void y(long j17) {
        super.set(this.f297195d + 7, java.lang.Long.valueOf(j17));
    }
}
