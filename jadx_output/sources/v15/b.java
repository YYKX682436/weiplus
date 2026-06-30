package v15;

/* loaded from: classes11.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f432594d;

    public b() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.t(-1, "downloadItem", v15.a.class, "SerializeFieldFlattenItemTagName")});
        this.f432594d = appendAttrs;
        super.set__serialName("downloadList");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f432594d + 0);
    }
}
