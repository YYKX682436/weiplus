package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class xo implements com.tencent.mm.pluginsdk.ui.chat.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.ro f200263a;

    public xo(com.tencent.mm.ui.chatting.component.ro roVar) {
        this.f200263a = roVar;
    }

    public void a(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.ui.chatting.component.ro roVar = this.f200263a;
        if (booleanValue) {
            if (roVar.D == null) {
                roVar.D = ((android.view.ViewStub) roVar.f198580d.c(com.tencent.mm.R.id.p3g)).inflate();
            }
            android.view.View view = roVar.D;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = roVar.D;
        if (view2 == null || view2.getVisibility() != 0) {
            return;
        }
        android.view.View view3 = roVar.D;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/component/VoiceComponent$5", "voiceInputMask", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
