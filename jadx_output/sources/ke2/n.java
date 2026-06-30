package ke2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f306969a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f306970b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306971c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f306972d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f306973e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.o72 f306974f;

    /* renamed from: g, reason: collision with root package name */
    public final int f306975g;

    public n(long j17, java.lang.String objectNonceId, java.lang.String str, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, r45.o72 o72Var, int i17) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f306969a = j17;
        this.f306970b = objectNonceId;
        this.f306971c = str;
        this.f306972d = gVar;
        this.f306973e = gVar2;
        this.f306974f = o72Var;
        this.f306975g = i17;
    }

    public java.lang.String toString() {
        return "LiveEntranceNavRequest(objectId=" + this.f306969a + ", objectNonceId='" + this.f306970b + "', sessionBuffer=" + this.f306971c + ", lastBuffer=" + this.f306973e + ')';
    }
}
