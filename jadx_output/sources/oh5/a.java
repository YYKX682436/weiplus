package oh5;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh5.d f345487d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(oh5.d dVar) {
        super(0);
        this.f345487d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        while (true) {
            oh5.d dVar = this.f345487d;
            if (!(!dVar.f345491b.isEmpty()) || !com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
                break;
            }
            android.content.Intent intent = (android.content.Intent) dVar.f345491b.poll();
            if (intent != null) {
                dVar.a(intent);
            }
        }
        return jz5.f0.f302826a;
    }
}
