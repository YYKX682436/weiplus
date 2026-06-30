package xt5;

/* loaded from: classes15.dex */
public class a extends xt5.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f457161a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xt5.c f457162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f457163c;

    public a(xt5.c cVar, android.content.Context context) {
        this.f457162b = cVar;
        this.f457163c = context;
    }

    @Override // xt5.j
    public void a(int i17, java.lang.CharSequence charSequence) {
        zt5.h.a("Soter.FingerprintManagerCompat", "soter: basic onAuthenticationError", new java.lang.Object[0]);
        if (this.f457161a) {
            return;
        }
        boolean z17 = true;
        this.f457161a = true;
        xt5.c cVar = this.f457162b;
        if (i17 == 5) {
            zt5.h.c("Soter.FingerprintManagerCompat", "soter: user cancelled fingerprint authen", new java.lang.Object[0]);
            cVar.a();
            return;
        }
        if (i17 != 7) {
            cVar.b(i17, charSequence);
            return;
        }
        zt5.h.c("Soter.FingerprintManagerCompat", "soter: system call too many trial.", new java.lang.Object[0]);
        android.content.Context context = this.f457163c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(android.preference.PreferenceManager.getDefaultSharedPreferences(context).getInt("key_fail_times", 0));
        zt5.h.c("Soter.SoterAntiBruteForceStrategy", "soter: current retry time: " + valueOf, new java.lang.Object[0]);
        if (valueOf.intValue() < 5) {
            zt5.h.c("Soter.SoterAntiBruteForceStrategy", "soter: fail time available", new java.lang.Object[0]);
        } else {
            z17 = false;
        }
        if (!z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Long valueOf2 = java.lang.Long.valueOf(android.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong("key_last_freeze_time", -1L));
            zt5.h.c("Soter.SoterAntiBruteForceStrategy", "soter: current last freeze time: " + valueOf2, new java.lang.Object[0]);
            int longValue = (int) ((currentTimeMillis - valueOf2.longValue()) / 1000);
            zt5.h.c("Soter.SoterAntiBruteForceStrategy", "soter: tween sec after last freeze: " + longValue, new java.lang.Object[0]);
            if (longValue > 30) {
                zt5.h.a("Soter.SoterAntiBruteForceStrategy", "soter: after last freeze", new java.lang.Object[0]);
            }
        }
        this.f457161a = false;
        a(10308, "Too many failed times");
    }
}
