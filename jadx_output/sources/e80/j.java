package e80;

/* loaded from: classes12.dex */
public final class j implements k70.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f250024a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f250025b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m11.d f250026c;

    public j(com.tencent.mm.modelbase.f fVar, kotlinx.coroutines.q qVar, m11.d dVar) {
        this.f250024a = fVar;
        this.f250025b = qVar;
        this.f250026c = dVar;
    }

    public final void a(long j17, int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.modelbase.f fVar = this.f250024a;
        fVar.f70615a = i18;
        fVar.f70616b = i19;
        r45.mu6 mu6Var = new r45.mu6();
        mu6Var.set(9, java.lang.Long.valueOf(j17));
        mu6Var.set(12, str);
        mu6Var.set(8, java.lang.Integer.valueOf(i17));
        r45.lu6 lu6Var = this.f250026c.f322666q;
        mu6Var.set(2, lu6Var != null ? (r45.du5) lu6Var.getCustom(1) : null);
        fVar.f70618d = mu6Var;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f250025b.resumeWith(kotlin.Result.m521constructorimpl(fVar));
    }
}
