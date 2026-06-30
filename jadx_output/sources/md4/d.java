package md4;

/* loaded from: classes4.dex */
public final class d implements com.tencent.mm.plugin.sns.model.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f325875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f325876b;

    public d(r45.jj4 jj4Var, android.widget.ImageView imageView) {
        this.f325875a = jj4Var;
        this.f325876b = imageView;
    }

    @Override // com.tencent.mm.plugin.sns.model.c2
    public final void a(android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$2");
        java.lang.String str = this.f325875a.f377855d;
        android.widget.ImageView imageView = this.f325876b;
        if (!kotlin.jvm.internal.o.b(str, imageView.getTag())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$2");
        } else {
            imageView.setImageBitmap(bitmap);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDecodeFin", "com.tencent.mm.plugin.sns.ui.item.improve.loader.BizPicMsgCardHelper$updateCardView$2");
        }
    }
}
