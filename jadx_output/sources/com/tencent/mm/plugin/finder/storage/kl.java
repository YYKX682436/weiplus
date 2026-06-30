package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class kl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.kl f127080d = new com.tencent.mm.plugin.finder.storage.kl();

    public kl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "ocr识别自动隐藏控件时长", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_enable_ocr_alpha_duration, false, 2, null);
        aVar.a("FINDER_OCR_CHECK_COMPONENT_DURATION", kz5.c0.i(0, 5, 10), kz5.c0.i("0秒", "5秒（默认）", "10秒"));
        return aVar;
    }
}
