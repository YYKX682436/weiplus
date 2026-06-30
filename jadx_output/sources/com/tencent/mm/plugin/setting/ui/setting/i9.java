package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class i9 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f161149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.k9 f161150b;

    public i9(com.tencent.mm.plugin.setting.ui.setting.k9 k9Var, boolean z17) {
        this.f161150b = k9Var;
        this.f161149a = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f161150b.f161232a.f160351m.setCheck(!this.f161149a);
    }
}
