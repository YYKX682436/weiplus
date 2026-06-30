package ey5;

/* loaded from: classes16.dex */
public class y implements com.tencent.tencentmap.mapsdk.map.UiSettings {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.tencentmap.mapsdk.maps.UiSettings f257689a;

    public y(com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings) {
        this.f257689a = uiSettings;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public boolean isAnimationEnabled() {
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public boolean isCompassEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isCompassEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public boolean isIndoorLevelPickerEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isIndoorLevelPickerEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public boolean isRotateGesturesEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isRotateGesturesEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public boolean isScaleControlsEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            return uiSettings.isScaleViewEnabled();
        }
        return false;
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public boolean isTiltGesturesEnabled() {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return false;
        }
        return uiSettings.isTiltGesturesEnabled();
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setAllGesturesEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setAllGesturesEnabled(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setAnimationEnabled(boolean z17) {
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setCompassEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return;
        }
        uiSettings.setCompassEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setIndoorLevelPickerEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setIndoorLevelPickerEnabled(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setLogoPosition(int i17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setLogoPosition(i17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setLogoScale(float f17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return;
        }
        uiSettings.setLogoScale(f17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setRotateGesturesEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return;
        }
        uiSettings.setRotateGesturesEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setScaleControlsEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setScaleViewEnabled(z17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0008, code lost:
    
        if (r7 != 2) goto L8;
     */
    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setScaleViewPositionWithMargin(int r7, int r8, int r9, int r10, int r11) {
        /*
            r6 = this;
            com.tencent.tencentmap.mapsdk.maps.UiSettings r0 = r6.f257689a
            if (r0 == 0) goto L15
            r1 = 1
            if (r7 == r1) goto Lc
            r2 = 2
            if (r7 == r2) goto Le
        La:
            r1 = r7
            goto Le
        Lc:
            r7 = 4
            goto La
        Le:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.setScaleViewPositionWithMargin(r1, r2, r3, r4, r5)
        L15:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ey5.y.setScaleViewPositionWithMargin(int, int, int, int, int):void");
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setScrollGesturesEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setScrollGesturesEnabled(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setTiltGesturesEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings == null) {
            return;
        }
        uiSettings.setTiltGesturesEnabled(z17);
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setZoomGesturesEnabled(boolean z17) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setZoomGesturesEnabled(z17);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.map.UiSettings
    public void setLogoPosition(int i17, int[] iArr) {
        com.tencent.tencentmap.mapsdk.maps.UiSettings uiSettings = this.f257689a;
        if (uiSettings != null) {
            uiSettings.setLogoPosition(i17, iArr);
        }
    }
}
