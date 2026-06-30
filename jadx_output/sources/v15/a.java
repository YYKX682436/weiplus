package v15;

/* loaded from: classes11.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f432593d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_USERNAME), com.tencent.mm.protobuf.i.n(-1, "msgsvrid"), com.tencent.mm.protobuf.i.n(-1, "createtime")});
        this.f432593d = appendAttrs;
        super.set__serialName("downloadItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0L, null});
    }

    public void j(java.lang.Long l17) {
        super.set(this.f432593d + 2, l17);
    }

    public void k(long j17) {
        super.set(this.f432593d + 1, java.lang.Long.valueOf(j17));
    }

    public void l(java.lang.String str) {
        super.set(this.f432593d + 0, str);
    }
}
