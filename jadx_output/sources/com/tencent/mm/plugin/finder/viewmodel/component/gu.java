package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class gu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.gu f134553d = new com.tencent.mm.plugin.finder.viewmodel.component.gu();

    public gu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.pb4 pb4Var = new r45.pb4();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_POPUP_EXPOSE_INFO_STRING, "");
        kotlin.jvm.internal.o.d(v17);
        if (v17.length() > 0) {
            pb4Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17));
        }
        return pb4Var;
    }
}
