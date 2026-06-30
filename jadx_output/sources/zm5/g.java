package zm5;

/* loaded from: classes3.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474218d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f474219e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f474220f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f474221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474218d = jz5.h.b(new zm5.a(activity));
        this.f474221g = jz5.h.b(new zm5.b(activity));
    }

    public final com.tencent.mm.view.item.FloatLayerItem O6() {
        java.lang.Object value = ((jz5.n) this.f474218d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.item.FloatLayerItem) value;
    }

    public final void P6(java.lang.String imagePath, java.lang.String keyword) {
        kotlin.jvm.internal.o.g(imagePath, "imagePath");
        kotlin.jvm.internal.o.g(keyword, "keyword");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryFloatLayerUIC", "showFloatLayer >> imagePath: " + imagePath + ", keyword: " + keyword);
        if (keyword.length() > 0) {
            kotlinx.coroutines.r2 r2Var = this.f474219e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            kotlinx.coroutines.r2 r2Var2 = this.f474220f;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            if (O6().getVisibility() == 0) {
                O6().setVisibility(8);
            }
            this.f474220f = kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(this), null, null, new zm5.f(this, imagePath, keyword, null), 3, null);
        }
    }
}
