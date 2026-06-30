package te2;

/* loaded from: classes3.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p1 f418266d;

    public o0(te2.p1 p1Var) {
        this.f418266d = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent;
        android.content.Intent intent2;
        te2.p1 p1Var = this.f418266d;
        android.content.Context context = p1Var.f418286d.getContext();
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        int i17 = 0;
        if (mMActivity != null && (intent2 = mMActivity.getIntent()) != null) {
            i17 = intent2.getIntExtra("KEY_PARAMS_DO_ACTION", 0);
        }
        if (i17 != 3) {
            ae2.in inVar = ae2.in.f3688a;
            if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3774i5).getValue()).r()).booleanValue()) {
                return;
            }
        }
        qo0.c.a(p1Var.f418288f, qo0.b.f365382m2, null, 2, null);
        android.content.Context context2 = p1Var.f418286d.getContext();
        com.tencent.mm.ui.MMActivity mMActivity2 = context2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context2 : null;
        if (mMActivity2 == null || (intent = mMActivity2.getIntent()) == null) {
            return;
        }
        intent.removeExtra("KEY_PARAMS_DO_ACTION");
    }
}
