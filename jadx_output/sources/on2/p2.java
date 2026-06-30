package on2;

/* loaded from: classes3.dex */
public final class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ on2.z2 f346984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f346985b;

    public p2(on2.z2 z2Var, kotlin.coroutines.Continuation continuation) {
        this.f346984a = z2Var;
        this.f346985b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String sb6;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean e17 = xg2.g.e(fVar);
        kotlin.coroutines.Continuation continuation = this.f346985b;
        if (e17) {
            int integer = ((r45.dt1) fVar.f70618d).getInteger(3);
            on2.z2 z2Var = this.f346984a;
            r45.dt1 dt1Var = (r45.dt1) z2Var.f347089g.getValue();
            int i17 = 0;
            if (integer >= (dt1Var != null ? dt1Var.getInteger(3) : 0)) {
                z2Var.f347089g.postValue(fVar.f70618d);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getLotteryPanelInfo resp,");
                com.tencent.mm.protobuf.f resp = fVar.f70618d;
                kotlin.jvm.internal.o.f(resp, "resp");
                r45.dt1 dt1Var2 = (r45.dt1) resp;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("item_list:");
                java.util.LinkedList list = dt1Var2.getList(1);
                kotlin.jvm.internal.o.f(list, "getItem_list(...)");
                if (list.isEmpty()) {
                    sb6 = "";
                } else {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                    for (java.lang.Object obj2 : list) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        sb10.append("[index:" + i17 + ",item:" + pm0.b0.g((r45.dz1) obj2) + ']');
                        i17 = i18;
                    }
                    sb6 = sb10.toString();
                    kotlin.jvm.internal.o.f(sb6, "toString(...)");
                }
                sb9.append(sb6);
                sb9.append(";\n");
                sb8.append(sb9.toString());
                sb8.append("location_id:" + dt1Var2.getInteger(2) + ';');
                java.lang.String sb11 = sb8.toString();
                kotlin.jvm.internal.o.f(sb11, "toString(...)");
                sb7.append(sb11);
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLotterySlice", sb7.toString());
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.e("MMFinder.LiveLotterySlice", "getLotteryPanelInfo fail:" + fVar.f70616b + ',' + fVar.f70615a + ',' + fVar.f70617c + ",data_version:" + ((r45.dt1) fVar.f70618d).getInteger(3));
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        return jz5.f0.f302826a;
    }
}
