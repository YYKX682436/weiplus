package qq0;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq0.u f365908d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qq0.u uVar) {
        super(0);
        this.f365908d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qq0.u uVar = this.f365908d;
        if (uVar.f365920i && !uVar.f365919h) {
            if (uVar.f365922k == null) {
                uVar.f365922k = new qq0.p(uVar);
            }
            android.widget.ImageView imageView = uVar.f365916e;
            imageView.removeCallbacks(uVar.f365922k);
            imageView.postDelayed(uVar.f365922k, 300L);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclViewCoverLogic", "CoverLogic, surface update after scl remove cover");
        }
        return jz5.f0.f302826a;
    }
}
