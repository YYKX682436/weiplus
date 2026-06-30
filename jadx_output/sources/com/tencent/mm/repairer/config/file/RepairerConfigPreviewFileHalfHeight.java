package com.tencent.mm.repairer.config.file;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/file/RepairerConfigPreviewFileHalfHeight;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigPreviewFileHalfHeight extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_PreviewFileHalfHeight";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "文件预览半屏高度(0-100)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupFile.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        if (!(i17 == 788529167 || i17 == 788529166)) {
            z65.c.a();
        }
        return 85;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_preview_file_half_height";
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("1", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", "40", "60", "65", "70", "75", "80", "85", "90", "95", "100");
    }
}
