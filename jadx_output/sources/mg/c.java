package mg;

/* loaded from: classes5.dex */
public final class c extends ng.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg.a f326196a;

    public c(mg.a aVar) {
        this.f326196a = aVar;
    }

    @Override // ng.f
    public void a(com.tencent.maas.base.Rect2 curRect, com.tencent.maas.base.Vec2 scale, float f17) {
        mg.d dVar;
        kotlin.jvm.internal.o.g(curRect, "curRect");
        kotlin.jvm.internal.o.g(scale, "scale");
        mg.a aVar = this.f326196a;
        if (aVar.f326187e == null || (dVar = aVar.f326186d) == null) {
            return;
        }
        dVar.a(curRect, scale, f17);
    }
}
