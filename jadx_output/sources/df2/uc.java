package df2;

/* loaded from: classes3.dex */
public final class uc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ad f231509d;

    public uc(df2.ad adVar) {
        this.f231509d = adVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pk2.o9 o9Var;
        pk2.j9 j9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorHitPromptTipsController$checkTipsLocation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.plugin.finder.live.viewmodel.s5 s5Var = (com.tencent.mm.plugin.finder.live.viewmodel.s5) pf5.z.f353948a.a((com.tencent.mm.ui.MMActivity) context).a(com.tencent.mm.plugin.finder.live.viewmodel.s5.class);
        if (s5Var != null && (o9Var = s5Var.f117394d) != null && (j9Var = o9Var.f356084g) != null) {
            j9Var.a(null, false);
        }
        df2.ad adVar = this.f231509d;
        kotlinx.coroutines.r2 r2Var = adVar.f229708n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if2.d0 d0Var = adVar.f229707m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorHitPromptTipsController$checkTipsLocation$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
