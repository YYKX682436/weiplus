package s15;

/* loaded from: classes9.dex */
public class a0 extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f402152d;

    public a0() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.u(-1, "noteauthor"), com.tencent.mm.protobuf.i.u(-1, "noteeditor")});
        this.f402152d = appendAttrs;
        super.set__serialName("RecordNoteInfoItem");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{"", ""});
    }

    public void j(java.lang.String str) {
        super.set(this.f402152d + 0, str);
    }

    public void k(java.lang.String str) {
        super.set(this.f402152d + 1, str);
    }
}
