package nu0;

/* loaded from: classes5.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f340139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(nu0.b4 b4Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f340138d = b4Var;
        this.f340139e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView movieComposingPlayerCoverView = new com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView(this.f340138d.getContext(), null, 0, 6, null);
        com.tencent.mm.ui.id.b(this.f340139e).inflate(com.tencent.mm.R.layout.dfn, movieComposingPlayerCoverView);
        return movieComposingPlayerCoverView;
    }
}
