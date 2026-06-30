package im2;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h01 f292588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(r45.h01 h01Var, im2.z3 z3Var) {
        super(0);
        this.f292588d = h01Var;
        this.f292589e = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        r45.h32 h32Var = (r45.h32) this.f292588d.getCustom(2);
        intent.putExtra("KEY_FINDER_LIVE_NOTICE_INFO", h32Var != null ? h32Var.toByteArray() : null);
        im2.z3 z3Var = this.f292589e;
        z3Var.getActivity().setResult(-1, intent);
        z3Var.getActivity().finish();
        z3Var.getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        return jz5.f0.f302826a;
    }
}
