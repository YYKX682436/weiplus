package fk2;

/* loaded from: classes3.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f263473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk2.v f263475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView f263476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263477h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f263478i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263479m;

    public t(bm2.h1 h1Var, android.view.View view, fk2.v vVar, com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView finderLiveEmojiView, java.lang.String str, com.tencent.mm.protobuf.g gVar, android.content.Context context) {
        this.f263474e = h1Var;
        this.f263473d = view;
        this.f263475f = vVar;
        this.f263476g = finderLiveEmojiView;
        this.f263477h = str;
        this.f263478i = gVar;
        this.f263479m = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bm2.h1 h1Var = this.f263474e;
        android.widget.FrameLayout frameLayout = h1Var.f21934o;
        android.view.View emojiViewContainer = this.f263473d;
        kotlin.jvm.internal.o.f(emojiViewContainer, "$emojiViewContainer");
        if (frameLayout.indexOfChild(emojiViewContainer) != -1) {
            int[] iArr = new int[2];
            emojiViewContainer.getLocationOnScreen(iArr);
            int measuredWidth = iArr[0] + emojiViewContainer.getMeasuredWidth();
            int[] iArr2 = new int[2];
            h1Var.f21929g.getLocationOnScreen(iArr2);
            int measuredWidth2 = iArr2[0] + h1Var.f21929g.getMeasuredWidth();
            fk2.v vVar = this.f263475f;
            java.lang.String str = vVar.f263494m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("containerActualRight = ");
            sb6.append(measuredWidth);
            sb6.append(", bgActualRight = ");
            sb6.append(measuredWidth2);
            sb6.append(",containerMeasuredWidth = ");
            sb6.append(emojiViewContainer.getMeasuredWidth());
            sb6.append(", emojiMeasuredWidth = ");
            com.tencent.mm.plugin.finder.live.view.FinderLiveEmojiView finderLiveEmojiView = this.f263476g;
            sb6.append(finderLiveEmojiView.getMeasuredWidth());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (measuredWidth > measuredWidth2 || emojiViewContainer.getMeasuredWidth() < finderLiveEmojiView.getMeasuredWidth()) {
                h1Var.f21934o.setVisibility(8);
                kotlin.jvm.internal.o.f(emojiViewContainer, "$emojiViewContainer");
                pm0.v.B(emojiViewContainer);
                fk2.v.q(vVar, this.f263479m, h1Var.f21933n);
                h1Var.f21933n.addView(emojiViewContainer);
                h1Var.f21933n.setVisibility(0);
                if (finderLiveEmojiView.getStatus() != 1) {
                    com.tencent.mars.xlog.Log.i(vVar.f263494m, "re-loadEmoji, case remove view before emoji load success");
                    kotlin.jvm.internal.o.f(emojiViewContainer, "$emojiViewContainer");
                    vVar.r(this.f263477h, this.f263478i, emojiViewContainer);
                }
                finderLiveEmojiView.requestLayout();
            }
        }
    }
}
