package vn2;

/* loaded from: classes2.dex */
public final class q0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bo2.a f438363a;

    public q0(bo2.a aVar) {
        this.f438363a = aVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        bo2.a aVar;
        xn2.a aVar2;
        if (i17 != -1 || intent == null || (aVar = this.f438363a) == null || (aVar2 = (xn2.a) ((com.tencent.mm.plugin.finder.megavideo.topstory.flow.b1) aVar).f120904a.get()) == null) {
            return;
        }
        long longExtra = intent.getLongExtra("key_see_later_data_key", 0L);
        xn2.p0 p0Var = (xn2.p0) aVar2;
        jz5.l lVar = vn2.u0.f438393g;
        if (lVar == null || longExtra != ((java.lang.Number) lVar.f302833d).longValue()) {
            return;
        }
        p0Var.j().i((java.util.List) lVar.f302834e, null);
        vn2.u0.f438393g = null;
    }
}
