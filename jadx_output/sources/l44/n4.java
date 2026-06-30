package l44;

/* loaded from: classes4.dex */
public class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f316276a;

    /* renamed from: b, reason: collision with root package name */
    public final long f316277b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f316278c;

    /* renamed from: d, reason: collision with root package name */
    public final int f316279d;

    /* renamed from: e, reason: collision with root package name */
    public final int f316280e;

    public n4(long j17, long j18, java.lang.String str, int i17, int i18) {
        this.f316276a = j17;
        this.f316277b = j18;
        this.f316278c = str;
        this.f316279d = i17;
        this.f316280e = i18;
    }

    public n4(long j17, long j18) {
        this(j17, j18, "", 0, 0);
    }

    public n4(com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo, int i17, int i18) {
        this(0L, adSnsInfo.field_snsId, adSnsInfo.getAdInfo().uxInfo, i17, i18);
    }
}
