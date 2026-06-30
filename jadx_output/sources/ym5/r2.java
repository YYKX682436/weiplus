package ym5;

/* loaded from: classes10.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MediaBanner f463496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.view.MediaBanner mediaBanner) {
        super(0);
        this.f463496d = mediaBanner;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463496d;
        if (mediaBanner.getStyle() == ym5.q2.f463478d) {
            return new android.widget.LinearLayout(mediaBanner.getContext());
        }
        return null;
    }
}
