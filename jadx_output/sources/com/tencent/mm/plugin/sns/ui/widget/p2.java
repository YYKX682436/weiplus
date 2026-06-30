package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class p2 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f171247d;

    public p2(yz5.p pVar) {
        this.f171247d = pVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$setSpan$clickableSpan$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager$setSpan$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        java.lang.Object tag = getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsCommentInfo");
        this.f171247d.invoke(widget, (r45.e86) tag);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/widget/SnsCommentMediaLoadManager$setSpan$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager$setSpan$clickableSpan$1");
    }
}
