package com.tencent.mm.repairer.config.ting.player;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/ting/player/RepairerConfigTingRecLocalFile;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigTingRecLocalFile extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Ting_Rec_Local_File";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "本地音乐识别";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.config.ting.RepairerGroupTingPlayKernel.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
        return (i17 == 788529167 || i17 == 788529166) || z65.c.a() ? 1 : 0;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_ting_rec_local_file";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("不开启识别", "开启识别", "开启识别不缓存识别结果");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("0", "1", "2");
    }
}
