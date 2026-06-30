package vd2;

/* loaded from: classes3.dex */
public final class e1 implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f435706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f435707b;

    public e1(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f435706a = c0Var;
        this.f435707b = qVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        if (this.f435706a.f310112d) {
            return;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f435707b.resumeWith(kotlin.Result.m521constructorimpl(obj instanceof com.tencent.mm.protocal.protobuf.FinderObject ? (com.tencent.mm.protocal.protobuf.FinderObject) obj : null));
    }
}
