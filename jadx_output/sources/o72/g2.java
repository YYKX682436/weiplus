package o72;

/* loaded from: classes12.dex */
public class g2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.i2 f343341a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(o72.i2 i2Var, android.os.Looper looper) {
        super(looper);
        this.f343341a = i2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        o72.i2 i2Var = this.f343341a;
        java.util.Iterator it = i2Var.f343354b.iterator();
        while (it.hasNext()) {
            o72.h2 h2Var = (o72.h2) it.next();
            if (h2Var != null) {
                ((com.tencent.mm.plugin.fav.ui.e1) h2Var).a();
            }
        }
        i2Var.f343354b.clear();
    }
}
