package l01;

/* loaded from: classes4.dex */
public enum a {
    ;


    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f314735d;

    public static android.graphics.drawable.Drawable h() {
        android.graphics.Bitmap bitmap;
        if (f314735d == null || (bitmap = (android.graphics.Bitmap) f314735d.get()) == null || bitmap.isRecycled()) {
            f314735d = new java.lang.ref.WeakReference(bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193075e, com.tencent.mm.R.raw.miniprogram_default_avatar, null));
        }
        f3.i iVar = new f3.i(com.tencent.mm.sdk.platformtools.x2.f193075e, (android.graphics.Bitmap) f314735d.get());
        iVar.b(true);
        return iVar;
    }

    public static l01.a valueOf(java.lang.String str) {
        android.support.v4.media.f.a(java.lang.Enum.valueOf(l01.a.class, str));
        return null;
    }
}
