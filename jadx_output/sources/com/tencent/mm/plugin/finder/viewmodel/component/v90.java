package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f136229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f136230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(java.lang.Class cls, kotlin.jvm.internal.f0 f0Var) {
        super(1);
        this.f136229d = cls;
        this.f136230e = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Class cls = this.f136229d;
        if (cls == null || cls.isAssignableFrom(it.getClass())) {
            this.f136230e.f310116d++;
        }
        return java.lang.Boolean.FALSE;
    }
}
