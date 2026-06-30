package wu;

/* loaded from: classes9.dex */
public final class j1 extends wu.p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(hu.f uiParams, com.tencent.mm.plugin.mvvmlist.MvvmList<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        kotlin.jvm.internal.o.g(uiParams, "uiParams");
        kotlin.jvm.internal.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        kotlin.jvm.internal.o.g(item, "item");
        s15.h hVar = item.f284997e;
        java.lang.String input = hVar.getString(hVar.f303422d + 1);
        android.widget.TextView textView = (android.widget.TextView) containerView.findViewById(com.tencent.mm.R.id.uxh);
        if (textView == null) {
            return;
        }
        hu.f fVar = this.f449610e;
        java.lang.String q17 = fVar.q();
        if (input instanceof java.lang.String) {
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("\n");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("\r");
            kotlin.jvm.internal.o.f(compile2, "compile(...)");
            input = compile2.matcher(replaceAll).replaceAll("\n");
            kotlin.jvm.internal.o.f(input, "replaceAll(...)");
        }
        java.lang.String spannableString = new android.text.SpannableString(input).toString();
        int a17 = k01.d.a(q17);
        android.os.Bundle a18 = com.tencent.mm.pluginsdk.ui.span.l1.f191252f.a(a17);
        a18.putInt("key_wxa_short_link_launch_chat_type", a17);
        a18.putString("geta8key_username", q17);
        a18.putInt("KMsgType", 1);
        a18.putString("msgUsername", fVar.o());
        java.lang.Long p17 = fVar.p();
        a18.putString("serverMsgID", p17 != null ? p17.toString() : null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        le0.r rVar = le0.x.P0;
        ((ke0.e) xVar).getClass();
        android.text.SpannableString s17 = com.tencent.mm.pluginsdk.ui.span.c0.s(context, spannableString, textSize, 1, a18, null, 4, rVar, true);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setText(s17);
        textView.setOnLongClickListener(new wu.h1(s17, this));
        textView.setOnTouchListener(new wu.i1());
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        s15.h hVar = item.f284997e;
        java.lang.String string = hVar.getString(hVar.f303422d + 1);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_chat_from", context.getClass().getName());
        intent.putExtra("key_chat_text", string);
        intent.putExtra("key_chat_preview_hide_toolbar", true);
        j45.l.u(context, ".ui.chatting.TextPreviewUI", intent, null);
        db5.f.j(context);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        kotlin.jvm.internal.o.g(containerView, "containerView");
        com.tencent.mm.ui.id.b(containerView.getContext()).inflate(com.tencent.mm.R.layout.f489379em1, (android.view.ViewGroup) containerView, true);
    }
}
