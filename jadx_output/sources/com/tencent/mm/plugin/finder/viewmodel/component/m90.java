package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class m90 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.m90 f135153d = new com.tencent.mm.plugin.finder.viewmodel.component.m90();

    public m90() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it.getIsShouldPlayResume()) {
            it.setIsShouldPlayResume(false);
        }
        return java.lang.Boolean.FALSE;
    }
}
