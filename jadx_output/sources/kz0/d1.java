package kz0;

/* loaded from: classes5.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f313677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f313678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(yz5.a aVar, ty0.b1 b1Var, n0.v2 v2Var) {
        super(1);
        this.f313677d = aVar;
        this.f313678e = b1Var;
        this.f313679f = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.mj_template.sns.compose.widget.e1 it = (com.tencent.mm.mj_template.sns.compose.widget.e1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f313677d.invoke();
        int i17 = kz0.k1.f313767a;
        this.f313679f.setValue(java.lang.Boolean.FALSE);
        yz5.l lVar = this.f313678e.f422793c;
        java.lang.String music_id = ((r45.k96) it.f69938a).f378517d;
        kotlin.jvm.internal.o.f(music_id, "music_id");
        lVar.invoke(music_id);
        return jz5.f0.f302826a;
    }
}
