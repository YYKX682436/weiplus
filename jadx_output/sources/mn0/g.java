package mn0;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mn0.y yVar) {
        super(0);
        this.f329733d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f329733d.f329805d.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (android.media.AudioManager) systemService;
    }
}
