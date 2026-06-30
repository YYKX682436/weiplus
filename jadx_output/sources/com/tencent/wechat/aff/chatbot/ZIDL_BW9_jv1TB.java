package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
class ZIDL_BW9_jv1TB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.h0 f216052a;

    private native void ZIDL_AX(long j17, long j18);

    public void ZIDL_AV(long j17, byte[][] bArr) {
        com.tencent.wechat.aff.chatbot.h0 h0Var = this.f216052a;
        java.util.ArrayList<java.lang.String> stringArrayToList = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(bArr);
        ((wx.o) h0Var).getClass();
        for (hy.a0 a0Var : hy.b0.f285728a.a()) {
            a0Var.f285724d.post(new hy.d(a0Var, stringArrayToList));
        }
    }

    public byte[] ZIDL_B() {
        ((wx.o) this.f216052a).getClass();
        com.tencent.wechat.aff.chatbot.i0 i0Var = com.tencent.wechat.aff.chatbot.i0.f216265y;
        wo.s1 s1Var = wo.t1.f447800a;
        i0Var.f216266d = s1Var.a();
        boolean[] zArr = i0Var.f216283x;
        zArr[1] = true;
        i0Var.f216267e = wo.r.a();
        zArr[2] = true;
        i0Var.f216268f = com.tencent.mm.sdk.platformtools.t8.P(wo.r.e(), 0);
        zArr[3] = true;
        i0Var.f216269g = s1Var.b();
        zArr[4] = true;
        i0Var.f216270h = lp0.b.X() + "/ilink";
        zArr[5] = true;
        i0Var.f216271i = android.os.Build.VERSION.INCREMENTAL;
        zArr[6] = true;
        i0Var.f216272m = wo.w0.m();
        zArr[7] = true;
        i0Var.f216273n = android.os.Build.DISPLAY;
        zArr[8] = true;
        i0Var.f216274o = android.os.Build.VERSION.RELEASE;
        zArr[9] = true;
        i0Var.f216275p = android.os.Build.MANUFACTURER;
        zArr[10] = true;
        i0Var.f216276q = lp0.b.h() + "voip/Models";
        zArr[11] = true;
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a(wo.w0.g(false));
        kotlin.jvm.internal.o.f(a17, "getMD5String(...)");
        char[] charArray = a17.toCharArray();
        kotlin.jvm.internal.o.f(charArray, "toCharArray(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(charArray.length);
        for (char c17 : charArray) {
            arrayList.add(java.lang.Integer.valueOf(c17));
        }
        i0Var.f216277r.addAll(arrayList);
        zArr[12] = true;
        java.lang.String format = java.lang.String.format("0x%x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        i0Var.f216278s = format;
        zArr[13] = true;
        i0Var.f216279t = android.os.Build.VERSION.RELEASE;
        zArr[14] = true;
        return i0Var.toByteArrayOrNull();
    }

    public byte[] ZIDL_C() {
        ((wx.o) this.f216052a).getClass();
        return new com.tencent.wechat.aff.chatbot.f0().toByteArrayOrNull();
    }

    public byte[] ZIDL_D(int i17) {
        ((wx.o) this.f216052a).getClass();
        return java.lang.String.valueOf(i17).getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.chatbot.h0 h0Var = (com.tencent.wechat.aff.chatbot.h0) obj;
        this.f216052a = h0Var;
        h0Var.getClass();
    }
}
