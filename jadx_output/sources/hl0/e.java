package hl0;

/* loaded from: classes13.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f282053a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f282054b;

    /* renamed from: d, reason: collision with root package name */
    public long f282056d;

    /* renamed from: e, reason: collision with root package name */
    public long f282057e;

    /* renamed from: f, reason: collision with root package name */
    public long f282058f;

    /* renamed from: g, reason: collision with root package name */
    public long f282059g;

    /* renamed from: h, reason: collision with root package name */
    public long f282060h;

    /* renamed from: i, reason: collision with root package name */
    public float f282061i;

    /* renamed from: k, reason: collision with root package name */
    public long f282063k;

    /* renamed from: l, reason: collision with root package name */
    public long f282064l;

    /* renamed from: m, reason: collision with root package name */
    public long f282065m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f282066n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f282067o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f282068p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f282069q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f282070r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f282071s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f282072t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f282073u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f282074v;

    /* renamed from: j, reason: collision with root package name */
    public int f282062j = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f282075w = -1;

    /* renamed from: c, reason: collision with root package name */
    public final int f282055c = java.lang.Integer.parseInt(com.tencent.mm.sdk.platformtools.z.f193111g.replace("0x", ""), 16);

    public e(java.lang.String str, java.lang.String str2) {
        this.f282053a = str;
        this.f282054b = str2;
    }

    public void a() {
        nl0.d a17 = nl0.c.a();
        java.lang.String str = this.f282053a;
        java.lang.String str2 = this.f282054b;
        dm.u6 y07 = a17.y0(str, str2);
        if (y07 == null) {
            y07 = new dm.u6();
            y07.field_type = str;
            y07.field_id = str2;
            y07.field_version = this.f282055c;
            nl0.c.a().insert(y07);
        }
        long j17 = this.f282056d;
        if (j17 != 0) {
            y07.field_happen_time = j17;
        }
        long j18 = this.f282057e;
        if (j18 != 0) {
            y07.field_predict_time = j18;
        }
        long j19 = this.f282058f;
        if (j19 != 0) {
            y07.field_prepare_time = j19;
        }
        long j27 = this.f282059g;
        if (j27 != 0) {
            y07.field_extract_time = j27;
        }
        long j28 = this.f282060h;
        if (j28 != 0) {
            y07.field_recall_time = j28;
        }
        float f17 = this.f282061i;
        if (f17 != 0.0f) {
            y07.field_prediction = f17;
        }
        int i17 = this.f282062j;
        if (i17 != -1) {
            y07.field_positive = i17;
        }
        long j29 = this.f282063k;
        if (j29 != 0) {
            y07.field_time_on_predict = j29;
        }
        long j37 = this.f282064l;
        if (j37 != 0) {
            y07.field_time_on_extract = j37;
        }
        long j38 = this.f282065m;
        if (j38 != 0) {
            y07.field_time_on_extract_all_feature = j38;
        }
        if (!android.text.TextUtils.isEmpty(this.f282071s)) {
            y07.field_error_on_predict = this.f282071s;
        }
        if (!android.text.TextUtils.isEmpty(this.f282069q)) {
            y07.field_model_heaviest_features = this.f282069q;
        }
        if (!android.text.TextUtils.isEmpty(this.f282070r)) {
            y07.field_model_null_features = this.f282070r;
        }
        if (!android.text.TextUtils.isEmpty(this.f282066n)) {
            y07.field_error_on_extract_all_feature = this.f282066n;
        }
        if (!android.text.TextUtils.isEmpty(this.f282067o)) {
            y07.field_all_heaviest_features = this.f282067o;
        }
        if (!android.text.TextUtils.isEmpty(this.f282068p)) {
            y07.field_all_null_features = this.f282068p;
        }
        if (!android.text.TextUtils.isEmpty(this.f282072t)) {
            y07.field_desc = this.f282072t;
        }
        int i18 = this.f282075w;
        if (i18 != -1) {
            y07.field_predict_type = i18;
        }
        boolean z17 = this.f282073u;
        if (z17) {
            y07.field_is_train_data_upload_finished = z17;
        }
        boolean z18 = this.f282074v;
        if (!z18) {
            y07.field_is_full_links_data_collector_finished = z18;
        }
        nl0.c.a().z0(y07);
    }
}
