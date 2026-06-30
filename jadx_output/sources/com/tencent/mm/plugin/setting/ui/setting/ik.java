package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public final class ik implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f161160d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161161e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f161162f;

    public ik(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI, java.lang.String title, java.lang.String desc, java.lang.String time) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(time, "time");
        this.f161160d = title;
        this.f161161e = desc;
        this.f161162f = time;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
