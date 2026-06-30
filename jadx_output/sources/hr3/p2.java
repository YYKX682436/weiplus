package hr3;

/* loaded from: classes8.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283873d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283873d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.CharSequence charSequence;
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283873d;
        java.lang.String stringExtra = contactMoreInfoUI.getIntent().getStringExtra("inviteer");
        if (stringExtra == null || r26.n0.N(stringExtra)) {
            item.f357956g = null;
        } else {
            java.lang.String f17 = com.tencent.mm.plugin.profile.n2.f(contactMoreInfoUI.f153681m, stringExtra);
            androidx.appcompat.app.AppCompatActivity context = contactMoreInfoUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (f17 == null) {
                charSequence = "";
            } else {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490969be4, f17);
                ((ke0.e) xVar).getClass();
                android.text.SpannableString spannableString = new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string));
                spannableString.setSpan(new com.tencent.mm.plugin.profile.x1(null), 0, f17.length(), 33);
                charSequence = spannableString;
            }
            item.f357956g = charSequence;
            item.f357966t = new hr3.o2(contactMoreInfoUI);
        }
        return jz5.f0.f302826a;
    }
}
