package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class zd implements java.io.FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r26.t f161824a;

    public zd(r26.t tVar) {
        this.f161824a = tVar;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        kotlin.jvm.internal.o.d(str);
        return this.f161824a.e(str);
    }
}
