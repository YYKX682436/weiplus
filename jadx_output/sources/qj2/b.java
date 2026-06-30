package qj2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj2.d f363868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qj2.d dVar) {
        super(0);
        this.f363868d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qj2.d dVar = this.f363868d;
        int childCount = dVar.getBubbleLayout().getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = dVar.getBubbleLayout().getChildAt(i18);
            kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
            if (childAt.getVisibility() == 0) {
                i17++;
            }
        }
        if (i17 < 3) {
            dVar.setBubbleLayoutScale(1.0f);
        } else {
            dVar.setBubbleLayoutScale(0.6f);
        }
        return jz5.f0.f302826a;
    }
}
