package lx;

/* loaded from: classes11.dex */
public final class k2 implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.n2 f321832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321833b;

    public k2(lx.n2 n2Var, java.lang.String str) {
        this.f321832a = n2Var;
        this.f321833b = str;
    }

    @Override // r35.n3
    public final void a(int i17) {
        lx.n2 n2Var;
        com.tencent.pigeon.biz.NotifyMsgCallbackApi notifyMsgCallbackApi;
        if ((i17 == -2 || i17 == 1) && (notifyMsgCallbackApi = (n2Var = this.f321832a).f321878f) != null) {
            notifyMsgCallbackApi.onContactAdded(this.f321833b, n2Var.f321876d, lx.j2.f321815d);
        }
    }
}
