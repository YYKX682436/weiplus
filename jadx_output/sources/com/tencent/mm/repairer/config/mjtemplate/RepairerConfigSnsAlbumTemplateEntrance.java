package com.tencent.mm.repairer.config.mjtemplate;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjtemplate/RepairerConfigSnsAlbumTemplateEntrance;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigSnsAlbumTemplateEntrance extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_SnsAlbumTemplateEntrance";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "朋友圈-相册页模版/剪同款入口";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMJTemplate.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 1;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_sns_album_template_entrance";
    }

    @Override // q55.d
    public java.util.List n() {
        return kz5.c0.k("默认(走X实验)", "强制关闭");
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.k("1", "2");
    }
}
