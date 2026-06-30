package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.gn f112716d = new com.tencent.mm.plugin.finder.live.plugin.gn();

    public gn() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.yv1 it = (r45.yv1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String string = it.getString(0);
        if (string == null) {
            string = "";
        }
        return string.concat(",");
    }
}
