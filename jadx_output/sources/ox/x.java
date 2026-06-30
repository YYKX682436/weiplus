package ox;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox.z f349532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f349533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f349534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv.e3 f349535g;

    public x(ox.z zVar, l81.b1 b1Var, android.content.Context context, rv.e3 e3Var) {
        this.f349532d = zVar;
        this.f349533e = b1Var;
        this.f349534f = context;
        this.f349535g = e3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pm0.v.X(new ox.w(this.f349532d, this.f349534f, ox.z.wi(this.f349532d, this.f349533e), this.f349535g, this.f349533e));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizPublishRichEditorService", "launchNewImageEditorWithOpenBundle: makeLaunchInfo failed, e=" + e17);
        }
    }
}
