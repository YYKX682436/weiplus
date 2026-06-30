package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class f {
    public f(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        return (text.length() < 2 || !r26.i0.y(text, "\t", false) || r26.n0.j0(text.subSequence(1, 2), "\t", false, 2, null)) ? text : "\t\t\t".concat(text);
    }
}
