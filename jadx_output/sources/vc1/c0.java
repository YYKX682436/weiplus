package vc1;

/* loaded from: classes13.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc1.q2 f434920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f434921f;

    public c0(vc1.p1 p1Var, java.lang.String str, vc1.q2 q2Var, o91.d dVar) {
        this.f434921f = p1Var;
        this.f434919d = str;
        this.f434920e = q2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mapsdk.raster.model.Marker marker;
        vc1.p1 p1Var = this.f434921f;
        java.lang.String str = this.f434919d;
        vc1.q2 q2Var = this.f434920e;
        p1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "map:%s updateMarker markerId:%s", p1Var, str);
        vc1.o1 z17 = p1Var.z(str);
        if (z17 != null) {
            vc1.o2 o2Var = q2Var.f435148s;
            rl1.f fVar = null;
            if (o2Var != null) {
                if (o2Var.f435051r == null && o2Var.f435052s == null) {
                    synchronized (p1Var.f435104w) {
                        z17.f435032e = null;
                    }
                } else {
                    z17.f435025b.f435148s = o2Var;
                    com.tencent.mapsdk.raster.model.Marker marker2 = z17.f435030c;
                    if (marker2 != null) {
                        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                            vc1.o2 o2Var2 = q2Var.f435148s;
                            marker2.setInfoWindowOffset(o2Var2.f435049p, o2Var2.f435050q);
                        } else {
                            com.tencent.mm.sdk.platformtools.u3.h(new vc1.f0(p1Var, marker2, q2Var));
                        }
                    }
                    com.tencent.mapsdk.raster.model.Marker marker3 = z17.f435030c;
                    if (marker3 == null || q2Var.f435148s.f435047n != 1) {
                        p1Var.J(z17);
                    } else {
                        p1Var.d0(marker3);
                    }
                }
            }
            if (q2Var.f435149t != null) {
                z17.f435031d.remove();
                com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit markerCollisionRelationUnit = z17.f435033f;
                if (markerCollisionRelationUnit != null && (marker = z17.f435030c) != null) {
                    marker.removeCollisionUnit(markerCollisionRelationUnit);
                }
                p1Var.S(str + "#label");
                com.tencent.mapsdk.raster.model.MarkerOptions markerOptions = new com.tencent.mapsdk.raster.model.MarkerOptions();
                markerOptions.position(new com.tencent.mapsdk.raster.model.LatLng(q2Var.f435132c, q2Var.f435133d));
                java.util.LinkedList linkedList = vc1.i3.f434984a;
                synchronized (linkedList) {
                    if (linkedList.size() > 0) {
                        fVar = (rl1.f) linkedList.removeFirst();
                        if (fVar != null && android.view.ViewGroup.class.isInstance(fVar.getParent())) {
                            ((android.view.ViewGroup) fVar.getParent()).removeView(fVar);
                        }
                    }
                }
                if (fVar == null) {
                    fVar = new rl1.f(p1Var.f435060a);
                }
                fVar.a();
                fVar.setTextColor(q2Var.f435149t.f435113b);
                fVar.setTextSize(q2Var.f435149t.f435114c);
                fVar.setText(q2Var.f435149t.f435112a);
                fVar.setTextPadding(q2Var.f435149t.f435122k);
                fVar.setGravity(q2Var.f435149t.f435121j);
                vc1.p2 p2Var = q2Var.f435149t;
                fVar.b(p2Var.f435118g, p2Var.f435119h, p2Var.f435120i, p2Var.f435117f);
                fVar.setX(q2Var.f435149t.f435115d);
                fVar.setY(q2Var.f435149t.f435116e);
                vc1.p2 p2Var2 = q2Var.f435149t;
                int i17 = p2Var2.f435124m;
                int i18 = p2Var2.f435123l;
                if (i17 > -1 && i18 > -1) {
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) fVar.f397169d.getLayoutParams();
                    layoutParams.width = i17;
                    layoutParams.height = i18;
                    fVar.f397169d.setLayoutParams(layoutParams);
                    fVar.invalidate();
                }
                fVar.measure(0, 0);
                markerOptions.anchor(fVar.getAnchorX(), fVar.getAnchorY());
                markerOptions.markerView(fVar);
                markerOptions.visible(true);
                markerOptions.tag(str + "#label");
                markerOptions.zIndex(q2Var.f435142m + 3);
                markerOptions.level(com.tencent.mapsdk.raster.model.OverlayLevel.OverlayLevelAboveLabels);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(q2Var.f435143n) && !com.tencent.mm.sdk.platformtools.t8.K0(q2Var.f435144o)) {
                    markerOptions.indoorInfo(new com.tencent.mapsdk.raster.model.IndoorInfo(q2Var.f435143n, q2Var.f435144o));
                }
                p1Var.X(markerOptions, q2Var, true);
                if (android.text.TextUtils.isEmpty(q2Var.f435146q) || !q2Var.f435146q.contains("marker")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "addCollisionUnit for label");
                    z17.f435031d = p1Var.f435068e.getMap().addMarker(markerOptions);
                } else {
                    com.tencent.mapsdk.raster.model.Marker marker4 = z17.f435030c;
                    if (marker4 != null) {
                        com.tencent.tencentmap.mapsdk.maps.model.MarkerCollisionRelationUnit addCollisionUnit = marker4.addCollisionUnit(ey5.x.h(markerOptions));
                        z17.f435033f = addCollisionUnit;
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        objArr[0] = java.lang.Boolean.valueOf(addCollisionUnit != null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.Map.DefaultTencentMapView", "addCollisionUnit for label result:%b", objArr);
                    }
                }
                p1Var.r(str + "#label", z17);
            }
        }
    }
}
