package pa5;

/* loaded from: classes3.dex */
public final class c implements u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f353093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Matrix f353094b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f353095c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u3.p f353096d;

    public c(android.graphics.Matrix matrix, android.graphics.Matrix matrix2, yz5.p pVar, u3.p pVar2) {
        this.f353093a = matrix;
        this.f353094b = matrix2;
        this.f353095c = pVar;
        this.f353096d = pVar2;
    }

    @Override // u3.p
    public final void a(u3.s sVar, boolean z17, float f17, float f18) {
        android.graphics.Matrix matrix = this.f353094b;
        android.graphics.Matrix matrix2 = this.f353093a;
        matrix2.set(matrix);
        yz5.p pVar = this.f353095c;
        if (pVar != null) {
            pVar.invoke(java.lang.Float.valueOf(1.0f), matrix2);
        }
        this.f353096d.a(sVar, z17, f17, f18);
    }
}
