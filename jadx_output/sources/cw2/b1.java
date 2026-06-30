package cw2;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f223590d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        super(0);
        this.f223590d = finderFeedNewSeekBarLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f223590d.findViewById(com.tencent.mm.R.id.f486792qp3);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        return textView;
    }
}
