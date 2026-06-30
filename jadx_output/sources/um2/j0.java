package um2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428840d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(um2.x5 x5Var) {
        super(0);
        this.f428840d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428840d.f19606c;
        android.view.View findViewById = cVar != null ? cVar.findViewById(com.tencent.mm.R.id.f7s) : null;
        if (findViewById != null) {
            com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById.findViewById(com.tencent.mm.R.id.f7u)).getPaint(), 0.8f);
        }
        return findViewById;
    }
}
