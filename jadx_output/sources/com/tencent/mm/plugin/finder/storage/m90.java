package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class m90 {
    public m90(java.lang.String contextId, java.lang.String clickTabContextId, com.tencent.mm.ui.MMActivity context, int i17, kotlin.jvm.internal.i iVar) {
        contextId = (i17 & 1) != 0 ? "" : contextId;
        clickTabContextId = (i17 & 2) != 0 ? "" : clickTabContextId;
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(clickTabContextId, "clickTabContextId");
        kotlin.jvm.internal.o.g(context, "context");
    }
}
