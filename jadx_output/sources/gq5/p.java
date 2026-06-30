package gq5;

/* loaded from: classes5.dex */
public final class p extends wm3.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // wm3.n
    public j75.a T6() {
        eq5.h hVar = new eq5.h();
        hVar.f255914e = getIntent().getBooleanExtra("isSender", false);
        java.lang.String stringExtra = getIntent().getStringExtra("toUserNick");
        if (stringExtra == null) {
            stringExtra = "";
        }
        hVar.f255915f = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("toUserHeadUrl");
        hVar.f255916g = stringExtra2 != null ? stringExtra2 : "";
        return hVar;
    }
}
