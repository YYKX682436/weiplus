package q01;

/* loaded from: classes12.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f359298a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f359299b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f359300c;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f359301d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f359302e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f359303f;

    /* renamed from: g, reason: collision with root package name */
    public volatile long f359304g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f359305h;

    /* renamed from: i, reason: collision with root package name */
    public volatile java.lang.String f359306i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f359307j;

    /* renamed from: k, reason: collision with root package name */
    public volatile java.lang.Integer f359308k;

    /* renamed from: l, reason: collision with root package name */
    public volatile java.lang.Integer f359309l;

    public l(int i17, java.lang.String sceneType, java.lang.String sceneDesc, long j17, long j18, int i18, long j19, long j27, java.lang.String str, boolean z17, java.lang.Integer num, java.lang.Integer num2, int i19, kotlin.jvm.internal.i iVar) {
        long j28 = (i19 & 8) != 0 ? 0L : j17;
        long j29 = (i19 & 16) != 0 ? 0L : j18;
        int i27 = (i19 & 32) != 0 ? 0 : i18;
        long j37 = (i19 & 64) != 0 ? 0L : j19;
        long j38 = (i19 & 128) == 0 ? j27 : 0L;
        java.lang.String experimentGroup = (i19 & 256) != 0 ? "" : str;
        boolean z18 = (i19 & 512) == 0 ? z17 : false;
        java.lang.Integer num3 = (i19 & 1024) != 0 ? null : num;
        java.lang.Integer num4 = (i19 & 2048) != 0 ? null : num2;
        kotlin.jvm.internal.o.g(sceneType, "sceneType");
        kotlin.jvm.internal.o.g(sceneDesc, "sceneDesc");
        kotlin.jvm.internal.o.g(experimentGroup, "experimentGroup");
        this.f359298a = i17;
        this.f359299b = sceneType;
        this.f359300c = sceneDesc;
        this.f359301d = j28;
        this.f359302e = j29;
        this.f359303f = i27;
        this.f359304g = j37;
        this.f359305h = j38;
        this.f359306i = experimentGroup;
        this.f359307j = z18;
        this.f359308k = num3;
        this.f359309l = num4;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q01.l)) {
            return false;
        }
        q01.l lVar = (q01.l) obj;
        return this.f359298a == lVar.f359298a && kotlin.jvm.internal.o.b(this.f359299b, lVar.f359299b) && kotlin.jvm.internal.o.b(this.f359300c, lVar.f359300c) && this.f359301d == lVar.f359301d && this.f359302e == lVar.f359302e && this.f359303f == lVar.f359303f && this.f359304g == lVar.f359304g && this.f359305h == lVar.f359305h && kotlin.jvm.internal.o.b(this.f359306i, lVar.f359306i) && this.f359307j == lVar.f359307j && kotlin.jvm.internal.o.b(this.f359308k, lVar.f359308k) && kotlin.jvm.internal.o.b(this.f359309l, lVar.f359309l);
    }

    public int hashCode() {
        return (((((((((((((((((((((java.lang.Integer.hashCode(this.f359298a) * 31) + this.f359299b.hashCode()) * 31) + this.f359300c.hashCode()) * 31) + java.lang.Long.hashCode(this.f359301d)) * 31) + java.lang.Long.hashCode(this.f359302e)) * 31) + java.lang.Integer.hashCode(this.f359303f)) * 31) + java.lang.Long.hashCode(this.f359304g)) * 31) + java.lang.Long.hashCode(this.f359305h)) * 31) + this.f359306i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f359307j)) * 31) + (this.f359308k == null ? 0 : this.f359308k.hashCode())) * 31) + (this.f359309l != null ? this.f359309l.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MonitorData(sceneHash=" + this.f359298a + ", sceneType=" + this.f359299b + ", sceneDesc=" + this.f359300c + ", doSceneStartMs=" + this.f359301d + ", enterRunningQueueMs=" + this.f359302e + ", waitingQueueLength=" + this.f359303f + ", threadSubmitMs=" + this.f359304g + ", threadStartMs=" + this.f359305h + ", experimentGroup=" + this.f359306i + ", isCoreCgi=" + this.f359307j + ", errCode=" + this.f359308k + ", errType=" + this.f359309l + ')';
    }
}
