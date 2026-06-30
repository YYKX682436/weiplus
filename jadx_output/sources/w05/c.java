package w05;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441934d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "frontpagresname"), com.tencent.mm.protobuf.i.u(-1, "backgroudpagresname"), com.tencent.mm.protobuf.i.u(-1, "mbbasicitemtype"), com.tencent.mm.protobuf.i.u(-1, "mbflyitemtype"), com.tencent.mm.protobuf.i.n(-1, "mbminiversion")});
        this.f441934d = appendAttrs;
        super.set__serialName("giftanimationmaterial");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", "", "", "", 0L});
    }

    public java.lang.String j() {
        return super.getString(this.f441934d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f441934d + 0);
    }

    public java.lang.String l() {
        return super.getString(this.f441934d + 2);
    }

    public java.lang.String n() {
        return super.getString(this.f441934d + 3);
    }

    public long o() {
        return super.getLong(this.f441934d + 4);
    }
}
