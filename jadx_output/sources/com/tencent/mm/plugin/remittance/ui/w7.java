package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class w7 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.m7 f158015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f158016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f158017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f158018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f158019e;

    public w7(com.tencent.mm.plugin.remittance.ui.m7 m7Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f158015a = m7Var;
        this.f158016b = h0Var;
        this.f158017c = remittanceRemarkInputHalfPage;
        this.f158018d = mMEditText;
        this.f158019e = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f158015a.onResult(true, null, (java.lang.String) this.f158016b.f310123d);
        this.f158017c.f157561d.hideVKB(this.f158018d);
        this.f158019e.B();
    }
}
