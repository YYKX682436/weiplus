package dh3;

/* loaded from: classes5.dex */
public final class e extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f232501d;

    public e() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.q(-1, "msglocalidlist", ""), com.tencent.mm.protobuf.i.i(-1, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)});
        this.f232501d = appendAttrs;
        super.set__serialName("MsgBatchSendRecord");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        dh3.d dVar = dh3.d.f232496e;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{linkedList, 0});
    }

    public final int getScene() {
        return super.getInteger(this.f232501d + 1);
    }

    public final java.util.LinkedList j() {
        return super.getLinkedList(this.f232501d + 0);
    }

    public final void k(java.util.LinkedList linkedList) {
        super.set(this.f232501d + 0, linkedList);
    }

    public final void l(int i17) {
        super.set(this.f232501d + 1, java.lang.Integer.valueOf(i17));
    }
}
