package mm2;

/* loaded from: classes3.dex */
public final class h5 extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f329111f;

    /* renamed from: g, reason: collision with root package name */
    public mm2.i7 f329112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329111f = "LiveProductRecordSlice";
    }

    public final void N6(mm2.i7 i7Var) {
        com.tencent.mars.xlog.Log.i(this.f329111f, "set recodingProduct: " + this.f329112g);
        this.f329112g = i7Var;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        N6(null);
        super.onCleared();
    }
}
