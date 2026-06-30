package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class h3 implements com.tencent.mm.sdk.platformtools.g6 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f201632d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f201633e;

    /* renamed from: f, reason: collision with root package name */
    public final ot0.f3 f201634f;

    public h3(java.util.Set set, com.tencent.mm.ui.widget.dialog.u3 u3Var, ot0.f3 f3Var) {
        this.f201632d = set;
        this.f201633e = u3Var;
        this.f201634f = f3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    @Override // com.tencent.mm.sdk.platformtools.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.h3.a():boolean");
    }

    @Override // com.tencent.mm.sdk.platformtools.g6
    public boolean b() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f201633e;
        if (u3Var == null) {
            return true;
        }
        u3Var.dismiss();
        ot0.f3 f3Var = this.f201634f;
        if (f3Var == null) {
            return true;
        }
        f3Var.f2(ot0.e3.del);
        return true;
    }
}
