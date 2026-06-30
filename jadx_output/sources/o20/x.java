package o20;

/* loaded from: classes14.dex */
public final class x implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.player.EcsVideoView f342400a;

    public x(com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView) {
        this.f342400a = ecsVideoView;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        o20.c0 c0Var;
        o20.c0 c0Var2;
        boolean b17 = kotlin.jvm.internal.o.b(str, "view_exp");
        com.tencent.mm.feature.ecs.product.player.EcsVideoView ecsVideoView = this.f342400a;
        if (b17) {
            if (!ecsVideoView.getAutoPlay() || (c0Var2 = ecsVideoView.f65938i) == null) {
                return null;
            }
            ((o20.i) c0Var2).e();
            return null;
        }
        if (!kotlin.jvm.internal.o.b(str, "view_unexp")) {
            return null;
        }
        if (ecsVideoView.getAutoPlay() && (c0Var = ecsVideoView.f65938i) != null) {
            ((o20.i) c0Var).a();
        }
        q20.k kVar = ecsVideoView.f65939m;
        if (kVar == null) {
            return null;
        }
        kVar.d();
        return null;
    }
}
