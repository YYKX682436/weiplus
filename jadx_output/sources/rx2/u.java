package rx2;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public rx2.w f400995a;

    /* renamed from: b, reason: collision with root package name */
    public rx2.d f400996b;

    /* renamed from: c, reason: collision with root package name */
    public rx2.a f400997c;

    public u(com.tencent.mm.plugin.finder.view.FinderPostEditText descTv, com.tencent.mm.ui.MMActivity activity) {
        kotlin.jvm.internal.o.g(descTv, "descTv");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f400995a = new rx2.w(descTv, activity);
        this.f400996b = new rx2.d();
        this.f400997c = new rx2.a();
    }

    public final void a(java.lang.String curDesc, android.text.Editable s17) {
        kotlin.jvm.internal.o.g(curDesc, "curDesc");
        kotlin.jvm.internal.o.g(s17, "s");
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) s17.getSpans(0, s17.length(), android.text.style.ForegroundColorSpan.class);
        kotlin.jvm.internal.o.d(foregroundColorSpanArr);
        for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            s17.removeSpan(foregroundColorSpan);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (t70Var.e()) {
            b().b(curDesc, s17);
        }
        if (t70Var.G2()) {
            rx2.w wVar = this.f400995a;
            if (wVar == null) {
                kotlin.jvm.internal.o.o("topicSuggestManager");
                throw null;
            }
            java.util.ArrayList atStringInfoList = b().f400967c;
            kotlin.jvm.internal.o.g(atStringInfoList, "atStringInfoList");
            java.util.ArrayList arrayList = (java.util.ArrayList) wVar.f400999a;
            arrayList.clear();
            arrayList.addAll(hc2.x0.h(curDesc, atStringInfoList, new rx2.v(s17)));
        }
        if (this.f400997c == null) {
            kotlin.jvm.internal.o.o("activityPostManager");
            throw null;
        }
        int L = r26.n0.L(curDesc, "", 0, false, 6, null);
        if (com.tencent.mm.sdk.platformtools.t8.K0("") || L < 0) {
            return;
        }
        int i17 = L + 0;
        s17.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479308vo)), L, i17, 17);
        s17.setSpan(new android.text.style.BackgroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f479204ss)), L, i17, 17);
    }

    public final rx2.d b() {
        rx2.d dVar = this.f400996b;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.o.o("atManager");
        throw null;
    }
}
