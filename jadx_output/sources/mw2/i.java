package mw2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw2.j f331721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mw2.j jVar) {
        super(3);
        this.f331721d = jVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mw2.e eVar;
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        if (bitmap != null) {
            mw2.j jVar = this.f331721d;
            r45.ir2 a17 = jVar.a();
            if (a17 != null) {
                int integer = a17.getInteger(5);
                int integer2 = a17.getInteger(4);
                if (integer <= 0 || integer2 <= 0) {
                    com.tencent.mars.xlog.Log.w("FinderSpritePreviewController", "Invalid image dimensions: " + integer + " x " + integer2);
                } else {
                    int i17 = intValue2 * integer;
                    int i18 = intValue * integer2;
                    if (i17 < 0 || i18 < 0 || i17 + integer > bitmap.getWidth() || i18 + integer2 > bitmap.getHeight()) {
                        com.tencent.mars.xlog.Log.w("FinderSpritePreviewController", "Crop area out of bounds: " + i17 + ',' + i18 + ',' + (i17 + integer) + ',' + (i18 + integer2) + " vs " + bitmap.getWidth() + 'x' + bitmap.getHeight());
                    } else {
                        eVar = new mw2.e(i17, i18, integer, integer2);
                        if (eVar != null && (imageView = jVar.f331723b) != null) {
                            imageView.post(new mw2.h(jVar, eVar, bitmap));
                        }
                    }
                }
            }
            eVar = null;
            if (eVar != null) {
                imageView.post(new mw2.h(jVar, eVar, bitmap));
            }
        }
        return jz5.f0.f302826a;
    }
}
