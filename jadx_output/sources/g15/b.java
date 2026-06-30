package g15;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f267587d;

    public b() {
        com.tencent.mm.protobuf.k c17 = com.tencent.mm.protobuf.i.c(-1, "voiceInput");
        c17.f192167h = true;
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "lastEditingMsg"), com.tencent.mm.protobuf.i.r(-1, "lastEditingQuote", g15.d.class), c17, com.tencent.mm.protobuf.i.t(-1, "recentAtRecord", g15.c.class, "oneAtRecord"), com.tencent.mm.protobuf.i.t(-1, "convRedHintList", g15.a.class, "")});
        this.f267587d = appendAttrs;
        super.set__serialName("DraftInfo");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", null, java.lang.Boolean.FALSE, new java.util.LinkedList(), new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.getLinkedList(this.f267587d + 4);
    }

    public java.lang.String k() {
        return super.getString(this.f267587d + 0);
    }

    public g15.d l() {
        return (g15.d) super.getCustom(this.f267587d + 1);
    }

    public java.util.LinkedList n() {
        return super.getLinkedList(this.f267587d + 3);
    }

    public boolean o() {
        return super.getBoolean(this.f267587d + 2);
    }

    public void p(java.lang.String str) {
        super.set(this.f267587d + 0, str);
    }

    public void q(g15.d dVar) {
        super.set(this.f267587d + 1, dVar);
    }

    public void r(java.util.LinkedList linkedList) {
        super.set(this.f267587d + 3, linkedList);
    }

    public void s(boolean z17) {
        super.set(this.f267587d + 2, java.lang.Boolean.valueOf(z17));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DraftInfo(lastEditingMsg='");
        int i17 = this.f267587d;
        sb6.append(com.tencent.mm.sdk.platformtools.t8.G1(super.getString(i17 + 0)));
        sb6.append("', quoteDraft={");
        g15.d dVar = (g15.d) super.getCustom(i17 + 1);
        sb6.append(dVar != null ? dVar.j() : 0L);
        sb6.append("}, voiceInput=");
        sb6.append(super.getBoolean(i17 + 2));
        sb6.append(')');
        return sb6.toString();
    }
}
