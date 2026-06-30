package rm;

/* loaded from: classes8.dex */
public final class e implements com.tencent.wechat.iam.biz.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f397365a;

    public e(kotlinx.coroutines.q qVar) {
        this.f397365a = qVar;
    }

    @Override // com.tencent.wechat.iam.biz.d
    public final void a(java.util.Optional optional) {
        this.f397365a.resumeWith(kotlin.Result.m521constructorimpl((optional == null || !optional.isPresent()) ? null : (com.tencent.wechat.iam.biz.w1) optional.get()));
    }
}
