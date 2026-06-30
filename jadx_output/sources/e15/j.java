package e15;

/* loaded from: classes5.dex */
public class j extends v05.b {

    /* renamed from: f, reason: collision with root package name */
    public final int f246450f;

    public j() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "type"), com.tencent.mm.protobuf.i.u(-1, "categoryId"), com.tencent.mm.protobuf.i.u(-1, "categoryItem"), com.tencent.mm.protobuf.i.u(-1, "listenItem")});
        this.f246450f = appendAttrs;
        super.set__serialName("tingChatRoomItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0, null, null, null});
    }

    public java.lang.String j() {
        return super.getString(this.f246450f + 2);
    }

    public java.lang.String k() {
        return super.getString(this.f246450f + 3);
    }
}
