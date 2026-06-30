package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes13.dex */
public class c2 implements com.tencent.mm.plugin.location.ui.impl.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker f144772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.y1 f144773b;

    public c2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var, com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker) {
        this.f144773b = y1Var;
        this.f144772a = customIndoorPicker;
    }

    @Override // com.tencent.mm.plugin.location.ui.impl.g
    public void onChange() {
        com.tencent.mm.plugin.location.ui.impl.CustomIndoorPicker customIndoorPicker = this.f144772a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(customIndoorPicker.f144697n2) || com.tencent.mm.sdk.platformtools.t8.K0(customIndoorPicker.f144698o2)) {
            return;
        }
        boolean equals = customIndoorPicker.f144697n2.equals(customIndoorPicker.f144694k2);
        com.tencent.mm.plugin.location.ui.impl.y1 y1Var = this.f144773b;
        if (equals && customIndoorPicker.f144698o2.equals(customIndoorPicker.f144695l2)) {
            y1Var.B.a(1.0f);
        } else {
            y1Var.B.a(0.5f);
        }
    }
}
