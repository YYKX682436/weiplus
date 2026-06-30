package gx0;

/* loaded from: classes5.dex */
public final class a implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f276177a;

    public a(yz5.a onResult) {
        kotlin.jvm.internal.o.g(onResult, "onResult");
        this.f276177a = onResult;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o
    public void onResult(java.lang.Object result) {
        kotlin.jvm.internal.o.g(result, "result");
        this.f276177a.invoke();
    }
}
