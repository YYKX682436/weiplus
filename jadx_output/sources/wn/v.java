package wn;

/* loaded from: classes11.dex */
public final class v extends wn.u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wn.u
    public wn.t O6() {
        if (wn.p.f447379a == null) {
            return null;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new rb5.a((com.tencent.mm.ui.MMActivity) activity);
    }
}
