package so2;

/* loaded from: classes10.dex */
public final class z4 {

    /* renamed from: k, reason: collision with root package name */
    public static final so2.x4 f410732k = new so2.x4(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410733a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410734b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410735c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410736d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f410737e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.a5 f410738f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f410739g;

    /* renamed from: h, reason: collision with root package name */
    public final int f410740h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f410741i;

    /* renamed from: j, reason: collision with root package name */
    public final so2.i5 f410742j;

    public z4(java.lang.String title, java.lang.String productID, int i17, java.lang.String appID, java.lang.String pagePath, so2.a5 source, java.lang.String str, int i18, java.lang.String extInfo, so2.i5 i5Var) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(productID, "productID");
        kotlin.jvm.internal.o.g(appID, "appID");
        kotlin.jvm.internal.o.g(pagePath, "pagePath");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        this.f410733a = title;
        this.f410734b = productID;
        this.f410735c = i17;
        this.f410736d = appID;
        this.f410737e = pagePath;
        this.f410738f = source;
        this.f410739g = str;
        this.f410740h = i18;
        this.f410741i = extInfo;
        this.f410742j = i5Var;
    }

    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo a() {
        cl0.g gVar = new cl0.g();
        java.lang.String str = this.f410734b;
        gVar.h("product_id", str);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJumpinfo_type(1);
        int i17 = this.f410740h;
        if (i17 == 0) {
            i17 = 1;
        }
        finderJumpInfo.setBusiness_type(i17);
        finderJumpInfo.setBusiness_category(1);
        java.lang.String str2 = this.f410739g;
        if (str2 == null || str2.length() == 0) {
            cu2.f0 f0Var = cu2.f0.f222391a;
            r45.am2 am2Var = (r45.am2) cu2.f0.f222397g.getCustom(3);
            str2 = am2Var != null ? am2Var.getString(1) : null;
        }
        finderJumpInfo.setIcon_url(str2);
        finderJumpInfo.setWording(this.f410733a);
        com.tencent.mm.protocal.protobuf.MiniAppInfo miniAppInfo = new com.tencent.mm.protocal.protobuf.MiniAppInfo();
        miniAppInfo.setApp_id(this.f410736d);
        miniAppInfo.setPath(this.f410737e);
        miniAppInfo.setFetch_info_id(str);
        finderJumpInfo.setMini_app_info(miniAppInfo);
        finderJumpInfo.setExt_info(gVar.toString());
        byte[] bytes = this.f410741i.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        finderJumpInfo.setExt_buff(com.tencent.mm.protobuf.g.b(bytes));
        finderJumpInfo.setSource(1);
        if (so2.y4.f410725a[this.f410738f.ordinal()] == 1) {
            java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
            r45.wf6 wf6Var = new r45.wf6();
            wf6Var.set(1, 1);
            wf6Var.set(2, 0);
            wf6Var.set(0, 1);
            style.add(wf6Var);
            java.util.LinkedList<r45.wf6> style2 = finderJumpInfo.getStyle();
            r45.wf6 wf6Var2 = new r45.wf6();
            wf6Var2.set(1, 6);
            wf6Var2.set(2, 2);
            wf6Var2.set(0, 1);
            style2.add(wf6Var2);
        }
        return finderJumpInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.z4)) {
            return false;
        }
        so2.z4 z4Var = (so2.z4) obj;
        return kotlin.jvm.internal.o.b(this.f410733a, z4Var.f410733a) && kotlin.jvm.internal.o.b(this.f410734b, z4Var.f410734b) && this.f410735c == z4Var.f410735c && kotlin.jvm.internal.o.b(this.f410736d, z4Var.f410736d) && kotlin.jvm.internal.o.b(this.f410737e, z4Var.f410737e) && this.f410738f == z4Var.f410738f && kotlin.jvm.internal.o.b(this.f410739g, z4Var.f410739g) && this.f410740h == z4Var.f410740h && kotlin.jvm.internal.o.b(this.f410741i, z4Var.f410741i) && kotlin.jvm.internal.o.b(this.f410742j, z4Var.f410742j);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f410733a.hashCode() * 31) + this.f410734b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410735c)) * 31) + this.f410736d.hashCode()) * 31) + this.f410737e.hashCode()) * 31) + this.f410738f.hashCode()) * 31;
        java.lang.String str = this.f410739g;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f410740h)) * 31) + this.f410741i.hashCode()) * 31;
        so2.i5 i5Var = this.f410742j;
        return hashCode2 + (i5Var != null ? i5Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderSelectProductInfo(title=" + this.f410733a + ", productID=" + this.f410734b + ", activityType=" + this.f410735c + ", appID=" + this.f410736d + ", pagePath=" + this.f410737e + ", source=" + this.f410738f + ", iconUrl=" + this.f410739g + ", busienssType=" + this.f410740h + ", extInfo=" + this.f410741i + ", previewIcon=" + this.f410742j + ')';
    }
}
