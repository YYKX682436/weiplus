package sx3;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx3.m f413558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sx3.m mVar, int i17) {
        super(0);
        this.f413558d = mVar;
        this.f413559e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List data;
        t45.e0 e0Var;
        t45.f fVar;
        java.util.List data2;
        java.util.List data3;
        sx3.m mVar = this.f413558d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = mVar.f413568g;
        if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
            int i17 = this.f413559e;
            ox3.f fVar2 = (ox3.f) data.get(i17);
            if (fVar2 != null) {
                androidx.appcompat.app.AppCompatActivity activity = mVar.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                pf5.z zVar = pf5.z.f353948a;
                sx3.q qVar = (sx3.q) zVar.a(activity).a(sx3.q.class);
                qVar.getClass();
                androidx.appcompat.app.AppCompatActivity activity2 = qVar.getActivity();
                kotlin.jvm.internal.o.g(activity2, "activity");
                ((com.tencent.mm.plugin.ringtone.uic.z1) zVar.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).O6();
                androidx.appcompat.app.AppCompatActivity activity3 = qVar.getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
                sx3.m mVar2 = (sx3.m) zVar.a(activity3).a(sx3.m.class);
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = mVar2.f413568g;
                ox3.f fVar3 = (wxRecyclerAdapter2 == null || (data3 = wxRecyclerAdapter2.getData()) == null) ? null : (ox3.f) data3.get(i17);
                kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.plugin.ringtone.data.RingtoneConvertData");
                ox3.g gVar = (ox3.g) fVar3;
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = mVar2.f413568g;
                if (wxRecyclerAdapter3 != null && (data2 = wxRecyclerAdapter3.getData()) != null) {
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter4 = mVar2.f413568g;
                if (wxRecyclerAdapter4 != null) {
                    wxRecyclerAdapter4.notifyItemRemoved(i17);
                }
                t45.g gVar2 = gVar.f349749d.f415617f;
                if (gVar2 != null && (fVar = gVar2.f415560d) != null) {
                    java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(fVar.f415549d);
                    kotlin.jvm.internal.o.d(r07);
                    wx3.a.a(3L, r07, 2L);
                }
                t45.f0 f0Var = gVar.f349749d.f415616e;
                if (f0Var != null && (e0Var = f0Var.f415551d) != null) {
                    wx3.a.a(3L, java.lang.String.valueOf(e0Var.f415547d), 1L);
                }
                androidx.appcompat.app.AppCompatActivity activity4 = qVar.getActivity();
                kotlin.jvm.internal.o.g(activity4, "activity");
                sx3.b bVar = (sx3.b) zVar.a(activity4).a(sx3.b.class);
                bVar.getClass();
                vx3.i i18 = vx3.l.E.i(((ox3.g) fVar2).f349749d);
                if (i18 != null) {
                    bVar.f413549g.remove(i18.e());
                    kotlin.jvm.internal.m0.a(bVar.f413550h).remove(fVar2);
                }
                kotlinx.coroutines.l.d(qVar.getLifecycleScope(), null, null, new sx3.o(fVar2, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
