package y31;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y31.f f459162d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y31.f fVar) {
        super(0);
        this.f459162d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bf3.p Di = ((com.tencent.mm.plugin.magicbrush.m5) d4Var).Di(context);
        y31.f fVar = this.f459162d;
        fVar.f459170n = Di;
        jc3.j0 wi6 = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi("MagicNewAdPlayable");
        rc3.w0 w0Var = (rc3.w0) wi6;
        w0Var.w(fVar);
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = fVar;
        mBBuildConfig.f147828r = fVar;
        mBBuildConfig.f147831u = Di;
        mBBuildConfig.f147833w = true;
        mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.1f);
        mBBuildConfig.a(fVar.f459172p);
        mBBuildConfig.f147821h = z65.c.a();
        w0Var.W(mBBuildConfig);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.MagicNewPlayableBiz", "MagicBrush setUp");
        fVar.f459163d = wi6;
        w0Var.start();
        return jz5.f0.f302826a;
    }
}
