package qb5;

/* loaded from: classes3.dex */
public class e implements com.tencent.mm.pluginsdk.model.app.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lo.l f361331a;

    public e(qb5.g gVar, lo.l lVar) {
        this.f361331a = lVar;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.r0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        lo.l lVar;
        lo.l lVar2 = this.f361331a;
        if (lVar2 != null) {
            lVar2.a(j17, j18, m1Var);
        }
        if (j17 < j18 || (lVar = this.f361331a) == null) {
            return;
        }
        lVar.b(0, "");
    }
}
