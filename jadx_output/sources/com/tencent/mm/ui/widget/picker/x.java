package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f212340d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.c0 f212341e;

    public x(com.tencent.mm.ui.widget.picker.c0 c0Var, int i17) {
        this.f212341e = c0Var;
        this.f212340d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.picker.c0 c0Var = this.f212341e;
        c0Var.f212258s.c(this.f212340d);
        c0Var.f212258s.invalidate();
    }
}
