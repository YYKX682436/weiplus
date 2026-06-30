package ij5;

/* loaded from: classes.dex */
public final class f extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.z3(getActivity(), new ij5.d(stringExtra));
        }
        j75.f Q62 = Q6();
        if (Q62 != null) {
            Q62.L2(getActivity(), new ij5.e(this));
        }
    }
}
