package dk5;

/* loaded from: classes9.dex */
public class f3 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f234618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234620f;

    public f3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI, android.widget.ImageView imageView, java.lang.String str) {
        this.f234620f = selectConversationUI;
        this.f234618d = imageView;
        this.f234619e = str;
    }

    @Override // l01.u
    public void b() {
        com.tencent.mars.xlog.Log.i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, image load fail:%", this.f234619e);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "SelectConversationUI#WEISHITHUMB";
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        int i17;
        int i18;
        android.graphics.Bitmap bitmap2;
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234620f;
        if (selectConversationUI.isFinishing() || bitmap == null || bitmap.isRecycled() || (imageView = this.f234618d) == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i19 = com.tencent.mm.ui.transmit.SelectConversationUI.B2;
        float f17 = height / width;
        int e17 = com.tencent.mm.ui.zk.e(selectConversationUI, com.tencent.mm.R.dimen.f479631b6);
        int e18 = com.tencent.mm.ui.zk.e(selectConversationUI, com.tencent.mm.R.dimen.f479630b5);
        if (f17 <= 0.0f || f17 >= 0.5d) {
            if (f17 >= 0.5d && f17 < 1.0f) {
                e17 = (int) (e18 * f17);
                i18 = e17;
            } else if (f17 >= 1.0f && f17 < 2.0f) {
                i17 = (int) (e18 / f17);
                i18 = e18;
                e17 = i18;
                e18 = i17;
            } else if (f17 >= 2.0f) {
                i18 = e18;
                e18 = e17;
                e17 = (int) (e17 * f17);
            } else {
                e17 = 0;
                i17 = 0;
                e18 = 0;
                i18 = 0;
            }
            i17 = e18;
        } else {
            i17 = (int) (e17 / f17);
            i18 = e17;
        }
        if (e17 <= 0 || i17 <= 0) {
            bitmap2 = null;
        } else {
            bitmap2 = android.graphics.Bitmap.createScaledBitmap(bitmap, i17, e17, true);
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(e18, i18));
        }
        imageView.setImageBitmap(com.tencent.mm.ui.sk.a(bitmap2, true, com.tencent.mm.ui.zk.a(selectConversationUI, 3), false));
    }
}
