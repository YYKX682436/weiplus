package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class g5 extends com.tencent.mm.pluginsdk.ui.span.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f204015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx3.i f204017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(int i17, int i18, android.app.Activity activity, java.lang.String str, vx3.i iVar) {
        super(i17, i18);
        this.f204015d = activity;
        this.f204016e = str;
        this.f204017f = iVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCalleeRingtoneHint$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRingtone", "[onClick] app msg enter to finder feed");
        mx3.s sVar = mx3.u.f332620f;
        android.app.Activity context = this.f204015d;
        kotlin.jvm.internal.o.f(context, "$context");
        java.lang.String str = this.f204016e;
        mx3.s.a(sVar, context, 1, str == null ? "" : str, 6, false, this.f204017f, 16, null);
        if (str == null) {
            str = "";
        }
        java.lang.String r07 = com.tencent.mm.sdk.platformtools.t8.r0(this.f204017f.f441298o);
        kotlin.jvm.internal.o.f(r07, "getUnsignedLongString(...)");
        wx3.a.f(3, 2, "", str, r07);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCalleeRingtoneHint$filling$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
    }
}
