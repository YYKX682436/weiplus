package com.tencent.mm.repairer.config.msgsend;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/msgsend/RepairerConfigBigFileThumbLongSideLimit;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RepairerConfigBigFileThumbLongSideLimit extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_FileThumbLongSideLimit";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "发送图片/视频文件缩略图质量限制";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupMsgSend.class;
    }

    @Override // q55.e
    public java.lang.String h() {
        return "String";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "120:30";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_file_thumb_long_side_limit";
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("90:30", "120:30", "150:30", "180:30", "200:30");
    }
}
