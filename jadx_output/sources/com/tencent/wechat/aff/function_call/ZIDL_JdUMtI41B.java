package com.tencent.wechat.aff.function_call;

/* loaded from: classes15.dex */
class ZIDL_JdUMtI41B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.function_call.c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.function_call.d f216885a;

    public ZIDL_JdUMtI41B(java.lang.Object obj) {
        com.tencent.wechat.aff.function_call.d dVar = (com.tencent.wechat.aff.function_call.d) obj;
        this.f216885a = dVar;
        ey.q qVar = (ey.q) dVar;
        qVar.getClass();
        qVar.f257284e = this;
    }

    private native void ZIDL_AX(long j17, long j18, boolean z17);

    private native void ZIDL_BX(long j17, long j18, boolean z17);

    private native void ZIDL_CX(long j17, long j18, byte[] bArr);

    private native void ZIDL_DX(long j17, long j18, byte[] bArr);

    public void Q1(long j17, java.lang.String str) {
        ZIDL_CX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void R1(long j17, java.lang.String str) {
        ZIDL_DX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void S1(long j17, boolean z17) {
        ZIDL_BX(this.nativeHandler, j17, z17);
    }

    public void T1(long j17, boolean z17) {
        ZIDL_AX(this.nativeHandler, j17, z17);
    }

    public void ZIDL_AV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.function_call.o notification = (com.tencent.wechat.aff.function_call.o) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.function_call.o.f216905i, bArr);
        ey.q qVar = (ey.q) this.f216885a;
        qVar.getClass();
        kotlin.jvm.internal.o.g(notification, "notification");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyFunctionCallStartAsync ");
        boolean[] zArr = notification.f216910h;
        sb6.append(zArr[2] ? notification.f216907e : "");
        sb6.append(' ');
        sb6.append(zArr[3] ? notification.f216908f : "");
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", sb6.toString());
        java.util.HashMap hashMap = qVar.f257285f;
        java.lang.String str = zArr[2] ? notification.f216907e : "";
        kotlin.jvm.internal.o.f(str, "getModuleName(...)");
        java.lang.String str2 = zArr[3] ? notification.f216908f : "";
        kotlin.jvm.internal.o.f(str2, "getFunctionName(...)");
        if (hashMap.containsKey(qVar.Ai(str, str2))) {
            java.lang.String str3 = zArr[2] ? notification.f216907e : "";
            kotlin.jvm.internal.o.f(str3, "getModuleName(...)");
            java.lang.String str4 = zArr[3] ? notification.f216908f : "";
            kotlin.jvm.internal.o.f(str4, "getFunctionName(...)");
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(qVar.Ai(str3, str4));
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ey.t) it.next()).c(notification);
                }
            }
        }
        com.tencent.wechat.aff.function_call.c cVar = qVar.f257284e;
        if (cVar != null) {
            ((com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41B) cVar).T1(j17, true);
        }
    }

    public void ZIDL_BV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.function_call.e notification = (com.tencent.wechat.aff.function_call.e) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.function_call.e.f216889m, bArr);
        ey.q qVar = (ey.q) this.f216885a;
        qVar.getClass();
        kotlin.jvm.internal.o.g(notification, "notification");
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "notifyFunctionCallEndAsync");
        java.util.HashMap hashMap = qVar.f257286g;
        boolean[] zArr = notification.f216895i;
        java.lang.String str = zArr[2] ? notification.f216891e : "";
        kotlin.jvm.internal.o.f(str, "getModuleName(...)");
        java.lang.String str2 = zArr[3] ? notification.f216892f : "";
        kotlin.jvm.internal.o.f(str2, "getFunctionName(...)");
        if (hashMap.containsKey(qVar.Ai(str, str2))) {
            java.lang.String str3 = zArr[2] ? notification.f216891e : "";
            kotlin.jvm.internal.o.f(str3, "getModuleName(...)");
            java.lang.String str4 = zArr[3] ? notification.f216892f : "";
            kotlin.jvm.internal.o.f(str4, "getFunctionName(...)");
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(qVar.Ai(str3, str4));
            if (arrayList != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ey.k) it.next()).c(notification);
                }
            }
        }
        com.tencent.wechat.aff.function_call.c cVar = qVar.f257284e;
        if (cVar != null) {
            ((com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41B) cVar).S1(j17, true);
        }
    }

    public void ZIDL_CV(long j17) {
        ey.q qVar = (ey.q) this.f216885a;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "getFunctionProtocolPathAsync");
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.io.File file = new java.io.File(context.getCacheDir(), "FunctionCall.protocol");
            if (!file.exists()) {
                java.io.InputStream open = context.getAssets().open("FunctionCall.protocol");
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                    try {
                        kotlin.jvm.internal.o.d(open);
                        vz5.a.b(open, fileOutputStream, 0, 2, null);
                        vz5.b.a(fileOutputStream, null);
                        vz5.b.a(open, null);
                        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "getFunctionProtocolPathAsync copied to: " + file.getAbsolutePath());
                    } finally {
                    }
                } finally {
                }
            }
            com.tencent.wechat.aff.function_call.c cVar = qVar.f257284e;
            if (cVar != null) {
                ((com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41B) cVar).Q1(j17, file.getAbsolutePath());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FunctionCallService", "getFunctionProtocolPathAsync failed: " + e17.getMessage());
            com.tencent.wechat.aff.function_call.c cVar2 = qVar.f257284e;
            if (cVar2 != null) {
                ((com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41B) cVar2).Q1(j17, "");
            }
        }
    }

    public void ZIDL_DV(long j17) {
        ey.q qVar = (ey.q) this.f216885a;
        qVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCallService", "getProtocolTempDirAsync");
        java.lang.String absolutePath = com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath();
        com.tencent.wechat.aff.function_call.c cVar = qVar.f257284e;
        if (cVar != null) {
            ((com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41B) cVar).R1(j17, absolutePath);
        }
    }
}
