package qb5;

/* loaded from: classes3.dex */
public class c implements com.tencent.mm.modelbase.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo.l f361329d;

    public c(qb5.g gVar, lo.l lVar) {
        this.f361329d = lVar;
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        lo.l lVar;
        lo.l lVar2 = this.f361329d;
        if (lVar2 != null) {
            lVar2.a(j17, j18, m1Var);
        }
        if (j17 < j18 || (lVar = this.f361329d) == null) {
            return;
        }
        lVar.b(0, "");
    }
}
