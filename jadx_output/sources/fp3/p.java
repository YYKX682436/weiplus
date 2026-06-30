package fp3;

/* loaded from: classes9.dex */
public class p implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fp3.q f265326b;

    public p(fp3.q qVar, int i17) {
        this.f265326b = qVar;
        this.f265325a = i17;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        fp3.q qVar = this.f265326b;
        dp3.o oVar = (dp3.o) ((java.util.ArrayList) qVar.f265327d.f152855g).get(this.f265325a);
        if (oVar != null) {
            qVar.f265327d.V6(oVar.f242224d, oVar.A, 1);
        }
    }
}
