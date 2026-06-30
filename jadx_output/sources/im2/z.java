package im2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f292626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity appCompatActivity, im2.z3 z3Var) {
        super(0);
        this.f292626d = appCompatActivity;
        this.f292627e = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveCreateNoticeCommonRowView finderLiveCreateNoticeCommonRowView = (com.tencent.mm.plugin.finder.live.view.FinderLiveCreateNoticeCommonRowView) this.f292626d.findViewById(com.tencent.mm.R.id.tmu);
        finderLiveCreateNoticeCommonRowView.setOnClickListener(new im2.y(this.f292627e));
        return finderLiveCreateNoticeCommonRowView;
    }
}
