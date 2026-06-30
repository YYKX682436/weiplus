package tm4;

/* loaded from: classes8.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f420642d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "reddotList", tm4.b.class, "")});
        this.f420642d = appendAttrs;
        super.set__serialName("fetchUniformReddotResult");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f420642d + 0);
    }
}
