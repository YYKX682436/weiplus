package xh4;

/* loaded from: classes.dex */
public final class w implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f454642a;

    public w(kotlinx.coroutines.q qVar) {
        this.f454642a = qVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        kotlinx.coroutines.q qVar = this.f454642a;
        if (i17 == -1) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.m.f454616d));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(xh4.m.f454617e));
        }
    }
}
