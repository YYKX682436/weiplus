package p15;

/* loaded from: classes12.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351258d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "searchquery"), com.tencent.mm.protobuf.i.u(-1, "md5")});
        this.f351258d = appendAttrs;
        super.set__serialName("emojiitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", ""});
    }

    public java.lang.String getMd5() {
        return super.getString(this.f351258d + 1);
    }

    public java.lang.String j() {
        return super.getString(this.f351258d + 0);
    }

    public void k(java.lang.String str) {
        super.set(this.f351258d + 1, str);
    }

    public void l(java.lang.String str) {
        super.set(this.f351258d + 0, str);
    }
}
