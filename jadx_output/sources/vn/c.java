package vn;

/* loaded from: classes11.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f438168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f438169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438170f;

    public c(com.tencent.mm.ui.widget.dialog.k0 k0Var, android.content.Context context, java.lang.String str) {
        this.f438168d = k0Var;
        this.f438169e = context;
        this.f438170f = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/chatroom/util/ConvBoxTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f438168d.u();
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this.f438169e, "com.tencent.mm.ui.LauncherUI");
        android.content.SharedPreferences d17 = com.tencent.mm.sdk.platformtools.x2.d();
        if (d17 != null) {
            d17.edit().putBoolean("conversation_box_tip", true).apply();
        }
        intent.setFlags(67108864);
        android.content.Context context = this.f438169e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/chatroom/util/ConvBoxTip$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/chatroom/util/ConvBoxTip$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct chatBoxGroupActionStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatBoxGroupActionStruct();
        chatBoxGroupActionStruct.f55598d = chatBoxGroupActionStruct.b("roomUsername", this.f438170f, true);
        chatBoxGroupActionStruct.f55599e = 3L;
        chatBoxGroupActionStruct.k();
        yj0.a.h(this, "com/tencent/mm/chatroom/util/ConvBoxTip$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
