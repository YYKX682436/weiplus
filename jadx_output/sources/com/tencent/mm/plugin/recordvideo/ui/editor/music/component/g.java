package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j f156229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.j jVar) {
        super(1);
        this.f156229d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicClipRangeBarView musicClipRangeBarView = this.f156229d.f156266f;
        if (musicClipRangeBarView != null) {
            musicClipRangeBarView.setPlayProgressMs(longValue);
        }
        return jz5.f0.f302826a;
    }
}
