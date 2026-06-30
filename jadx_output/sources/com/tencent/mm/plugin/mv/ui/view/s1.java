package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView f151945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f151946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentView musicMvCommentView, java.util.ArrayList arrayList) {
        super(0);
        this.f151945d = musicMvCommentView;
        this.f151946e = arrayList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f151945d.setMaxHeight(this.f151946e.size());
        return jz5.f0.f302826a;
    }
}
