package on2;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f347022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ on2.j1 f347024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(on2.a2 a2Var, android.content.Context context, on2.j1 j1Var) {
        super(2);
        this.f347022d = a2Var;
        this.f347023e = context;
        this.f347024f = j1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(on2.a2 r10, on2.j1 r11, r45.dz1 r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on2.u1.a(on2.a2, on2.j1, r45.dz1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.dz1 dz1Var = (r45.dz1) obj;
        ((java.lang.Number) obj2).intValue();
        if (dz1Var != null) {
            on2.a2 a2Var = this.f347022d;
            on2.z2 z2Var = (on2.z2) a2Var.c(on2.z2.class);
            if (!(z2Var != null && z2Var.V6())) {
                on2.z2 z2Var2 = (on2.z2) a2Var.c(on2.z2.class);
                if (!(z2Var2 != null && z2Var2.T6())) {
                    kotlinx.coroutines.l.d(a2Var.getScope(), null, null, new on2.q1(dz1Var, this.f347022d, this.f347023e, this.f347024f, null), 3, null);
                }
            }
            android.view.View view = a2Var.f346832o;
            db5.t7.m(view.getContext(), view.getContext().getResources().getString(com.tencent.mm.R.string.dpv));
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveLotteryPanelWidget", "statusBtnClick error, data is null!");
        }
        return jz5.f0.f302826a;
    }
}
