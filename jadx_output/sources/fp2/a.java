package fp2;

/* loaded from: classes2.dex */
public final class a extends cp2.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.MMActivity activity, androidx.fragment.app.Fragment fragment, r45.qt2 contextObj, r45.dd2 dd2Var) {
        super(activity, contextObj, "", null);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f220933m = fragment;
        this.f220934n = dd2Var;
    }

    @Override // cp2.c
    public int getCommentScene() {
        return this.f220928e.getInteger(5);
    }

    @Override // cp2.v0
    public int s() {
        r45.dd2 dd2Var = this.f220934n;
        return (dd2Var != null ? dd2Var.getInteger(0) : 0) + 15;
    }

    @Override // cp2.v0
    public int y() {
        r45.dd2 dd2Var = this.f220934n;
        return (dd2Var != null ? dd2Var.getInteger(0) : 0) + 1001;
    }
}
