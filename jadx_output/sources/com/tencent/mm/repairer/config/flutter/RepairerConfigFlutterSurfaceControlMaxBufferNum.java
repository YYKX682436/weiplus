package com.tencent.mm.repairer.config.flutter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/flutter/RepairerConfigFlutterSurfaceControlMaxBufferNum;", "Lq55/d;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RepairerConfigFlutterSurfaceControlMaxBufferNum extends q55.d {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Flutter_SurfaceControlMaxNum_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "SurfaceControl最大缓冲区数量(重启生效)";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupFlutter.class;
    }

    @Override // q55.e
    public java.lang.String h() {
        return "Int";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 6;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_flutter_surface_control_buffer_num";
    }

    @Override // q55.d
    public java.util.List o() {
        return kz5.c0.i("1", "2", "3", "4", "5", "6");
    }
}
