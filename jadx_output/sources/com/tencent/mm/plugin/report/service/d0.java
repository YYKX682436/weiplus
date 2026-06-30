package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class d0 implements com.tencent.mm.vfs.t6 {
    @Override // com.tencent.mm.vfs.t6
    public boolean accept(com.tencent.mm.vfs.r6 r6Var) {
        return java.util.regex.Pattern.matches("cpu[0-9]", r6Var.getName());
    }
}
