package yl2;

/* loaded from: classes3.dex */
public final class c1 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f462981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f462982b;

    public c1(kotlinx.coroutines.q qVar, int i17) {
        this.f462981a = qVar;
        this.f462982b = i17;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f462981a.resumeWith(kotlin.Result.m521constructorimpl(new yl2.x(this.f462982b)));
    }
}
