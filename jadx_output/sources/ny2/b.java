package ny2;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ny2.h f341425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ny2.h hVar) {
        super(1);
        this.f341425d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ny2.h hVar = this.f341425d;
        if (booleanValue) {
            hVar.O6().setBackground(hVar.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.a0t));
            hVar.O6().setTextColor(hVar.getActivity().getResources().getColor(com.tencent.mm.R.color.f478553an));
            hVar.O6().setEnabled(true);
        } else {
            hVar.O6().setBackground(hVar.getActivity().getResources().getDrawable(com.tencent.mm.R.drawable.a4c));
            hVar.O6().setTextColor(hVar.getActivity().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
            hVar.O6().setEnabled(false);
        }
        return jz5.f0.f302826a;
    }
}
