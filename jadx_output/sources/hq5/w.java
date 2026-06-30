package hq5;

/* loaded from: classes5.dex */
public final class w extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f283281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f283281d = jz5.h.b(new hq5.s(this));
    }

    public final android.widget.TextView T6() {
        return (android.widget.TextView) ((jz5.n) this.f283281d).getValue();
    }

    public final java.lang.String U6() {
        java.lang.String str;
        eq5.h hVar;
        j75.f Q6 = Q6();
        long j17 = (Q6 == null || (hVar = (eq5.h) Q6.getState()) == null) ? 0L : hVar.f255920n;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((j17 >> 30) > 0) {
            str = java.lang.String.format("%.2f GB", java.lang.Double.valueOf(j17 / 1.073741824E9d));
        } else if ((j17 >> 20) > 0) {
            str = java.lang.Math.round(j17 / 1048576.0d) + " MB";
        } else if ((j17 >> 9) > 0) {
            str = java.lang.Math.round(j17 / 1024.0d) + " KB";
        } else {
            str = j17 + " B";
        }
        kotlin.jvm.internal.o.f(str, "getIntegerSize(...)");
        return str;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new hq5.t(this));
        }
    }
}
