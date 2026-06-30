package df2;

/* loaded from: classes3.dex */
public final class li extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wi f230668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230669e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(df2.wi wiVar, java.lang.String str) {
        super(0);
        this.f230668d = wiVar;
        this.f230669e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.z53 z53Var;
        ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.c1 Ui = zo3.p.Ui();
        df2.wi wiVar = this.f230668d;
        r45.n73 c76 = wiVar.c7();
        Ui.d((c76 == null || (z53Var = (r45.z53) c76.getCustom(1)) == null) ? null : z53Var.getString(0));
        pm0.v.X(new df2.ki(wiVar, this.f230669e));
        return jz5.f0.f302826a;
    }
}
