package dz4;

/* loaded from: classes11.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(dz4.u2 u2Var, android.app.Activity activity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245370d = u2Var;
        this.f245371e = activity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.p2(this.f245370d, this.f245371e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dz4.u2 u2Var = this.f245370d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = u2Var.f245427b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        u2Var.f245427b = null;
        android.app.Activity activity = this.f245371e;
        return db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.cck));
    }
}
