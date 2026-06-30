package com.tencent.mm.repairer.config.flutter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/flutter/ReparierConfigFlutterVulkanExtraImageCount;", "Lq55/i;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ReparierConfigFlutterVulkanExtraImageCount extends q55.i {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_Flutter_VulkanExtraImageCount_Int";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "vulkan extra image count";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupFlutter.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return 3;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_enable_flutter_vulkan_extra_image_count";
    }

    @Override // q55.i, q55.d
    public java.util.List n() {
        return kz5.c0.i("", "官方默认值", "", "默认值", "");
    }

    @Override // q55.i, q55.d
    public java.util.List o() {
        return kz5.c0.i("0", "1", "2", "3", "4");
    }
}
