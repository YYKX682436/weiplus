package nv2;

/* loaded from: classes2.dex */
public class g1 extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f340491d;

    /* renamed from: e, reason: collision with root package name */
    public final long f340492e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f340493f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340494g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f340495h;

    /* renamed from: i, reason: collision with root package name */
    public final int f340496i;

    /* renamed from: j, reason: collision with root package name */
    public final int f340497j;

    /* renamed from: k, reason: collision with root package name */
    public final r45.qt2 f340498k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.bc1 f340499l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f340500m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.finder.storage.FinderItem finderObject, long j17, java.lang.String objectNonceId, boolean z17, boolean z18, int i17, int i18, nv2.i1 i1Var, r45.qt2 contextObj, r45.bc1 bc1Var) {
        super(i1Var);
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f340491d = finderObject;
        this.f340492e = j17;
        this.f340493f = objectNonceId;
        this.f340494g = z17;
        this.f340495h = z18;
        this.f340496i = i17;
        this.f340497j = i18;
        this.f340498k = contextObj;
        this.f340499l = bc1Var;
        this.f340500m = "";
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.a(callback);
        long j17 = this.f340492e;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f340491d;
        new db2.x1(new db2.c5(j17, finderItem.getDupFlag(), this.f340493f, this.f340494g, this.f340495h, this.f340496i, this.f340497j, finderItem.getEncryptedObjectId(), this.f340500m, this.f340499l), this.f340498k).l().K(new nv2.f1(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f340492e + '_' + this.f340494g;
    }

    public java.lang.String toString() {
        return "action_" + this.f340492e + '_' + this.f340494g + '_' + this.f340496i + '_' + this.f340575c;
    }
}
