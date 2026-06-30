package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.k6 f151208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(int i17, int i18, com.tencent.mm.plugin.mv.ui.uic.k6 k6Var) {
        super(0);
        this.f151206d = i17;
        this.f151207e = i18;
        this.f151208f = k6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.music.ui.LyricView lyricView;
        int i17 = this.f151206d;
        if (i17 >= 0 && this.f151207e >= 0 && (lyricView = this.f151208f.f151252d) != null) {
            lyricView.setCurrentTime(i17);
        }
        return jz5.f0.f302826a;
    }
}
