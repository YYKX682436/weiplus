package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class oq {
    public oq(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.hs a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return (com.tencent.mm.plugin.finder.viewmodel.component.hs) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.hs.class);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
