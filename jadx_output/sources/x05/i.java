package x05;

/* loaded from: classes9.dex */
public class i extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451193d;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.r(-1, "detail", x05.h.class)});
        this.f451193d = appendAttrs;
        super.set__serialName("finder");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null});
    }

    public int getType() {
        return super.getInteger(this.f451193d + 0);
    }

    public x05.h j() {
        return (x05.h) super.getCustom(this.f451193d + 1);
    }
}
