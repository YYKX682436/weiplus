package jd2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.text.SpannableString f299146a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f299147b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderAuthInfo f299148c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f299149d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f299150e;

    /* renamed from: f, reason: collision with root package name */
    public final int f299151f;

    public e(android.text.SpannableString nickname, java.lang.String timeString, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo, boolean z17, boolean z18, int i17) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(timeString, "timeString");
        this.f299146a = nickname;
        this.f299147b = timeString;
        this.f299148c = finderAuthInfo;
        this.f299149d = z17;
        this.f299150e = z18;
        this.f299151f = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd2.e)) {
            return false;
        }
        jd2.e eVar = (jd2.e) obj;
        return kotlin.jvm.internal.o.b(this.f299146a, eVar.f299146a) && kotlin.jvm.internal.o.b(this.f299147b, eVar.f299147b) && kotlin.jvm.internal.o.b(this.f299148c, eVar.f299148c) && this.f299149d == eVar.f299149d && this.f299150e == eVar.f299150e && this.f299151f == eVar.f299151f;
    }

    public int hashCode() {
        int hashCode = ((this.f299146a.hashCode() * 31) + this.f299147b.hashCode()) * 31;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = this.f299148c;
        return ((((((hashCode + (finderAuthInfo == null ? 0 : finderAuthInfo.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f299149d)) * 31) + java.lang.Boolean.hashCode(this.f299150e)) * 31) + java.lang.Integer.hashCode(this.f299151f);
    }

    public java.lang.String toString() {
        return "FinderLiveMentionTitleData(nickname=" + ((java.lang.Object) this.f299146a) + ", timeString=" + this.f299147b + ", authInfo=" + this.f299148c + ", showFinderLogo=" + this.f299149d + ", showFollowBtn=" + this.f299150e + ", mentionType=" + this.f299151f + ')';
    }
}
