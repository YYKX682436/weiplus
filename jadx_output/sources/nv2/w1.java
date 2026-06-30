package nv2;

/* loaded from: classes2.dex */
public final class w1 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final long f340612d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f340613e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f340614f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.yj0 f340615g;

    /* renamed from: h, reason: collision with root package name */
    public final nv2.x1 f340616h;

    /* renamed from: i, reason: collision with root package name */
    public final int f340617i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.qt2 f340618j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f340619k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f340620l;

    /* renamed from: m, reason: collision with root package name */
    public final int f340621m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f340622n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(long j17, java.lang.String str, java.lang.String objectNonceId, com.tencent.mm.plugin.finder.storage.yj0 comment, nv2.x1 likeType, int i17, nv2.i1 i1Var, r45.qt2 contextObj, boolean z17, com.tencent.mm.protobuf.g gVar, int i18, java.lang.String str2) {
        super(i1Var);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(comment, "comment");
        kotlin.jvm.internal.o.g(likeType, "likeType");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f340612d = j17;
        this.f340613e = str;
        this.f340614f = objectNonceId;
        this.f340615g = comment;
        this.f340616h = likeType;
        this.f340617i = i17;
        this.f340618j = contextObj;
        this.f340619k = z17;
        this.f340620l = gVar;
        this.f340621m = i18;
        this.f340622n = str2;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.a(callback);
        new db2.w1(this, this.f340618j).l().K(new nv2.v1(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f340612d + '_' + this.f340615g.t0() + '_' + this.f340616h + '_' + this.f340617i + '_' + this.f340575c;
    }

    public java.lang.String toString() {
        return "action_" + this.f340612d + '_' + this.f340615g.t0() + '_' + this.f340616h + '_' + this.f340617i;
    }
}
