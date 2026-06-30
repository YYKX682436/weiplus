package p61;

/* loaded from: classes14.dex */
public class a5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.l1 f352213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p61.b5 f352214e;

    public a5(p61.b5 b5Var, com.tencent.mm.modelsimple.l1 l1Var) {
        this.f352214e = b5Var;
        this.f352213d = l1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f352214e.f352223d.b();
        gm0.j1.d().d(this.f352213d);
    }
}
