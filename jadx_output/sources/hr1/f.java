package hr1;

/* loaded from: classes11.dex */
public final class f implements hr1.d {
    @Override // hr1.d
    public void a(hr1.e owner) {
        java.lang.CharSequence i17;
        kotlin.jvm.internal.o.g(owner, "owner");
        if (kotlin.jvm.internal.o.b(owner.field_sessionId, "bizfansnofiticationholder@bizfansmsg")) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n5n);
            owner.f283345p0 = string;
            owner.Z = string;
            return;
        }
        if (kotlin.jvm.internal.o.b(owner.field_sessionId, "bizfansgreetholder@bizfansmsg")) {
            java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492053o13);
            owner.f283345p0 = string2;
            owner.Z = string2;
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(owner.field_sessionId, true);
        owner.Y = n17;
        owner.f283345p0 = n17 != null ? n17.g2() : null;
        com.tencent.mm.storage.z3 z3Var = owner.Y;
        if (z3Var == null || (i17 = z3Var.J2) == null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String str = owner.f283345p0;
            ((ke0.e) xVar).getClass();
            i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str);
        }
        owner.Z = i17;
    }

    @Override // hr1.d
    public java.lang.CharSequence b(hr1.e owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = owner.field_editingMsg;
        boolean z17 = true;
        if (!(str == null || r26.n0.N(str))) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(context.getString(com.tencent.mm.R.string.f490733n51));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479482a31)), 0, spannableStringBuilder.length(), 33);
            android.text.SpannableStringBuilder append = spannableStringBuilder.append((java.lang.CharSequence) " ");
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = owner.field_editingMsg;
            ((ke0.e) xVar).getClass();
            append.append((java.lang.CharSequence) com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
            return spannableStringBuilder;
        }
        if (!kotlin.jvm.internal.o.b(owner.field_digestType, "47") && !kotlin.jvm.internal.o.b(owner.field_digestType, "1048625")) {
            z17 = false;
        }
        if (z17) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490382tf);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str3 = owner.field_digest;
        ((ke0.e) xVar2).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3);
    }
}
