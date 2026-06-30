package mn2;

/* loaded from: classes2.dex */
public final class e0 extends mn2.q3 {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.y90 f329940i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.String str, com.tencent.mm.plugin.finder.storage.y90 blurMediaType) {
        super(str, blurMediaType);
        kotlin.jvm.internal.o.g(blurMediaType, "blurMediaType");
        this.f329940i = blurMediaType;
    }

    @Override // mn2.q3, ip0.c
    public java.lang.String n() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f329940i.f128374d);
        sb6.append("_finder_blur_");
        java.lang.Object value = ((jz5.n) this.f330099h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        sb6.append((java.lang.String) value);
        return sb6.toString();
    }
}
