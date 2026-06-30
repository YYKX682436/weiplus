package com.tencent.wemagic.common.zidl_gen;

/* loaded from: classes8.dex */
class ZIDL_xyzzHllyB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wemagic.common.zidl_gen.b f220068a;

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_HX(long j17, long j18);

    private native void ZIDL_IX(long j17, long j18);

    public void ZIDL_AV(long j17, long j18) {
        this.f220068a.getClass();
    }

    public void ZIDL_BV(long j17, java.lang.String str, long j18) {
        this.f220068a.getClass();
    }

    public void ZIDL_CV(long j17, java.lang.String str, long j18, float f17, float f18, float f19, float f27, int i17) {
        this.f220068a.getClass();
    }

    public void ZIDL_DV(long j17, java.lang.String str, long j18) {
        this.f220068a.getClass();
    }

    public void ZIDL_EV(long j17, java.lang.String str, long j18) {
        this.f220068a.getClass();
    }

    public void ZIDL_FV(long j17, long j18, java.lang.String apiName, java.lang.String apiData, long j19) {
        ((yw5.a) this.f220068a).getClass();
        kotlin.jvm.internal.o.g(apiName, "apiName");
        kotlin.jvm.internal.o.g(apiData, "apiData");
        zw5.a aVar = yw5.a.f467000a;
        aVar.getClass();
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) aVar.f476939a).get(java.lang.Long.valueOf(j18));
        com.tencent.wemagic.common.api.IMBJsAdaptor iMBJsAdaptor = weakReference != null ? (com.tencent.wemagic.common.api.IMBJsAdaptor) weakReference.get() : null;
        if (iMBJsAdaptor != null) {
            iMBJsAdaptor.invoke(apiName, apiData, j19);
            return;
        }
        java.lang.String concat = "fail:internal error ".concat("jsapi adapter not found");
        if (concat == null) {
            concat = "fail:internal error";
        }
        com.tencent.wemagic.common.zidl_gen.c.f220085b.d(j18, (int) j19, 4, concat, "");
    }

    public void ZIDL_GV(long j17, int i17, boolean z17) {
        this.f220068a.getClass();
    }

    public void ZIDL_HV(long j17, long j18, final java.lang.String str) {
        ((yw5.a) this.f220068a).getClass();
        vw5.b bVar = (vw5.b) yw5.a.f467001b.get(java.lang.Long.valueOf(j18));
        if (bVar != null) {
            if (str == null) {
                str = "";
            }
            final xw5.d dVar = (xw5.d) bVar;
            java.lang.String format = "onJsLog: ".concat(str);
            kotlin.jvm.internal.o.g(format, "format");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
            if (!(copyOf.length == 0)) {
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
            }
            kotlin.jvm.internal.o.d(format);
            com.tencent.wemagic.common.MBInitializer.f220064a.b(new java.lang.Runnable() { // from class: xw5.d$$d
                @Override // java.lang.Runnable
                public final void run() {
                    xw5.d this$0 = xw5.d.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    java.lang.String str2 = str;
                    kotlin.jvm.internal.o.g(str2, "$str");
                    if (this$0.f457755j && this$0.f457754i) {
                        this$0.c(str2);
                    } else {
                        this$0.f457752g.add(str2);
                    }
                }
            });
        }
    }

    public void ZIDL_IV(long j17, long j18, final boolean z17) {
        ((yw5.a) this.f220068a).getClass();
        vw5.b bVar = (vw5.b) yw5.a.f467001b.get(java.lang.Long.valueOf(j18));
        if (bVar != null) {
            final xw5.d dVar = (xw5.d) bVar;
            java.lang.String format = "onSwitch: " + z17;
            kotlin.jvm.internal.o.g(format, "format");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
            if (!(copyOf.length == 0)) {
                format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
            }
            kotlin.jvm.internal.o.d(format);
            com.tencent.wemagic.common.MBInitializer.f220064a.b(new java.lang.Runnable() { // from class: xw5.d$$b
                @Override // java.lang.Runnable
                public final void run() {
                    xw5.d this$0 = xw5.d.this;
                    kotlin.jvm.internal.o.g(this$0, "this$0");
                    boolean z18 = z17;
                    this$0.f457753h = z18;
                    if (!z18) {
                        this$0.b();
                    } else {
                        if (this$0.a()) {
                            return;
                        }
                        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
                        kotlin.jvm.internal.o.d(copyOf2.length == 0 ? "onSwitch, vconsole container not found" : java.lang.String.format("onSwitch, vconsole container not found", java.util.Arrays.copyOf(copyOf2, copyOf2.length)));
                    }
                }
            });
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wemagic.common.zidl_gen.b bVar = (com.tencent.wemagic.common.zidl_gen.b) obj;
        this.f220068a = bVar;
        bVar.getClass();
    }
}
