package np5;

/* loaded from: classes9.dex */
public abstract class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338830d;

    /* renamed from: e, reason: collision with root package name */
    public int f338831e;

    /* renamed from: f, reason: collision with root package name */
    public np5.d f338832f;

    public abstract void a(np5.d dVar);

    public abstract boolean b(int i17, int i18, np5.d dVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.u0 u0Var;
        java.lang.Object obj;
        if (!(m1Var instanceof np5.d) || b(i17, i18, (np5.d) m1Var) || (u0Var = this.f338830d) == null || (obj = this.f338832f) == null || !(obj instanceof com.tencent.mm.modelbase.m1)) {
            return;
        }
        u0Var.onSceneEnd(i17, i18, str, (com.tencent.mm.modelbase.m1) obj);
    }
}
