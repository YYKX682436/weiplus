package vg2;

/* loaded from: classes3.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(vg2.r1 r1Var) {
        super(0);
        this.f436539d = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vg2.r1 r1Var = this.f436539d;
        android.view.View findViewById = r1Var.f436564e.findViewById(com.tencent.mm.R.id.cpg);
        findViewById.setOnClickListener(new vg2.k1(r1Var));
        return findViewById;
    }
}
