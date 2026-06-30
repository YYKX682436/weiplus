package y05;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f458658d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "namecard", y05.d.class)});
        this.f458658d = appendAttrs;
        super.set__serialName("gamecenter");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public y05.d j() {
        return (y05.d) super.getCustom(this.f458658d + 0);
    }

    public void k(y05.d dVar) {
        super.set(this.f458658d + 0, dVar);
    }
}
