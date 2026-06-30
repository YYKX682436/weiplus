package vd2;

/* loaded from: classes3.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f436017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f436018e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436019f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vd2.f1 f436020g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f436021h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.wk0 f436022i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f436023m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ss5.d0 f436024n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f436025o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, android.content.Context context, vd2.f1 f1Var, android.content.Intent intent, r45.wk0 wk0Var, android.content.Intent intent2, ss5.d0 d0Var, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f436017d = finderObject;
        this.f436018e = z17;
        this.f436019f = context;
        this.f436020g = f1Var;
        this.f436021h = intent;
        this.f436022i = wk0Var;
        this.f436023m = intent2;
        this.f436024n = d0Var;
        this.f436025o = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        java.lang.String description;
        vd2.f1 f1Var = this.f436020g;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f436017d;
        if (finderObject != null) {
            boolean z17 = this.f436018e;
            android.content.Context context = this.f436019f;
            if (!z17 || !sl2.h.f409251a.c(context, finderObject)) {
                java.lang.String username = finderObject.getUsername();
                if ((username == null || username.length() == 0) || !kotlin.jvm.internal.o.b(finderObject.getUsername(), xy2.c.e(context))) {
                    com.tencent.mars.xlog.Log.i(f1Var.f435725d, "enterLiveC1 visitor");
                    this.f436020g.Ni(this.f436019f, this.f436023m, kz5.b0.c(finderObject), 0, this.f436022i, this.f436024n);
                } else {
                    com.tencent.mars.xlog.Log.i(f1Var.f435725d, "enterLiveC1 anchor");
                    s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                    android.content.Intent intent = this.f436021h;
                    android.content.Context context2 = this.f436019f;
                    long id6 = finderObject.getId();
                    r45.nw1 liveInfo = finderObject.getLiveInfo();
                    java.lang.Long valueOf = java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L);
                    java.lang.String objectNonceId = finderObject.getObjectNonceId();
                    java.lang.String str = objectNonceId == null ? "" : objectNonceId;
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                    java.lang.String str2 = (objectDesc == null || (description = objectDesc.getDescription()) == null) ? "" : description;
                    java.lang.String sessionBuffer = finderObject.getSessionBuffer();
                    r45.y74 y74Var = (r45.y74) this.f436022i.getCustom(6);
                    ((com.tencent.mm.feature.finder.live.v4) w0Var).oj(intent, context2, id6, valueOf, str, str2, "", sessionBuffer, (y74Var == null || (string = y74Var.getString(8)) == null) ? "" : string);
                }
            }
        } else {
            java.lang.String str3 = f1Var.f435725d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveC1 error ");
            com.tencent.mm.modelbase.f fVar = this.f436025o;
            sb6.append(fVar.f70615a);
            sb6.append(", ");
            sb6.append(fVar.f70616b);
            com.tencent.mars.xlog.Log.w(str3, sb6.toString());
            ss5.d0 d0Var = this.f436024n;
            if (d0Var != null) {
                d0Var.onFailed(-1);
            }
        }
        return jz5.f0.f302826a;
    }
}
