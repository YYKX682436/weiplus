package ts0;

/* loaded from: classes10.dex */
public final class m extends ts0.l {
    public final java.lang.String M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.M = "CommonCamera1ForFinderLive";
    }

    @Override // ts0.b
    public boolean I(int i17) {
        di3.s sVar;
        di3.g0 g0Var = this.f421529k;
        java.lang.String str = this.M;
        try {
            boolean D = D();
            android.graphics.Point E = E();
            android.util.Size[] F = F();
            if (F == null) {
                com.tencent.mars.xlog.Log.e(str, "preview size null!!");
                return false;
            }
            try {
                sVar = di3.t.d(F, E, i17, D);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e(str, "selectNoCropPreviewSize fail resolutionLimit:" + i17 + "!!");
                sVar = new di3.s();
            }
            if (sVar.f232757a == null) {
                com.tencent.mars.xlog.Log.e(str, "preview size still null!!");
                sVar = di3.t.i(F, new android.graphics.Point(java.lang.Math.min(E.x, E.y), java.lang.Math.max(E.x, E.y)), this.f421522d, D);
            }
            if (sVar.f232757a == null) {
                com.tencent.mars.xlog.Log.i(str, "checkMore start %s", sVar.toString());
                sVar.f232757a = sVar.f232760d;
                sVar.f232758b = sVar.f232761e;
                sVar.f232759c = sVar.f232762f;
            }
            android.graphics.Point point = sVar.f232757a;
            android.util.Size size = new android.util.Size(point.x, point.y);
            g0Var.f232711c = size.getWidth();
            g0Var.f232710b = size.getHeight();
            android.graphics.Point point2 = sVar.f232759c;
            if (point2 != null) {
                this.f421537s = point2;
            }
            J(size.getWidth(), size.getHeight());
            com.tencent.mars.xlog.Log.i(str, "final set camera preview size: " + size + ", cropSize: " + this.f421537s);
            return true;
        } catch (android.hardware.camera2.CameraAccessException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "selectNoCropPreviewSize Exception by camera access exception, %s, %s", android.os.Looper.myLooper(), e17.getMessage());
            return false;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e18, "selectNoCropPreviewSize Exception, %s, %s", android.os.Looper.myLooper(), e18.getMessage());
            return false;
        }
    }
}
