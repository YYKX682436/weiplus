package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f154748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f154749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.storage.z3 z3Var) {
        super(1);
        this.f154747d = h0Var;
        this.f154748e = mMActivity;
        this.f154749f = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList galleryImagePathList = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(galleryImagePathList, "galleryImagePathList");
        com.tencent.mm.ui.widget.dialog.f4 f4Var = (com.tencent.mm.ui.widget.dialog.f4) this.f154747d.f310123d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("view_only", true);
        kr3.s1.f311475a.a(intent, this.f154748e, this.f154749f.d1(), com.tencent.mm.plugin.profile.ui.mod.components.j0.class, 104, true);
        return jz5.f0.f302826a;
    }
}
