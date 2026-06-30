package pi0;

/* loaded from: classes10.dex */
public final class j0 implements io.flutter.plugin.common.BasicMessageChannel.Reply {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f354620b;

    public j0(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f354619a = str;
        this.f354620b = qVar;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(java.lang.Object obj) {
        if (kotlin.jvm.internal.o.b((java.lang.String) obj, this.f354619a)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) this.f354620b).resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }
}
