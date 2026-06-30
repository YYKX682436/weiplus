package y15;

/* loaded from: classes12.dex */
public class a extends y15.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f458920e;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.j(-1, "type")});
        this.f458920e = appendAttrs;
        super.set__serialName("videomsg");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0});
    }

    public int getType() {
        return super.getInteger(this.f458920e + 0);
    }

    public void j(int i17) {
        super.set(this.f458920e + 0, java.lang.Integer.valueOf(i17));
    }
}
