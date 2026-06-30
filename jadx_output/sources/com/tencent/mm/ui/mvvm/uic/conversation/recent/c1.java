package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class c1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.z f209278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 f209279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f209280f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f209281g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f209282h;

    public c1(wi5.z zVar, com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var, java.util.List list, java.util.HashMap hashMap, kotlinx.coroutines.flow.i2 i2Var) {
        this.f209278d = zVar;
        this.f209279e = h1Var;
        this.f209280f = list;
        this.f209281g = hashMap;
        this.f209282h = i2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        p13.v vVar = (p13.v) obj;
        wi5.z zVar = this.f209278d;
        boolean z17 = zVar.f446369d;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.h1 h1Var = this.f209279e;
        java.util.List list = this.f209280f;
        if (z17) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            for (java.lang.String str : zVar.f446368c) {
                android.text.SpannableString spannableString = new android.text.SpannableString(str);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.plugin.fts.ui.c.f138023a), 0, str.length(), 33);
                spannableStringBuilder.append((java.lang.CharSequence) spannableString);
                spannableStringBuilder.append((java.lang.CharSequence) "、");
            }
            java.lang.CharSequence concat = android.text.TextUtils.concat(h1Var.getString(com.tencent.mm.R.string.nm8), spannableStringBuilder.subSequence(0, spannableStringBuilder.length() - 1), h1Var.getString(com.tencent.mm.R.string.f491379nm4));
            java.lang.String string = h1Var.getActivity().getString(com.tencent.mm.R.string.ffp);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            list.addAll(h1Var.U6(1, false, vVar, string, true, concat));
        } else {
            java.lang.String string2 = h1Var.getActivity().getString(com.tencent.mm.R.string.ffp);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            list.addAll(h1Var.U6(1, false, vVar, string2, false, null));
        }
        this.f209281g.put(new java.lang.Integer(1), vVar);
        java.lang.Object emit = this.f209282h.emit(list, continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}
