package com.tencent.wemagic.adframework.plugin.scl.zidl_gen;

/* loaded from: classes8.dex */
class ZIDL_ItEWxcf4B extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wemagic.adframework.plugin.scl.zidl_gen.a f220041a;

    private native void ZIDL_AX(long j17, long j18);

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_HX(long j17, long j18);

    private native void ZIDL_IX(long j17, long j18, int i17, int i18);

    public void ZIDL_AV(long j17, java.lang.String str, long j18) {
        this.f220041a.getClass();
    }

    public void ZIDL_BV(long j17, java.lang.String str, long j18) {
        tw5.a aVar;
        android.view.View aVar2;
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.d(str);
        nw5.b bVar = lw5.a.f321662a;
        bVar.getClass();
        java.lang.String format = "onCanvasViewCreate, frameSetId: " + str + ", canvasId: " + j18;
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        mw5.a aVar3 = (mw5.a) ((java.util.HashMap) bVar.f341031a).get(str);
        if (aVar3 == null || (aVar = ((nw5.a) aVar3).f341030e) == null) {
            return;
        }
        android.view.View view = aVar.f422489i;
        if (view != null && view != null) {
            aVar.removeView(view);
            aVar.f422489i = null;
        }
        android.content.Context context = aVar.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier mBCanvasSurfaceNotifier = new com.tencent.wemagic.common.component.MBCanvasSurfaceNotifier(aVar.f422484d);
        ww5.c type = aVar.f422487g;
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            aVar2 = new ww5.a(j18, mBCanvasSurfaceNotifier, context);
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            aVar2 = new ww5.b(j18, mBCanvasSurfaceNotifier, context);
        }
        aVar.f422489i = aVar2;
        aVar.addView(aVar2);
    }

    public void ZIDL_CV(long j17, java.lang.String str, long j18, float f17, float f18, float f19, float f27, int i17) {
        tw5.a aVar;
        android.view.View view;
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.d(str);
        int i18 = (int) f17;
        int i19 = (int) f18;
        int i27 = (int) f19;
        int i28 = (int) f27;
        nw5.b bVar = lw5.a.f321662a;
        bVar.getClass();
        java.lang.String format = "onCanvasViewLayout, frameSetId: " + str + ", canvasId: " + j18;
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        mw5.a aVar2 = (mw5.a) ((java.util.HashMap) bVar.f341031a).get(str);
        if (aVar2 == null || (aVar = ((nw5.a) aVar2).f341030e) == null || (view = aVar.f422489i) == null) {
            return;
        }
        float f28 = aVar.f422491n;
        view.layout(i18, i19, ((int) (i27 * f28)) + i18, ((int) (i28 * f28)) + i19);
    }

    public void ZIDL_DV(long j17, java.lang.String str, long j18) {
        tw5.a aVar;
        android.view.View view;
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.d(str);
        nw5.b bVar = lw5.a.f321662a;
        bVar.getClass();
        java.lang.String format = "onCanvasViewDestroy, frameSetId: " + str + ", canvasId: " + j18;
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        mw5.a aVar2 = (mw5.a) ((java.util.HashMap) bVar.f341031a).get(str);
        if (aVar2 == null || (aVar = ((nw5.a) aVar2).f341030e) == null || (view = aVar.f422489i) == null) {
            return;
        }
        aVar.removeView(view);
        aVar.f422489i = null;
    }

    public void ZIDL_EV(long j17, java.lang.String str, long j18) {
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.d(str);
        lw5.a.f321662a.getClass();
        java.lang.String format = "onCanvasFirstFrameRendered, viewId: " + str + ", canvasId: " + j18;
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
    }

    public void ZIDL_FV(long j17, java.lang.String frameSetId, java.lang.String rootId) {
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        kotlin.jvm.internal.o.g(rootId, "rootId");
        nw5.b bVar = lw5.a.f321662a;
        bVar.getClass();
        java.lang.String format = "onFrameSetViewBind, frameSetId: ".concat(frameSetId);
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        mw5.a aVar = (mw5.a) ((java.util.HashMap) bVar.f341031a).get(frameSetId);
        if (aVar != null) {
            nw5.a aVar2 = (nw5.a) aVar;
            tw5.a aVar3 = new tw5.a(aVar2.f341026a, rootId, frameSetId, aVar2.f341027b, null, 16, null);
            aVar3.setUpOnFrameSetViewBoundCallback(aVar2.f341029d);
            aVar2.f341028c.invoke(aVar3);
            aVar2.f341030e = aVar3;
        }
    }

    public void ZIDL_GV(long j17, java.lang.String str) {
        tw5.a aVar;
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.d(str);
        nw5.b bVar = lw5.a.f321662a;
        bVar.getClass();
        java.lang.String format = "onFrameSetViewUnBind, frameSetId: ".concat(str);
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        java.util.HashMap hashMap = (java.util.HashMap) bVar.f341031a;
        mw5.a aVar2 = (mw5.a) hashMap.get(str);
        if (aVar2 != null && (aVar = ((nw5.a) aVar2).f341030e) != null) {
            android.view.View view = aVar.f422489i;
            if (view != null) {
                aVar.removeView(view);
                aVar.f422489i = null;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.getParent();
            if (viewGroup != null && viewGroup.indexOfChild(aVar) != -1) {
                viewGroup.removeView(aVar);
            }
            aVar.f422488h = false;
        }
        hashMap.remove(str);
    }

    public void ZIDL_HV(long j17, java.lang.String str, int i17, int i18) {
        tw5.a aVar;
        ((lw5.a) this.f220041a).getClass();
        kotlin.jvm.internal.o.d(str);
        nw5.b bVar = lw5.a.f321662a;
        bVar.getClass();
        java.lang.String format = "onFrameSetViewResize, frameSetId: " + str + ", width: " + i17 + ", height: " + i18;
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(new java.lang.Object[0], 0);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        kotlin.jvm.internal.o.d(format);
        mw5.a aVar2 = (mw5.a) ((java.util.HashMap) bVar.f341031a).get(str);
        if (aVar2 == null || (aVar = ((nw5.a) aVar2).f341030e) == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        float f17 = aVar.f422491n;
        if (i17 > 0 && layoutParams.width != i17) {
            layoutParams.width = (int) (i17 * f17);
        }
        if (i18 > 0 && layoutParams.height != i18) {
            layoutParams.height = (int) (i18 * f17);
        }
        aVar.setLayoutParams(layoutParams);
        aVar.requestLayout();
    }

    public void ZIDL_IV(long j17, java.lang.String str) {
        ((lw5.a) this.f220041a).getClass();
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wemagic.adframework.plugin.scl.zidl_gen.a aVar = (com.tencent.wemagic.adframework.plugin.scl.zidl_gen.a) obj;
        this.f220041a = aVar;
        aVar.getClass();
    }
}
