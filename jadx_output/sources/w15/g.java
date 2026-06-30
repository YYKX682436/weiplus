package w15;

/* loaded from: classes5.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f442248d;

    public g() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.v(-1, "type"), com.tencent.mm.protobuf.i.r(-1, "showTeenageModeOpenNotify", w15.f.class)});
        this.f442248d = appendAttrs;
        super.set__serialName("sysmsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{null, null});
    }

    public w15.f j() {
        return (w15.f) super.getCustom(this.f442248d + 1);
    }
}
