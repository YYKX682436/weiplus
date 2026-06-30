package df2;

/* loaded from: classes3.dex */
public final class p4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f231035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f231036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f231037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231038e;

    public p4(int i17, kotlin.jvm.internal.c0 c0Var, df2.r4 r4Var, r45.tm1 tm1Var, java.lang.String str) {
        this.f231034a = i17;
        this.f231035b = c0Var;
        this.f231036c = r4Var;
        this.f231037d = tm1Var;
        this.f231038e = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            kotlin.jvm.internal.c0 c0Var = this.f231035b;
            r45.tm1 tm1Var = this.f231037d;
            df2.r4 r4Var = this.f231036c;
            int i17 = this.f231034a;
            if (i17 == 1) {
                c0Var.f310112d = true;
                r4Var.l7(new df2.d9(tm1Var.getString(3), null, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.nkl), null, com.tencent.mm.R.drawable.d2u, com.tencent.mm.R.color.aaz));
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.nko));
                if (tm1Var.getInteger(2) > 0) {
                    r4Var.n7(tm1Var.getInteger(2), "on subscribe");
                } else {
                    r4Var.n7(5000L, "on subscribe");
                }
                r4Var.o7(2);
            } else if (i17 == 2) {
                c0Var.f310112d = false;
                r4Var.l7(new df2.d9(tm1Var.getString(3), null, this.f231038e, null, 0, 0, 48, null));
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.h(context2, context2.getString(com.tencent.mm.R.string.cn8));
                java.lang.Long valueOf = java.lang.Long.valueOf(tm1Var.getInteger(1));
                if (!(valueOf.longValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    r4Var.n7(valueOf.longValue(), "on unsubscribe");
                }
                r4Var.o7(4);
            }
        }
        return jz5.f0.f302826a;
    }
}
