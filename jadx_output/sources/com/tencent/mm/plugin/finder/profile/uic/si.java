package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes15.dex */
public final class si {
    public si(kotlin.jvm.internal.i iVar) {
    }

    public final int a(float f17, int i17) {
        int i18 = (int) (f17 * 255);
        if (i18 <= 0) {
            i18 = 0;
        }
        return ((255 > i18 ? i18 : 255) << 24) + (i17 & 16777215);
    }
}
