package dg5;

/* loaded from: classes9.dex */
public class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f232390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f232391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dg5.u f232392f;

    public p(dg5.u uVar, java.lang.String str, android.content.Context context) {
        this.f232392f = uVar;
        this.f232390d = str;
        this.f232391e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        er3.f fVar = new er3.f(this.f232390d, true);
        com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
        dg5.u uVar = this.f232392f;
        e17.a(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, uVar);
        c01.d9.e().g(fVar);
        android.content.Context context = this.f232391e;
        uVar.f232403f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f232391e.getString(com.tencent.mm.R.string.f490604zq), true, true, new dg5.o(this, fVar));
    }
}
