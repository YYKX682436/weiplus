package com.tencent.mm.plugin.lite;

/* loaded from: classes15.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f144161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo f144162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f144163f;

    public r0(com.tencent.mm.plugin.lite.w wVar, android.content.Context context, com.tencent.mm.plugin.lite.LiteAppCenter.SystemInfo systemInfo, float f17) {
        this.f144161d = context;
        this.f144162e = systemInfo;
        this.f144163f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.lite.LiteAppCenter.cachedNavigationBarHeight = com.tencent.mm.ui.bl.c(this.f144161d);
        this.f144162e.navigationBarHeight = com.tencent.mm.plugin.lite.LiteAppCenter.cachedNavigationBarHeight / this.f144163f;
    }
}
