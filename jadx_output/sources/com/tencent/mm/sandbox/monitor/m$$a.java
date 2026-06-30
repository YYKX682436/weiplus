package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public final /* synthetic */ class m$$a implements java.io.FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return str.endsWith(".crashlog") || str.endsWith(".preventcrashlog");
    }
}
