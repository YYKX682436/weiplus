package com.tencent.mm.repairer.config.voip.render;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/voip/render/RepairerConfigVoIPShaper;", "Lq55/e;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigVoIPShaper extends q55.e {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_VOIP_RemoteRenderSharpen_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "对端渲染锐化，-1表示关闭";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.voip.RepairerGroupVoIP.class;
    }
}
