package kk5;

/* loaded from: classes.dex */
public final class e0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.h0 f308633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f308634e;

    public e0(kk5.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        this.f308633d = h0Var;
        this.f308634e = h0Var2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f308633d.f308645d = false;
        ((com.tencent.mm.roomsdk.model.factory.a) this.f308634e.f310123d).a();
    }
}
