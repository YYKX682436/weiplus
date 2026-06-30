package oh5;

/* loaded from: classes12.dex */
public final class b extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh5.d f345488a;

    public b(oh5.d dVar) {
        this.f345488a = dVar;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        pm0.v.X(new oh5.a(this.f345488a));
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
