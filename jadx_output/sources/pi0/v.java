package pi0;

/* loaded from: classes10.dex */
public final class v implements io.flutter.plugin.common.BasicMessageChannel.Reply {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f354735a;

    public v(kotlin.coroutines.Continuation continuation) {
        this.f354735a = continuation;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public void reply(java.lang.Object obj) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f354735a.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
    }
}
