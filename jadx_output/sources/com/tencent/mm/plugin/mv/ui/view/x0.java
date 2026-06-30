package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f151984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151985e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(yz5.a aVar, com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        super(0);
        this.f151984d = aVar;
        this.f151985e = musicMVCardChooseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f151984d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f151985e.D = false;
        return jz5.f0.f302826a;
    }
}
