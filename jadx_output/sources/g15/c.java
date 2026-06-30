package g15;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f267588d;

    public c() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.x(-1, "atUserList", "")});
        this.f267588d = appendAttrs;
        super.set__serialName("DraftOneAtRecord");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f267588d + 0);
    }

    public void k(java.util.LinkedList linkedList) {
        super.set(this.f267588d + 0, linkedList);
    }
}
