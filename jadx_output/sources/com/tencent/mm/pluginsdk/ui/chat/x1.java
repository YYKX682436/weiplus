package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class x1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f190734d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190735e;

    public x1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190735e = chatFooter;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190735e;
        android.text.Editable text = chatFooter.f190021m.getText();
        java.util.List list = this.f190734d;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            text.removeSpan((android.text.style.ForegroundColorSpan) it.next());
        }
        ((java.util.LinkedList) list).clear();
        java.lang.String text2 = chatFooter.f190021m.getText().toString();
        ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
        java.util.regex.Matcher matcher = com.tencent.mm.pluginsdk.ui.span.b0.f191186u.matcher(text2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(chatFooter.getResources().getColor(com.tencent.mm.R.color.Link_100));
            ((java.util.LinkedList) list).add(foregroundColorSpan);
            text.setSpan(foregroundColorSpan, start, end, 33);
        }
        com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = chatFooter.f189955a3;
        if (y4Var != null && y4Var.a() != null) {
            com.tencent.mm.ui.chatting.component.ho hoVar = (com.tencent.mm.ui.chatting.component.ho) ((sb5.o2) chatFooter.f189955a3.a().f460708c.a(sb5.o2.class));
            hoVar.getClass();
            kotlin.jvm.internal.o.g(text2, "text");
            if (!kotlin.jvm.internal.o.b(text2, hoVar.f199191u)) {
                boolean z17 = text2.length() == 0;
                java.lang.Runnable runnable = hoVar.f199196z;
                com.tencent.mm.sdk.platformtools.n3 n3Var = hoVar.f199195y;
                if (z17) {
                    hoVar.u0(com.tencent.mm.ui.chatting.component.kn.f199376d);
                    n3Var.removeCallbacks(runnable);
                    com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = hoVar.f199183m;
                    if (loadableTextView == null) {
                        kotlin.jvm.internal.o.o("resultTv");
                        throw null;
                    }
                    loadableTextView.setOriginText("");
                } else if (!kotlin.jvm.internal.o.b(text2, hoVar.f199190t) && hoVar.n0() != -1) {
                    hoVar.u0(com.tencent.mm.ui.chatting.component.kn.f199377e);
                    n3Var.removeCallbacks(runnable);
                    n3Var.postDelayed(runnable, 300L);
                }
                hoVar.f199191u = text2;
            }
        }
        if (chatFooter.f190029n3) {
            chatFooter.f190021m.setHint("");
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
