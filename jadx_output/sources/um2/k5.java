package um2;

/* loaded from: classes3.dex */
public final class k5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f428857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f428858f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f428859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(um2.x5 x5Var, kotlin.jvm.internal.h0 h0Var, int i17, boolean z17) {
        super(0);
        this.f428856d = x5Var;
        this.f428857e = h0Var;
        this.f428858f = i17;
        this.f428859g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        co0.s liveCore;
        com.tencent.mm.plugin.finder.live.widget.zn loadingTipWidget;
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap2;
        zi2.w wVar;
        android.view.ViewGroup viewGroup;
        ((ku5.t0) ku5.t0.f312615d).h(dk2.lg.f233737d, "Finder.LiveExceptionMonitor");
        fm2.c cVar = this.f428856d.f19606c;
        mm2.h hVar = null;
        if (cVar == null || (loadingTipWidget = cVar.getLoadingTipWidget()) == null || (imageView = loadingTipWidget.f120584d) == null) {
            bitmap = null;
        } else {
            um2.x5 x5Var = this.f428856d;
            if (!((mm2.e1) x5Var.c(mm2.e1.class)).g7() || (wVar = x5Var.I0) == null || (viewGroup = wVar.f365323d) == null) {
                bitmap2 = null;
            } else {
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/fluent/ViewFluentPerformerKt", "getDrawBitmap", "(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap2, "com/tencent/mm/ui/fluent/ViewFluentPerformerKt", "getDrawBitmap", "(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                kotlin.jvm.internal.o.f(bitmap2, "createBitmap(...)");
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap2);
                imageView.draw(canvas);
                viewGroup.draw(canvas);
            }
            bitmap = bitmap2;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        efVar.N();
        fm2.c cVar2 = this.f428856d.f19606c;
        if (cVar2 != null && (liveCore = cVar2.getLiveCore()) != null) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f428856d.f19605b;
            java.lang.Boolean bool = (java.lang.Boolean) this.f428857e.f310123d;
            boolean booleanValue = bool != null ? bool.booleanValue() : true;
            int i17 = this.f428858f;
            android.graphics.Bitmap bitmap3 = ((mm2.c1) this.f428856d.c(mm2.c1.class)).I4;
            boolean z17 = this.f428859g;
            mm2.w wVar2 = (mm2.w) this.f428856d.c(mm2.w.class);
            mm2.f fVar = (mm2.f) wVar2.f329503o.getValue();
            if (fVar == mm2.f.f329016g || fVar == mm2.f.f329017h) {
                com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "getLivingVideoViewToMiniWindow state:" + fVar + " videoView:" + wVar2.f329504p);
                mm2.h hVar2 = wVar2.f329504p;
                if (hVar2 != null) {
                    hVar2.setOnVideoError(new mm2.m(wVar2));
                }
                mm2.h hVar3 = wVar2.f329504p;
                if (hVar3 != null) {
                    hVar3.setOnProgressChange(new mm2.n(wVar2));
                }
                mm2.h hVar4 = wVar2.f329504p;
                if (hVar4 != null) {
                    hVar4.setOnVideoComplete(new mm2.o(wVar2));
                }
                mm2.h hVar5 = wVar2.f329504p;
                if (hVar5 != null) {
                    hVar5.setOnProgressChange(null);
                }
                mm2.h hVar6 = wVar2.f329504p;
                if (hVar6 != null) {
                    hVar6.setOnFirstFrameRendered(null);
                }
                hVar = wVar2.f329504p;
            }
            liveCore.G(new jn0.a(appCompatActivity, booleanValue, false, i17, 0, bitmap3, z17, hVar, false, bitmap, false, 1296, null));
        }
        fm2.c cVar3 = this.f428856d.f19606c;
        if (cVar3 != null && (data = cVar3.getData()) != null && (liveRoomControllerStore = data.f309131f) != null) {
            if2.z.f291153a.b(liveRoomControllerStore);
        }
        if (pm0.v.z(((mm2.c1) this.f428856d.c(mm2.c1.class)).f328807g2, 524288)) {
            efVar.Z();
        }
        efVar.R();
        ((mm2.e5) this.f428856d.c(mm2.e5.class)).O6();
        return jz5.f0.f302826a;
    }
}
