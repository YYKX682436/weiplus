package kj5;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj5.f f308459d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kj5.f fVar) {
        super(0);
        this.f308459d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kj5.f fVar = this.f308459d;
        if (fVar.f308461q == 0) {
            fVar.T6().q().setVisibility(8);
            fVar.T6().p().setVisibility(0);
            fVar.T6().r().setTextColor(fVar.getActivity().getResources().getColor(com.tencent.mm.R.color.a4h));
            fVar.T6().r().setText(com.tencent.mm.R.string.igk);
            fVar.T6().n().setBackground(fVar.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.ayn));
        } else {
            fVar.T6().q().setVisibility(0);
            fVar.T6().p().setVisibility(8);
            fVar.T6().r().setTextColor(fVar.getActivity().getResources().getColor(com.tencent.mm.R.color.Brand_100));
            fVar.T6().r().setText(fVar.getActivity().getString(com.tencent.mm.R.string.igt, java.lang.String.valueOf(fVar.f308461q)));
            fVar.T6().n().setBackground(fVar.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.ayo));
        }
        return jz5.f0.f302826a;
    }
}
