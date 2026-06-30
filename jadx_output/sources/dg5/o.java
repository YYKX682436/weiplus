package dg5;

/* loaded from: classes9.dex */
public class o implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er3.f f232388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dg5.p f232389e;

    public o(dg5.p pVar, er3.f fVar) {
        this.f232389e = pVar;
        this.f232388d = fVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        c01.d9.e().d(this.f232388d);
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, this.f232389e.f232392f);
    }
}
