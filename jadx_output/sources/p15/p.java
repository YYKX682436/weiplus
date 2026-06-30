package p15;

/* loaded from: classes12.dex */
public class p extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f351261d;

    public p() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "emojilist", p15.i.class, "emojiitem")});
        this.f351261d = appendAttrs;
        super.set__serialName("mediaeditcontent");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f351261d + 0);
    }

    public void k(java.util.LinkedList linkedList) {
        super.set(this.f351261d + 0, linkedList);
    }
}
