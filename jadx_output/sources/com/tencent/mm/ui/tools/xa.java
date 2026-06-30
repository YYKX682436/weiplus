package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class xa implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210912e;

    public xa(com.tencent.mm.ui.tools.ShowImageUI showImageUI, android.view.View view) {
        this.f210912e = showImageUI;
        this.f210911d = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        if (motionEvent.getAction() == 0) {
            ym5.v6.a(this.f210911d, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            int i17 = com.tencent.mm.ui.tools.ShowImageUI.f210190u;
            this.f210912e.getClass();
        }
        return java.lang.Boolean.TRUE;
    }
}
