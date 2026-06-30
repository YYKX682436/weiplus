package rm;

/* loaded from: classes8.dex */
public final class c implements com.tencent.wechat.iam.biz.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f397358a;

    public c(kotlinx.coroutines.q qVar) {
        this.f397358a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.e
    public final void complete(boolean z17) {
        this.f397358a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
