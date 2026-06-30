package com.tencent.mm.sandbox.monitor;

/* loaded from: classes11.dex */
public class b implements java.io.FilenameFilter {
    @Override // java.io.FilenameFilter
    public boolean accept(java.io.File file, java.lang.String str) {
        return str.endsWith(".crashlog") || str.endsWith(".preventcrashlog");
    }
}
