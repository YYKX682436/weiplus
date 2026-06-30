package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class ng extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity f174136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng(com.tencent.mm.plugin.textstatus.ui.TextStatusTransparentActivity textStatusTransparentActivity) {
        super(0);
        this.f174136d = textStatusTransparentActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.os.ResultReceiver) this.f174136d.getIntent().getParcelableExtra("CALLBACK");
    }
}
