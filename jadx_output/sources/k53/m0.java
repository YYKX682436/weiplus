package k53;

/* loaded from: classes8.dex */
public class m0 implements k53.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304372a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f304373b;

    public m0(k53.u0 u0Var, int i17) {
        this.f304373b = u0Var;
        this.f304372a = i17;
    }

    @Override // k53.s0
    public void a(k53.t0 t0Var) {
        k53.u0 u0Var = this.f304373b;
        u0Var.getClass();
        ot0.q qVar = new ot0.q();
        qVar.f348666i = 5;
        qVar.f348654f = t0Var.f304388a;
        java.lang.String str = t0Var.f304389b;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.content.Context context = u0Var.f304395a;
        if (K0) {
            str = context.getString(com.tencent.mm.R.string.fpd);
        }
        qVar.f348658g = str;
        qVar.f348674k = t0Var.f304391d;
        qVar.f348734z = t0Var.f304390c;
        java.lang.String u17 = ot0.q.u(qVar, null, null);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", u17);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        intent.putExtra("src_username", context.getString(com.tencent.mm.R.string.fpd));
        intent.putExtra("src_displayname", context.getString(com.tencent.mm.R.string.fpd));
        j45.l.v(context, ".ui.transmit.MsgRetransmitUI", intent, this.f304372a);
    }
}
