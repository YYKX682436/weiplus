package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class te implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity f174324d;

    public te(com.tencent.mm.plugin.textstatus.ui.TextStatusOtherTopicFriendsActivity textStatusOtherTopicFriendsActivity) {
        this.f174324d = textStatusOtherTopicFriendsActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object value = ((jz5.n) this.f174324d.f173659f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$4$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/TextStatusOtherTopicFriendsActivity$onCreate$4$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
