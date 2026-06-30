package rx0;

/* loaded from: classes5.dex */
public final class f extends rx0.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f400916a;

    /* renamed from: b, reason: collision with root package name */
    public final long f400917b;

    /* renamed from: c, reason: collision with root package name */
    public final int f400918c;

    /* renamed from: d, reason: collision with root package name */
    public final long f400919d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f400920e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f400921f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f400922g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.to0 f400923h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.xy6 f400924i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.b70 f400925j;

    /* renamed from: k, reason: collision with root package name */
    public final r45.mi0 f400926k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String templateId, long j17, int i17, long j18, com.tencent.mm.protobuf.g gVar, boolean z17, boolean z18, r45.to0 to0Var, r45.xy6 xy6Var, r45.b70 b70Var, r45.mi0 mi0Var) {
        super(null);
        kotlin.jvm.internal.o.g(templateId, "templateId");
        this.f400916a = templateId;
        this.f400917b = j17;
        this.f400918c = i17;
        this.f400919d = j18;
        this.f400920e = gVar;
        this.f400921f = z17;
        this.f400922g = z18;
        this.f400923h = to0Var;
        this.f400924i = xy6Var;
        this.f400925j = b70Var;
        this.f400926k = mi0Var;
    }

    public java.lang.String toString() {
        return "Normal(templateId='" + this.f400916a + "', templateTabId=" + this.f400917b + ", templatePosition=" + this.f400918c + ", templateVersion=" + this.f400919d + ", sessionBuffer=" + this.f400920e + ", isFavorite=" + this.f400921f + ", isAIGC=" + this.f400922g + ", faceRecognitionInfo=" + this.f400923h + ", tplVersionInfo=" + this.f400924i + ", commonTplInfo=" + this.f400925j + ", effectEditInfo=" + this.f400926k + ')';
    }
}
