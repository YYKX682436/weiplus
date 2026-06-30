package ns4;

/* loaded from: classes8.dex */
public final class z3 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f339691a;

    public z3(ns4.b4 b4Var) {
        this.f339691a = b4Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        ns4.b4 b4Var = this.f339691a;
        pr4.i iVar = ((pr4.h) b4Var.f339442b.f357990d.get(b4Var.f339456p)).f358003c;
        jz5.l[] lVarArr = new jz5.l[2];
        lVarArr[0] = new jz5.l("buy_type", java.lang.Integer.valueOf(iVar == pr4.i.f358009d ? 2 : iVar == pr4.i.f358010e ? 1 : 0));
        android.widget.CheckBox checkBox = b4Var.f339453m;
        if (checkBox != null) {
            lVarArr[1] = new jz5.l("is_read_agree", checkBox.isChecked() ? "1" : "0");
            return kz5.c1.k(lVarArr);
        }
        kotlin.jvm.internal.o.o("checkbox");
        throw null;
    }
}
