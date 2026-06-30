package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public interface g0 {
    static /* synthetic */ r45.i70 a(com.tencent.mm.plugin.vlog.model.g0 g0Var, java.lang.String str, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, android.util.Size size, android.graphics.Rect rect, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj == null) {
            return ((com.tencent.mm.plugin.vlog.model.p) g0Var).e(str, videoTransPara, size, rect, (i17 & 16) != 0 ? false : z17, (i17 & 32) != 0 ? false : z18);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: chooseExportConfig");
    }
}
