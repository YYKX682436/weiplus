package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class um extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.um f114588d = new com.tencent.mm.plugin.finder.live.plugin.um();

    public um() {
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
