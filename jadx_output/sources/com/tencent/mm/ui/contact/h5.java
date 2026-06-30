package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class h5 extends com.tencent.mm.ui.contact.f5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f206753n;

    public h5(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI, java.util.List list, boolean z17, java.lang.String str) {
        super(mMBaseSelectContactUI, list, z17, 0);
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f206753n = hashSet;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(str.split(",")));
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSearchSportContactAdapter", "matchUsernameSet %s", java.lang.Integer.valueOf(hashSet.size()));
        }
        ((qd0.n0) ((rd0.c1) this.f206704m)).f361571v = new com.tencent.mm.ui.contact.g5(this);
    }
}
