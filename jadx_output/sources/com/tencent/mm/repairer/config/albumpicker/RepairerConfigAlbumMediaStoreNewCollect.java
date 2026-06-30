package com.tencent.mm.repairer.config.albumpicker;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/albumpicker/RepairerConfigAlbumMediaStoreNewCollect;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RepairerConfigAlbumMediaStoreNewCollect extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_AlbumMediaStoreNewCollect";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "相册Item MediaStore拉取新方式";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupAlbumPicker.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_album_use_new_fetch_media_store";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.k("默认(x实验)", "使用", "不使用");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.k("1", "2", "3");
    }
}
