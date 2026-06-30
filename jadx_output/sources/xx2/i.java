package xx2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx2.l f457973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f457974e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xx2.l lVar, boolean z17) {
        super(0);
        this.f457973d = lVar;
        this.f457974e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f457974e;
        xx2.l lVar = this.f457973d;
        lVar.c(z17);
        int i17 = lVar.f457987i;
        int i18 = com.tencent.mm.plugin.finder.view.sidebar.DraggableConstraintLayout.L;
        lVar.f457985g.a(i17 == 2);
        return jz5.f0.f302826a;
    }
}
