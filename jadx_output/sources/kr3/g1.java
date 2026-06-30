package kr3;

/* loaded from: classes3.dex */
public final class g1 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f311382d;

    public g1(kotlin.jvm.internal.h0 h0Var) {
        this.f311382d = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "saving Dialog: cancel by user");
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) this.f311382d.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
