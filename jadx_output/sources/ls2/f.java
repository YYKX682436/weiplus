package ls2;

/* loaded from: classes2.dex */
public final class f extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f321026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ls2.a f321027b;

    public f(in5.s0 s0Var, ls2.a aVar) {
        this.f321026a = s0Var;
        this.f321027b = aVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            in5.s0 s0Var = this.f321026a;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            ls2.b bVar = ls2.g.f321028e;
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ls2.a aVar = this.f321027b;
            org.json.JSONObject a17 = bVar.a(context2, aVar.f321020d.f453234a);
            ya2.b2 b2Var = aVar.f321020d.f453249k;
            a17.put("finderusername", b2Var != null ? b2Var.D0() : "");
            com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "menu", 0, a17, false, null, 48, null);
        }
    }
}
