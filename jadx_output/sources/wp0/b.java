package wp0;

/* loaded from: classes5.dex */
public final class b extends wp0.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448363a;

    /* renamed from: b, reason: collision with root package name */
    public final long f448364b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f448365c;

    /* renamed from: d, reason: collision with root package name */
    public final long f448366d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.RectF f448367e;

    /* renamed from: f, reason: collision with root package name */
    public final long f448368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f448369g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f448370h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f448371i;

    /* renamed from: j, reason: collision with root package name */
    public final int f448372j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f448373k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f448374l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String id6, long j17, java.lang.String emojiKey, long j18, android.graphics.RectF frame, long j19, boolean z17, java.lang.String fromUserName, java.lang.String toUserName, int i17, java.lang.String content, java.lang.String ext) {
        super(id6, frame, j17);
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(emojiKey, "emojiKey");
        kotlin.jvm.internal.o.g(frame, "frame");
        kotlin.jvm.internal.o.g(fromUserName, "fromUserName");
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        kotlin.jvm.internal.o.g(content, "content");
        kotlin.jvm.internal.o.g(ext, "ext");
        this.f448363a = id6;
        this.f448364b = j17;
        this.f448365c = emojiKey;
        this.f448366d = j18;
        this.f448367e = frame;
        this.f448368f = j19;
        this.f448369g = z17;
        this.f448370h = fromUserName;
        this.f448371i = toUserName;
        this.f448372j = i17;
        this.f448373k = content;
        this.f448374l = ext;
    }

    public final java.lang.String a(int i17, java.lang.String session) {
        kotlin.jvm.internal.o.g(session, "session");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = new java.util.HashMap(16);
        hashMap.put("msgId", java.lang.Long.valueOf(this.f448368f));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i17));
        hashMap.put("msgMeta", b());
        hashMap.put("sentTime", java.lang.Long.valueOf(currentTimeMillis));
        java.util.HashMap hashMap2 = new java.util.HashMap(3);
        hashMap2.put("sessionID", session);
        hashMap2.put("toChatName", this.f448371i);
        hashMap2.put("messageTimestamp", java.lang.Long.valueOf(currentTimeMillis));
        hashMap.put("reportInfo", hashMap2);
        nf.f.c(hashMap);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }

    public final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap(12);
        hashMap.put("msgId", java.lang.Long.valueOf(this.f448368f));
        hashMap.put("ID", this.f448363a);
        hashMap.put("isFrom", java.lang.Boolean.valueOf(this.f448369g));
        hashMap.put("msgType", java.lang.Long.valueOf(this.f448366d));
        hashMap.put("content", this.f448373k);
        hashMap.put("emojiKey", this.f448365c);
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, java.lang.Long.valueOf(this.f448364b));
        hashMap.put("fromUserName", this.f448370h);
        hashMap.put("toUserName", this.f448371i);
        hashMap.put("emojiConfigVersion", java.lang.Integer.valueOf(this.f448372j));
        hashMap.put("ext", this.f448374l);
        hashMap.put("frame", cq0.a.f221325a.b(this.f448367e));
        return hashMap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp0.b)) {
            return false;
        }
        wp0.b bVar = (wp0.b) obj;
        return kotlin.jvm.internal.o.b(this.f448363a, bVar.f448363a) && this.f448364b == bVar.f448364b && kotlin.jvm.internal.o.b(this.f448365c, bVar.f448365c) && this.f448366d == bVar.f448366d && kotlin.jvm.internal.o.b(this.f448367e, bVar.f448367e) && this.f448368f == bVar.f448368f && this.f448369g == bVar.f448369g && kotlin.jvm.internal.o.b(this.f448370h, bVar.f448370h) && kotlin.jvm.internal.o.b(this.f448371i, bVar.f448371i) && this.f448372j == bVar.f448372j && kotlin.jvm.internal.o.b(this.f448373k, bVar.f448373k) && kotlin.jvm.internal.o.b(this.f448374l, bVar.f448374l);
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f448363a.hashCode() * 31) + java.lang.Long.hashCode(this.f448364b)) * 31) + this.f448365c.hashCode()) * 31) + java.lang.Long.hashCode(this.f448366d)) * 31) + this.f448367e.hashCode()) * 31) + java.lang.Long.hashCode(this.f448368f)) * 31) + java.lang.Boolean.hashCode(this.f448369g)) * 31) + this.f448370h.hashCode()) * 31) + this.f448371i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f448372j)) * 31) + this.f448373k.hashCode()) * 31) + this.f448374l.hashCode();
    }

    public java.lang.String toString() {
        return "MEMeta(id=" + this.f448363a + ", timestamp=" + this.f448364b + ", emojiKey=" + this.f448365c + ", msgType=" + this.f448366d + ", frame=" + this.f448367e + ", msgId=" + this.f448368f + ", isFrom=" + this.f448369g + ", fromUserName=" + this.f448370h + ", toUserName=" + this.f448371i + ", emojiConfigVersion=" + this.f448372j + ", content=" + this.f448373k + ", ext=" + this.f448374l + ')';
    }
}
