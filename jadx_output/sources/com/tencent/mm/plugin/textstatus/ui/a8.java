package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class a8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 f173719d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        super(0);
        this.f173719d = textStatusDoWhatActivityV2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.drawable.Drawable drawable = this.f173719d.getResources().getDrawable(com.tencent.mm.R.drawable.b6f);
        kotlin.jvm.internal.o.e(drawable, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
        return (android.graphics.drawable.TransitionDrawable) drawable;
    }
}
