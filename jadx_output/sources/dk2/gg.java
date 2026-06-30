package dk2;

/* loaded from: classes5.dex */
public final class gg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f233530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f233531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f233533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f233534h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f233535i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f233536m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f233537n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233538o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f233539p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f233540q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(long j17, boolean z17, boolean z18, int i17, int i18, boolean z19, int i19, java.lang.Integer num, java.lang.String str, boolean z27, boolean z28) {
        super(0);
        this.f233530d = j17;
        this.f233531e = z17;
        this.f233532f = z18;
        this.f233533g = i17;
        this.f233534h = i18;
        this.f233535i = z19;
        this.f233536m = i19;
        this.f233537n = num;
        this.f233538o = str;
        this.f233539p = z27;
        this.f233540q = z28;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String message;
        try {
            cl0.g gVar = new cl0.g();
            long j17 = this.f233530d;
            boolean z17 = this.f233531e;
            boolean z18 = this.f233532f;
            int i17 = this.f233533g;
            int i18 = this.f233534h;
            boolean z19 = this.f233535i;
            int i19 = this.f233536m;
            java.lang.Integer num = this.f233537n;
            java.lang.String str = this.f233538o;
            boolean z27 = this.f233539p;
            boolean z28 = this.f233540q;
            gVar.s("liveId", java.lang.Long.valueOf(j17));
            gVar.s("isFloat", java.lang.Boolean.valueOf(z17));
            gVar.s("isForeground", java.lang.Boolean.valueOf(z18));
            gVar.s("threadCntInProcess", java.lang.Integer.valueOf(i17));
            gVar.s("threadCntInJava", java.lang.Integer.valueOf(i18));
            gVar.s("screenOff", java.lang.Boolean.valueOf(z19));
            gVar.s("battery", java.lang.Integer.valueOf(i19));
            gVar.s("curBattery", num);
            gVar.s("memInfo", str);
            gVar.s("hasStack", java.lang.Boolean.valueOf(z27));
            gVar.s("deleteSuc", java.lang.Boolean.valueOf(z28));
            message = gVar.toString();
        } catch (java.lang.Exception e17) {
            message = e17.getMessage();
            if (message == null) {
                message = "";
            }
        }
        kotlin.jvm.internal.o.d(message);
        return message;
    }
}
