package ti3;

/* loaded from: classes9.dex */
public final class d extends com.tencent.mm.sdk.platformtools.w3 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419582b;

    /* renamed from: c, reason: collision with root package name */
    public final g15.b f419583c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f419584d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.sdk.platformtools.x3 type, java.lang.String talker, g15.b bVar, java.lang.String modifyFrom) {
        super(type, "");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(modifyFrom, "modifyFrom");
        this.f419582b = talker;
        this.f419583c = bVar;
        this.f419584d = modifyFrom;
    }

    public java.lang.String toString() {
        return "DraftChangeEvent(type=" + this.f193048a + ", talker='" + this.f419582b + "', newDraftInfo=" + this.f419583c + ", modifyFrom='" + this.f419584d + "')";
    }
}
