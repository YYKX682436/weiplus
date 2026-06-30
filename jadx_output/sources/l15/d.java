package l15;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f315013d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "expinfo", n15.a.class), com.tencent.mm.protobuf.i.r(-1, "imagemsg", l15.f.class), com.tencent.mm.protobuf.i.r(-1, "sightmsg", l15.g.class), com.tencent.mm.protobuf.i.r(-1, "appMsg", l15.e.class)});
        this.f315013d = appendAttrs;
        super.set__serialName("msgoperation");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null, null, null});
    }

    public l15.e j() {
        return (l15.e) super.getCustom(this.f315013d + 3);
    }

    public n15.a k() {
        return (n15.a) super.getCustom(this.f315013d + 0);
    }

    public l15.f l() {
        return (l15.f) super.getCustom(this.f315013d + 1);
    }
}
