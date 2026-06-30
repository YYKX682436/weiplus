package com.tencent.wechat.aff.chatbot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class ZIDL_OtOYwmlmK {
    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_ABX(java.lang.Object obj, int i17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_ACX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_AX(java.lang.Object obj) {
        ((wx.l) ((com.tencent.wechat.aff.chatbot.r0) obj)).getClass();
        com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "attachNativeControllerAsync complete");
    }

    private void ZIDL_CBX(java.lang.Object obj, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.chatbot.d0.f216136o, bArr);
        throw null;
    }

    private void ZIDL_CX(java.lang.Object obj, int i17) {
        yz5.l lVar = ((hy.b) ((com.tencent.wechat.aff.chatbot.s0) obj)).f285727a;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17));
        }
    }

    private void ZIDL_FBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_KX(java.lang.Object obj) {
        ((wx.n) ((com.tencent.wechat.aff.chatbot.v0) obj)).getClass();
        com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "releaseAffAsync complete");
    }

    private void ZIDL_OX(java.lang.Object obj, int i17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_PX(java.lang.Object obj, int i17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_QX(java.lang.Object obj) {
        ((wx.m) ((com.tencent.wechat.aff.chatbot.t0) obj)).getClass();
        com.tencent.mars.xlog.Log.i("ChatBotIamCoreCenter", "fetchChatBotRoomInfoAsync complete");
    }

    private void ZIDL_SBX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_TBX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_UBX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_UX(java.lang.Object obj, int i17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_VBX(java.lang.Object obj, boolean z17, byte[] bArr, byte[] bArr2) {
        android.support.v4.media.f.a(obj);
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        throw null;
    }

    private void ZIDL_VX(java.lang.Object obj, int i17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_WBX(java.lang.Object obj, int i17, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        throw null;
    }

    private void ZIDL_WX(java.lang.Object obj, int i17, byte[][] bArr, byte[][] bArr2) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.bytesArrayToList(bArr);
        com.tencent.wechat.zidl2.ZidlUtil.bytesArrayToList(bArr2);
        throw null;
    }

    private void ZIDL_XBX(java.lang.Object obj, boolean z17) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_XX(java.lang.Object obj, byte[][] bArr) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.bytesArrayToList(bArr);
        throw null;
    }

    private void ZIDL_YBX(java.lang.Object obj) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_YX(java.lang.Object obj, byte[] bArr) {
        android.support.v4.media.f.a(obj);
        throw null;
    }

    private void ZIDL_ZBX(java.lang.Object obj, byte[] bArr) {
        com.tencent.wechat.aff.chatbot.m mVar = (com.tencent.wechat.aff.chatbot.m) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.chatbot.m.f216371m, bArr);
        ay.k kVar = (ay.k) ((com.tencent.wechat.aff.chatbot.u0) obj);
        ay.l lVar = kVar.f15158a;
        java.lang.String str = lVar.f15150e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(" startPullQueryList  roomUvCount:");
        sb6.append(mVar.f216375g);
        sb6.append("，resp items.size:");
        java.util.LinkedList linkedList = mVar.f216374f;
        sb6.append(linkedList.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (lVar.f15169w == -1) {
            lVar.f15169w = mVar.f216375g;
        }
        int i17 = mVar.f216375g;
        if (i17 != lVar.f15162p) {
            lVar.f15162p = i17;
            lVar.R6();
        }
        androidx.lifecycle.j0 j0Var = lVar.f15165s;
        java.lang.String b17 = mVar.b();
        kotlin.jvm.internal.o.f(b17, "getAnsweringTraceid(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        boolean z17 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.wechat.aff.chatbot.l lVar2 = (com.tencent.wechat.aff.chatbot.l) it.next();
            if (android.text.TextUtils.equals(lVar2.b(), mVar.b()) && lVar2.f216346i) {
                z17 = true;
            }
            boolean z18 = lVar2.f216347m;
            java.lang.String string = z18 ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n4m) : "";
            kotlin.jvm.internal.o.d(string);
            boolean[] zArr = lVar2.f216349o;
            java.lang.String str2 = zArr[2] ? lVar2.f216342e : "";
            kotlin.jvm.internal.o.f(str2, "getPersonName(...)");
            if (str2.length() > 6) {
                str2 = r26.p0.E0(str2, 6).concat("...");
            }
            lVar2.f216342e = str2;
            zArr[2] = true;
            arrayList.add(new zx.u(z18, string, false, lVar2, 4, null));
        }
        j0Var.postValue(new ay.w(b17, kotlin.jvm.internal.m0.b(arrayList)));
        if ((!linkedList.isEmpty()) && !android.text.TextUtils.equals(lVar.f15168v, mVar.b())) {
            boolean isEmpty = android.text.TextUtils.isEmpty(mVar.b());
            androidx.lifecycle.j0 j0Var2 = lVar.f15164r;
            xx.y yVar = lVar.f15160n;
            if (isEmpty) {
                j0Var2.postValue(java.lang.Boolean.FALSE);
                xx.e eVar = xx.e.f457784e;
                boolean z19 = lVar.f15167u;
                java.lang.String str3 = lVar.f15168v;
                yVar.f(eVar, z19, str3 != null ? str3 : "");
                yVar.f457840m.f457847e = 0;
            } else {
                if (!lVar.f15170x) {
                    ((gy.c) ((jz5.n) lVar.f15151f).getValue()).e();
                }
                j0Var2.postValue(java.lang.Boolean.TRUE);
                java.lang.String b18 = mVar.b();
                kotlin.jvm.internal.o.f(b18, "getAnsweringTraceid(...)");
                yVar.getClass();
                com.tencent.mars.xlog.Log.i("ChatBotBrandDataReporter", "reportAISpeakBegin");
                yVar.f457831d = c01.id.a();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("ai_voice_chat_model_speak_start", yVar.a(yVar.f457837j, new xx.k(yVar, z17, b18)), 36708);
                xx.z zVar = yVar.f457840m;
                zVar.f457849g++;
                zVar.f457847e = 1;
                if (z17) {
                    zVar.f457848f++;
                }
            }
        }
        if (kVar.f15159b) {
            kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(lVar), null, null, new ay.j(lVar, null), 3, null);
        }
        lVar.f15168v = mVar.b();
        lVar.f15167u = z17;
    }

    private void ZIDL_ZX(java.lang.Object obj, byte[][] bArr, int i17) {
        android.support.v4.media.f.a(obj);
        com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(com.tencent.wechat.aff.chatbot.d0.f216136o, bArr);
        throw null;
    }

    public native void ZIDL_ABV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_ACV(long j17, java.lang.Object obj, int i17, int i18, byte[] bArr);

    public native void ZIDL_AV(long j17, java.lang.Object obj, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2);

    public native byte[] ZIDL_B(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, byte[] bArr4, byte[] bArr5, int i18, byte[] bArr6);

    public native void ZIDL_BB(long j17, int i17, int i18);

    public native int ZIDL_BC(long j17);

    public native void ZIDL_CBV(long j17, java.lang.Object obj, int i17, int i18);

    public native byte[] ZIDL_CC(long j17);

    public native void ZIDL_CV(long j17, java.lang.Object obj, int i17, int i18, byte[] bArr);

    public native int ZIDL_D(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    public native void ZIDL_DB(long j17, byte[] bArr);

    public native void ZIDL_DC(long j17, int i17);

    public native int ZIDL_E(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    public native boolean ZIDL_EB(long j17);

    public native void ZIDL_EC(long j17, byte[] bArr, byte[] bArr2);

    public native int ZIDL_F(long j17, java.nio.ByteBuffer byteBuffer, int i17, int i18, byte[] bArr);

    public native void ZIDL_FBV(long j17, java.lang.Object obj);

    public native void ZIDL_FC(long j17, byte[] bArr);

    public native void ZIDL_G(long j17, byte[] bArr, int i17);

    public native byte[] ZIDL_GB(long j17);

    public native byte[] ZIDL_H(long j17);

    public native void ZIDL_HB(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native void ZIDL_I(long j17, byte[] bArr, int i17, byte[] bArr2, byte[] bArr3);

    public native void ZIDL_IB(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, byte[] bArr4);

    public native void ZIDL_J(long j17);

    public native void ZIDL_JB(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native void ZIDL_KB(long j17, float f17, float f18, boolean z17, byte[] bArr, byte[] bArr2, byte[] bArr3);

    public native void ZIDL_KV(long j17, java.lang.Object obj);

    public native byte[] ZIDL_L(long j17, byte[] bArr);

    public native void ZIDL_LB(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4);

    public native byte[][] ZIDL_M(long j17);

    public native void ZIDL_MB(long j17, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i17);

    public native byte[] ZIDL_N(long j17, int i17);

    public native void ZIDL_NB(long j17, int i17, byte[] bArr);

    public native void ZIDL_OB(long j17, int i17, boolean z17);

    public native void ZIDL_OV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2);

    public native void ZIDL_OtOYwmlmC(java.lang.Object obj, java.lang.String str, java.lang.String str2);

    public native void ZIDL_PB(long j17, byte[] bArr, int i17, byte[] bArr2);

    public native void ZIDL_PV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, int i17, byte[] bArr);

    public native double ZIDL_QB(long j17, double[] dArr, byte[][] bArr, double[] dArr2);

    public native void ZIDL_QV(long j17, java.lang.Object obj);

    public native void ZIDL_R(long j17, int i17);

    public native byte[] ZIDL_RB(long j17, byte[] bArr);

    public native byte[] ZIDL_S(long j17);

    public native void ZIDL_SBV(long j17, java.lang.Object obj, byte[] bArr, long j18, byte[] bArr2, int i17, int i18, long j19, long j27, byte[] bArr3);

    public native void ZIDL_T(long j17, byte[] bArr);

    public native void ZIDL_TBV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_UBV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_UV(long j17, java.lang.Object obj, byte[] bArr, byte[] bArr2, byte[] bArr3, int i17, byte[] bArr4, byte[] bArr5);

    public native void ZIDL_VBV(long j17, java.lang.Object obj, byte[] bArr, int i17);

    public native void ZIDL_VV(long j17, java.lang.Object obj, java.nio.ByteBuffer byteBuffer, byte[] bArr);

    public native void ZIDL_WBV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_WV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_XBV(long j17, java.lang.Object obj, int i17);

    public native void ZIDL_XV(long j17, java.lang.Object obj);

    public native void ZIDL_YBV(long j17, java.lang.Object obj, byte[][] bArr);

    public native void ZIDL_YV(long j17, java.lang.Object obj, long j18);

    public native void ZIDL_ZBV(long j17, java.lang.Object obj, byte[] bArr);

    public native void ZIDL_ZV(long j17, java.lang.Object obj, long j18, int i17, int i18);
}
