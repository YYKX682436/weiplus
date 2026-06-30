package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class g2 {

    /* renamed from: a, reason: collision with root package name */
    public int f214534a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f214535b;

    /* renamed from: c, reason: collision with root package name */
    public int f214536c;

    /* renamed from: d, reason: collision with root package name */
    public int f214537d;

    /* renamed from: e, reason: collision with root package name */
    public int f214538e;

    public boolean a() {
        int i17 = this.f214534a;
        int i18 = 2;
        if ((i17 & 7) != 0) {
            int i19 = this.f214537d;
            int i27 = this.f214535b;
            if ((((i19 > i27 ? 1 : i19 == i27 ? 2 : 4) << 0) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 112) != 0) {
            int i28 = this.f214537d;
            int i29 = this.f214536c;
            if ((((i28 > i29 ? 1 : i28 == i29 ? 2 : 4) << 4) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 1792) != 0) {
            int i37 = this.f214538e;
            int i38 = this.f214535b;
            if ((((i37 > i38 ? 1 : i37 == i38 ? 2 : 4) << 8) & i17) == 0) {
                return false;
            }
        }
        if ((i17 & 28672) != 0) {
            int i39 = this.f214538e;
            int i47 = this.f214536c;
            if (i39 > i47) {
                i18 = 1;
            } else if (i39 != i47) {
                i18 = 4;
            }
            if ((i17 & (i18 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
