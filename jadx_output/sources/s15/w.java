package s15;

/* loaded from: classes9.dex */
public class w extends k15.b {

    /* renamed from: e, reason: collision with root package name */
    public final int f402182e;

    public w() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "noteinfo", s15.a0.class), com.tencent.mm.protobuf.i.t(-1, "datalist", s15.h.class, "dataitem"), com.tencent.mm.protobuf.i.u(-1, "favusername"), com.tencent.mm.protobuf.i.u(-1, "favcreatetime"), com.tencent.mm.protobuf.i.n(-1, "edittime"), com.tencent.mm.protobuf.i.u(-1, "editusr"), com.tencent.mm.protobuf.i.i(-1, "isChatRoom")});
        this.f402182e = appendAttrs;
        super.set__serialName("recordinfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, new java.util.LinkedList(), "", "", 0L, "", 0});
    }

    @Override // e14.l
    public boolean isXmlListNeedCountAttr(java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        kotlin.jvm.internal.o.g(tagName, "tagName");
        kotlin.jvm.internal.o.g(itemTagName, "itemTagName");
        if (kotlin.jvm.internal.o.b(tagName, "datalist")) {
            return true;
        }
        return super.isXmlListNeedCountAttr(tagName, itemTagName, z17);
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f402182e + 1);
    }

    public void k(int i17) {
        super.set(this.f402182e + 6, java.lang.Integer.valueOf(i17));
    }

    public void l(java.util.LinkedList linkedList) {
        super.set(this.f402182e + 1, linkedList);
    }

    public void n(long j17) {
        super.set(this.f402182e + 4, java.lang.Long.valueOf(j17));
    }

    public void o(java.lang.String str) {
        super.set(this.f402182e + 5, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f402182e + 3, str);
    }

    public void q(s15.a0 a0Var) {
        super.set(this.f402182e + 0, a0Var);
    }
}
