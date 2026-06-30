package df2;

/* loaded from: classes3.dex */
public final class ml extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f230786d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(df2.pl plVar) {
        super(1);
        this.f230786d = plVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.pl plVar = this.f230786d;
        if (booleanValue) {
            android.widget.RelativeLayout relativeLayout = plVar.f231089o;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText = plVar.f231100z;
            if (fakeEditText != null) {
                fakeEditText.setVisibility(0);
            }
            java.lang.Object obj2 = plVar.A.get(0);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            plVar.e7((android.widget.TextView) obj2);
            df2.pl.Z6(plVar);
        } else {
            com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText2 = plVar.f231100z;
            if (fakeEditText2 != null) {
                fakeEditText2.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout2 = plVar.f231089o;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
