package df2;

/* loaded from: classes3.dex */
public final class ri extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.m01 f231248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wi f231249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(r45.m01 m01Var, df2.wi wiVar) {
        super(1);
        this.f231248d = m01Var;
        this.f231249e = wiVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.wi wiVar = this.f231249e;
        if (booleanValue) {
            if (kz5.z.G(new java.lang.Integer[]{1, 5}, java.lang.Integer.valueOf(this.f231248d.getInteger(0)))) {
                ((mm2.c1) wiVar.business(mm2.c1.class)).D5 = true;
            }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = wiVar.f231693p;
            com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = wiVar.f231694q;
            if (finderObjectDesc != null && finderMedia != null) {
                wiVar.Z6(finderObjectDesc, finderMedia);
            }
        } else {
            android.content.Context O6 = wiVar.O6();
            pf5.z zVar = pf5.z.f353948a;
            if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).a(com.tencent.mm.plugin.finder.live.viewmodel.b8.class)).a7();
        }
        return jz5.f0.f302826a;
    }
}
