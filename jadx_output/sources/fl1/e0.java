package fl1;

/* loaded from: classes4.dex */
public class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f263750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bg7 f263751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f263752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263753g;

    public e0(fl1.c1 c1Var, com.tencent.mm.plugin.appbrand.o6 o6Var, r45.bg7 bg7Var, java.lang.Runnable runnable) {
        this.f263753g = c1Var;
        this.f263750d = o6Var;
        this.f263751e = bg7Var;
        this.f263752f = runnable;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f263753g.i(this.f263750d, true, null, this.f263751e);
        this.f263752f.run();
    }
}
