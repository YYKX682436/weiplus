package f53;

/* loaded from: classes15.dex */
public final class c implements f53.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig f259635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f259636b;

    public c(com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig, kotlin.jvm.internal.h0 h0Var) {
        this.f259635a = gameAtSomeoneConfig;
        this.f259636b = h0Var;
    }

    public final void a(boolean z17) {
        com.tencent.mm.plugin.game.luggage.api.GameAtSomeoneConfig gameAtSomeoneConfig;
        java.lang.String str;
        if (!z17 || (str = (gameAtSomeoneConfig = this.f259635a).f139509d) == null || kotlin.jvm.internal.o.b(str, "")) {
            return;
        }
        ((com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) this.f259636b.f310123d).n1(gameAtSomeoneConfig.f139509d);
    }
}
