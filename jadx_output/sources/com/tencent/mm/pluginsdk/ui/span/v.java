package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes2.dex */
public final class v extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f191293d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.span.u f191294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, com.tencent.mm.pluginsdk.ui.span.u obj) {
        super(obj.f191290d, obj.f191291e);
        kotlin.jvm.internal.o.g(obj, "obj");
        this.f191293d = i17;
        this.f191294e = obj;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.pluginsdk.ui.span.u uVar = this.f191294e;
        com.tencent.mm.pluginsdk.ui.span.t tVar = uVar.f191292f;
        if (tVar != null) {
            tVar.a(widget, this.f191293d, uVar);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/LinkTextClickSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
