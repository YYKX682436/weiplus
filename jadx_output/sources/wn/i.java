package wn;

/* loaded from: classes10.dex */
public final class i extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatting.BasePrivateMsgConvListFragment f447375a;

    public i(com.tencent.mm.chatting.BasePrivateMsgConvListFragment basePrivateMsgConvListFragment) {
        this.f447375a = basePrivateMsgConvListFragment;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.chatting.BasePrivateMsgConvListFragment basePrivateMsgConvListFragment = this.f447375a;
        java.util.List a17 = basePrivateMsgConvListFragment.z0().a(basePrivateMsgConvListFragment.w0().getItemCount());
        ym5.s3 s3Var = new ym5.s3(1);
        s3Var.f463522g = false;
        s3Var.f463521f = true ^ a17.isEmpty();
        s3Var.f463523h = a17.size();
        basePrivateMsgConvListFragment.w0().y(false, a17);
        basePrivateMsgConvListFragment.x0().onPreFinishLoadMoreSmooth(s3Var);
        basePrivateMsgConvListFragment.s0();
    }
}
