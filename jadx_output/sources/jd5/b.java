package jd5;

/* loaded from: classes9.dex */
public class b extends co.a {

    /* renamed from: e, reason: collision with root package name */
    public final int f299184e;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "itemList", oi3.g.class, "")});
        this.f299184e = appendAttrs;
        super.set__serialName("previewmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    @Override // co.a
    public java.lang.Object clone() {
        return super.clone();
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f299184e + 0);
    }

    public void k(java.util.LinkedList linkedList) {
        super.set(this.f299184e + 0, linkedList);
    }
}
