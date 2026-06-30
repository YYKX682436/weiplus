package vd0;

/* loaded from: classes8.dex */
public final class s1 implements re4.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0.h2 f435505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f435506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435507c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f435508d;

    public s1(wd0.h2 h2Var, vd0.v1 v1Var, android.content.Context context, kotlinx.coroutines.y0 y0Var) {
        this.f435505a = h2Var;
        this.f435506b = v1Var;
        this.f435507c = context;
        this.f435508d = y0Var;
    }

    @Override // re4.z
    public final void h(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("SettingFingerprintService", "[fingerprint login] initSoter onResult errCode: " + i17 + ", errMsg: " + str);
        wd0.h2 h2Var = this.f435505a;
        if (i17 != 0 && i17 != 1028) {
            wd0.d1[] d1VarArr = wd0.d1.f444702d;
            kotlin.jvm.internal.o.d(str);
            ((com.tencent.mm.plugin.account.ui.t6) h2Var).a(1, str);
            return;
        }
        android.content.Context context = this.f435507c;
        vd0.v1 v1Var = this.f435506b;
        if (v1Var.Ui(context, true)) {
            kotlinx.coroutines.y0 y0Var = this.f435508d;
            kotlinx.coroutines.l.d(y0Var, null, null, new vd0.r1(v1Var, y0Var, h2Var, null), 3, null);
        } else {
            wd0.d1[] d1VarArr2 = wd0.d1.f444702d;
            ((com.tencent.mm.plugin.account.ui.t6) h2Var).a(2, "");
        }
    }
}
