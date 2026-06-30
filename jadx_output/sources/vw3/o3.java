package vw3;

/* loaded from: classes.dex */
public final class o3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI f441050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f441051e;

    public o3(com.tencent.mm.plugin.repairer.ui.RepairerMsgResendUI repairerMsgResendUI, com.tencent.mm.storage.f9 f9Var) {
        this.f441050d = repairerMsgResendUI;
        this.f441051e = f9Var;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        this.f441050d.getContext();
        vw3.m3[] m3VarArr = vw3.m3.f441031d;
        boolean z17 = false;
        g4Var.l(0, "随机SvrId", com.tencent.mm.R.raw.icons_filled_refresh, false);
        vw3.m3[] m3VarArr2 = vw3.m3.f441031d;
        g4Var.l(1, "刷新消息时间", com.tencent.mm.R.raw.icons_filled_refresh, false);
        vw3.m3[] m3VarArr3 = vw3.m3.f441031d;
        g4Var.l(2, "推送", com.tencent.mm.R.raw.icons_filled_share, false);
        vw3.m3[] m3VarArr4 = vw3.m3.f441031d;
        com.tencent.mm.storage.f9 f9Var = this.f441051e;
        if (f9Var != null && f9Var.getType() == 43) {
            z17 = true;
        }
        g4Var.l(3, "视频过期", com.tencent.mm.R.raw.icons_filled_delete, !z17);
    }
}
