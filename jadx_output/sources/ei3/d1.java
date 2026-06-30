package ei3;

/* loaded from: classes10.dex */
public class d1 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.e1 f253035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(ei3.e1 e1Var, android.os.Looper looper) {
        super(looper);
        this.f253035a = e1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (257 != i17) {
            if (258 == i17) {
                android.support.v4.media.f.a(message.obj);
                return;
            } else {
                if (259 == i17) {
                    android.support.v4.media.f.a(message.obj);
                    return;
                }
                return;
            }
        }
        int i18 = 0;
        while (true) {
            ei3.e1 e1Var = this.f253035a;
            if (i18 >= e1Var.f253040b.size()) {
                return;
            }
            android.support.v4.media.f.a(((java.lang.ref.WeakReference) e1Var.f253040b.valueAt(i18)).get());
            i18++;
        }
    }
}
