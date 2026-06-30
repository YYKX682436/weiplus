package e15;

/* loaded from: classes5.dex */
public class i extends v05.b {

    /* renamed from: f, reason: collision with root package name */
    public final int f246449f;

    public i() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "tingChatRoomItem", e15.j.class)});
        this.f246449f = appendAttrs;
        super.set__serialName("appmsg");
        super.set__xmlPrefixTag("msg");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public e15.j j() {
        return (e15.j) super.getCustom(this.f246449f + 0);
    }
}
