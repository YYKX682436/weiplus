package z41;

/* loaded from: classes8.dex */
public class c extends android.view.OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public z41.a f470090a;

    /* renamed from: b, reason: collision with root package name */
    public final int f470091b;

    /* renamed from: c, reason: collision with root package name */
    public final z41.b f470092c;

    public c(android.content.Context context, z41.b bVar) {
        super(context);
        this.f470090a = z41.a.NONE;
        this.f470091b = 45;
        this.f470092c = bVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.OrientationListenerHelper", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // android.view.OrientationEventListener
    public void disable() {
        super.disable();
        this.f470090a = z41.a.NONE;
    }

    @Override // android.view.OrientationEventListener
    public void enable() {
        super.enable();
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i17) {
        if (i17 == -1) {
            return;
        }
        z41.a aVar = this.f470090a;
        int i18 = this.f470091b;
        z41.a aVar2 = ((i17 < 360 - i18 || i17 >= 360) && (i17 < 0 || i17 > i18 + 0)) ? (i17 < 270 - i18 || i17 > i18 + 270) ? (i17 < 180 - i18 || i17 > i18 + 180) ? (i17 < 90 - i18 || i17 > i18 + 90) ? aVar : z41.a.REVERSE_LANDSCAPE : z41.a.REVERSE_PORTRAIT : z41.a.LANDSCAPE : z41.a.PORTRAIT;
        if (aVar2 != aVar) {
            z41.b bVar = this.f470092c;
            if (bVar != null && aVar != z41.a.NONE) {
                bVar.a(aVar, aVar2);
            }
            this.f470090a = aVar2;
        }
    }
}
