package w05;

/* loaded from: classes9.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f441935d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "subtype"), com.tencent.mm.protobuf.i.u(-1, "wishmessage"), com.tencent.mm.protobuf.i.u(-1, "gifttitle"), com.tencent.mm.protobuf.i.i(-1, "takemethod"), com.tencent.mm.protobuf.i.u(-1, "giftmsgid"), com.tencent.mm.protobuf.i.r(-1, "jumpinfo", w05.g.class), com.tencent.mm.protobuf.i.t(-1, "gifts", w05.e.class, "gift"), com.tencent.mm.protobuf.i.u(-1, "appmsg_sign"), com.tencent.mm.protobuf.i.i(-1, "disable_receive"), com.tencent.mm.protobuf.i.u(-1, "giftsourcename"), com.tencent.mm.protobuf.i.r(-1, "giftcover", w05.f.class), com.tencent.mm.protobuf.i.m(-1, "giftLabels", "item"), com.tencent.mm.protobuf.i.u(-1, "gifttitletemplate"), com.tencent.mm.protobuf.i.u(-1, "recvusername"), com.tencent.mm.protobuf.i.i(-1, "ellipsisindex"), com.tencent.mm.protobuf.i.i(-1, "fromproductset"), com.tencent.mm.protobuf.i.t(-1, "skuinfos", w05.n.class, "skuinfo"), com.tencent.mm.protobuf.i.u(-1, "drawtimewording"), com.tencent.mm.protobuf.i.i(-1, "lotterymethod"), com.tencent.mm.protobuf.i.r(-1, "giftanimationmaterial", w05.c.class)});
        this.f441935d = appendAttrs;
        super.set__serialName("ecsgift");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, "", "", 0, "", null, new java.util.LinkedList(), "", 0, "", null, new java.util.LinkedList(), "", "", 0, 0, new java.util.LinkedList(), "", 0, null});
    }

    public java.util.LinkedList A() {
        return super.getLinkedList(this.f441935d + 16);
    }

    public int B() {
        return super.getInteger(this.f441935d + 3);
    }

    public java.lang.String C() {
        return super.getString(this.f441935d + 1);
    }

    public int getSubType() {
        return super.getInteger(this.f441935d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f441935d + 7);
    }

    public int k() {
        return super.getInteger(this.f441935d + 8);
    }

    public java.lang.String l() {
        return super.getString(this.f441935d + 17);
    }

    public int n() {
        return super.getInteger(this.f441935d + 14);
    }

    public int o() {
        return super.getInteger(this.f441935d + 15);
    }

    public w05.c p() {
        return (w05.c) super.getCustom(this.f441935d + 19);
    }

    public w05.f q() {
        return (w05.f) super.getCustom(this.f441935d + 10);
    }

    public java.util.LinkedList r() {
        return super.getLinkedList(this.f441935d + 11);
    }

    public java.util.LinkedList s() {
        return super.getLinkedList(this.f441935d + 6);
    }

    public java.lang.String t() {
        return super.getString(this.f441935d + 4);
    }

    public java.lang.String u() {
        return super.getString(this.f441935d + 2);
    }

    public java.lang.String w() {
        return super.getString(this.f441935d + 12);
    }

    public w05.g x() {
        return (w05.g) super.getCustom(this.f441935d + 5);
    }

    public int y() {
        return super.getInteger(this.f441935d + 18);
    }

    public java.lang.String z() {
        return super.getString(this.f441935d + 13);
    }
}
