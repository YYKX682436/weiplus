package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class ug extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f211089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ProfileDispatchTouchEventLayout f211090e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(android.content.Context context, com.tencent.mm.ui.ProfileDispatchTouchEventLayout profileDispatchTouchEventLayout) {
        super(0);
        this.f211089d = context;
        this.f211090e = profileDispatchTouchEventLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.tg gestureListener;
        gestureListener = this.f211090e.getGestureListener();
        return new android.view.GestureDetector(this.f211089d, gestureListener);
    }
}
