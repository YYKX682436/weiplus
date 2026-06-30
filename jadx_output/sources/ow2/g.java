package ow2;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ow2.h f349376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ow2.h hVar) {
        super(0);
        this.f349376d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ow2.h hVar = this.f349376d;
        com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView finderSpeedIndicatorView = (com.tencent.mm.plugin.finder.view.FinderSpeedIndicatorView) hVar.f349381b.findViewById(com.tencent.mm.R.id.tux);
        yz5.l lVar = hVar.f349382c;
        if (lVar != null && finderSpeedIndicatorView != null) {
            finderSpeedIndicatorView.setOnSpeedClickListener(new ow2.f(lVar));
        }
        return finderSpeedIndicatorView;
    }
}
