package nu1;

@j95.b
/* loaded from: classes13.dex */
public final class n extends i95.w implements nu1.i {

    /* renamed from: e, reason: collision with root package name */
    public static tu1.o f340170e;

    /* renamed from: d, reason: collision with root package name */
    public final nu1.m f340171d = new nu1.m(this);

    static {
        new nu1.j(null);
    }

    public boolean Ai() {
        if (f340170e == null) {
            f340170e = new tu1.o();
        }
        tu1.o oVar = f340170e;
        if (oVar != null) {
            return oVar.f422120k;
        }
        return false;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "happened account release");
        com.tencent.mm.app.w.INSTANCE.a(this.f340171d);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCast", "happened account release");
        wi();
        com.tencent.mm.app.w.INSTANCE.p(this.f340171d);
    }

    public void wi() {
        com.tencent.mm.sdk.platformtools.x2.f193071a.stopService(new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.cast.service.ScreenCastForegroundService.class));
        if (f340170e == null) {
            f340170e = new tu1.o();
        }
        tu1.o oVar = f340170e;
        if (oVar != null) {
            oVar.d();
        }
    }
}
