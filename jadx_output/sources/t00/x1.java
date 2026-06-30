package t00;

/* loaded from: classes9.dex */
public final /* synthetic */ class x1 extends kotlin.jvm.internal.m implements yz5.u {
    public x1(java.lang.Object obj) {
        super(7, obj, t00.e2.class, "processOnActivityResult", "processOnActivityResult(Landroid/content/Context;IILandroid/content/Intent;ILjava/lang/String;Lcom/tencent/mm/feature/ecs/api/IEcsHandleEcsActionService$ActionCallback;)Z", 0);
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        boolean z17;
        android.content.Context p07 = (android.content.Context) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        android.content.Intent intent = (android.content.Intent) obj4;
        int intValue3 = ((java.lang.Number) obj5).intValue();
        java.lang.String str = (java.lang.String) obj6;
        c00.n3 p66 = (c00.n3) obj7;
        kotlin.jvm.internal.o.g(p07, "p0");
        kotlin.jvm.internal.o.g(p66, "p6");
        ((t00.e2) this.receiver).getClass();
        if (intValue != intValue3) {
            p66.a();
            z17 = false;
        } else {
            if (intValue2 == -1) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Conv_User") : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactEcsActionHandler", "select username nil");
                    p66.a();
                } else {
                    java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                    kotlin.jvm.internal.o.d(stringExtra);
                    com.tencent.mm.ipcinvoker.extension.l.a(str2, new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket(stringExtra, str), t00.q1.class, new t00.b2(p07, p66));
                }
            } else {
                p66.onCancel();
            }
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
