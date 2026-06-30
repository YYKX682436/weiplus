package hf3;

/* loaded from: classes5.dex */
public abstract class f {
    public static void a(android.widget.ImageView imageView, java.lang.String str, int i17) {
        if (imageView == null) {
            return;
        }
        java.lang.String str2 = null;
        imageView.setImageBitmap(null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (i17 != 0) {
                imageView.setImageResource(i17);
                return;
            }
            return;
        }
        o11.f fVar = new o11.f();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str2 = java.lang.String.format("%s/%s", lp0.b.D() + "wallet/mall", kk.k.g(str.getBytes()));
        }
        fVar.f342083g = str2;
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342096t = false;
        if (i17 != 0) {
            fVar.f342091o = i17;
        }
        n11.a.b().h(str, imageView, fVar.a());
    }
}
