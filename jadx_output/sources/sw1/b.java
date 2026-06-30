package sw1;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sw1.c f413446d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sw1.c cVar) {
        super(1);
        this.f413446d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        sw1.c cVar = this.f413446d;
        java.lang.CharSequence text = ((android.widget.TextView) cVar.findViewById(android.R.id.title)).getText();
        kotlin.jvm.internal.o.e(text, "null cannot be cast to non-null type android.text.SpannedString");
        return ((android.text.SpannedString) text).toString() + ((com.tencent.mm.wallet_core.ui.WalletTextView) cVar.findViewById(android.R.id.summary)).a().toString();
    }
}
