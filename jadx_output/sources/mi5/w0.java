package mi5;

/* loaded from: classes3.dex */
public final class w0 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f326934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mi5.y0 f326935b;

    public w0(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, mi5.y0 y0Var) {
        this.f326934a = weImageView;
        this.f326935b = y0Var;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mm.sdk.platformtools.u3.h(new mi5.v0(bitmap, this.f326934a, this.f326935b, str));
    }
}
