package yl2;

/* loaded from: classes.dex */
public final class d0 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f462984d;

    public d0(kotlinx.coroutines.q qVar) {
        this.f462984d = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f462984d.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
    }
}
