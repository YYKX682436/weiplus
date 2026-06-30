package qi5;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi5.w f363846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qi5.w wVar) {
        super(0);
        this.f363846d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j75.f stateCenter;
        wi5.n0 n0Var;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f363846d.f363847d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity baseMvvmActivity = appCompatActivity instanceof com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity ? (com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity) appCompatActivity : null;
        return java.lang.Boolean.valueOf((baseMvvmActivity == null || (stateCenter = baseMvvmActivity.getStateCenter()) == null || (n0Var = (wi5.n0) stateCenter.getState()) == null) ? false : n0Var.f446322r);
    }
}
