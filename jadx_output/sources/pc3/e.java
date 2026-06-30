package pc3;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353374d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pc3.m f353375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, pc3.m mVar) {
        super(0);
        this.f353374d = str;
        this.f353375e = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "removeBiz " + this.f353374d + ", bizCount = " + this.f353375e.f353383b.size());
        this.f353375e.f353383b.remove(this.f353374d);
        com.tencent.mm.plugin.magicbrush.a5 a5Var = com.tencent.mm.plugin.magicbrush.a5.f147836a;
        java.lang.String instanceName = this.f353374d;
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        java.util.Set set = com.tencent.mm.plugin.magicbrush.a5.f147842g;
        synchronized (set) {
            set.remove(instanceName);
            com.tencent.mm.plugin.magicbrush.a5.f147841f = a5Var.a(set);
        }
        if (this.f353375e.f353383b.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MagicBrushClientMgr", "No biz -> unbind service");
            pc3.m.a(this.f353375e, false);
        }
        return jz5.f0.f302826a;
    }
}
