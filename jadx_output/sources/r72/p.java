package r72;

/* loaded from: classes15.dex */
public class p extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393153d;

    public p() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "avatarUrl"), com.tencent.mm.protobuf.i.t(-1, "authors", r72.o.class, "author")});
        this.f393153d = appendAttrs;
        super.set__serialName("coAuthor");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, new java.util.LinkedList()});
    }

    public java.lang.String getAvatarUrl() {
        return super.getString(this.f393153d + 0);
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f393153d + 1);
    }

    public void k(java.util.LinkedList linkedList) {
        super.set(this.f393153d + 1, linkedList);
    }

    public void l(java.lang.String str) {
        super.set(this.f393153d + 0, str);
    }
}
