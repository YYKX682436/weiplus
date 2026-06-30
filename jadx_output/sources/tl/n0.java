package tl;

/* loaded from: classes12.dex */
public class n0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl.o0 f420062a;

    public n0(tl.o0 o0Var, tl.p0 p0Var) {
        this.f420062a = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        tl.p0 p0Var = this.f420062a.f420065e;
        if (p0Var.f420083p <= 0) {
            return;
        }
        com.tencent.mm.modelbase.f1 f1Var = p0Var.f420085r;
        p0Var.f420083p = 2;
        if (f1Var != null) {
            f1Var.a();
        }
    }
}
