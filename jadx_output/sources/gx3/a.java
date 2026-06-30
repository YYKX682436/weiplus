package gx3;

/* loaded from: classes12.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f277393d;

    public a() {
        com.tencent.mm.protobuf.k g17 = com.tencent.mm.protobuf.i.g(-1, "field4Custom");
        g17.f192167h = true;
        com.tencent.mm.protobuf.k g18 = com.tencent.mm.protobuf.i.g(-1, "field11");
        g18.f192162c = true;
        g18.f192168i = "";
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "field1Custom"), com.tencent.mm.protobuf.i.i(-1, "field2Custom"), com.tencent.mm.protobuf.i.t(-1, "field3Custom", gx3.b.class, ""), g17, com.tencent.mm.protobuf.i.u(-1, "field5"), com.tencent.mm.protobuf.i.u(-1, "field6"), com.tencent.mm.protobuf.i.x(-1, "field7", ""), com.tencent.mm.protobuf.i.x(-1, "field8", ""), com.tencent.mm.protobuf.i.x(-1, "field9", ""), com.tencent.mm.protobuf.i.m(-1, "field10", ""), g18, com.tencent.mm.protobuf.i.h(-1, "field12"), com.tencent.mm.protobuf.i.c(-1, "field13"), com.tencent.mm.protobuf.i.r(-1, "field14", gx3.b.class), com.tencent.mm.protobuf.i.r(-1, "field15", gx3.b.class), com.tencent.mm.protobuf.i.r(-1, "field16", gx3.b.class)});
        this.f277393d = appendAttrs;
        super.set__serialName("TestSerialize");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", 0, new java.util.LinkedList(), null, null, "", new java.util.LinkedList(), null, null, new java.util.LinkedList(), new java.util.LinkedList(), java.lang.Double.valueOf(0.1d), java.lang.Boolean.FALSE, null, new gx3.b(), new gx3.b()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f277393d + 9);
    }

    public gx3.b k() {
        return (gx3.b) super.getCustom(this.f277393d + 14);
    }

    public java.util.LinkedList l() {
        return super.getLinkedList(this.f277393d + 6);
    }

    public void n(java.lang.String str) {
        super.set(this.f277393d + 0, str);
    }

    public void o(int i17) {
        super.set(this.f277393d + 1, java.lang.Integer.valueOf(i17));
    }

    public void p(java.util.LinkedList linkedList) {
        super.set(this.f277393d + 2, linkedList);
    }
}
