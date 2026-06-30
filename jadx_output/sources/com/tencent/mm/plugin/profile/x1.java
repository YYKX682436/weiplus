package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class x1 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f154738d;

    public x1(android.view.View.OnClickListener onClickListener) {
        this.f154738d = onClickListener;
        setColor(i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478524a5), i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.ahd));
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ProfileUtilsKt$getChatroomInviter$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View.OnClickListener onClickListener = this.f154738d;
        if (onClickListener != null) {
            onClickListener.onClick(widget);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ProfileUtilsKt$getChatroomInviter$clickableSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
