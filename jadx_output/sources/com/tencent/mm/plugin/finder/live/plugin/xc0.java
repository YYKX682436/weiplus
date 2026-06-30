package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class xc0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.xc0 f115072d = new com.tencent.mm.plugin.finder.live.plugin.xc0();

    public xc0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) obj;
        java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
        return username == null ? "" : username;
    }
}
