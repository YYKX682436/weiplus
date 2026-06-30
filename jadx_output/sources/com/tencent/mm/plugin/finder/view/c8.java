package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f131758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView) {
        super(2);
        this.f131758d = finderEmojiView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.Long l17 = (java.lang.Long) obj2;
        yz5.p downloadListener = this.f131758d.getDownloadListener();
        if (downloadListener != null) {
            kotlin.jvm.internal.o.d(bool);
            kotlin.jvm.internal.o.d(l17);
            downloadListener.invoke(bool, l17);
        }
        return jz5.f0.f302826a;
    }
}
