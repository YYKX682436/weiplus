package e23;

/* loaded from: classes12.dex */
public class d0 extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f246809q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.CharSequence f246810r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f246811s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f246812t;

    /* renamed from: u, reason: collision with root package name */
    public int f246813u;

    /* renamed from: v, reason: collision with root package name */
    public p13.f f246814v;

    /* renamed from: w, reason: collision with root package name */
    public final e23.c0 f246815w;

    /* renamed from: x, reason: collision with root package name */
    public final e23.b0 f246816x;

    public d0(int i17) {
        super(3, i17);
        this.f246813u = -1;
        this.f246815w = new e23.c0(this);
        this.f246816x = new e23.b0(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... objArr) {
        boolean z17;
        p13.f fVar = (p13.f) this.f246809q.f351197o;
        this.f246814v = fVar;
        if (fVar == null) {
            return;
        }
        this.f246810r = fVar.field_title;
        this.f246812t = fVar.field_iconPath;
        if (fVar.field_featureId == 88 && ((ox.g) ((tk.o) i95.n0.c(tk.o.class))).wi()) {
            this.f246813u = com.tencent.mm.R.raw.photo_accounts_icon;
        }
        p13.f fVar2 = this.f246814v;
        java.lang.String str = fVar2.field_androidUrl;
        int i17 = fVar2.field_actionType;
        int i18 = this.f246809q.f351185c;
        boolean z18 = false;
        if (i18 != 1) {
            if (i18 != 2) {
                if (i18 != 3) {
                    if (i18 == 4) {
                        java.lang.String str2 = fVar2.field_tag;
                        this.f246811s = str2;
                        this.f246811s = o13.q.e(p13.i.b(str2, this.f423762e)).f351105a;
                    }
                    if (this.f423764g == -8 || this.f246809q.f351185c == 4) {
                    }
                    this.f246811s = context.getString(com.tencent.mm.R.string.ffu);
                    return;
                }
                z18 = true;
            }
            z17 = z18;
            z18 = true;
        } else {
            z17 = false;
        }
        this.f246810r = o13.q.e(p13.i.d(this.f246810r, this.f423762e, z18, z17)).f351105a;
        if (this.f423764g == -8) {
        }
    }

    @Override // u13.g
    public java.lang.String f() {
        return this.f246814v.field_title;
    }

    @Override // u13.g
    public int j() {
        return this.f246809q.f351200r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f246815w;
    }
}
