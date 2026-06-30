package w45;

/* loaded from: classes.dex */
public final class m implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w45.p f442916d;

    public m(w45.p pVar) {
        this.f442916d = pVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.getType();
        com.tencent.mm.sdk.platformtools.u3.h(new w45.l(this.f442916d, m1Var, i18, i17));
    }
}
