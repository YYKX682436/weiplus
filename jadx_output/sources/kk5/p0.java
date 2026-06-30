package kk5;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.q0 f308677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(kk5.q0 q0Var) {
        super(1);
        this.f308677d = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null && (str = (java.lang.String) kz5.n0.a0(c0Var.f446282b, 0)) != null) {
            kk5.q0 q0Var = this.f308677d;
            android.content.Intent intent = new android.content.Intent(q0Var.getActivity(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent.addFlags(67108864);
            intent.putExtra("Chat_User", str);
            intent.putExtra("finish_direct", false);
            androidx.appcompat.app.AppCompatActivity activity = q0Var.getActivity();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/uic/SelectDirectChatUIC$onCreate$1", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/ui/uic/SelectDirectChatUIC$onCreate$1", "invoke", "(Lcom/tencent/mm/ui/mvvm/state/SelectContactState;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            q0Var.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
