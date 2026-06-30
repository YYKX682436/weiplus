package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 f154091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f154092e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f154091d = i0Var;
        this.f154092e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var = this.f154091d;
        mr3.n m76 = i0Var.m7();
        final androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f154092e;
        return new xm3.t0(m76, appCompatActivity, new in5.s() { // from class: com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.ModImageDescriptionUIWxContact$adapter$2$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    kotlinx.coroutines.y0 b17 = v65.m.b(androidx.appcompat.app.AppCompatActivity.this);
                    com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var2 = i0Var;
                    return new mr3.j(b17, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.h(i0Var2), (mr3.d) ((jz5.n) i0Var2.f154076w).getValue(), new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i(i0Var));
                }
                kotlinx.coroutines.y0 b18 = v65.m.b(androidx.appcompat.app.AppCompatActivity.this);
                boolean X6 = i0Var.X6();
                com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.i0 i0Var3 = i0Var;
                return new mr3.v(b18, X6, new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j(i0Var3), new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.k(i0Var3));
            }
        }, false, 8, null);
    }
}
