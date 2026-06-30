package m14;

/* loaded from: classes5.dex */
public class n extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f322882d;

    public n() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "items", m14.o.class, "")});
        this.f322882d = appendAttrs;
        super.set__serialName("TipsData");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f322882d + 0);
    }
}
