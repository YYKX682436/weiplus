package m84;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f324822a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f324823b;

    /* renamed from: c, reason: collision with root package name */
    public final long f324824c;

    public z(java.lang.String avatarUrl, java.lang.String str, long j17) {
        kotlin.jvm.internal.o.g(avatarUrl, "avatarUrl");
        this.f324822a = avatarUrl;
        this.f324823b = str;
        this.f324824c = j17;
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarUrl", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarUrl", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return this.f324822a;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return true;
        }
        if (!(obj instanceof m84.z)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return false;
        }
        m84.z zVar = (m84.z) obj;
        if (!kotlin.jvm.internal.o.b(this.f324822a, zVar.f324822a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f324823b, zVar.f324823b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
            return false;
        }
        long j17 = this.f324824c;
        long j18 = zVar.f324824c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return j17 == j18;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        int hashCode = this.f324822a.hashCode() * 31;
        java.lang.String str = this.f324823b;
        int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f324824c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return hashCode2;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        java.lang.String str = "AvatarRecord(avatarUrl=" + this.f324822a + ", avatarMd5=" + this.f324823b + ", updateTs=" + this.f324824c + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarStorage$AvatarRecord");
        return str;
    }
}
