package rr;

/* loaded from: classes9.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr.r f399143a;

    public p(rr.r rVar) {
        this.f399143a = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        rr.r rVar = this.f399143a;
        com.tencent.mars.xlog.Log.i(rVar.f399148d, "checkExchange: cgi result: " + i17 + ", " + i18);
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            java.lang.String field_groupId = rVar.f399146b.field_groupId;
            kotlin.jvm.internal.o.f(field_groupId, "field_groupId");
            rr.u.a(field_groupId);
            rVar.f399147c.a(true);
        } else {
            java.lang.String str = fVar.f70617c;
            rr.e eVar = (rr.e) rVar;
            rr.d dVar = new rr.d(eVar);
            eVar.f399147c.a(false);
            android.content.Context context = eVar.f399145a;
            if (i18 == 4) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.bxz);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                eVar.a(string, dVar);
            } else if (i18 == 8) {
                java.lang.String string2 = context.getString(com.tencent.mm.R.string.bum);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                eVar.a(string2, dVar);
            } else if (i18 != 9) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    java.lang.String string3 = context.getString(com.tencent.mm.R.string.buj);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    eVar.a(string3, dVar);
                } else {
                    eVar.a(str, dVar);
                }
            } else {
                java.lang.String string4 = context.getString(com.tencent.mm.R.string.bul);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                eVar.a(string4, dVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
