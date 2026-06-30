package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public final class z5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.g6 f192022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(com.tencent.mm.pluginsdk.ui.tools.g6 g6Var) {
        super(0);
        this.f192022d = g6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent className = new android.content.Intent().setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.ui.chatting.ChattingSendDataToDeviceUI");
        kotlin.jvm.internal.o.f(className, "setClassName(...)");
        com.tencent.mm.pluginsdk.ui.tools.g6 g6Var = this.f192022d;
        className.putExtra("Retr_Msg_Id", g6Var.f191645b.f191987j);
        className.putExtra("Retr_MsgTalker", g6Var.f191645b.f191988k);
        className.addFlags(268435456);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$dealMenuClick$5", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/QBFileMenuBottomSheetHelper$dealMenuClick$5", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
