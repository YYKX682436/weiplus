package com.tencent.wechat.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes11.dex */
public class ZIDL_idvlmtlKK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void ZIDL_AX(java.lang.Object r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wechat.iam.biz.ZIDL_idvlmtlKK.ZIDL_AX(java.lang.Object, byte[]):void");
    }

    private void ZIDL_EX(java.lang.Object obj, byte[] bArr) {
        java.util.Optional mmpbMessageJniToJavaOptional = com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.mm.biz.p4.f218470g, bArr);
        ((t01.l) ((com.tencent.wechat.iam.biz.a0) obj)).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "fetchMeTabRedPointAsync " + mmpbMessageJniToJavaOptional);
        com.tencent.wechat.mm.biz.p4 p4Var = (com.tencent.wechat.mm.biz.p4) mmpbMessageJniToJavaOptional.orElse(null);
        if (p4Var != null) {
            try {
                r45.vs2 vs2Var = new r45.vs2();
                com.tencent.mm.protobuf.g gVar = p4Var.f218472e;
                com.tencent.mm.protobuf.f parseFrom = vs2Var.parseFrom(gVar != null ? gVar.g() : null);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderRedDotCtrlInfo");
                r45.vs2 vs2Var2 = (r45.vs2) parseFrom;
                t01.i iVar = t01.m.f414399d;
                t01.i.a(iVar).D(t01.m.f414402g, vs2Var2.f388503x);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "save tipsUuid: " + vs2Var2.f388503x);
                zy2.fa.D(t01.i.c(iVar), vs2Var2, "bizMeTab", null, false, null, 28, null);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizPersonalFinderRedDot", e17, "add red dot error", new java.lang.Object[0]);
            }
        }
    }

    private void ZIDL_FX(java.lang.Object obj, boolean z17) {
        ((t01.k) ((com.tencent.wechat.iam.biz.y) obj)).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "disposeMeTabRedPointAsync: " + z17);
    }

    private void ZIDL_GX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_HX(java.lang.Object obj, byte[] bArr) {
        java.util.Optional mmpbMessageJniToJavaOptional = com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.mm.biz.r4.f218524v, bArr);
        ox.b bVar = (ox.b) ((com.tencent.wechat.iam.biz.b0) obj);
        bVar.getClass();
        com.tencent.wechat.mm.biz.r4 r4Var = (com.tencent.wechat.mm.biz.r4) mmpbMessageJniToJavaOptional.orElse(null);
        if (r4Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkMeTabStrategyRemoteSwitch, open=");
            sb6.append(r4Var.f218526e);
            sb6.append(", openWithOutAcct: ");
            sb6.append(r4Var.f218529h);
            sb6.append(", canRegisterPhotoAccount: ");
            sb6.append(r4Var.f218537s == 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", sb6.toString());
            boolean z17 = r4Var.f218526e == 1;
            ox.g gVar = bVar.f349444a;
            gVar.f349472e = z17;
            gVar.f349473f = r4Var.f218529h == 1;
            gVar.f349474g = r4Var.f218537s == 1;
            com.tencent.mm.sdk.platformtools.o4 o4Var = gVar.f349471d;
            o4Var.putBoolean("meStrategySwitch", z17);
            o4Var.putBoolean("meStrategyOpenWithoutAcct", gVar.f349473f);
            o4Var.putBoolean("canRegisterPhotoAccount", gVar.f349474g);
            java.util.LinkedList linkedList = r4Var.f218532n;
            kotlin.jvm.internal.o.f(linkedList, "getNativeEditorScene(...)");
            gVar.f349475h = linkedList;
            if (!linkedList.isEmpty()) {
                java.util.List list = gVar.f349475h;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
                }
                o4Var.putStringSet("nativeEditorScenes", kz5.n0.X0(arrayList));
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "checkMeTabStrategyRemoteSwitch, stored nativeEditorScenes: " + gVar.f349475h);
            } else {
                o4Var.remove("nativeEditorScenes");
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "checkMeTabStrategyRemoteSwitch, removed nativeEditorScenes from KV");
            }
            java.lang.String[] b17 = o4Var.b();
            kotlin.jvm.internal.o.f(b17, "allKeys(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.String str : b17) {
                kotlin.jvm.internal.o.d(str);
                if (r26.i0.y(str, "clientExpItemValue_", false)) {
                    arrayList2.add(str);
                }
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                o4Var.W((java.lang.String) it6.next());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", "clearAllClientExpItemValues, removed " + arrayList2.size() + " keys");
            java.util.LinkedList<com.tencent.wechat.mm.biz.l3> list2 = r4Var.f218531m.f218248d;
            kotlin.jvm.internal.o.f(list2, "list");
            for (com.tencent.wechat.mm.biz.l3 l3Var : list2) {
                java.lang.String key = l3Var.f218299d;
                kotlin.jvm.internal.o.f(key, "key");
                java.lang.String str2 = l3Var.f218300e;
                gVar.uj(key, str2 != null ? r26.h0.h(str2) : null);
            }
            com.tencent.wechat.mm.biz.w4 w4Var = r4Var.f218538t;
            gVar.f349476i = w4Var;
            o4Var.putBoolean("bizOriginPublishSwitch", w4Var != null ? w4Var.f218757d : false);
            com.tencent.wechat.mm.biz.w4 w4Var2 = r4Var.f218538t;
            o4Var.putInt("bizOriginPublishSizeLimit", w4Var2 != null ? w4Var2.f218758e : 0);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkMeTabStrategyRemoteSwitch, originalPictureStrategy: ");
            com.tencent.wechat.mm.biz.w4 w4Var3 = gVar.f349476i;
            sb7.append(w4Var3 != null ? java.lang.Boolean.valueOf(w4Var3.f218757d) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPublishApiFeatureService", sb7.toString());
            gVar.uj("support_view_photo_acct", java.lang.Integer.valueOf(r4Var.f218534p));
            gVar.uj("support_oper_photo_acct", java.lang.Integer.valueOf(r4Var.f218535q));
            gVar.uj("support_photo_acct_new_logo", java.lang.Integer.valueOf(r4Var.f218536r));
            r0 = jz5.f0.f302826a;
        }
        if (r0 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizPublishApiFeatureService", "checkMeTabStrategyRemoteSwitch, resp is empty");
        }
    }

    private void ZIDL_IX(java.lang.Object obj, byte[] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.mmpbMessageJniToJavaOptional(com.tencent.wechat.mm.biz.r4.f218524v, bArr);
        throw null;
    }

    private void ZIDL_JX(java.lang.Object obj, boolean z17) {
        ((rm.f0) ((com.tencent.wechat.iam.biz.i0) obj)).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SyncPhotoSwitchTask", "turnOnCreateBizPhotoAndFetchMeTabStrategyAsync result: " + z17);
    }

    private void ZIDL_LX(java.lang.Object obj, byte[] bArr, int i17) {
        ((com.tencent.wechat.iam.biz.c0) obj).a(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), i17);
    }

    private void ZIDL_MX(java.lang.Object obj, boolean z17) {
        ((gr1.a) ((com.tencent.wechat.iam.biz.x) obj)).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFans.RedDotDelegate", "clearSvrNotificationRedDot " + z17);
    }

    private void ZIDL_NX(java.lang.Object obj, boolean z17) {
        ((jr1.f) ((com.tencent.wechat.iam.biz.h0) obj)).getClass();
        com.tencent.mars.xlog.Log.i("BizFans.BizFansUtil", "reportBizFansOp " + z17);
    }

    private void ZIDL_OX(java.lang.Object obj, boolean z17) {
        ((com.tencent.wechat.iam.biz.k0) obj).complete(z17);
    }

    private void ZIDL_PX(java.lang.Object obj, boolean z17) {
        zw.l lVar = (zw.l) ((com.tencent.wechat.iam.biz.j0) obj);
        kotlinx.coroutines.q qVar = lVar.f476522c;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterSelectPhotoHandler", "textCoverEnable is false");
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            zw.k kVar = new zw.k();
            ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).Bi(lVar.f476520a, 0, 56, null, null, lVar.f476521b, false, kVar, new zw.j(qVar));
        }
    }

    public native void ZIDL_AV(long j17, java.lang.Object obj, byte[] bArr, int i17, byte[] bArr2);

    public native void ZIDL_EV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_FV(long j17, java.lang.Object obj, byte[] bArr, int i17, byte[] bArr2);

    public native void ZIDL_GV(long j17, java.lang.Object obj);

    public native void ZIDL_HV(long j17, java.lang.Object obj, boolean z17, boolean z18);

    public native void ZIDL_IV(long j17, java.lang.Object obj);

    public native void ZIDL_JV(long j17, java.lang.Object obj);

    public native void ZIDL_LV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_MV(long j17, java.lang.Object obj, byte[] bArr, int i17);

    public native void ZIDL_NV(long j17, java.lang.Object obj, byte[] bArr, int i17, int i18, byte[] bArr2);

    public native void ZIDL_OV(long j17, java.lang.Object obj);

    public native void ZIDL_PV(long j17, java.lang.Object obj);

    public native void ZIDL_idvlmtlKC(java.lang.Object obj, java.lang.Object obj2, java.lang.String str, java.lang.String str2);
}
