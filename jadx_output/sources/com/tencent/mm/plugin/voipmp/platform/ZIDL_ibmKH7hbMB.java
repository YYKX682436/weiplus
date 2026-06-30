package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
class ZIDL_ibmKH7hbMB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.mm.plugin.voipmp.platform.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.voipmp.platform.z0 f177201a;

    public ZIDL_ibmKH7hbMB(java.lang.Object obj) {
        com.tencent.mm.plugin.voipmp.platform.z0 z0Var = (com.tencent.mm.plugin.voipmp.platform.z0) obj;
        this.f177201a = z0Var;
        ((fo5.f3) z0Var).getClass();
        fo5.f3.f264984a = this;
    }

    private native void ZIDL_ABX(long j17, long j18);

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BBX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CBX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DBX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    private native void ZIDL_EBX(long j17, long j18);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FBX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18);

    private native void ZIDL_GBX(long j17, long j18);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_HBX(long j17, long j18);

    private native void ZIDL_HX(long j17, long j18);

    private native void ZIDL_IBX(long j17, long j18, boolean z17);

    private native void ZIDL_IX(long j17, long j18);

    private native void ZIDL_JBX(long j17, long j18);

    private native void ZIDL_JX(long j17, long j18);

    private native void ZIDL_KBX(long j17, long j18);

    private native void ZIDL_KX(long j17, long j18);

    private native void ZIDL_LBX(long j17, long j18);

    private native void ZIDL_LX(long j17, long j18);

    private native void ZIDL_MBX(long j17, long j18);

    private native void ZIDL_MX(long j17, long j18);

    private native void ZIDL_NBX(long j17, long j18);

    private native void ZIDL_NX(long j17, long j18);

    private native void ZIDL_OX(long j17, long j18);

    private native void ZIDL_PX(long j17, long j18);

    private native void ZIDL_QX(long j17, long j18);

    private native void ZIDL_RX(long j17, long j18);

    private native void ZIDL_SX(long j17, long j18);

    private native void ZIDL_TX(long j17, long j18);

    private native void ZIDL_UX(long j17, long j18);

    private native void ZIDL_VX(long j17, long j18);

    private native void ZIDL_WX(long j17, long j18);

    private native void ZIDL_XX(long j17, long j18);

    private native void ZIDL_YX(long j17, long j18);

    private native void ZIDL_ZX(long j17, long j18);

    public void A2(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }

    public void B2(long j17) {
        ZIDL_MBX(this.nativeHandler, j17);
    }

    public void Q1(long j17) {
        ZIDL_AX(this.nativeHandler, j17);
    }

    public void R1(long j17) {
        ZIDL_UX(this.nativeHandler, j17);
    }

    public void S1(long j17) {
        ZIDL_OX(this.nativeHandler, j17);
    }

    public void T1(long j17) {
        ZIDL_ZX(this.nativeHandler, j17);
    }

    public void U1(long j17) {
        ZIDL_QX(this.nativeHandler, j17);
    }

    public void V1(long j17) {
        ZIDL_GBX(this.nativeHandler, j17);
    }

    public void W1(long j17) {
        ZIDL_VX(this.nativeHandler, j17);
    }

    public void X1(long j17) {
        ZIDL_HBX(this.nativeHandler, j17);
    }

    public void Y1(long j17) {
        ZIDL_MX(this.nativeHandler, j17);
    }

    public void Z1(long j17) {
        ZIDL_LBX(this.nativeHandler, j17);
    }

    public void ZIDL_ABV(long j17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.p0((fo5.r0) aVar, str, null), 3, null);
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).t2(j17);
        }
    }

    public void ZIDL_AV(long j17, byte[] bArr) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).Q1(j17);
        }
    }

    public void ZIDL_BBV(long j17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((fo5.f3) this.f177201a).getClass();
        if (fo5.f3.f264986c != null) {
            if (str.length() > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "unsafe talking, need verification ".concat(str));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("showShare", false);
                intent.putExtra("show_bottom", false);
                intent.putExtra("needRedirect", false);
                intent.putExtra("neverGetA8Key", true);
                intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
                intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", ".ui.tools.WebViewUI", intent, null);
                db5.f.i(com.tencent.mm.sdk.platformtools.x2.f193071a);
            } else {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lo8));
                u1Var.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lo7));
                ip5.a.a(u1Var);
            }
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).v2(j17);
        }
    }

    public void ZIDL_BV(long j17, boolean z17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).q2(j17);
        }
    }

    public void ZIDL_CBV(long j17, int i17) {
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            fo5.r0 r0Var = (fo5.r0) aVar;
            if (i17 != 0) {
                r0Var.E = java.lang.System.currentTimeMillis();
                r0Var.F = i17 * 1000;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pck, java.lang.Integer.valueOf(i17));
                e4Var.c();
            } else {
                long j18 = r0Var.E;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (java.lang.System.currentTimeMillis() - j18 < r0Var.F) {
                    int ceil = (int) java.lang.Math.ceil((r2 - r4) / 1000.0d);
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                    e4Var2.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.pck, java.lang.Integer.valueOf(ceil));
                    e4Var2.c();
                }
            }
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).u2(j17);
        }
    }

    public void ZIDL_CV(long j17, boolean z17, byte[][] bArr) {
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(er4.c.f256059i, bArr);
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).A2(j17);
        }
    }

    public void ZIDL_DBV(long j17, int i17) {
        er4.r a17 = er4.r.a(i17);
        ((fo5.f3) this.f177201a).getClass();
        if (fo5.f3.f264986c != null) {
            int i18 = a17 == er4.r.MP_ROOM_TYPE_VIDEO ? com.tencent.mm.R.string.lfi : com.tencent.mm.R.string.lhu;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(i18));
            u1Var.n(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.lo7));
            ip5.a.a(u1Var);
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).r2(j17);
        }
    }

    public void ZIDL_DV(long j17, boolean z17, boolean z18) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).z2(j17);
        }
    }

    public void ZIDL_EBV(long j17, int i17, boolean z17) {
        er4.r a17 = er4.r.a(i17);
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            aVar.e(a17, z17);
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).d2(j17);
        }
    }

    public void ZIDL_EV(long j17, boolean z17, boolean z18) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).p2(j17);
        }
    }

    public void ZIDL_FBV(long j17, int i17, int i18, long j18, long j19, byte[] bArr, byte[][] bArr2, boolean z17) {
        er4.r a17 = er4.r.a(i18);
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.util.ArrayList<java.lang.String> stringArrayToList = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr2);
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            fo5.r0 r0Var = (fo5.r0) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "launchInComingCardAsync: " + i17 + " : " + a17 + " : " + j18 + " : " + j19 + " : " + str + " : " + stringArrayToList + " : " + z17);
            if (a17 == er4.r.MP_ROOM_TYPE_MULTI_TALK || a17 == er4.r.MP_ROOM_TYPE_TRANS_MUTLTI) {
                com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent = new com.tencent.mm.autogen.events.MultiTalkActionEvent();
                multiTalkActionEvent.f54504g.f6259a = 3;
                multiTalkActionEvent.e();
            }
            jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (a17 == null) {
                a17 = er4.r.MP_ROOM_TYPE_VIDEO;
            }
            oVar.L5(context, i17, a17, j18, j19, str, stringArrayToList, z17);
            r0Var.f265104w = 2;
            r0Var.f265105x = j18;
            r0Var.f265106y = j19;
            r0Var.f265107z = false;
            fo5.z zVar = r0Var.G;
            zVar.getClass();
            zVar.f265157a = r0Var;
            ro5.b bVar = r0Var.f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.j(zVar);
            r0Var.f265103v = true;
            boolean z18 = com.tencent.mm.ui.tools.ld.f210556a;
            com.tencent.mm.ui.tools.ld.f210556a = true;
            fo5.q0 observer = r0Var.H;
            kotlin.jvm.internal.o.g(observer, "observer");
            java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mm.ui.tools.ld.f210557b;
            if (!arrayList.contains(observer)) {
                arrayList.add(observer);
            }
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).c2(j17);
        }
    }

    public void ZIDL_FV(long j17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).o2(j17);
        }
    }

    public void ZIDL_GBV(long j17) {
        ((fo5.f3) this.f177201a).getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.a3(null), 3, null);
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).V1(j17);
        }
    }

    public void ZIDL_GV(long j17, byte[] bArr, boolean z17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).i2(j17);
        }
    }

    public void ZIDL_HBV(long j17, int i17, long j18) {
        er4.r a17 = er4.r.a(i17);
        ((fo5.f3) this.f177201a).getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.b3(a17, j18, null), 3, null);
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).X1(j17);
        }
    }

    public void ZIDL_HV(long j17, byte[][] bArr) {
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(er4.m.f256121o, bArr);
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).m2(j17);
        }
    }

    public void ZIDL_IBV(long j17, int i17) {
        boolean z17;
        er4.r a17 = er4.r.a(i17);
        ((fo5.f3) this.f177201a).getClass();
        if (fo5.f3.f264986c != null) {
            if (a17 != null) {
                ((jp5.o) i95.n0.c(jp5.o.class)).we(a17);
            }
            z17 = true;
        } else {
            z17 = false;
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).b2(j17, z17);
        }
    }

    public void ZIDL_IV(long j17, byte[][] bArr) {
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(er4.m.f256121o, bArr);
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).m2(j17);
        }
    }

    public void ZIDL_JBV(long j17, byte[][] bArr, byte[] bArr2) {
        java.util.ArrayList<java.lang.String> stringArrayToList = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            android.app.Activity o17 = ((fo5.r0) aVar).o();
            if (stringArrayToList != null && o17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "before add member is " + stringArrayToList);
                eo5.a aVar2 = new eo5.a();
                aVar2.f255593a = str;
                ((androidx.fragment.app.FragmentActivity) o17).getActivityResultRegistry().e("MicroMsg.VoIPMP.CoreV2", aVar2, new fo5.v(stringArrayToList)).a(stringArrayToList, null);
            }
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).a2(j17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ZIDL_JV(long r24, boolean r26, int r27, int r28, int r29, byte[] r30, byte[] r31, byte[][] r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB.ZIDL_JV(long, boolean, int, int, int, byte[], byte[], byte[][], int, int, int):void");
    }

    public void ZIDL_KBV(long j17, byte[] bArr, int i17) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        er4.r a17 = er4.r.a(i17);
        ((fo5.f3) this.f177201a).getClass();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.c3(str, a17, null), 3, null);
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).e2(j17);
        }
    }

    public void ZIDL_KV(long j17, byte[][] bArr) {
        java.util.ArrayList mmpbListUnSerializeFromBasic = com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(er4.m.f256121o, bArr);
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            ro5.b bVar = ((fo5.r0) aVar).f265097p;
            if (bVar == null) {
                kotlin.jvm.internal.o.o("renderController");
                throw null;
            }
            bVar.q(mmpbListUnSerializeFromBasic);
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).j2(j17);
        }
    }

    public void ZIDL_LBV(long j17) {
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            gp5.e eVar = ((fo5.r0) aVar).f265089h;
            com.tencent.mm.ui.widget.dialog.z2 z2Var = eVar.f274466g;
            if (z2Var != null) {
                z2Var.B();
            }
            eVar.f274466g = null;
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).Z1(j17);
        }
    }

    public void ZIDL_LV(long j17, boolean z17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).l2(j17);
        }
    }

    public void ZIDL_MBV(long j17, byte[] bArr, byte[] bArr2) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        er4.e eVar = (er4.e) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(er4.e.f256072h, bArr2);
        ((fo5.f3) this.f177201a).getClass();
        if (fo5.f3.f264986c != null) {
            if (str.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.VoIPMP.CoreV2", "updateBannerInfo: groupname is null");
            } else {
                com.tencent.mm.plugin.multitalk.model.y yVar = (com.tencent.mm.plugin.multitalk.model.y) i95.n0.c(com.tencent.mm.plugin.multitalk.model.y.class);
                if (yVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.CoreV2", "updateBannerInfo: IMultiTalkRoomMgr service not found");
                } else {
                    yVar.Ld(str, eVar);
                }
            }
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).B2(j17);
        }
    }

    public void ZIDL_MV(long j17, int i17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).Y1(j17);
        }
    }

    public void ZIDL_NBV(long j17) {
        this.f177201a.getClass();
    }

    public void ZIDL_NV(long j17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).s2(j17);
        }
    }

    public void ZIDL_OV(long j17, boolean z17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).S1(j17);
        }
    }

    public void ZIDL_PV(long j17, byte[] bArr) {
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((fo5.f3) this.f177201a).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            fo5.r0 r0Var = (fo5.r0) aVar;
            if (kotlin.jvm.internal.o.b(r0Var.f265095n.f320216c.f301242k, str)) {
                r0Var.f265095n.f320214a = new fo5.l0(r0Var, false);
            }
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).h2(j17);
        }
    }

    public void ZIDL_QV(long j17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).U1(j17);
        }
    }

    public void ZIDL_RV(long j17, int i17, int i18, byte[] bArr, int i19) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).g2(j17);
        }
    }

    public void ZIDL_SV(long j17, boolean z17, boolean z18) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).f2(j17);
        }
    }

    public void ZIDL_TV(long j17, long j18, byte[] bArr) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).k2(j17);
        }
    }

    public void ZIDL_UV(long j17, int i17) {
        er4.h hVar;
        com.tencent.mm.plugin.voipmp.platform.z0 z0Var = this.f177201a;
        switch (i17) {
            case 0:
                hVar = er4.h.VOIPMP_FINISH_REASON_UNKNOWN;
                break;
            case 1:
                hVar = er4.h.VOIPMP_FINISH_REASON_ERROR;
                break;
            case 2:
                hVar = er4.h.VOIPMP_FINISH_REASON_INVITE_TIMEOUT;
                break;
            case 3:
                hVar = er4.h.VOIPMP_FINISH_REASON_CANCEL;
                break;
            case 4:
                hVar = er4.h.VOIPMP_FINISH_REASON_REJECT;
                break;
            case 5:
                hVar = er4.h.VOIPMP_FINISH_REASON_ANOTHER_REJECT;
                break;
            case 6:
                hVar = er4.h.VOIPMP_FINISH_REASON_BUSY;
                break;
            case 7:
                hVar = er4.h.VOIPMP_FINISH_REASON_ANOTHER_HANGUP;
                break;
            case 8:
                hVar = er4.h.VOIPMP_FINISH_REASON_ANOTHER_CANCEL;
                break;
            default:
                hVar = null;
                break;
        }
        ((fo5.f3) z0Var).getClass();
        fo5.a aVar = fo5.f3.f264986c;
        if (aVar != null) {
            fo5.r0 r0Var = (fo5.r0) aVar;
            if (r0Var.p() && !r0Var.B) {
                if (r0Var.f265107z) {
                    if (r0Var.f265104w >= 4) {
                        long j18 = r0Var.f265105x;
                        long j19 = r0Var.f265106y;
                        long j27 = r0Var.f265083b.f256166d;
                        boolean a17 = r0Var.a();
                        boolean z17 = r0Var.B;
                        boolean z18 = r0Var.f265107z;
                        com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                        voIPShortcutAnswerReportStruct.f61673d = j18;
                        voIPShortcutAnswerReportStruct.f61674e = j19;
                        voIPShortcutAnswerReportStruct.f61675f = (int) j27;
                        voIPShortcutAnswerReportStruct.f61676g = a17 ? 1 : 0;
                        voIPShortcutAnswerReportStruct.f61677h = z17 ? 1 : 0;
                        voIPShortcutAnswerReportStruct.f61678i = z18 ? 6 : 1;
                        voIPShortcutAnswerReportStruct.o();
                        voIPShortcutAnswerReportStruct.k();
                    } else {
                        long j28 = r0Var.f265105x;
                        long j29 = r0Var.f265106y;
                        long j37 = r0Var.f265083b.f256166d;
                        boolean a18 = r0Var.a();
                        boolean z19 = r0Var.B;
                        com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                        voIPShortcutAnswerReportStruct2.f61673d = j28;
                        voIPShortcutAnswerReportStruct2.f61674e = j29;
                        voIPShortcutAnswerReportStruct2.f61675f = (int) j37;
                        voIPShortcutAnswerReportStruct2.f61676g = a18 ? 1 : 0;
                        voIPShortcutAnswerReportStruct2.f61677h = z19 ? 1 : 0;
                        voIPShortcutAnswerReportStruct2.f61678i = 5;
                        voIPShortcutAnswerReportStruct2.o();
                        voIPShortcutAnswerReportStruct2.k();
                    }
                } else if (r0Var.f265104w >= 4) {
                    long j38 = r0Var.f265105x;
                    long j39 = r0Var.f265106y;
                    long j47 = r0Var.f265083b.f256166d;
                    boolean a19 = r0Var.a();
                    boolean z27 = r0Var.B;
                    boolean z28 = r0Var.f265107z;
                    com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct3 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                    voIPShortcutAnswerReportStruct3.f61673d = j38;
                    voIPShortcutAnswerReportStruct3.f61674e = j39;
                    voIPShortcutAnswerReportStruct3.f61675f = (int) j47;
                    voIPShortcutAnswerReportStruct3.f61676g = a19 ? 1 : 0;
                    voIPShortcutAnswerReportStruct3.f61677h = z27 ? 1 : 0;
                    voIPShortcutAnswerReportStruct3.f61678i = z28 ? 6 : 1;
                    voIPShortcutAnswerReportStruct3.o();
                    voIPShortcutAnswerReportStruct3.k();
                } else {
                    int i18 = hVar == null ? -1 : fo5.g.f264988b[hVar.ordinal()];
                    if (i18 == 1) {
                        long j48 = r0Var.f265105x;
                        long j49 = r0Var.f265106y;
                        long j57 = r0Var.f265083b.f256166d;
                        boolean a27 = r0Var.a();
                        boolean z29 = r0Var.f265107z;
                        com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct4 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                        voIPShortcutAnswerReportStruct4.f61673d = j48;
                        voIPShortcutAnswerReportStruct4.f61674e = j49;
                        voIPShortcutAnswerReportStruct4.f61675f = (int) j57;
                        voIPShortcutAnswerReportStruct4.f61676g = a27 ? 1 : 0;
                        voIPShortcutAnswerReportStruct4.f61678i = z29 ? 4 : 3;
                        voIPShortcutAnswerReportStruct4.o();
                        voIPShortcutAnswerReportStruct4.k();
                    } else if (i18 == 2) {
                        long j58 = r0Var.f265105x;
                        long j59 = r0Var.f265106y;
                        long j66 = r0Var.f265083b.f256166d;
                        boolean a28 = r0Var.a();
                        boolean z37 = r0Var.B;
                        com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct voIPShortcutAnswerReportStruct5 = new com.tencent.mm.autogen.mmdata.rpt.VoIPShortcutAnswerReportStruct();
                        voIPShortcutAnswerReportStruct5.f61673d = j58;
                        voIPShortcutAnswerReportStruct5.f61674e = j59;
                        voIPShortcutAnswerReportStruct5.f61675f = (int) j66;
                        voIPShortcutAnswerReportStruct5.f61676g = a28 ? 1 : 0;
                        voIPShortcutAnswerReportStruct5.f61677h = z37 ? 1 : 0;
                        voIPShortcutAnswerReportStruct5.f61678i = 2;
                        voIPShortcutAnswerReportStruct5.o();
                        voIPShortcutAnswerReportStruct5.k();
                    }
                }
            }
            r0Var.f265104w = 5;
            r0Var.l();
            r0Var.f265104w = 0;
            r0Var.f265105x = 0L;
            r0Var.f265106y = 0L;
            r0Var.f265107z = false;
            r0Var.A = false;
            r0Var.B = false;
            r0Var.C = false;
            r0Var.D = false;
            r0Var.f265103v = false;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new fo5.l(r0Var, null), 3, null);
            nq4.e.f339012e.set(false);
            boolean z38 = com.tencent.mm.ui.tools.ld.f210556a;
            com.tencent.mm.ui.tools.ld.f210556a = false;
            fo5.q0 observer = r0Var.H;
            kotlin.jvm.internal.o.g(observer, "observer");
            ((java.util.ArrayList) com.tencent.mm.ui.tools.ld.f210557b).remove(observer);
            r0Var.f265102u = false;
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).R1(j17);
        }
    }

    public void ZIDL_VV(long j17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).W1(j17);
        }
    }

    public void ZIDL_WV(long j17, int i17, int i18, byte[] bArr) {
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).w2(j17);
        }
    }

    public void ZIDL_XV(long j17, boolean z17) {
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).y2(j17);
        }
    }

    public void ZIDL_YV(long j17, byte[][] bArr) {
        com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        ((fo5.f3) this.f177201a).getClass();
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).x2(j17);
        }
    }

    public void ZIDL_ZV(long j17, byte[] bArr) {
        java.lang.String string;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((fo5.f3) this.f177201a).getClass();
        if (fo5.f3.f264986c != null) {
            qo5.b.f365663a.a();
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.setType(50);
            f9Var.e1(java.lang.System.currentTimeMillis());
            f9Var.r1(6);
            f9Var.j1(2);
            f9Var.u1(str);
            if (ip.b.a()) {
                string = "[" + com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mdh) + ']';
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mdi);
                kotlin.jvm.internal.o.d(string);
            }
            f9Var.d1(string);
            c01.m8 m8Var = ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d;
            kotlin.jvm.internal.o.e(m8Var, "null cannot be cast to non-null type com.tencent.mm.model.IOnNewMsgNotify");
            ((c01.v8) m8Var).a(f9Var);
        }
        com.tencent.mm.plugin.voipmp.platform.y0 y0Var = fo5.f3.f264984a;
        if (y0Var != null) {
            ((com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMB) y0Var).T1(j17);
        }
    }

    public void a2(long j17) {
        ZIDL_JBX(this.nativeHandler, j17);
    }

    public void b2(long j17, boolean z17) {
        ZIDL_IBX(this.nativeHandler, j17, z17);
    }

    public void c2(long j17) {
        ZIDL_FBX(this.nativeHandler, j17);
    }

    public void d2(long j17) {
        ZIDL_EBX(this.nativeHandler, j17);
    }

    public void e2(long j17) {
        ZIDL_KBX(this.nativeHandler, j17);
    }

    public void f2(long j17) {
        ZIDL_SX(this.nativeHandler, j17);
    }

    public void g2(long j17) {
        ZIDL_RX(this.nativeHandler, j17);
    }

    public void h2(long j17) {
        ZIDL_PX(this.nativeHandler, j17);
    }

    public void i2(long j17) {
        ZIDL_GX(this.nativeHandler, j17);
    }

    public void j2(long j17) {
        ZIDL_KX(this.nativeHandler, j17);
    }

    public void k2(long j17) {
        ZIDL_TX(this.nativeHandler, j17);
    }

    public void l2(long j17) {
        ZIDL_LX(this.nativeHandler, j17);
    }

    public void m2(long j17) {
        ZIDL_HX(this.nativeHandler, j17);
    }

    public void n2(long j17) {
        ZIDL_JX(this.nativeHandler, j17);
    }

    public void o2(long j17) {
        ZIDL_FX(this.nativeHandler, j17);
    }

    public void p2(long j17) {
        ZIDL_EX(this.nativeHandler, j17);
    }

    public void q2(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }

    public void r2(long j17) {
        ZIDL_DBX(this.nativeHandler, j17);
    }

    public void s2(long j17) {
        ZIDL_NX(this.nativeHandler, j17);
    }

    public void t2(long j17) {
        ZIDL_ABX(this.nativeHandler, j17);
    }

    public void u2(long j17) {
        ZIDL_CBX(this.nativeHandler, j17);
    }

    public void v2(long j17) {
        ZIDL_BBX(this.nativeHandler, j17);
    }

    public void w2(long j17) {
        ZIDL_WX(this.nativeHandler, j17);
    }

    public void x2(long j17) {
        ZIDL_YX(this.nativeHandler, j17);
    }

    public void y2(long j17) {
        ZIDL_XX(this.nativeHandler, j17);
    }

    public void z2(long j17) {
        ZIDL_DX(this.nativeHandler, j17);
    }
}
