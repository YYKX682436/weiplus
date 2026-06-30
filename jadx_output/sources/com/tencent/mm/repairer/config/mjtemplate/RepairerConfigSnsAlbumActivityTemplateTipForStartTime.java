package com.tencent.mm.repairer.config.mjtemplate;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/mjtemplate/RepairerConfigSnsAlbumActivityTemplateTipForStartTime;", "Ly55/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RepairerConfigSnsAlbumActivityTemplateTipForStartTime extends y55.a {
    @Override // q55.h
    public java.lang.String c() {
        return "起始时间(秒，默认为今天0点)";
    }

    @Override // q55.e
    public java.lang.Object i() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        kotlin.jvm.internal.o.f(calendar, "getInstance(...)");
        calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return java.lang.String.valueOf(calendar.getTimeInMillis() / 1000);
    }
}
