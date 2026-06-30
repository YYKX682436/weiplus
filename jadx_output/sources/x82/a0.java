package x82;

/* loaded from: classes9.dex */
public class a0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f452493a;

    public a0(x82.b0 b0Var, q80.d0 d0Var) {
        this.f452493a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "[handleLiteAppItem] fail appId = " + this.f452493a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FavItemLogic", "[handleLiteAppItem] success appId = " + this.f452493a.f360649a);
    }
}
