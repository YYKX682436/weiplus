package km2;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309114a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f309115b;

    /* renamed from: c, reason: collision with root package name */
    public final long f309116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309117d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f309118e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ja0 f309119f;

    /* renamed from: g, reason: collision with root package name */
    public long f309120g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f309121h;

    /* renamed from: i, reason: collision with root package name */
    public final long f309122i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f309123j;

    /* renamed from: k, reason: collision with root package name */
    public final int f309124k;

    public k(java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17, r45.ja0 ja0Var, long j18, boolean z18, long j19, java.lang.String str3, int i18) {
        this.f309114a = str;
        this.f309115b = str2;
        this.f309116c = j17;
        this.f309117d = i17;
        this.f309118e = z17;
        this.f309119f = ja0Var;
        this.f309120g = j18;
        this.f309121h = z18;
        this.f309122i = j19;
        this.f309123j = str3;
        this.f309124k = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.k)) {
            return false;
        }
        km2.k kVar = (km2.k) obj;
        return kotlin.jvm.internal.o.b(this.f309114a, kVar.f309114a) && kotlin.jvm.internal.o.b(this.f309115b, kVar.f309115b) && this.f309116c == kVar.f309116c && this.f309117d == kVar.f309117d && this.f309118e == kVar.f309118e && kotlin.jvm.internal.o.b(this.f309119f, kVar.f309119f) && this.f309120g == kVar.f309120g && this.f309121h == kVar.f309121h && this.f309122i == kVar.f309122i && kotlin.jvm.internal.o.b(this.f309123j, kVar.f309123j) && this.f309124k == kVar.f309124k;
    }

    public int hashCode() {
        java.lang.String str = this.f309114a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f309115b;
        int hashCode2 = (((((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Long.hashCode(this.f309116c)) * 31) + java.lang.Integer.hashCode(this.f309117d)) * 31) + java.lang.Boolean.hashCode(this.f309118e)) * 31;
        r45.ja0 ja0Var = this.f309119f;
        int hashCode3 = (((((((hashCode2 + (ja0Var == null ? 0 : ja0Var.hashCode())) * 31) + java.lang.Long.hashCode(this.f309120g)) * 31) + java.lang.Boolean.hashCode(this.f309121h)) * 31) + java.lang.Long.hashCode(this.f309122i)) * 31;
        java.lang.String str3 = this.f309123j;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f309124k);
    }

    public java.lang.String toString() {
        return "FinderLiveBattlePlayerInfo(username=" + this.f309114a + ", userSdkId=" + this.f309115b + ", wecoinHot=" + this.f309116c + ", winningStreakCount=" + this.f309117d + ", isAccepted=" + this.f309118e + ", critQuestInfo=" + this.f309119f + ", extraRewardWecoin=" + this.f309120g + ", isApplicant=" + this.f309121h + ", count=" + this.f309122i + ", boardKey=" + this.f309123j + ", boardType=" + this.f309124k + ')';
    }

    public /* synthetic */ k(java.lang.String str, java.lang.String str2, long j17, int i17, boolean z17, r45.ja0 ja0Var, long j18, boolean z18, long j19, java.lang.String str3, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, (i19 & 2) != 0 ? "" : str2, (i19 & 4) != 0 ? 0L : j17, (i19 & 8) != 0 ? 0 : i17, (i19 & 16) != 0 ? false : z17, (i19 & 32) != 0 ? null : ja0Var, (i19 & 64) != 0 ? 0L : j18, (i19 & 128) != 0 ? false : z18, (i19 & 256) == 0 ? j19 : 0L, (i19 & 512) == 0 ? str3 : null, (i19 & 1024) == 0 ? i18 : 0);
    }
}
