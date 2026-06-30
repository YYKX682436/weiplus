package u83;

/* loaded from: classes8.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f425494d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "reddotList", u83.c.class, "")});
        this.f425494d = appendAttrs;
        super.set__serialName("WebSearchFetchUniformReddotListResult");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f425494d + 0);
    }
}
