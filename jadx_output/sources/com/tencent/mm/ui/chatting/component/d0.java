package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class d0 extends com.tencent.mm.ui.chatting.component.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f198915e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198916f = "";

    @Override // yn.d
    public void f0(java.lang.String str, java.lang.String str2) {
        java.util.Collection collection;
        java.lang.String t17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AtSomeoneCopyComponent", "force return due to talker is empty");
            return;
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!m0() || com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(this.f198916f) || com.tencent.mm.sdk.platformtools.t8.K0(this.f198915e)) {
            return;
        }
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str2.concat(str));
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        if (!kotlin.jvm.internal.o.b(a17, this.f198916f)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeoneCopyComponent", "force return due to different key");
            return;
        }
        java.util.List g17 = new r26.t(",").g(this.f198915e, 0);
        if (!g17.isEmpty()) {
            java.util.ListIterator listIterator = g17.listIterator(g17.size());
            while (listIterator.hasPrevious()) {
                if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                    collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = kz5.p0.f313996d;
        java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
        com.tencent.mm.storage.a3 z07 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(this.f198580d.x());
        for (java.lang.String str3 : strArr) {
            if (!kotlin.jvm.internal.o.b(str3, "notify@all")) {
                t17 = c01.e2.t(z07, str3, false);
                kotlin.jvm.internal.o.f(t17, "getRoomAtSomeShowName(...)");
            } else if (z07.P0()) {
                t17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.a6j, "");
                kotlin.jvm.internal.o.f(t17, "getString(...)");
            }
            if (t17.length() > 0) {
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.r(str, str3, t17);
            }
        }
    }

    @Override // yn.d
    public void k0(java.lang.String str, long j17, java.lang.CharSequence charSequence) {
        java.lang.String str2;
        java.util.Map d17;
        java.lang.String str3 = pt0.f0.f358209b1.n(str, j17).G;
        int i17 = c01.ia.f37254a;
        java.lang.String str4 = null;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str3, "msgsource", null)) != null) {
            str4 = (java.lang.String) d17.get(".msgsource.atuserlist");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            return;
        }
        if (charSequence == null || (str2 = charSequence.toString()) == null) {
            str2 = "";
        }
        kotlin.jvm.internal.o.d(str4);
        java.lang.String x17 = this.f198580d.x();
        if (m0() && !com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(str2.concat(x17));
            kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AtSomeoneCopyComponent", "return due to copy key is empty!");
                return;
            }
            if (str4.length() == 0) {
                this.f198915e = "";
                this.f198916f = "";
            } else {
                this.f198915e = str4;
                this.f198916f = a17;
            }
        }
    }

    public final boolean m0() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_chatroom_at_info_copy_enable_android, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeoneCopyComponent", "get expt:" + fj6);
        return fj6;
    }
}
