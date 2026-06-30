package x05;

/* loaded from: classes5.dex */
public class l extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f451196d;

    public l() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "avatarUrl"), com.tencent.mm.protobuf.i.t(-1, "authors", x05.m.class, "author")});
        this.f451196d = appendAttrs;
        super.set__serialName("coAuthor");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, new java.util.LinkedList()});
    }

    public java.lang.String getAvatarUrl() {
        return super.getString(this.f451196d + 0);
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f451196d + 1);
    }
}
