package pj5;

/* loaded from: classes9.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.c1 f355376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f355377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f355378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, com.tencent.mm.ui.chatting.view.c1 c1Var, yz5.l lVar, long j17) {
        super(4);
        this.f355375d = context;
        this.f355376e = c1Var;
        this.f355377f = lVar;
        this.f355378g = j17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduleMsgHelper", "SetMsgRemindCgi callback, errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + ((java.lang.String) obj3) + ", remindId: " + ((java.lang.String) obj4));
        com.tencent.mm.ui.chatting.view.c1 c1Var = this.f355376e;
        android.content.Context context = this.f355375d;
        if (intValue == 0 && intValue2 == 0) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.f492275fw5);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            c1Var.getClass();
            c1Var.f202898n.f59193d = 1L;
            pm0.v.K(null, new com.tencent.mm.ui.chatting.view.a1(c1Var));
            yz5.l lVar = this.f355377f;
            if (lVar != null) {
                lVar.invoke(java.lang.Long.valueOf(this.f355378g));
            }
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.d(com.tencent.mm.R.string.p6z);
            e4Var2.c();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(795L, 4L, 1L, false);
            c1Var.getClass();
            c1Var.f202898n.f59193d = 2L;
            pm0.v.K(null, new com.tencent.mm.ui.chatting.view.a1(c1Var));
        }
        return jz5.f0.f302826a;
    }
}
