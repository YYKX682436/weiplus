package gg2;

/* loaded from: classes2.dex */
public final class q extends gg2.b {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f271708b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f271708b = "LiveExpTwelveItem";
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // gg2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.view.View r46, kotlin.coroutines.Continuation r47) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gg2.q.a(android.view.View, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // gg2.b
    public int c() {
        return com.tencent.mm.R.layout.dr7;
    }

    @Override // gg2.b
    public int e() {
        kotlinx.coroutines.flow.j2 j2Var;
        r45.bc2 bc2Var;
        bg2.h4 h4Var = (bg2.h4) this.f271664a.a(bg2.h4.class);
        return (h4Var == null || (j2Var = h4Var.f20139i) == null || (bc2Var = (r45.bc2) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null || ((r45.wk5) bc2Var.getCustom(1)) == null) ? -1 : 3;
    }

    @Override // gg2.b
    public java.lang.String f() {
        kotlinx.coroutines.flow.j2 j2Var;
        r45.bc2 bc2Var;
        r45.wk5 wk5Var;
        java.lang.String string;
        bg2.h4 h4Var = (bg2.h4) this.f271664a.a(bg2.h4.class);
        if (h4Var == null || (j2Var = h4Var.f20139i) == null || (bc2Var = (r45.bc2) ((kotlinx.coroutines.flow.h3) j2Var).getValue()) == null) {
            return "";
        }
        if (((r45.px3) bc2Var.getCustom(0)) != null) {
            r45.px3 px3Var = (r45.px3) bc2Var.getCustom(0);
            if (px3Var == null || (string = px3Var.getString(1)) == null) {
                return "";
            }
        } else if (((r45.wk5) bc2Var.getCustom(1)) == null || (wk5Var = (r45.wk5) bc2Var.getCustom(1)) == null || (string = wk5Var.getString(0)) == null) {
            return "";
        }
        return string;
    }

    @Override // gg2.b
    public int g() {
        return 12;
    }

    @Override // gg2.b
    public java.lang.String i() {
        return this.f271708b;
    }
}
