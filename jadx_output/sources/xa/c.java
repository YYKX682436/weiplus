package xa;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f452759a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f452760b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f452761c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f452762d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f452763e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f452764f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f452765g;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.google.android.gms.common.internal.Preconditions.checkState(!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f452760b = str;
        this.f452759a = str2;
        this.f452761c = str3;
        this.f452762d = str4;
        this.f452763e = str5;
        this.f452764f = str6;
        this.f452765g = str7;
    }

    public static xa.c a(android.content.Context context) {
        com.google.android.gms.common.internal.StringResourceValueReader stringResourceValueReader = new com.google.android.gms.common.internal.StringResourceValueReader(context);
        java.lang.String string = stringResourceValueReader.getString("google_app_id");
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        return new xa.c(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof xa.c)) {
            return false;
        }
        xa.c cVar = (xa.c) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.f452760b, cVar.f452760b) && com.google.android.gms.common.internal.Objects.equal(this.f452759a, cVar.f452759a) && com.google.android.gms.common.internal.Objects.equal(this.f452761c, cVar.f452761c) && com.google.android.gms.common.internal.Objects.equal(this.f452762d, cVar.f452762d) && com.google.android.gms.common.internal.Objects.equal(this.f452763e, cVar.f452763e) && com.google.android.gms.common.internal.Objects.equal(this.f452764f, cVar.f452764f) && com.google.android.gms.common.internal.Objects.equal(this.f452765g, cVar.f452765g);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.f452760b, this.f452759a, this.f452761c, this.f452762d, this.f452763e, this.f452764f, this.f452765g);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("applicationId", this.f452760b).add("apiKey", this.f452759a).add("databaseUrl", this.f452761c).add("gcmSenderId", this.f452763e).add("storageBucket", this.f452764f).add("projectId", this.f452765g).toString();
    }
}
