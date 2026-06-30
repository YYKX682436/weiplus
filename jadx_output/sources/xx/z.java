package xx;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f457843a;

    /* renamed from: b, reason: collision with root package name */
    public int f457844b;

    /* renamed from: c, reason: collision with root package name */
    public int f457845c;

    /* renamed from: d, reason: collision with root package name */
    public int f457846d;

    /* renamed from: e, reason: collision with root package name */
    public int f457847e;

    /* renamed from: f, reason: collision with root package name */
    public int f457848f;

    /* renamed from: g, reason: collision with root package name */
    public int f457849g;

    public z(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, kotlin.jvm.internal.i iVar) {
        i17 = (i38 & 1) != 0 ? 0 : i17;
        i18 = (i38 & 2) != 0 ? 0 : i18;
        i19 = (i38 & 4) != 0 ? 0 : i19;
        i27 = (i38 & 8) != 0 ? 0 : i27;
        i28 = (i38 & 16) != 0 ? 0 : i28;
        i29 = (i38 & 32) != 0 ? 0 : i29;
        i37 = (i38 & 64) != 0 ? 0 : i37;
        this.f457843a = i17;
        this.f457844b = i18;
        this.f457845c = i19;
        this.f457846d = i27;
        this.f457847e = i28;
        this.f457848f = i29;
        this.f457849g = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx.z)) {
            return false;
        }
        xx.z zVar = (xx.z) obj;
        return this.f457843a == zVar.f457843a && this.f457844b == zVar.f457844b && this.f457845c == zVar.f457845c && this.f457846d == zVar.f457846d && this.f457847e == zVar.f457847e && this.f457848f == zVar.f457848f && this.f457849g == zVar.f457849g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f457843a) * 31) + java.lang.Integer.hashCode(this.f457844b)) * 31) + java.lang.Integer.hashCode(this.f457845c)) * 31) + java.lang.Integer.hashCode(this.f457846d)) * 31) + java.lang.Integer.hashCode(this.f457847e)) * 31) + java.lang.Integer.hashCode(this.f457848f)) * 31) + java.lang.Integer.hashCode(this.f457849g);
    }

    public java.lang.String toString() {
        return "CommentExitInfo(userCommentCnt=" + this.f457843a + ", newQuestionCnt=" + this.f457844b + ", onlineUserCnt=" + this.f457845c + ", dailyChatPv=" + this.f457846d + ", ifAnswerQuestion=" + this.f457847e + ", avatarSelfAnswerCnt=" + this.f457848f + ", avatarAnswerCnt=" + this.f457849g + ')';
    }
}
