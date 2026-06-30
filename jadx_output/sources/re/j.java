package re;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re.n f394273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(re.n nVar) {
        super(0);
        this.f394273d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new re.i(this.f394273d), false);
    }
}
