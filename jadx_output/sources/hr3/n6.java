package hr3;

/* loaded from: classes9.dex */
public class n6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er3.f f283824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283825e;

    public n6(hr3.t6 t6Var, er3.f fVar) {
        this.f283825e = t6Var;
        this.f283824d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f283824d);
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, this.f283825e);
    }
}
