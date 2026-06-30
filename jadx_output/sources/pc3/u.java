package pc3;

/* loaded from: classes7.dex */
public final class u extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase f353404a;

    public u(com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase magicBrushServiceContextBase) {
        this.f353404a = magicBrushServiceContextBase;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MagicBrushServiceContext", "onEnterForeground");
        int i17 = com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase.f147890f;
        this.f353404a.a().d(true);
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MagicBrushServiceContext", "onExitForeground");
        int i17 = com.tencent.mm.plugin.magicbrush.core.MagicBrushServiceContextBase.f147890f;
        this.f353404a.a().d(false);
    }
}
