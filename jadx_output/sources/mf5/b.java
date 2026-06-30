package mf5;

/* loaded from: classes5.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f326178d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "datalist", mf5.a.class, "dataitem")});
        this.f326178d = appendAttrs;
        super.set__serialName("introductionitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f326178d + 0);
    }
}
