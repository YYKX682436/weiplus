package qf2;

/* loaded from: classes3.dex */
public final class v0 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public int f362614m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f362614m = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(qf2.v0 r17, long r18, java.lang.String r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.v0.a7(qf2.v0, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c7(qf2.v0 v0Var, r45.xn1 finderLiveContact, r45.kj1 kj1Var, int i17, byte[] bArr, java.lang.String str, yz5.a aVar, int i18, java.lang.Object obj) {
        r45.kj1 kj1Var2 = (i18 & 2) != 0 ? null : kj1Var;
        int i19 = (i18 & 4) != 0 ? 0 : i17;
        byte[] bArr2 = (i18 & 8) != 0 ? null : bArr;
        java.lang.String str2 = (i18 & 16) != 0 ? null : str;
        yz5.a aVar2 = (i18 & 32) != 0 ? null : aVar;
        v0Var.getClass();
        kotlin.jvm.internal.o.g(finderLiveContact, "finderLiveContact");
        com.tencent.mm.plugin.finder.live.util.y.d(v0Var, null, null, new qf2.z(v0Var, finderLiveContact, kj1Var2, i19, bArr2, str2, aVar2, null), 3, null);
    }

    public static /* synthetic */ void e7(qf2.v0 v0Var, java.lang.String str, boolean z17, boolean z18, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        v0Var.d7(str, z17, z18, lVar);
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.r0(this, null), 3, null);
    }

    public final void Z6(km2.q micUser) {
        kotlin.jvm.internal.o.g(micUser, "micUser");
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "acceptMicReport acceptMicTimeOut: " + micUser.L + " user: " + micUser);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.o(this, micUser, null), 3, null);
    }

    public final void b7(r45.xn1 xn1Var) {
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329318o;
        kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309172c, (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                        break;
                    }
                }
            }
        }
        km2.q qVar = (km2.q) obj;
        if (qVar == null) {
            com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "anchorAcceptWithAnchorMicTrtc fail userData = null");
        } else {
            ((mm2.o4) business(mm2.o4.class)).M7(qVar);
            com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.w(qVar, this, null), 3, null);
        }
    }

    public final void d7(java.lang.String userName, boolean z17, boolean z18, yz5.l lVar) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (zl2.q4.f473933a.E()) {
            com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "close trace: " + android.util.Log.getStackTraceString(new java.lang.Throwable("Pk mic close")));
        }
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.l0(this, userName, z17, z18, lVar, null), 3, null);
    }

    public final void f7() {
        java.util.HashMap hashMap = new java.util.HashMap();
        mk2.h hVar = mk2.h.f327133a;
        hashMap.putAll(mk2.h.f327135c);
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "cancelAllAnchorApply task: " + hashMap.size());
        java.util.Set<java.util.Map.Entry> entrySet = hashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Runnable runnable = (java.lang.Runnable) entry.getValue();
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.l(runnable);
            }
            java.lang.String str = (java.lang.String) entry.getKey();
            if (str != null) {
                e7(this, str, false, false, null, 14, null);
            }
        }
        mk2.h hVar2 = mk2.h.f327133a;
        mk2.h.f327135c.clear();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new qf2.q0(this, null), 3, null);
    }
}
