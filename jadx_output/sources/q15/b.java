package q15;

/* loaded from: classes5.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f359693d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "masssend_msg_info", q15.c.class), com.tencent.mm.protobuf.i.t(-1, "newmsgid_list", q15.d.class, "newmsgid")});
        this.f359693d = appendAttrs;
        super.set__serialName("masssend_newxml");
        super.set__xmlPrefixTag("sysmsg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, new java.util.LinkedList()});
    }

    public q15.c j() {
        return (q15.c) super.getCustom(this.f359693d + 0);
    }

    public java.util.LinkedList k() {
        return super.getLinkedList(this.f359693d + 1);
    }
}
