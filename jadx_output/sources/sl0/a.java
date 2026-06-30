package sl0;

/* loaded from: classes13.dex */
public class a implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409044a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409045b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f409046c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f409047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f409048e;

    public a(sl0.e eVar, int i17, java.lang.String str, int i18, long j17, long j18) {
        this.f409044a = i17;
        this.f409045b = str;
        this.f409046c = i18;
        this.f409047d = j17;
        this.f409048e = j18;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        android.database.Cursor B;
        int i17;
        long j17 = this.f409048e;
        long j18 = this.f409047d;
        int i18 = this.f409046c;
        java.lang.String str = this.f409045b;
        int i19 = this.f409044a;
        if (i19 == 2) {
            ul0.a aVar = tl0.b.f420194a;
            aVar.getClass();
            B = aVar.f428555d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and talker = '" + str + "' and type = ? and action = 2)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18)});
            try {
                i17 = B.moveToFirst() ? B.getInt(0) : 0;
                B.close();
                return java.lang.Integer.valueOf(i17);
            } finally {
            }
        }
        if (i19 != 1) {
            return 0;
        }
        ul0.a aVar2 = tl0.b.f420194a;
        aVar2.getClass();
        B = aVar2.f428555d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and talker = '" + str + "' and type = ? and action = 1)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i18)});
        try {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return java.lang.Integer.valueOf(i17);
        } finally {
        }
    }
}
