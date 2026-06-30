package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class s1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.u1 f161526d;

    public s1(com.tencent.mm.plugin.setting.ui.setting.u1 u1Var) {
        this.f161526d = u1Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (this.f161526d.f161593d.f160166e != null) {
            g4Var.a(0, com.tencent.mm.R.string.frw);
        }
    }
}
