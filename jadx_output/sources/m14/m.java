package m14;

/* loaded from: classes15.dex */
public class m extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f322881d;

    public m() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "simplified_chinese"), com.tencent.mm.protobuf.i.u(-1, "traditional_chinese"), com.tencent.mm.protobuf.i.u(-1, "english")});
        this.f322881d = appendAttrs;
        super.set__serialName(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", ""});
    }

    public java.lang.String j() {
        return super.getString(this.f322881d + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f322881d + 0);
    }

    public java.lang.String l() {
        return super.getString(this.f322881d + 1);
    }
}
