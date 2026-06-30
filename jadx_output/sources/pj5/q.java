package pj5;

/* loaded from: classes9.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f355401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pj5.l f355402e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(in5.s0 s0Var, pj5.l lVar) {
        super(4);
        this.f355401d = s0Var;
        this.f355402e = lVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScheduleMsgDetailUI", "SetMsgRemindCgi delete, errType: " + ((java.lang.Number) obj).intValue() + ", errCode: " + ((java.lang.Number) obj2).intValue() + ", errMsg: " + ((java.lang.String) obj3) + ", remindId: " + ((java.lang.String) obj4));
        androidx.recyclerview.widget.f2 adapter = this.f355401d.o().getAdapter();
        xm3.t0 t0Var = adapter instanceof xm3.t0 ? (xm3.t0) adapter : null;
        if (t0Var != null && (mvvmList = t0Var.I) != null) {
            mvvmList.s(this.f355402e.v());
        }
        return jz5.f0.f302826a;
    }
}
