package q15;

/* loaded from: classes5.dex */
public class d extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f359695d;

    public d() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "receiver"), com.tencent.mm.protobuf.i.u(-1, dm.i4.COL_ID)});
        this.f359695d = appendAttrs;
        super.set__serialName("newmsgid");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    public java.lang.String getTalker() {
        return super.getString(this.f359695d + 0);
    }

    public java.lang.String j() {
        return super.getString(this.f359695d + 1);
    }
}
