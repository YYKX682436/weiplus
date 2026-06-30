package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f151976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(yz5.a aVar, com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        super(0);
        this.f151976d = aVar;
        this.f151977e = musicMVCardChooseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a aVar = this.f151976d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f151977e.D = false;
        return jz5.f0.f302826a;
    }
}
