package qy0;

/* loaded from: classes5.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f367653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f367654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f367655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(yz5.a aVar, boolean z17, ty0.b1 b1Var) {
        super(1);
        this.f367653d = aVar;
        this.f367654e = z17;
        this.f367655f = b1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.mj_template.sns.compose.widget.e1 it = (com.tencent.mm.mj_template.sns.compose.widget.e1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f367653d.invoke();
        boolean z17 = this.f367654e;
        ty0.b1 b1Var = this.f367655f;
        if (z17) {
            yz5.l lVar = b1Var.f422793c;
            java.lang.String music_id = ((r45.k96) it.f69938a).f378517d;
            kotlin.jvm.internal.o.f(music_id, "music_id");
            lVar.invoke(music_id);
        } else {
            yz5.l lVar2 = b1Var.f422802l;
            if (lVar2 != null) {
                lVar2.invoke(it);
            }
        }
        return jz5.f0.f302826a;
    }
}
