package s72;

/* loaded from: classes11.dex */
public final class c implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s72.d f403996d;

    public c(s72.d dVar) {
        this.f403996d = dVar;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        s72.d dVar = this.f403996d;
        dVar.f404015e.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mm.modelbase.u0 u0Var = dVar.f404016f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, dVar);
        }
    }
}
