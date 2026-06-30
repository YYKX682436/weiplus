package hd2;

/* loaded from: classes2.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280495e;

    public l0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, android.content.Context context) {
        this.f280494d = finderProfileCardFragment;
        this.f280495e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280494d;
        vb2.x xVar = finderProfileCardFragment.f110054r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView finderSelfNicknameArrow = xVar.f434764j;
        kotlin.jvm.internal.o.f(finderSelfNicknameArrow, "finderSelfNicknameArrow");
        vb2.x xVar2 = finderProfileCardFragment.f110054r;
        if (xVar2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        android.widget.TextView finderNickTv = xVar2.f434763i;
        kotlin.jvm.internal.o.f(finderNickTv, "finderNickTv");
        int i17 = pm0.v.t(finderSelfNicknameArrow)[0] - pm0.v.t(finderNickTv)[0];
        if (finderProfileCardFragment.f110054r == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        float measuredWidth = (i17 - r4.f434756b.getMeasuredWidth()) - this.f280495e.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        if (finderProfileCardFragment.f110054r == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (r4.f434763i.getMeasuredWidth() > measuredWidth) {
            vb2.x xVar3 = finderProfileCardFragment.f110054r;
            if (xVar3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            if (xVar3 == null) {
                kotlin.jvm.internal.o.o("binding");
                throw null;
            }
            android.widget.TextView textView = xVar3.f434763i;
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = (int) measuredWidth;
            textView.setLayoutParams(layoutParams);
        }
    }
}
