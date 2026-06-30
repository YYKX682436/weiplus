package dk2;

/* loaded from: classes2.dex */
public final class of {

    /* renamed from: j, reason: collision with root package name */
    public static final dk2.nf f233859j = new dk2.nf(null);

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f233860k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f233861a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f233862b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.vz2 f233863c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f233864d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f233865e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f233866f;

    /* renamed from: g, reason: collision with root package name */
    public final int f233867g;

    /* renamed from: h, reason: collision with root package name */
    public final int f233868h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f233869i;

    public of(java.lang.String themeId, java.lang.String themeTag, java.lang.String cardId, r45.vz2 vz2Var, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, boolean z17, int i17, int i18, boolean z18) {
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(themeTag, "themeTag");
        kotlin.jvm.internal.o.g(cardId, "cardId");
        this.f233861a = themeId;
        this.f233862b = cardId;
        this.f233863c = vz2Var;
        this.f233864d = gVar;
        this.f233865e = gVar2;
        this.f233866f = z17;
        this.f233867g = i17;
        this.f233868h = i18;
        this.f233869i = z18;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveThemeSpecialBundle[themeId=");
        sb6.append(this.f233861a);
        sb6.append(", cardId=");
        sb6.append(this.f233862b);
        sb6.append(", themeAppearance=");
        r45.vz2 vz2Var = this.f233863c;
        if (vz2Var != null) {
            str = "title:" + vz2Var.f388690e + " subTitle: " + vz2Var.f388692g + " containerType: " + vz2Var.f388698p;
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", cardBuffer=");
        sb6.append(this.f233864d);
        sb6.append(", cardType=");
        sb6.append(this.f233867g);
        sb6.append(", playTogetherLiveType=");
        sb6.append(this.f233868h);
        sb6.append(", enterCheckCache=");
        sb6.append(this.f233869i);
        sb6.append(']');
        return sb6.toString();
    }
}
