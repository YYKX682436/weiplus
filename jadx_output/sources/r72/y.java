package r72;

/* loaded from: classes16.dex */
public class y extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393161d;

    public y() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "fallbackurl"), com.tencent.mm.protobuf.i.i(-1, "subtype"), com.tencent.mm.protobuf.i.i(-1, "bizId"), com.tencent.mm.protobuf.i.u(-1, "nickname"), com.tencent.mm.protobuf.i.u(-1, "des"), com.tencent.mm.protobuf.i.u(-1, com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE), com.tencent.mm.protobuf.i.i(-1, "jumptype"), com.tencent.mm.protobuf.i.i(-1, "mediatype"), com.tencent.mm.protobuf.i.i(-1, "subtype"), com.tencent.mm.protobuf.i.u(-1, "query"), com.tencent.mm.protobuf.i.u(-1, "pagepath"), com.tencent.mm.protobuf.i.u(-1, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE), com.tencent.mm.protobuf.i.u(-1, "appid"), com.tencent.mm.protobuf.i.u(-1, "appId"), com.tencent.mm.protobuf.i.u(-1, "thumburl"), com.tencent.mm.protobuf.i.u(-1, "thumbUrl"), com.tencent.mm.protobuf.i.c(-1, "isTransparent"), com.tencent.mm.protobuf.i.c(-1, "forbidForward"), com.tencent.mm.protobuf.i.t(-1, "excerptlist", r72.j.class, "excerptitem")});
        this.f393161d = appendAttrs;
        super.set__serialName("liteappitem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", -1, -1, "", "", "", -1, -1, -1, "", "", "", "", "", "", "", bool, bool, linkedList});
    }

    public void A(java.lang.String str) {
        super.set(this.f393161d + 4, str);
    }

    public void B(boolean z17) {
        super.set(this.f393161d + 17, java.lang.Boolean.valueOf(z17));
    }

    public void C(int i17) {
        super.set(this.f393161d + 6, java.lang.Integer.valueOf(i17));
    }

    public void E(int i17) {
        super.set(this.f393161d + 7, java.lang.Integer.valueOf(i17));
    }

    public void F(java.lang.String str) {
        super.set(this.f393161d + 3, str);
    }

    public void G(java.lang.String str) {
        super.set(this.f393161d + 10, str);
    }

    public void H(java.lang.String str) {
        super.set(this.f393161d + 9, str);
    }

    public void I(java.lang.String str) {
        super.set(this.f393161d + 14, str);
    }

    public void J(java.lang.String str) {
        super.set(this.f393161d + 5, str);
    }

    public void K(boolean z17) {
        super.set(this.f393161d + 16, java.lang.Boolean.valueOf(z17));
    }

    public void L(java.lang.String str) {
        super.set(this.f393161d + 0, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r3.equals("appId") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r3.equals(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3.equals("thumbUrl") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r3.equals("bizId") == false) goto L18;
     */
    @Override // e14.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean checkValueSkip(java.lang.String r3, java.lang.Object r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fieldSerializeName"
            kotlin.jvm.internal.o.g(r3, r0)
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case 3433103: goto L2a;
                case 93028124: goto L21;
                case 93752718: goto L18;
                case 1566917561: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L35
        Le:
            java.lang.String r0 = "thumbUrl"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L35
            goto L34
        L18:
            java.lang.String r0 = "bizId"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L35
        L21:
            java.lang.String r0 = "appId"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L35
        L2a:
            java.lang.String r0 = "page"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            java.lang.String r0 = "subtype"
            boolean r0 = kotlin.jvm.internal.o.b(r3, r0)
            if (r0 == 0) goto L59
            if (r4 == 0) goto L58
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r5 = kotlin.jvm.internal.o.b(r4, r5)
            if (r5 != 0) goto L58
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = kotlin.jvm.internal.o.b(r4, r5)
            if (r4 == 0) goto L57
            goto L58
        L57:
            r1 = r3
        L58:
            return r1
        L59:
            boolean r3 = super.checkValueSkip(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r72.y.checkValueSkip(java.lang.String, java.lang.Object, boolean):boolean");
    }

    public java.lang.String getAppId() {
        return super.getString(this.f393161d + 12);
    }

    public int getMediaType() {
        return super.getInteger(this.f393161d + 7);
    }

    public java.lang.String getNickName() {
        return super.getString(this.f393161d + 3);
    }

    public java.lang.String getThumbUrl() {
        return super.getString(this.f393161d + 14);
    }

    public java.lang.String getTitle() {
        return super.getString(this.f393161d + 5);
    }

    public java.lang.String getUrl() {
        return super.getString(this.f393161d + 0);
    }

    public int j() {
        return super.getInteger(this.f393161d + 1);
    }

    public java.lang.String k() {
        return super.getString(this.f393161d + 4);
    }

    public java.util.LinkedList l() {
        return super.getLinkedList(this.f393161d + 18);
    }

    public java.lang.String n() {
        return super.getString(this.f393161d + 13);
    }

    public int o() {
        return super.getInteger(this.f393161d + 2);
    }

    public int p() {
        return super.getInteger(this.f393161d + 8);
    }

    public java.lang.String q() {
        return super.getString(this.f393161d + 11);
    }

    public java.lang.String r() {
        return super.getString(this.f393161d + 15);
    }

    public boolean s() {
        return super.getBoolean(this.f393161d + 17);
    }

    public int t() {
        return super.getInteger(this.f393161d + 6);
    }

    public java.lang.String u() {
        return super.getString(this.f393161d + 10);
    }

    public java.lang.String w() {
        return super.getString(this.f393161d + 9);
    }

    public boolean x() {
        return super.getBoolean(this.f393161d + 16);
    }

    public void y(java.lang.String str) {
        super.set(this.f393161d + 12, str);
    }

    public void z(int i17) {
        super.set(this.f393161d + 1, java.lang.Integer.valueOf(i17));
    }
}
