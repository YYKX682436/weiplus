package sl0;

/* loaded from: classes13.dex */
public class c implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f409063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f409064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f409065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f409066f;

    public c(sl0.e eVar, int i17, java.lang.String str, int i18, long j17, long j18, int i19) {
        this.f409061a = i17;
        this.f409062b = str;
        this.f409063c = i18;
        this.f409064d = j17;
        this.f409065e = j18;
        this.f409066f = i19;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        android.database.Cursor B;
        int i17;
        int i18 = this.f409066f;
        long j17 = this.f409065e;
        long j18 = this.f409064d;
        int i19 = this.f409063c;
        java.lang.String str = this.f409062b;
        int i27 = this.f409061a;
        if (i27 == 2) {
            ul0.a aVar = tl0.b.f420194a;
            aVar.getClass();
            B = aVar.f428555d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 2)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19)});
            try {
                i17 = B.moveToFirst() ? B.getInt(0) : 0;
                B.close();
                return java.lang.Integer.valueOf(i17);
            } finally {
            }
        }
        if (i27 != 1) {
            return 0;
        }
        ul0.a aVar2 = tl0.b.f420194a;
        aVar2.getClass();
        B = aVar2.f428555d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 1)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18), java.lang.String.valueOf(i19)});
        try {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return java.lang.Integer.valueOf(i17);
        } finally {
        }
    }
}
