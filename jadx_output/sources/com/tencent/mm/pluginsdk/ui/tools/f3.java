package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes3.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        super(0);
        this.f191626d = fileSelectorUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f191626d.getIntent().getBooleanExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", false));
    }
}
