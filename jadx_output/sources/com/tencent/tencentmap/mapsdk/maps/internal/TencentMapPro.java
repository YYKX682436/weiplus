package com.tencent.tencentmap.mapsdk.maps.internal;

/* loaded from: classes13.dex */
public final class TencentMapPro {
    private com.tencent.mapsdk.internal.tr mVectorMapDelegate;
    private boolean mapDestroyed = false;
    private com.tencent.mapsdk.internal.bg mapManager;
    private com.tencent.mapsdk.internal.af viewControl;

    public TencentMapPro(com.tencent.mapsdk.internal.bg bgVar, com.tencent.mapsdk.internal.af afVar) {
        this.mapManager = bgVar;
        this.viewControl = afVar;
        this.mVectorMapDelegate = bgVar.f48905b;
    }

    public static final boolean isLocal(android.content.Context context, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.ko.a(com.tencent.mapsdk.internal.ko.a());
        com.tencent.mapsdk.internal.sm.a().a(context);
        com.tencent.mapsdk.internal.sm.a();
        com.tencent.mapsdk.internal.gc[] c17 = com.tencent.mapsdk.internal.sm.c(com.tencent.mapsdk.internal.sm.f51473a);
        com.tencent.mapsdk.internal.gc b17 = com.tencent.mapsdk.internal.y.b(com.tencent.map.lib.models.GeoPoint.from(latLng));
        if (b17 == null || c17 == null) {
            return true;
        }
        boolean a17 = com.tencent.mapsdk.internal.sm.a(b17, c17);
        if (a17) {
            com.tencent.mapsdk.internal.ko.a((com.tencent.mapsdk.internal.ko.g) new com.tencent.mapsdk.internal.ko.g<java.lang.Boolean>() { // from class: com.tencent.tencentmap.mapsdk.maps.internal.TencentMapPro.1
                private static java.lang.Boolean a() {
                    try {
                        com.tencent.mapsdk.internal.dx dxVar = (com.tencent.mapsdk.internal.dx) com.tencent.mapsdk.internal.cp.a(com.tencent.mapsdk.internal.dx.class);
                        if (dxVar == null) {
                            dxVar = (com.tencent.mapsdk.internal.dx) com.tencent.mapsdk.internal.hp.a(com.tencent.mapsdk.internal.dx.class, new java.lang.Object[0]);
                        }
                        com.tencent.map.tools.net.NetResponse local = ((com.tencent.mapsdk.internal.di) dxVar.i()).local(1);
                        if (local != null) {
                            com.tencent.mapsdk.core.utils.log.LogUtil.b("data with response:".concat(new java.lang.String(local.data, local.charset)));
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mapsdk.core.utils.log.LogUtil.d("err:" + e17.getMessage());
                    }
                    return java.lang.Boolean.TRUE;
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return a();
                }
            }).a((com.tencent.mapsdk.internal.ko.b.a) java.lang.Boolean.FALSE);
        }
        return a17;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay addIntersectionEnlargeOverlay(com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlayOptions intersectionOverlayOptions) {
        com.tencent.mapsdk.internal.tr trVar;
        com.tencent.mapsdk.internal.ne neVar;
        if (this.mapDestroyed || (trVar = this.mVectorMapDelegate) == null || (neVar = trVar.f52273as) == null || neVar.f50506f == null) {
            return null;
        }
        return (com.tencent.tencentmap.mapsdk.maps.model.IntersectionOverlay) neVar.f50510j.a((com.tencent.mapsdk.internal.bi) new com.tencent.mapsdk.internal.ob(intersectionOverlayOptions));
    }

    public final void addRouteNameSegments(java.util.List<com.tencent.map.lib.mapstructure.MapRouteSectionWithName> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2) {
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.map.lib.mapstructure.MapRouteSectionWithName mapRouteSectionWithName : list) {
                if (mapRouteSectionWithName != null) {
                    com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection mapRouteSection = new com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection();
                    mapRouteSection.color = mapRouteSectionWithName.color;
                    mapRouteSection.endNum = mapRouteSectionWithName.endNum;
                    mapRouteSection.roadName = mapRouteSectionWithName.roadName;
                    mapRouteSection.startNum = mapRouteSectionWithName.startNum;
                    arrayList.add(mapRouteSection);
                }
            }
            addSegmentsWithRouteName(arrayList, list2);
        }
    }

