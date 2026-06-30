package l41;

/* loaded from: classes15.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l41.j1 j1Var) {
        super(0);
        this.f315977d = j1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = this.f315977d.f315842a.getIntent();
        if (intent != null) {
            return (android.os.ResultReceiver) intent.getParcelableExtra("key_result_receiver");
        }
        return null;
    }
}
