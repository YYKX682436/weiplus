package qj4;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f363927a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f363928b;

    /* renamed from: c, reason: collision with root package name */
    public final long f363929c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f363930d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f363931e;

    /* renamed from: f, reason: collision with root package name */
    public final bw5.jn0 f363932f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f363933g;

    public l(java.lang.String username, boolean z17, long j17, java.lang.String statusId, java.lang.String publishSessionId, bw5.jn0 publishActionSheetScene, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        statusId = (i17 & 8) != 0 ? "" : statusId;
        publishSessionId = (i17 & 16) != 0 ? "" : publishSessionId;
        publishActionSheetScene = (i17 & 32) != 0 ? bw5.jn0.STATUS_UNKNOWN : publishActionSheetScene;
        map = (i17 & 64) != 0 ? null : map;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(publishSessionId, "publishSessionId");
        kotlin.jvm.internal.o.g(publishActionSheetScene, "publishActionSheetScene");
        this.f363927a = username;
        this.f363928b = z17;
        this.f363929c = j17;
        this.f363930d = statusId;
        this.f363931e = publishSessionId;
        this.f363932f = publishActionSheetScene;
        this.f363933g = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj4.l)) {
            return false;
        }
        qj4.l lVar = (qj4.l) obj;
        return kotlin.jvm.internal.o.b(this.f363927a, lVar.f363927a) && this.f363928b == lVar.f363928b && this.f363929c == lVar.f363929c && kotlin.jvm.internal.o.b(this.f363930d, lVar.f363930d) && kotlin.jvm.internal.o.b(this.f363931e, lVar.f363931e) && this.f363932f == lVar.f363932f && kotlin.jvm.internal.o.b(this.f363933g, lVar.f363933g);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f363927a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f363928b)) * 31) + java.lang.Long.hashCode(this.f363929c)) * 31) + this.f363930d.hashCode()) * 31) + this.f363931e.hashCode()) * 31) + this.f363932f.hashCode()) * 31;
        java.util.Map map = this.f363933g;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public java.lang.String toString() {
        return "PublishEntranceViewReportObj(username=" + this.f363927a + ", isFromCardView=" + this.f363928b + ", enterScene=" + this.f363929c + ", statusId=" + this.f363930d + ", publishSessionId=" + this.f363931e + ", publishActionSheetScene=" + this.f363932f + ", customParams=" + this.f363933g + ')';
    }
}
