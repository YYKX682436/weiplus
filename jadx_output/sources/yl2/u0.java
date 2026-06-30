package yl2;

/* loaded from: classes3.dex */
public final class u0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f463077d;

    public u0(kotlinx.coroutines.q qVar) {
        this.f463077d = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f463077d.resumeWith(kotlin.Result.m521constructorimpl(new yl2.x(10000)));
    }
}
