package yg;

/* loaded from: classes7.dex */
public final class z implements e8.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f462145a;

    public z(com.tencent.magicbrush.MagicBrush magicBrush) {
        this.f462145a = magicBrush;
    }

    @Override // e8.d
    public void a(java.lang.String path, e8.c event, e8.a decodeInfo) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(decodeInfo, "decodeInfo");
    }

    @Override // e8.d
    public void b(java.lang.String path, java.lang.Object obj, e8.e recycleHandler, com.github.henryye.nativeiv.ImageDecodeConfig config) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(recycleHandler, "recycleHandler");
        kotlin.jvm.internal.o.g(config, "config");
        com.tencent.magicbrush.MagicBrush magicBrush = this.f462145a;
        if (magicBrush.f48577a == 0) {
            if (obj != null) {
                ((com.github.henryye.nativeiv.bitmap.IBitmap) obj).recycle();
                return;
            }
            return;
        }
        ch.g gVar = magicBrush.f48583g;
        if (gVar != null) {
            gVar.k(new yg.m(magicBrush, recycleHandler, path, obj, config), false);
        } else if (obj != null) {
            ((com.github.henryye.nativeiv.bitmap.IBitmap) obj).recycle();
        }
    }
}
