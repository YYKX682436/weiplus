package k91;

/* loaded from: classes4.dex */
public class n1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.p1 f305691d;

    public n1(k91.p1 p1Var) {
        this.f305691d = p1Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        k91.p1 p1Var = this.f305691d;
        if (p1Var == null) {
            return 0;
        }
        p1Var.a(i17, i18, str, oVar);
        return 0;
    }
}
