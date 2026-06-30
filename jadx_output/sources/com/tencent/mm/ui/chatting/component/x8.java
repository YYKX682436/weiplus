package com.tencent.mm.ui.chatting.component;

/* loaded from: classes.dex */
public final class x8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f200223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        super(0);
        this.f200223d = y8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View x07 = this.f200223d.x0();
        if (x07 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(x07, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$updateNewTextGuide$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x07.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(x07, "com/tencent/mm/ui/chatting/component/ChattingVoice2TxtComponent$updateNewTextGuide$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
