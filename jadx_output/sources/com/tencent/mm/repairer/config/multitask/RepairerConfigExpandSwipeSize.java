package com.tencent.mm.repairer.config.multitask;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/multitask/RepairerConfigExpandSwipeSize;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigExpandSwipeSize extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_ExpandSwipeSize";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "热区扩大大小";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMultiTask.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        boolean z17 = true;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        return java.lang.Integer.valueOf((z17 || com.tencent.mm.sdk.platformtools.v8.a(com.tencent.mm.sdk.platformtools.z.f193112h) || com.tencent.mm.sdk.platformtools.v8.b(com.tencent.mm.sdk.platformtools.z.f193112h)) ? 40 : 0);
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_expand_swipe_size";
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("1", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", "40", "60");
    }
}
