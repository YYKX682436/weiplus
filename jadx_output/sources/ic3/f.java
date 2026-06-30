package ic3;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xj.i f290400e;

    public f(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity, xj.i iVar) {
        this.f290399d = magicAdServiceDemoActivity;
        this.f290400e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290399d;
        java.lang.String str = magicAdServiceDemoActivity.f147850d;
        ((wj.j0) this.f290400e).Vi(magicAdServiceDemoActivity.f147851e, magicAdServiceDemoActivity.f147856m, new ic3.e(magicAdServiceDemoActivity));
    }
}
