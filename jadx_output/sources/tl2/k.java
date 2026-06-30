package tl2;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.ui.fa {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f420254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f420255e;

    public k(tl2.u uVar, java.lang.Runnable runnable) {
        this.f420254d = uVar;
        this.f420255e = runnable;
    }

    @Override // com.tencent.mm.ui.fa
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        int i17 = newConfig.orientation;
        tl2.u uVar = this.f420254d;
        if (i17 == 1) {
            ((com.tencent.mm.ui.MMActivity) uVar.f420274d).getWindow().getDecorView().postDelayed(this.f420255e, 1000L);
        }
        android.app.Activity activity = uVar.f420274d;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.removeOnConfigurationChangedListener(this);
        }
    }
}
