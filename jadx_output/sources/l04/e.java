package l04;

/* loaded from: classes11.dex */
public class e implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f314850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314851b;

    public e(q80.d0 d0Var, android.content.Context context) {
        this.f314850a = d0Var;
        this.f314851b = context;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Feature", "openLiteApp fail %s.", this.f314850a.f360649a);
        l04.g.a(this.f314851b);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Feature", "openLiteApp success %s.", this.f314850a.f360649a);
    }
}
