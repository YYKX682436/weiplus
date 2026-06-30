package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class oa0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f135458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f135459e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oa0(android.content.Context context, boolean z17) {
        super(1);
        this.f135458d = context;
        this.f135459e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cw2.da it = (cw2.da) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = this.f135458d;
        if ((context == null || it.getF124907z() == context.hashCode()) && (it.getParentView() instanceof cw2.v9)) {
            it.setMute(this.f135459e);
        }
        return java.lang.Boolean.FALSE;
    }
}
