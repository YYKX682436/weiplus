package s61;

/* loaded from: classes8.dex */
public class b1 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f403328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s61.f1 f403329b;

    public b1(s61.f1 f1Var, java.util.ArrayList arrayList) {
        this.f403329b = f1Var;
        this.f403328a = arrayList;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        if (i18 != -1) {
            this.f403329b.a(((r61.s0) this.f403328a.get(i18)).field_googlegmail);
        }
    }
}
