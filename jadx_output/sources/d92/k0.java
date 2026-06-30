package d92;

/* loaded from: classes.dex */
public final class k0 extends e92.b implements d92.l2 {

    /* renamed from: e, reason: collision with root package name */
    public static final d92.s f227486e = new d92.s(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.f484351dz5);
        root.view(com.tencent.mm.R.id.dzo).clickAs(com.tencent.mm.R.id.a_4).disableChildren().desc(new d92.t(context));
        root.view(com.tencent.mm.R.id.a8p).disable();
        root(com.tencent.mm.R.id.lkf).view(com.tencent.mm.R.id.lkg).desc(d92.c0.f227459d);
        root(com.tencent.mm.R.id.gbz).view(com.tencent.mm.R.id.a_x).desc(d92.d0.f227462d);
        root(com.tencent.mm.R.id.gbz).view(com.tencent.mm.R.id.msw).desc(d92.e0.f227468d);
        root(com.tencent.mm.R.id.gbz).view(com.tencent.mm.R.id.c79).desc(d92.f0.f227471d);
        root(com.tencent.mm.R.id.gbz).view(com.tencent.mm.R.id.f487088ng5).desc(d92.g0.f227474d);
        root(com.tencent.mm.R.id.chy).view(com.tencent.mm.R.id.f487278o45).desc(d92.h0.f227478d);
        root(com.tencent.mm.R.id.ggw).view(com.tencent.mm.R.id.iqi).desc(com.tencent.mm.R.string.egx);
        root(com.tencent.mm.R.id.efq).view(com.tencent.mm.R.id.efy).desc(d92.i0.f227482d);
        root(com.tencent.mm.R.id.efq).view(com.tencent.mm.R.id.efv).desc(d92.j0.f227484d);
        root(com.tencent.mm.R.id.efq).view(com.tencent.mm.R.id.f484502rl5).desc(d92.u.f227509d);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f487850r);
        root2.disable(com.tencent.mm.R.id.ggw);
        root2.view(com.tencent.mm.R.id.iqp).desc(new d92.v(context));
        root2.view(com.tencent.mm.R.id.f486332kx4).desc(com.tencent.mm.R.string.guf).type(com.tencent.mm.accessibility.type.ViewType.Button).expand(i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479672c9)), i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479738dv)), i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479738dv)), i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479738dv)));
        root2.view(com.tencent.mm.R.id.g4n).expand(0, i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479648bn)), i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479688cn)), i65.a.c(context, i65.a.f(context, com.tencent.mm.R.dimen.f479648bn)));
        root(com.tencent.mm.R.id.jdk).view(com.tencent.mm.R.id.g99).disable();
        root(com.tencent.mm.R.id.f484896qk3).view(com.tencent.mm.R.id.qm_).type(com.tencent.mm.accessibility.type.ViewType.SeekBar).disExpand().desc(new d92.w(context)).onSeekForward(new d92.x(this)).onSeekBackward(new d92.y(this));
        root(com.tencent.mm.R.id.ehc).view(com.tencent.mm.R.id.ehd).desc(new d92.z(context));
        root(com.tencent.mm.R.id.g4q).view(com.tencent.mm.R.id.e_x).desc(new d92.a0(context));
        root(com.tencent.mm.R.id.g4q).view(com.tencent.mm.R.id.g4v).desc(new d92.b0(context));
    }
}
