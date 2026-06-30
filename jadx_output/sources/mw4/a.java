package mw4;

/* loaded from: classes.dex */
public final class a implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f331758d;

    public a(kotlin.coroutines.Continuation continuation) {
        this.f331758d = continuation;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        this.f331758d.resumeWith(kotlin.Result.m521constructorimpl((com.tencent.mm.ipcinvoker.type.IPCString) obj));
    }
}
