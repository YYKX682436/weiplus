package ga4;

/* loaded from: classes.dex */
public final class b extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f269904d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f269905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String keyword, int i17) {
        super(i17, (r35.m3) null);
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f269904d = keyword;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/keywords/SnsKeywordMatcher$KeywordClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        yz5.l lVar = this.f269905e;
        if (lVar != null) {
            lVar.invoke(this.f269904d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/keywords/SnsKeywordMatcher$KeywordClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
    }
}
