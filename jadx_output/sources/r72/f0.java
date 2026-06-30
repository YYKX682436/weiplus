package r72;

/* loaded from: classes11.dex */
public class f0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393138d;

    public f0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "time"), com.tencent.mm.protobuf.i.u(-1, "remark")});
        this.f393138d = appendAttrs;
        super.set__serialName("remark");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L, ""});
    }

    public java.lang.String j() {
        return super.getString(this.f393138d + 1);
    }

    public long k() {
        return super.getLong(this.f393138d + 0);
    }

    public void l(java.lang.String str) {
        super.set(this.f393138d + 1, str);
    }

    public void n(long j17) {
        super.set(this.f393138d + 0, java.lang.Long.valueOf(j17));
    }
}
