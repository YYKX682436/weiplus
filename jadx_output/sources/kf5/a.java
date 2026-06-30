package kf5;

/* loaded from: classes9.dex */
public final class a implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingLargeCoverView f307494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f307495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c11.e f307496c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f307497d;

    public a(com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingLargeCoverView chattingLargeCoverView, android.widget.FrameLayout frameLayout, c11.e eVar, android.widget.ImageView imageView) {
        this.f307494a = chattingLargeCoverView;
        this.f307495b = frameLayout;
        this.f307496c = eVar;
        this.f307497d = imageView;
    }

    @Override // g75.s
    public void a(g75.x result) {
        kotlin.jvm.internal.o.g(result, "result");
        int i17 = result.f269404a;
        if (i17 == 0) {
            int i18 = com.tencent.mm.ui.chatting.viewitems.mvvmview.templateview.ChattingLargeCoverView.f204885h;
            this.f307494a.g(this.f307495b, this.f307496c);
        } else if (i17 == -1) {
            android.widget.ImageView imageView = this.f307497d;
            imageView.setImageBitmap(com.tencent.mm.sdk.platformtools.x.r(com.tencent.mm.R.raw.picture_filled, imageView.getWidth(), imageView.getHeight(), imageView.getContext().getColor(com.tencent.mm.R.color.FG_4), imageView.getContext().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_0_4), 0.625f));
        }
    }
}
