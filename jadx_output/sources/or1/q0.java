package or1;

/* loaded from: classes9.dex */
public class q0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er3.f f347553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or1.r0 f347554e;

    public q0(or1.r0 r0Var, er3.f fVar) {
        this.f347554e = r0Var;
        this.f347553d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f347553d);
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, this.f347554e.f347564f);
    }
}
