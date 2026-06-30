package kk5;

/* loaded from: classes.dex */
public final class j0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.o0 f308661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f308662e;

    public j0(kk5.o0 o0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f308661d = o0Var;
        this.f308662e = h0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.f308661d.f308674d = false;
        ((com.tencent.mm.roomsdk.model.factory.a) this.f308662e.f310123d).a();
    }
}
