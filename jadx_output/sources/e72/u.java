package e72;

/* loaded from: classes14.dex */
public class u implements e72.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.v f249927a;

    public u(e72.v vVar) {
        this.f249927a = vVar;
    }

    public void a(int i17) {
        synchronized (this.f249927a.f249944q) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NumberFaceMotion", "hy: on voice prepare error: %d", java.lang.Integer.valueOf(i17));
            if (i17 != 11) {
                e72.v vVar = this.f249927a;
                vVar.f249946s = true;
                vVar.f249947t = new e72.f(7, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.hhn));
            } else {
                this.f249927a.getClass();
            }
        }
    }
}
