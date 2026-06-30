package r72;

/* loaded from: classes15.dex */
public class h extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f393141d;

    public h() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.r(-1, "recordinfo", r72.g.class)});
        this.f393141d = appendAttrs;
        super.set__serialName("DataRecordItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null});
    }

    public r72.g j() {
        return (r72.g) super.getCustom(this.f393141d + 0);
    }

    public void k(r72.g gVar) {
        super.set(this.f393141d + 0, gVar);
    }
}
