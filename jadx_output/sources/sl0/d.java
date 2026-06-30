package sl0;

/* loaded from: classes13.dex */
public class d implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f409078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f409080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f409081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f409082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f409083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f409084g;

    public d(sl0.e eVar, int i17, java.lang.String str, int i18, long j17, long j18, int i19, int i27) {
        this.f409078a = i17;
        this.f409079b = str;
        this.f409080c = i18;
        this.f409081d = j17;
        this.f409082e = j18;
        this.f409083f = i19;
        this.f409084g = i27;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        android.database.Cursor B;
        int i17;
        int i18 = this.f409084g;
        int i19 = this.f409083f;
        long j17 = this.f409082e;
        long j18 = this.f409081d;
        int i27 = this.f409080c;
        java.lang.String str = this.f409079b;
        int i28 = this.f409078a;
        if (i28 == 2) {
            ul0.a aVar = tl0.b.f420194a;
            aVar.getClass();
            B = aVar.f428555d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 2)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i19), java.lang.String.valueOf(i18), java.lang.String.valueOf(i27)});
            try {
                i17 = B.moveToFirst() ? B.getInt(0) : 0;
                B.close();
                return java.lang.Integer.valueOf(i17);
            } finally {
            }
        }
        if (i28 != 1) {
            return 0;
        }
        ul0.a aVar2 = tl0.b.f420194a;
        aVar2.getClass();
        B = aVar2.f428555d.B("SELECT COUNT(*) FROM (select * from ChattingEvent where timestamp >= ? and timestamp <= ? and dayOfWeek = ? and hourOfDay = ? and talker = '" + str + "' and type = ? and action = 1)", new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j17), java.lang.String.valueOf(i19), java.lang.String.valueOf(i18), java.lang.String.valueOf(i27)});
        try {
            i17 = B.moveToFirst() ? B.getInt(0) : 0;
            B.close();
            return java.lang.Integer.valueOf(i17);
        } finally {
        }
    }
}
