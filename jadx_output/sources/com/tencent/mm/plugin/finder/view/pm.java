package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class pm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.rm f132852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm(com.tencent.mm.plugin.finder.view.rm rmVar) {
        super(0);
        this.f132852d = rmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.rm rmVar = this.f132852d;
        if (rmVar.isShowing()) {
            rmVar.dismiss();
        }
        return jz5.f0.f302826a;
    }
}
