package kb5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kb5.b f306246d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kb5.b bVar) {
        super(1);
        this.f306246d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            kb5.b bVar = this.f306246d;
            bVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            java.util.List list = c0Var.f446282b;
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(list, ",");
            intent.putExtra("Select_Conv_User", c17);
            if (list.size() == 1) {
                intent.putExtra("KSelectUserChatType", k01.d.a(c17));
            }
            bVar.getActivity().setResult(-1, intent);
            bVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
