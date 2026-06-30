package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity f174402d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity textStatusDoWhatActivity) {
        super(0);
        this.f174402d = textStatusDoWhatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (android.os.ResultReceiver) this.f174402d.getIntent().getParcelableExtra("CALLBACK");
    }
}
