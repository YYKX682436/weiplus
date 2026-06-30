package l15;

/* loaded from: classes.dex */
public class f extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f315015d;

    public f() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.i(-1, "downloadcontroltype")});
        this.f315015d = appendAttrs;
        super.set__serialName("imagemsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0});
    }

    public int j() {
        return super.getInteger(this.f315015d + 0);
    }
}
