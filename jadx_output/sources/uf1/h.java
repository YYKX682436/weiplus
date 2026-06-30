package uf1;

/* loaded from: classes7.dex */
public class h implements tb1.y {
    public int[] a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (lVar == null) {
            return new int[2];
        }
        if (lVar instanceof com.tencent.mm.plugin.appbrand.jsapi.d0) {
            return com.tencent.mm.plugin.appbrand.utils.f5.a((com.tencent.mm.plugin.appbrand.jsapi.d0) lVar);
        }
        android.content.Context context = lVar.getContext();
        android.graphics.Point point = new android.graphics.Point();
        if (context != null) {
            ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        }
        return new int[]{point.x, point.y};
    }
}
