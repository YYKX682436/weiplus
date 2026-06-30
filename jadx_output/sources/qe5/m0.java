package qe5;

/* loaded from: classes12.dex */
public final class m0 extends wm3.a implements com.tencent.mm.modelbase.u0, bt3.q0 {

    /* renamed from: d, reason: collision with root package name */
    public i40.a f362145d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362146e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f362147f;

    /* renamed from: g, reason: collision with root package name */
    public int f362148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362147f = jz5.h.b(new qe5.l0(this));
    }

    public static /* synthetic */ void d7(qe5.m0 m0Var, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        m0Var.c7(z17);
    }

    @Override // bt3.q0
    public void D6(bt3.l0 l0Var) {
        pm0.v.X(new qe5.k0(this));
    }

    public final void T6() {
        com.tencent.mm.storage.f9 Y6 = Y6();
        if (Y6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "msgInfo is null");
        } else {
            kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new qe5.d0(Y6, this, null), 3, null);
        }
    }

    public final com.tencent.mm.pluginsdk.model.app.d U6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((qe5.h) pf5.z.f353948a.a(activity).a(qe5.h.class)).T6();
    }

    public final kd5.e V6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final int W6(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFileSendStatus: isSend = ");
        sb6.append(z17);
        sb6.append(", stack = ");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewUtil", sb6.toString());
        return 101;
    }

    public final java.lang.Long X6() {
        kd5.e V6 = V6();
        if (V6 != null) {
            return java.lang.Long.valueOf(V6.f306879g);
        }
        return null;
    }

    public final com.tencent.mm.storage.f9 Y6() {
        com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem;
        java.lang.Long X6 = X6();
        kd5.e V6 = V6();
        java.lang.String str = V6 != null ? V6.f306880h : null;
        if (X6 != null && str != null) {
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, X6.longValue());
            if (n17.getMsgId() != 0 && n17.j() != null) {
                return n17;
            }
            if (!(getIntent().getIntExtra("msg_type", 0) == 1) || (msgQuoteItem = (com.tencent.mm.plugin.msgquote.model.MsgQuoteItem) getIntent().getParcelableExtra("key_quoted_msg")) == null) {
                return null;
            }
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.setType(msgQuoteItem.f149482d);
            f9Var.o1(msgQuoteItem.f149483e);
            f9Var.u1(msgQuoteItem.f149484f);
            f9Var.u3(msgQuoteItem.f149487i);
            f9Var.d1(msgQuoteItem.f149488m);
            if (com.tencent.mm.sdk.platformtools.t8.D0(msgQuoteItem.f149485g, c01.z1.r())) {
                f9Var.j1(1);
            }
            return f9Var;
        }
        return null;
    }

    public final em.d0 Z6() {
        return (em.d0) ((jz5.n) this.f362147f).getValue();
    }

    public final void a7() {
        java.lang.String str;
        if (this.f362146e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "onDownLoadImpl hasTryOpen");
            return;
        }
        this.f362146e = true;
        kd5.e V6 = V6();
        if (V6 != null) {
            int i17 = V6.f306889t;
            kd5.e V62 = V6();
            if (V62 == null || (str = V62.f306893x) == null) {
                str = "";
            }
            if (i17 != 0) {
                if (i17 != 2) {
                    if (i17 != 74 && i17 != 6) {
                        if (i17 == 7) {
                            android.content.Intent intent = new android.content.Intent();
                            com.tencent.mm.storage.f9 Y6 = Y6();
                            intent.putExtra("App_MsgId", Y6 != null ? java.lang.Long.valueOf(Y6.getMsgId()) : null);
                            intent.putExtra("App_MsgTalker", Y6 != null ? Y6.Q0() : null);
                            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
                            if (P6 != null) {
                                P6.setResult(-1, intent);
                                P6.finish();
                            }
                        } else if (i17 != 130 && i17 != 131) {
                            b7(0);
                            j75.f Q6 = Q6();
                            if (Q6 != null) {
                                Q6.B3(new kd5.w());
                            }
                            androidx.appcompat.app.AppCompatActivity activity = getActivity();
                            kotlin.jvm.internal.o.g(activity, "activity");
                            ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).g7(8);
                        }
                    }
                    g7(str, i17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "onDownLoadImpl");
                    c7(false);
                } else if (!f7()) {
                    androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                    kotlin.jvm.internal.o.g(activity2, "activity");
                    ((qe5.z) pf5.z.f353948a.a(activity2).a(qe5.z.class)).k7();
                }
            } else if (!g7(str, i17)) {
                androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
                kotlin.jvm.internal.o.g(activity3, "activity");
                pf5.z zVar = pf5.z.f353948a;
                ((qe5.z) zVar.a(activity3).a(qe5.z.class)).g7(8);
                Z6().c().setVisibility(8);
                kd5.e V63 = V6();
                java.lang.String str2 = V63 != null ? V63.f306893x : null;
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(str2);
                kotlin.jvm.internal.o.f(e17, "getMimeTypeByExt(...)");
                if (x51.t1.b(e17)) {
                    Z6().h().setVisibility(8);
                    b7(8);
                } else {
                    b7(0);
                    j75.f Q62 = Q6();
                    if (Q62 != null) {
                        Q62.B3(new kd5.w());
                    }
                }
                androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
                kotlin.jvm.internal.o.g(activity4, "activity");
                ((qe5.z) zVar.a(activity4).a(qe5.z.class)).i7();
            }
            j75.f Q63 = Q6();
            if (Q63 != null) {
                Q63.B3(new kd5.q());
            }
        }
    }

    public final void b7(int i17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).f7(i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0118, code lost:
    
        if (r5 == 101) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(boolean r18) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.m0.c7(boolean):void");
    }

    public final boolean e7() {
        java.lang.String str;
        com.tencent.mm.vfs.z2 z2Var;
        boolean z17;
        com.tencent.mm.pluginsdk.model.app.d U6 = U6();
        java.lang.Long X6 = X6();
        kd5.e V6 = V6();
        java.lang.String str2 = V6 != null ? V6.f306880h : null;
        com.tencent.mm.storage.f9 Y6 = Y6();
        com.tencent.mm.storage.f9 Y62 = Y6();
        java.lang.String j17 = Y62 != null ? Y62.j() : null;
        kd5.e V62 = V6();
        ot0.q qVar = V62 != null ? V62.f306882m : null;
        if (X6 == null || Y6 == null || str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "tryInitAttachInfo msgId is null or msgInfo is null or talker is null");
            return false;
        }
        if (U6 == null) {
            kd5.e V63 = V6();
            java.lang.String cj6 = V63 != null ? ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).cj(Y6, V63.f306892w, V63.f306893x, true) : null;
            long longValue = X6.longValue();
            if (cj6 == null || cj6.length() == 0) {
                cj6 = null;
            }
            com.tencent.mm.pluginsdk.model.app.k0.s(longValue, str2, j17, cj6);
            U6 = U6();
            if (U6 != null) {
                java.lang.Object[] objArr = new java.lang.Object[8];
                objArr[0] = java.lang.Long.valueOf(U6.systemRowid);
                objArr[1] = java.lang.Long.valueOf(U6.field_totalLen);
                objArr[2] = U6.field_fileFullPath;
                objArr[3] = java.lang.Long.valueOf(U6.field_type);
                objArr[4] = U6.field_mediaId;
                objArr[5] = java.lang.Long.valueOf(U6.field_msgInfoId);
                objArr[6] = java.lang.Boolean.valueOf(U6.field_isUpload);
                java.lang.String str3 = U6.field_signature;
                objArr[7] = java.lang.Integer.valueOf(str3 == null ? -1 : str3.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", objArr);
                if (qVar != null && qVar.f348714u == 0) {
                    r8 = true;
                }
                if (!r8 || qVar.f348682m > 26214400) {
                    z17 = !x51.t1.b(U6.field_signature);
                    str = null;
                }
            }
            z17 = true;
            str = null;
        } else {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(U6.field_fileFullPath);
            java.lang.String str4 = a17.f213279f;
            if (str4 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            if (U6.field_status == 199) {
                str = null;
                z2Var = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!(!z2Var.a() ? false : z2Var.f213266a.F(z2Var.f213267b))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp tryInitAttachInfo info exist but file not!");
                    kd5.e V64 = V6();
                    java.lang.String cj7 = V64 != null ? ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).cj(Y6, V64.f306892w, V64.f306893x, true) : null;
                    long longValue2 = X6.longValue();
                    if (cj7 == null || cj7.length() == 0) {
                        cj7 = null;
                    }
                    com.tencent.mm.pluginsdk.model.app.k0.s(longValue2, str2, j17, cj7);
                }
            } else {
                str = null;
                z2Var = null;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[10];
            objArr2[0] = java.lang.Long.valueOf(U6.systemRowid);
            objArr2[1] = java.lang.Long.valueOf(U6.field_totalLen);
            objArr2[2] = U6.field_fileFullPath;
            objArr2[3] = java.lang.Long.valueOf(U6.field_type);
            objArr2[4] = U6.field_mediaId;
            objArr2[5] = java.lang.Long.valueOf(U6.field_msgInfoId);
            objArr2[6] = java.lang.Boolean.valueOf(U6.field_isUpload);
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, z2Var);
            objArr2[7] = java.lang.Boolean.valueOf(m17.a() ? m17.f213266a.F(m17.f213267b) : false);
            objArr2[8] = java.lang.Long.valueOf(U6.field_status);
            java.lang.String str5 = U6.field_signature;
            objArr2[9] = java.lang.Integer.valueOf(str5 == null ? -1 : str5.length());
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", objArr2);
            z17 = true;
        }
        if (qVar != null) {
            if (U6 != null && ((int) U6.field_status) == 102) {
                com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "tryInitAttachInfo file is pause!");
            } else if (qVar.f348714u != 0 || qVar.f348682m > 26214400) {
                z17 = !((d35.j) ((qx.h0) i95.n0.c(qx.h0.class))).bj();
            }
        }
        if (!z17) {
            com.tencent.mm.modelbase.r1 e17 = c01.d9.e();
            kd5.e V65 = V6();
            java.lang.String str6 = V65 != null ? V65.D : str;
            kd5.e V66 = V6();
            java.lang.String str7 = V66 != null ? V66.f306895z : str;
            kd5.e V67 = V6();
            java.lang.String str8 = V67 != null ? V67.f306892w : str;
            kd5.e V68 = V6();
            java.lang.String str9 = V68 != null ? V68.f306893x : str;
            kd5.e V69 = V6();
            e17.g(new bt3.i0(U6, str6, str7, str8, str9, V69 != null ? V69.A : str));
        }
        if (U6 != null) {
            kd5.e V610 = V6();
            if (V610 != null) {
                java.lang.String field_fileFullPath = U6.field_fileFullPath;
                kotlin.jvm.internal.o.f(field_fileFullPath, "field_fileFullPath");
                V610.F = field_fileFullPath;
            }
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((qe5.p0) pf5.z.f353948a.a(activity).a(qe5.p0.class)).V6();
        }
        return z17;
    }

    public final boolean f7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).Y6()) {
            return false;
        }
        j75.f Q6 = Q6();
        if (Q6 == null) {
            return true;
        }
        Q6.B3(new kd5.q());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r6 != 131) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g7(java.lang.String r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.f7()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 0
            if (r5 != 0) goto Ld
            r5 = r0
            goto L11
        Ld:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.G0(r5)
        L11:
            if (r5 == 0) goto L69
            java.lang.Class<qe5.z> r5 = qe5.z.class
            java.lang.String r2 = "activity"
            if (r6 == 0) goto L43
            r3 = 2
            if (r6 == r3) goto L2c
            r3 = 6
            if (r6 == r3) goto L43
            r3 = 74
            if (r6 == r3) goto L43
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L43
            r3 = 131(0x83, float:1.84E-43)
            if (r6 == r3) goto L43
            goto L59
        L2c:
            androidx.appcompat.app.AppCompatActivity r6 = r4.getActivity()
            kotlin.jvm.internal.o.g(r6, r2)
            pf5.z r2 = pf5.z.f353948a
            pf5.v r6 = r2.a(r6)
            androidx.lifecycle.c1 r5 = r6.a(r5)
            qe5.z r5 = (qe5.z) r5
            r5.k7()
            goto L59
        L43:
            androidx.appcompat.app.AppCompatActivity r6 = r4.getActivity()
            kotlin.jvm.internal.o.g(r6, r2)
            pf5.z r2 = pf5.z.f353948a
            pf5.v r6 = r2.a(r6)
            androidx.lifecycle.c1 r5 = r6.a(r5)
            qe5.z r5 = (qe5.z) r5
            r5.h7()
        L59:
            j75.f r5 = r4.Q6()
            if (r5 == 0) goto L67
            kd5.q r6 = new kd5.q
            r6.<init>()
            r5.B3(r6)
        L67:
            r5 = r1
            goto L6a
        L69:
            r5 = r0
        L6a:
            if (r5 == 0) goto L6d
            return r1
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.m0.g7(java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(int r20) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.m0.h7(int):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.j0(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.storage.f9 Y6 = Y6();
        if (Y6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FileDownLoadUIC", "removeDownloadCallback msgInfo is null");
            return;
        }
        java.lang.String Q0 = Y6.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        h40.f fVar = new h40.f(Q0, Y6.I0());
        fVar.f278742c = this.f362145d;
        fVar.f278745f = h40.b.f278722g;
        ((d40.q) ((e40.w) i95.n0.c(e40.w.class))).mj(fVar);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        c01.d9.e().q(728, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        c01.d9.e().a(728, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp onSceneEnd type[%d], [%d, %d, %s]", java.lang.Integer.valueOf(scene.getType()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if ((scene.getType() == 221 || scene.getType() == 728) && scene.getType() == 728 && i17 == 0 && i18 == 0) {
            com.tencent.mm.pluginsdk.model.app.d U6 = U6();
            if (U6 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp onSceneEnd getAppAttachInfo is null");
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str2 = U6.field_signature;
                objArr[0] = java.lang.Integer.valueOf(str2 == null ? -1 : str2.length());
                com.tencent.mars.xlog.Log.i("MicroMsg.File.FileDownLoadUIC", "summerapp onSceneEnd CheckBigFileDownload ok signature len[%d] start NetSceneDownloadAppAttach", objArr);
            }
            if (U6 != null) {
                W6(false);
                U6.field_status = 101;
                U6.field_lastModifyTime = c01.id.e();
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(U6, new java.lang.String[0]);
                T6();
            }
        }
    }
}