    public final void addSegmentsWithRouteName(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2) {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || bgVar.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_) == null) {
            return;
        }
        java.util.List<com.tencent.map.lib.models.GeoPoint> from = com.tencent.map.lib.models.GeoPoint.from(list2);
        com.tencent.mapsdk.internal.ne neVar = vectorMap.f52512o;
        if (neVar.f50526z == null) {
            neVar.f50526z = new com.tencent.mapsdk.internal.ne.d();
        }
        com.tencent.mapsdk.internal.ne.d dVar = neVar.f50526z;
        dVar.f50538a = list;
        dVar.f50539b = from;
        com.tencent.mapsdk.internal.ne.this.f50506f.a(list, from);
    }

    public final void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return;
        }
        bgVar.a(latLng, f17, f18, 0.0f, true);
    }

    public final void animateToNaviPosition2(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return;
        }
        com.tencent.mapsdk.internal.th thVar = new com.tencent.mapsdk.internal.th();
        thVar.b((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        thVar.a(f19);
        thVar.c(f17);
        thVar.d(f18);
        thVar.f51603a = bgVar.f48913j;
        thVar.f51633g = true;
        thVar.a(1000L);
        ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).y();
        ((com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_).a(thVar);
    }

    public final float calNaviLevel(com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds latLngBounds, float f17, int i17, boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || latLngBounds == null) {
            return 0.0f;
        }
        int i18 = z17 ? bgVar.f48905b.H : bgVar.f48905b.f52179J;
        float f18 = !z17 ? 0.0f : f17;
        if (i18 < 0) {
            i18 = bgVar.f48905b.Z / 2;
        }
        return bgVar.a(f18, 0, 0, i17, bgVar.f48905b.f52180aa - i18, latLngBounds.southwest, latLngBounds.northeast);
    }

    public final float calNaviLevel2(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, float f18, int i17, boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || latLng == null || latLng2 == null) {
            return 0.0f;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder builder = new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return bgVar.a(!z17 ? 0.0f : f17, 0, 0, i17, 0, builder.build().southwest, builder.build().northeast);
    }

    public final float calNaviLevel3(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, float f17, int i17, int i18, int i19, int i27, boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || latLng == null || latLng2 == null) {
            return 0.0f;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder builder = new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds.Builder();
        builder.include(latLng);
        builder.include(latLng2);
        return bgVar.a(!z17 ? 0.0f : f17, i17, i18, i19, i27, builder.build().southwest, builder.build().northeast);
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.CameraPosition calculateZoomToSpanLevelAsync(java.util.List<com.tencent.tencentmap.mapsdk.maps.model.IOverlay> list, java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> list2, int i17, int i18, int i19, int i27, com.tencent.tencentmap.mapsdk.maps.TencentMap.AsyncOperateCallback<com.tencent.tencentmap.mapsdk.maps.model.CameraPosition> asyncOperateCallback) {
        if (this.mapDestroyed || this.mapManager == null) {
            if (asyncOperateCallback != null) {
                asyncOperateCallback.onOperateFinished(null);
            }
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            for (com.tencent.tencentmap.mapsdk.maps.model.IOverlay iOverlay : list) {
                if (iOverlay instanceof com.tencent.mapsdk.internal.ez) {
                    arrayList.add((com.tencent.mapsdk.internal.ez) iOverlay);
                }
            }
        }
        return this.mapManager.a(arrayList, list2, i17, i18, i19, i27, asyncOperateCallback);
    }

    public final void clearRouteNameSegments() {
        com.tencent.mapsdk.internal.bg bgVar;
        com.tencent.mapsdk.vector.VectorMap vectorMap;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || bgVar.f48905b == null || (vectorMap = (com.tencent.mapsdk.vector.VectorMap) bgVar.f48905b.e_) == null) {
            return;
        }
        vectorMap.clearRouteNameSegments();
    }

    public final boolean isNaviStateEnabled() {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return false;
        }
        return bgVar.x();
    }

    public final void moveToNavPosition(com.tencent.tencentmap.mapsdk.maps.CameraUpdate cameraUpdate, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return;
        }
        bgVar.a(cameraUpdate);
        if (latLng != null) {
            setNavCenter((int) (latLng.latitude * 1000000.0d), (int) (latLng.longitude * 1000000.0d));
        }
    }

    public final void onDestroy() {
        this.mapDestroyed = true;
    }

    public final void setNavCenter(int i17, int i18) {
        com.tencent.mapsdk.internal.af afVar = this.viewControl;
        if (afVar == null) {
            return;
        }
        com.tencent.mapsdk.internal.al alVar = afVar.f48858a;
        java.lang.ref.WeakReference<com.tencent.mapsdk.internal.bu> C = alVar == null ? null : alVar.C();
        if (C != null) {
            com.tencent.mapsdk.internal.bu buVar = C.get();
            if (buVar instanceof com.tencent.mapsdk.internal.ud) {
                ((com.tencent.mapsdk.internal.ud) buVar).getVectorMapDelegate().b(i17, i18);
            }
        }
    }

    public final void setNaviFixingProportion(float f17, float f18) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || bgVar.f48905b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        bgVar.f48905b.c((int) (bgVar.f48905b.Z * f17), (int) (bgVar.f48905b.f52180aa * f18));
        bgVar.f48905b.K = f17;
        bgVar.f48905b.L = f18;
    }

    public final void setNaviFixingProportion2D(float f17, float f18) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || bgVar.f48905b == null) {
            return;
        }
        if (f17 < 0.0f) {
            f17 = 0.0f;
        } else if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        bgVar.f48905b.d((int) (bgVar.f48905b.Z * f17), (int) (bgVar.f48905b.f52180aa * f18));
        bgVar.f48905b.M = f17;
        bgVar.f48905b.N = f18;
    }

    public final void setNaviStateEnabled(boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return;
        }
        bgVar.h(z17);
    }

    public final void setOnCameraChangeListener(com.tencent.tencentmap.mapsdk.maps.TencentMap.OnCameraChangeListener onCameraChangeListener) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null || bgVar.f48905b == null) {
            return;
        }
        bgVar.f48905b.C = onCameraChangeListener;
    }

    public final void setOptionalResourcePath(java.lang.String str) {
        com.tencent.mapsdk.internal.tr trVar;
        com.tencent.mapsdk.internal.ne neVar;
        com.tencent.mapsdk.internal.om omVar;
        if (this.mapDestroyed || (trVar = this.mVectorMapDelegate) == null || (neVar = trVar.f52273as) == null || (omVar = neVar.f50524x) == null) {
            return;
        }
        omVar.a(str);
    }

    public final void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return;
        }
        bgVar.a(latLng, f17, f18, f19, true);
    }

    public final void animateToNaviPosition(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, float f17, float f18, float f19, boolean z17) {
        com.tencent.mapsdk.internal.bg bgVar;
        if (this.mapDestroyed || (bgVar = this.mapManager) == null) {
            return;
        }
        bgVar.a(latLng, f17, f18, f19, z17);
    }
}
