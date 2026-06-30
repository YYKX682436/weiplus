package qe5;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.w0 f362196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(qe5.w0 w0Var) {
        super(0);
        this.f362196d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity activity = this.f362196d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        qe5.n1 n1Var = (qe5.n1) pf5.z.f353948a.a(activity).a(qe5.n1.class);
        kd5.e T6 = n1Var.T6();
        java.lang.Long valueOf = T6 != null ? java.lang.Long.valueOf(T6.f306879g) : null;
        kd5.e T62 = n1Var.T6();
        java.lang.String str = T62 != null ? T62.f306880h : null;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = n1Var.P6();
        if (P6 != null) {
            android.content.Intent intent = new android.content.Intent(P6, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent.putExtra("msg_local_id", valueOf);
            intent.putExtra("finish_direct", true);
            intent.putExtra("show_search_chat_content_result", true);
            intent.putExtra("need_hight_item", true);
            intent.putExtra("Chat_User", str);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(P6, arrayList.toArray(), "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC", "doGotoChatting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            P6.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(P6, "com/tencent/mm/ui/chatting/uic/file/FilePageLogicUIC", "doGotoChatting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
