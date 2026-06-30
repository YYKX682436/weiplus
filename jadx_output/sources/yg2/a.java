package yg2;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yg2.b f462316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yg2.b bVar) {
        super(0);
        this.f462316d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final yg2.b bVar = this.f462316d;
        bVar.f462317d.mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.finder.live.infrastructure.coroutine.LiveScope$1$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy() {
                yg2.b bVar2 = yg2.b.this;
                kotlinx.coroutines.z0.e(bVar2, null, 1, null);
                bVar2.f462317d.mo133getLifecycle().c(this);
                bVar2.f462320g.dead();
            }
        });
        return jz5.f0.f302826a;
    }
}
