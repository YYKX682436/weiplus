package yt2;

/* loaded from: classes3.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.g f465295d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yt2.g gVar) {
        super(0);
        this.f465295d = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new yt2.e(this.f465295d), true);
        b4Var.setLogging(false);
        return b4Var;
    }
}
