package gu2;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f275939d;

    public a() {
        int appendAttrs = super.appendAttrs(new com.tencent.mm.protobuf.k[]{com.tencent.mm.protobuf.i.n(-1, "is_from_draft")});
        this.f275939d = appendAttrs;
        super.set__serialName("ActionResult");
        super.set__xmlPrefixTag("");
        super.set__trim(true);
        super.replaceDefault(appendAttrs, new java.lang.Object[]{0L});
    }

    @Override // e14.l
    public boolean checkValueSkip(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        kotlin.jvm.internal.o.g(fieldSerializeName, "fieldSerializeName");
        return false;
    }

    public void j(long j17) {
        super.set(this.f275939d + 0, java.lang.Long.valueOf(j17));
    }
}
