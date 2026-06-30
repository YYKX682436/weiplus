package rx0;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final rx0.j f400933i = new rx0.j(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f400934a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f400935b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.camerafun.MJRecordingFinishInfo f400936c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.q23 f400937d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400938e;

    /* renamed from: f, reason: collision with root package name */
    public final yx0.u f400939f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f400940g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f400941h;

    public k(int i17, boolean z17, com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, r45.q23 q23Var, java.lang.String str, yx0.u uVar, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str2) {
        this.f400934a = i17;
        this.f400935b = z17;
        this.f400936c = mJRecordingFinishInfo;
        this.f400937d = q23Var;
        this.f400938e = str;
        this.f400939f = uVar;
        this.f400940g = mJTime;
        this.f400941h = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0.k)) {
            return false;
        }
        rx0.k kVar = (rx0.k) obj;
        return this.f400934a == kVar.f400934a && this.f400935b == kVar.f400935b && kotlin.jvm.internal.o.b(this.f400936c, kVar.f400936c) && kotlin.jvm.internal.o.b(this.f400937d, kVar.f400937d) && kotlin.jvm.internal.o.b(this.f400938e, kVar.f400938e) && kotlin.jvm.internal.o.b(this.f400939f, kVar.f400939f) && kotlin.jvm.internal.o.b(this.f400940g, kVar.f400940g) && kotlin.jvm.internal.o.b(this.f400941h, kVar.f400941h);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f400934a) * 31) + java.lang.Boolean.hashCode(this.f400935b)) * 31;
        com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo = this.f400936c;
        int hashCode2 = (hashCode + (mJRecordingFinishInfo == null ? 0 : mJRecordingFinishInfo.hashCode())) * 31;
        r45.q23 q23Var = this.f400937d;
        int hashCode3 = (hashCode2 + (q23Var == null ? 0 : q23Var.hashCode())) * 31;
        java.lang.String str = this.f400938e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        yx0.u uVar = this.f400939f;
        int hashCode5 = (hashCode4 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        com.tencent.maas.model.time.MJTime mJTime = this.f400940g;
        int hashCode6 = (hashCode5 + (mJTime == null ? 0 : mJTime.hashCode())) * 31;
        java.lang.String str2 = this.f400941h;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TemplateResult(result=" + this.f400934a + ", isVideo=" + this.f400935b + ", finishInfo=" + this.f400936c + ", templateInfo=" + this.f400937d + ", selectedMjMusicId=" + this.f400938e + ", musicState=" + this.f400939f + ", coverStartTime=" + this.f400940g + ", conditionNotMetReason=" + this.f400941h + ')';
    }
}
