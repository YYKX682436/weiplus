package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f136115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f136116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f136117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(java.lang.Class cls, java.lang.Class cls2, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f136115d = cls;
        this.f136116e = cls2;
        this.f136117f = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Class cls;
        mk4.b renderView;
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Class cls2 = this.f136115d;
        if ((cls2 == null || cls2.isAssignableFrom(it.getClass())) && (cls = this.f136116e) != null) {
            java.lang.Class<?> cls3 = null;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = it instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) it : null;
            if (finderThumbPlayerProxy != null && (renderView = finderThumbPlayerProxy.getRenderView()) != null) {
                cls3 = renderView.getClass();
            }
            if (cls.isAssignableFrom(cls3)) {
                this.f136117f.f310116d++;
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
