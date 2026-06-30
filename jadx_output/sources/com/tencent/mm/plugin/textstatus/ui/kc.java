package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class kc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI f174036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc(com.tencent.mm.plugin.textstatus.ui.TextStatusHistoryUI textStatusHistoryUI) {
        super(0);
        this.f174036d = textStatusHistoryUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusHistoryUI", "onLoadMoreBegin");
        bk4.d dVar = this.f174036d.f173635g;
        if (dVar != null) {
            dVar.b();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("dataLoader");
        throw null;
    }
}
