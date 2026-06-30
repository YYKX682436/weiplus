package com.tencent.mm.ui;

/* loaded from: classes13.dex */
public class dk extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208344h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk(long j17, android.view.WindowInsets windowInsets, android.view.View view) {
        super(j17, windowInsets);
        this.f208344h = view;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        return this.f208344h.getRootWindowInsets();
    }
}
