package pc0;

/* loaded from: classes7.dex */
public final class c2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f353238d;

    public c2(kotlinx.coroutines.q qVar) {
        this.f353238d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f353238d.resumeWith(kotlin.Result.m521constructorimpl(new qc0.m1(-1, -4, 0, null, null, null, 0, 124, null)));
    }
}
