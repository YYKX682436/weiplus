package rf3;

/* loaded from: classes12.dex */
public final class x extends sf3.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.media.image.SwitchableImageContainer f395014a;

    public x(com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer) {
        this.f395014a = switchableImageContainer;
    }

    @Override // sf3.j
    public void a(sf3.g param, sf3.i result) {
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mm.plugin.media.image.SwitchableImageContainer switchableImageContainer = this.f395014a;
        android.graphics.Bitmap bitmap = result.f407393a;
        if (bitmap == null) {
            int i17 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
            switchableImageContainer.h("onLoadFinish but bmp null", new java.lang.Object[0]);
        } else {
            int i18 = com.tencent.mm.plugin.media.image.SwitchableImageContainer.f148561i;
            switchableImageContainer.f(bitmap);
        }
    }

    @Override // sf3.j
    public void b(sf3.g param, com.tencent.mm.graphics.MMBitmapFactory$Options options) {
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(options, "options");
        rf3.v vVar = this.f395014a.getCom.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER java.lang.String();
        if (vVar != null) {
            vVar.r(((android.graphics.BitmapFactory.Options) options).outWidth, ((android.graphics.BitmapFactory.Options) options).outHeight);
        }
    }
}
