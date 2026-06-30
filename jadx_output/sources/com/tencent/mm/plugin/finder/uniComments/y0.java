package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes5.dex */
public final class y0 implements com.tencent.mm.plugin.finder.ui.at.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter f130459a;

    public y0(com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter) {
        this.f130459a = textStatusCommentFooter;
    }

    @Override // com.tencent.mm.plugin.finder.ui.at.a
    public void a(java.lang.String displayName, java.lang.String username) {
        kotlin.jvm.internal.o.g(displayName, "displayName");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter.N;
        com.tencent.mm.plugin.finder.uniComments.TextStatusCommentFooter textStatusCommentFooter = this.f130459a;
        java.lang.String obj = textStatusCommentFooter.getEditText().getText().toString();
        int selectionEnd = textStatusCommentFooter.getEditText().getSelectionEnd();
        int length = obj.length();
        if (selectionEnd > length) {
            selectionEnd = length;
        }
        int i17 = selectionEnd - 1;
        if (i17 < 0) {
            i17 = 0;
        }
        java.lang.String str = kotlin.jvm.internal.o.b(obj.subSequence(i17, selectionEnd).toString(), "@") ? "" : "@";
        long length2 = displayName.length() + 2;
        if (selectionEnd > obj.length()) {
            selectionEnd = obj.length();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String substring = obj.substring(0, selectionEnd);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        sb6.append(substring);
        sb6.append(str);
        sb6.append(displayName);
        sb6.append((char) 8197);
        java.lang.String substring2 = obj.substring(selectionEnd, obj.length());
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        sb6.append(substring2);
        java.lang.String sb7 = sb6.toString();
        int length3 = selectionEnd + str.length() + displayName.length() + 1;
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText = textStatusCommentFooter.getEditText();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textStatusCommentFooter.getContext();
        ((ke0.e) xVar).getClass();
        editText.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, sb7));
        textStatusCommentFooter.getEditText().setSelection(length3);
        textStatusCommentFooter.getEditText().postDelayed(new com.tencent.mm.plugin.finder.uniComments.v0(textStatusCommentFooter), 200L);
        textStatusCommentFooter.I.add(new hv2.a(username, displayName, -1L, length2));
    }
}
