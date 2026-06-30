package mm2;

/* loaded from: classes3.dex */
public final class l2 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f329218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i("LiveDoNotUseWillDeleteSlice", "clear plugin layout");
        this.f329218f = null;
    }
}
