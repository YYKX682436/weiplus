package rx4;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.s f401242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rx4.s sVar) {
        super(0);
        this.f401242d = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.LinearLayout linearLayout;
        rx4.s sVar = this.f401242d;
        sVar.f401262g = null;
        ((java.util.ArrayList) sVar.f401263h).clear();
        ((java.util.LinkedHashMap) sVar.f401264i).clear();
        sVar.f401265m = null;
        sVar.f401266n = false;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) sVar.findViewById(com.tencent.mm.R.id.t4z);
        if (viewGroup != null && (linearLayout = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.f484127t50)) != null) {
            linearLayout.removeAllViews();
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
