package or1;

/* loaded from: classes9.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f347563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ or1.s0 f347564f;

    public r0(or1.s0 s0Var, java.lang.String str, android.content.Context context) {
        this.f347564f = s0Var;
        this.f347562d = str;
        this.f347563e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        er3.f fVar = new er3.f(this.f347562d, true);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        or1.s0 s0Var = this.f347564f;
        d17.a(com.tencent.mm.plugin.appbrand.jsapi.finder.q0.CTRL_INDEX, s0Var);
        gm0.j1.d().g(fVar);
        android.content.Context context = this.f347563e;
        s0Var.f347569f = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f347563e.getString(com.tencent.mm.R.string.f490604zq), true, true, new or1.q0(this, fVar));
    }
}
