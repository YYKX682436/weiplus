package fu0;

/* loaded from: classes5.dex */
public final class e implements wt3.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f266769a;

    public e(kotlinx.coroutines.q qVar) {
        this.f266769a = qVar;
    }

    @Override // wt3.i0
    public void a(java.util.LinkedList bgmList, boolean z17, boolean z18, long j17) {
        kotlin.jvm.internal.o.g(bgmList, "bgmList");
        r45.vv0 vv0Var = (r45.vv0) kz5.n0.Z(bgmList);
        this.f266769a.resumeWith(kotlin.Result.m521constructorimpl(vv0Var != null ? com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo.M.a(vv0Var, 1, true) : null));
    }

    @Override // wt3.i0
    public android.app.Activity getActivity() {
        return null;
    }
}
