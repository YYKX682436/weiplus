package xc2;

/* loaded from: classes2.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment f453127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderRecommendReasonFragment finderRecommendReasonFragment) {
        super(0);
        this.f453127d = finderRecommendReasonFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f453127d.f110060w;
        return java.lang.Boolean.valueOf(view == null || !view.canScrollVertically(-1));
    }
}
