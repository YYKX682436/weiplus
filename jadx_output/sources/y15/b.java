package y15;

/* loaded from: classes12.dex */
public class b extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f458921d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "videomsg", y15.a.class), com.tencent.mm.protobuf.i.r(-1, "extcommoninfo", r15.b.class)});
        this.f458921d = appendAttrs;
        super.set__serialName("msg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new y15.a(), null});
    }

    public y15.a j() {
        return (y15.a) super.getCustom(this.f458921d + 0);
    }
}
