package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes.dex */
public final class e1 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f191207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yz5.l lVar) {
        super(1, (r35.m3) null);
        this.f191207d = lVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/SpanExKt$setSpannableClick$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        this.f191207d.invoke(widget);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/SpanExKt$setSpannableClick$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
