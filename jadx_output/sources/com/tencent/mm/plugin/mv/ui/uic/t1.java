package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151452e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f151451d = musicMvMainUIC;
        this.f151452e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f151452e;
        return new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$adapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new lm3.b0(androidx.appcompat.app.AppCompatActivity.this);
            }
        }, this.f151451d.f150977g, false);
    }
}
