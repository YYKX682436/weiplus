package x05;

/* loaded from: classes9.dex */
public class q extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451201d;

    public q() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "content", x05.f.class)});
        this.f451201d = appendAttrs;
        super.set__serialName("newlifeShareExtInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public x05.f j() {
        return (x05.f) super.getCustom(this.f451201d + 0);
    }

    public void k(x05.f fVar) {
        super.set(this.f451201d + 0, fVar);
    }
}
