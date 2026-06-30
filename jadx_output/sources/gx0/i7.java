package gx0;

/* loaded from: classes5.dex */
public final class i7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f276530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(gx0.w8 w8Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f276529d = w8Var;
        this.f276530e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView movieComposingPlayerCoverView = new com.tencent.mm.mj_publisher.finder.widgets.MovieComposingPlayerCoverView(this.f276529d.getContext(), null, 0, 6, null);
        com.tencent.mm.ui.id.b(this.f276530e).inflate(com.tencent.mm.R.layout.dfn, movieComposingPlayerCoverView);
        return movieComposingPlayerCoverView;
    }
}
