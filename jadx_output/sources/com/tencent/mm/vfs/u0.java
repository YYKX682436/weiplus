package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class u0 extends com.tencent.mm.vfs.b1 {

    /* renamed from: l, reason: collision with root package name */
    public final java.util.regex.Pattern f213191l;

    public u0(java.lang.String str, int i17, int i18, java.lang.String str2) {
        super(str, i17, i18, str2);
        this.f213191l = java.util.regex.Pattern.compile("^\\$\\{data\\}/app_xwalk_[\\-0-9]*$");
    }

    @Override // com.tencent.mm.vfs.b1
    public boolean a(com.tencent.mm.vfs.a1 a1Var) {
        return a1Var.f212766b == 7 && this.f213191l.matcher(a1Var.f212768d).matches();
    }
}
