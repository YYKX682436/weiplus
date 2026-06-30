package y05;

/* loaded from: classes5.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f458657d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "framesetname"), com.tencent.mm.protobuf.i.u(-1, "mbcarddata"), com.tencent.mm.protobuf.i.u(-1, "minpkgversion"), com.tencent.mm.protobuf.i.u(-1, "clientextinfo"), com.tencent.mm.protobuf.i.i(-1, "mbcardheight"), com.tencent.mm.protobuf.i.i(-1, "isoldversion")});
        this.f458657d = appendAttrs;
        super.set__serialName("wxgamecard");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null, 0, 0});
    }

    public java.lang.String j() {
        return super.getString(this.f458657d + 3);
    }
}
