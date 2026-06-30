package hg2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hg2.h f281341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hg2.h hVar) {
        super(0);
        this.f281341d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hg2.h hVar = this.f281341d;
        int i17 = hVar.f281355p;
        if (i17 > 0) {
            boolean z17 = i17 >= 3600;
            android.widget.TextView textView = hVar.f281357r;
            if (textView != null) {
                textView.setText(no0.l.a(no0.m.f338730a, i17, ":", z17, false, false, 24, null));
            }
            hVar.f281355p--;
        } else {
            hVar.f281356q.d();
            android.view.ViewGroup viewGroup = hVar.f281353n;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
