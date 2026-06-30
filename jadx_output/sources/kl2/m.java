package kl2;

/* loaded from: classes3.dex */
public final class m extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.n f308790d;

    public m(kl2.n nVar) {
        this.f308790d = nVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        df2.ox oxVar;
        pk2.o9 o9Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$setConsumeManagerText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        kl2.n nVar = this.f308790d;
        nVar.a();
        il2.r rVar = (il2.r) nVar.f308791h;
        r45.f82 f82Var = ((mm2.v5) rVar.P0(mm2.v5.class)).f329486i;
        com.tencent.mars.xlog.Log.i("FinderLiveRestrictConsumePlugin", "showConsumeManagerWidget restrictConsumeDialogData: " + f82Var);
        if (f82Var != null && (oxVar = (df2.ox) rVar.U0(df2.ox.class)) != null && (o9Var = oxVar.f231016q) != null) {
            pk2.ta.a(o9Var, false, null, 3, null);
        }
        il2.s.f292086a.a(zl2.e5.f473742i, nVar.f308797q);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveRestrictConsumeDialogWidget$setConsumeManagerText$firstClickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#576B95"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
