package com.tencent.mm.plugin.game.luggage.ui.circle;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "f53/s", "a", "b", "c", "d", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class PostCommentDialogUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int G = 0;
    public boolean A;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.ChatFooterPanel f140011d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f140012e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f140013f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InputPanelLinearLayout f140014g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f140015h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f140016i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f140017m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f140018n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f140019o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f140020p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView f140021q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView f140022r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.game.api.GameInputConfig f140023s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f140024t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f140025u;

    /* renamed from: x, reason: collision with root package name */
    public boolean f140028x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f140029y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f140030z;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f140026v = jz5.h.b(new f53.d0(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f140027w = jz5.h.b(new f53.t(this));
    public boolean B = true;
    public final f53.s D = new f53.s();
    public boolean E = true;
    public int F = 1000;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$a;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class a implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
            if (iPCString == null) {
                return;
            }
            m33.x0.f323344a.a(iPCString.f68406d, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$b;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class b implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (bundle == null) {
                return;
            }
            java.lang.String string = bundle.getString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY);
            java.lang.String string2 = bundle.getString("jsonData");
            if (string == null || string2 == null) {
                return;
            }
            m33.x0.f323344a.a(string, new org.json.JSONObject(string2));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$c;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class c implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
            if (iPCString == null) {
                return;
            }
            m33.y0 y0Var = m33.x0.f323344a;
            y0Var.f323345a.remove(iPCString.f68406d);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI$d;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class d implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (bundle == null) {
                return;
            }
            java.lang.String string = bundle.getString(com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY);
            if (string == null || string.length() == 0) {
                return;
            }
            m33.y0 y0Var = m33.x0.f323344a;
            m33.u0 u0Var = new m33.u0(bundle.getString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, ""), bundle.getInt("inputTop", 0), bundle.getInt("inputHeight", 0), bundle.getBoolean("isKeyboardShow", false));
            m33.w0 w0Var = (m33.w0) y0Var.f323345a.get(string);
            if (w0Var != null) {
                w0Var.b(u0Var);
            }
        }
    }

    public static final void T6(com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI postCommentDialogUI) {
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = postCommentDialogUI.f140011d;
        if (chatFooterPanel == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel.h();
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = postCommentDialogUI.f140011d;
        if (chatFooterPanel2 == null) {
            kotlin.jvm.internal.o.o("smileyPanel");
            throw null;
        }
        chatFooterPanel2.setVisibility(8);
        android.widget.ImageView imageView = postCommentDialogUI.f140013f;
        if (imageView != null) {
            postCommentDialogUI.U6(imageView, com.tencent.mm.R.raw.game_comment_smiley, postCommentDialogUI.C);
        } else {
            kotlin.jvm.internal.o.o("ivSmileyIcon");
            throw null;
        }
    }

    public final void U6(android.widget.ImageView imageView, int i17, int i18) {
        if (i18 == 0) {
            if (i17 == -1) {
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                com.tencent.mm.ui.uk.f(drawable, b3.l.getColor(this, com.tencent.mm.R.color.f478714f5));
                imageView.setImageDrawable(drawable);
                return;
            } else {
                android.graphics.drawable.Drawable drawable2 = b3.l.getDrawable(this, i17);
                if (drawable2 != null) {
                    com.tencent.mm.ui.uk.f(drawable2, b3.l.getColor(this, com.tencent.mm.R.color.f478714f5));
                    imageView.setImageDrawable(drawable2);
                    return;
                }
                return;
            }
        }
        if (i18 == 1) {
            if (i17 == -1) {
                android.graphics.drawable.Drawable drawable3 = imageView.getDrawable();
                com.tencent.mm.ui.uk.f(drawable3, b3.l.getColor(this, com.tencent.mm.R.color.f478716f7));
                imageView.setImageDrawable(drawable3);
                return;
            } else {
                android.graphics.drawable.Drawable drawable4 = b3.l.getDrawable(this, i17);
                if (drawable4 != null) {
                    com.tencent.mm.ui.uk.f(drawable4, b3.l.getColor(this, com.tencent.mm.R.color.f478716f7));
                    imageView.setImageDrawable(drawable4);
                    return;
                }
                return;
            }
        }
        if (i18 != 2) {
            return;
        }
        if (i17 == -1) {
            android.graphics.drawable.Drawable drawable5 = imageView.getDrawable();
            com.tencent.mm.ui.uk.f(drawable5, b3.l.getColor(this, com.tencent.mm.R.color.aaz));
            imageView.setImageDrawable(drawable5);
        } else {
            android.graphics.drawable.Drawable drawable6 = b3.l.getDrawable(this, i17);
            if (drawable6 != null) {
                com.tencent.mm.ui.uk.f(drawable6, b3.l.getColor(this, com.tencent.mm.R.color.aaz));
                imageView.setImageDrawable(drawable6);
            }
        }
    }

    public final void V6(int i17, boolean z17, java.lang.String userName) {
        java.lang.Integer num;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        android.text.Editable text = mMEditText.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        java.lang.String obj = text.subSequence(0, i17).toString();
        int O = r26.n0.O(obj, '@', 0, false, 6, null);
        if (O >= obj.length() || O < 0) {
            return;
        }
        java.lang.String substring = obj.substring(0, O);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f140012e;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        android.text.Editable text2 = mMEditText2.getText();
        kotlin.jvm.internal.o.f(text2, "getText(...)");
        java.lang.String obj2 = text2.subSequence(i17, text2.length()).toString();
        f53.s sVar = this.D;
        sVar.getClass();
        sVar.f259688b = "";
        sVar.f259687a = false;
        int i18 = i17 - O;
        if (kotlin.jvm.internal.o.b(userName, "")) {
            for (java.util.Map.Entry entry : sVar.f259691e.entrySet()) {
                if (((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue() == O) {
                    userName = (java.lang.String) entry.getKey();
                }
            }
        }
        ((java.util.ArrayList) sVar.f259689c).remove(userName);
        sVar.f259691e.remove(userName);
        if (!z17 && (num = (java.lang.Integer) sVar.f259690d.get(userName)) != null) {
            W6().l1(num.intValue());
        }
        sVar.f259690d.remove(userName);
        for (java.util.Map.Entry entry2 : sVar.f259691e.entrySet()) {
            if (((java.lang.Number) ((jz5.l) entry2.getValue()).f302833d).intValue() >= i17) {
                entry2.setValue(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry2.getValue()).f302833d).intValue() - i18), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry2.getValue()).f302834e).intValue() - i18)));
            }
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(substring + obj2);
        try {
            for (java.util.Map.Entry entry3 : sVar.f259691e.entrySet()) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(getContext().getResources().getColor(com.tencent.mm.R.color.f479185s9)), ((java.lang.Number) ((jz5.l) entry3.getValue()).f302833d).intValue(), ((java.lang.Number) ((jz5.l) entry3.getValue()).f302834e).intValue(), 33);
            }
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
        java.lang.CharSequence a17 = pg5.d.a(getContext(), spannableString);
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f140012e;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText3.setText(a17);
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f140012e;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText4.setSelection(O);
        if (((java.util.ArrayList) sVar.f259689c).size() == 0) {
            Y6();
        }
    }

    public final com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView W6() {
        com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView atSomeoneView = this.f140022r;
        if (atSomeoneView != null) {
            return atSomeoneView;
        }
        kotlin.jvm.internal.o.o("atSomeoneView");
        throw null;
    }

    public final com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView X6() {
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView gameEmojiPickView = this.f140021q;
        if (gameEmojiPickView != null) {
            return gameEmojiPickView;
        }
        kotlin.jvm.internal.o.o("quickPickEmoji");
        throw null;
    }

    public final void Y6() {
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = this.f140023s;
        if (gameInputConfig != null && gameInputConfig.canShowAtSomeoneView) {
            android.view.View view = this.f140019o;
            if (view == null) {
                kotlin.jvm.internal.o.o("atSomeoneLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.giq);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/game/luggage/ui/circle/PostCommentDialogUI", "hideAtSomeoneView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f53.s sVar = this.D;
            sVar.f259690d.clear();
            W6().setSelectedDatas(sVar.f259689c);
            sVar.f259688b = "";
            this.E = true;
            sVar.f259687a = false;
        }
    }

    public final void Z6(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        java.lang.String obj = mMEditText.getText().toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f140012e;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        int d17 = pg5.d.d(context, obj, mMEditText2.getSelectionStart());
        androidx.appcompat.app.AppCompatActivity context2 = getContext();
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f140012e;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        java.lang.String obj2 = mMEditText3.getText().toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f140012e;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        int d18 = pg5.d.d(context2, obj2, mMEditText4.getSelectionEnd());
        com.tencent.mm.ui.widget.MMEditText mMEditText5 = this.f140012e;
        if (mMEditText5 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(mMEditText5.getText());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = false;
        sb6.append(stringBuffer.substring(0, d17));
        sb6.append(text);
        sb6.append(stringBuffer.substring(d18, stringBuffer.length()));
        java.lang.String sb7 = sb6.toString();
        int i17 = -1;
        if (fp.h.c(21)) {
            com.tencent.mm.ui.widget.MMEditText mMEditText6 = this.f140012e;
            if (mMEditText6 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            android.text.InputFilter[] filters = mMEditText6.getFilters();
            kotlin.jvm.internal.o.f(filters, "getFilters(...)");
            for (android.text.InputFilter inputFilter : filters) {
                if (inputFilter instanceof android.text.InputFilter.LengthFilter) {
                    i17 = ((android.text.InputFilter.LengthFilter) inputFilter).getMax();
                }
            }
        }
        f53.s sVar = this.D;
        for (java.util.Map.Entry entry : sVar.f259691e.entrySet()) {
            if (d17 <= ((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue()) {
                entry.setValue(new jz5.l(java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry.getValue()).f302833d).intValue() + text.length()), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.l) entry.getValue()).f302834e).intValue() + text.length())));
            }
        }
        int length = d17 + text.length();
        if (1 <= i17 && i17 < length) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(sb7);
        try {
            for (java.util.Map.Entry entry2 : sVar.f259691e.entrySet()) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(getContext().getResources().getColor(com.tencent.mm.R.color.f479185s9)), ((java.lang.Number) ((jz5.l) entry2.getValue()).f302833d).intValue(), ((java.lang.Number) ((jz5.l) entry2.getValue()).f302834e).intValue(), 33);
            }
        } catch (java.lang.IndexOutOfBoundsException unused) {
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText7 = this.f140012e;
        if (mMEditText7 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText7.setText(pg5.d.a(getContext(), spannableString));
        com.tencent.mm.ui.widget.MMEditText mMEditText8 = this.f140012e;
        if (mMEditText8 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText8.setSelection(length);
    }

    public final void a7() {
        if (!this.A) {
            b7();
            return;
        }
        this.f140030z = true;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f140012e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        java.lang.Object systemService = mMEditText.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
        }
        Y6();
    }

    public final void b7() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_can_select_video_and_pic", true);
        intent.putExtra("key_send_raw_image", false);
        intent.putExtra("max_select_count", 1);
        intent.putExtra("query_source_type", 15);
        intent.putExtra("query_media_type", 1);
        intent.putExtra("show_header_view", false);
        intent.putExtra("game_haowan_ignore_video_preview", true);
        intent.addFlags(67108864);
        j45.l.n(getContext(), "game", ".media.GamePublishGalleryUI", intent, 10011);
    }

    public final void c7(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        java.lang.String str = this.f140025u;
        java.lang.String string = str == null || str.length() == 0 ? getString(com.tencent.mm.R.string.fmc) : getString(com.tencent.mm.R.string.f492211fm4);
        kotlin.jvm.internal.o.d(string);
        java.lang.String str2 = this.f140025u;
        java.lang.String string2 = str2 == null || str2.length() == 0 ? getString(com.tencent.mm.R.string.fpp) : getString(com.tencent.mm.R.string.f492229fp4);
        kotlin.jvm.internal.o.d(string2);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(getContext());
        u1Var.g(string);
        u1Var.r(false);
        u1Var.a(true);
        u1Var.n(string2);
        u1Var.l(new f53.k0(this, iEmojiInfo));
        u1Var.j(getString(com.tencent.mm.R.string.f490347sg));
        u1Var.q(false);
    }

    public final void d7(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f140024t = iEmojiInfo;
        if (iEmojiInfo == null) {
            android.widget.ImageView imageView = this.f140018n;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.o.o("ivPicPlaceholder");
                throw null;
            }
        }
        android.widget.ImageView imageView2 = this.f140018n;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("ivPicPlaceholder");
            throw null;
        }
        imageView2.setImageBitmap(iEmojiInfo.W(this));
        android.widget.ImageView imageView3 = this.f140018n;
        if (imageView3 == null) {
            kotlin.jvm.internal.o.o("ivPicPlaceholder");
            throw null;
        }
        imageView3.setVisibility(0);
        this.f140025u = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.tencent.mm.R.anim.f477848d6);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bfn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 10011 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("CropImage_OutputPath_List") : null;
            if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                return;
            }
            kotlin.jvm.internal.o.d(stringArrayListExtra);
            java.lang.String str = stringArrayListExtra.get(0);
            this.f140025u = str;
            this.f140024t = null;
            int a17 = ym5.x.a(this, 32.0f);
            android.graphics.Bitmap t17 = com.tencent.mm.sdk.platformtools.x.t(str, a17, a17, true, false);
            if (t17 != null) {
                android.widget.ImageView imageView = this.f140018n;
                if (imageView == null) {
                    kotlin.jvm.internal.o.o("ivPicPlaceholder");
                    throw null;
                }
                imageView.setImageBitmap(t17);
                android.widget.ImageView imageView2 = this.f140018n;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                } else {
                    kotlin.jvm.internal.o.o("ivPicPlaceholder");
                    throw null;
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        setTransparentTheme(true);
        customfixStatusbar(true);
        super.onCreate(bundle);
        getController().G0(b3.l.getColor(this, com.tencent.mm.R.color.a9e));
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = (com.tencent.mm.plugin.game.api.GameInputConfig) getIntent().getParcelableExtra("game_center_input_config");
        this.f140023s = gameInputConfig;
        if (gameInputConfig != null) {
            this.B = gameInputConfig.isToolsProcess;
            this.C = gameInputConfig.forceUserInterfaceStyle;
            this.F = gameInputConfig.maxInputCharsCount * 2;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.go8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f140021q = (com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f486641lz2);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f140016i = (android.widget.LinearLayout) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f483279a60);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f140019o = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f483280a61);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f140022r = (com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView) findViewById4;
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig2 = this.f140023s;
        if (gameInputConfig2 != null && gameInputConfig2.canShowAtSomeoneView) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig3 = this.f140023s;
            bundle2.putString("contentId", gameInputConfig3 != null ? gameInputConfig3.atContentId : null);
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig4 = this.f140023s;
            if (gameInputConfig4 != null && (str = gameInputConfig4.atContext) != null) {
                byte[] bytes = str.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                bundle2.putByteArray("context", bytes);
            }
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig5 = this.f140023s;
            if (gameInputConfig5 != null) {
                bundle2.putInt("limit", gameInputConfig5.atLimit);
            }
            com.tencent.mm.plugin.game.luggage.ui.circle.AtSomeoneView W6 = W6();
            W6.f139982o2 = bundle2;
            W6.m1(null);
            W6().setOnItemClickListener(new f53.u(this));
        }
        android.widget.LinearLayout linearLayout = this.f140016i;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("replyBox");
            throw null;
        }
        int i17 = this.C;
        if (i17 == 1) {
            linearLayout.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.getColor(this, com.tencent.mm.R.color.aaz), android.graphics.PorterDuff.Mode.DARKEN));
        } else if (i17 == 2) {
            linearLayout.getBackground().setColorFilter(new android.graphics.PorterDuffColorFilter(b3.l.getColor(this, com.tencent.mm.R.color.f478514w), android.graphics.PorterDuff.Mode.DARKEN));
        }
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.gjb);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f140012e = (com.tencent.mm.ui.widget.MMEditText) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.p1v);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f140020p = findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.i2m);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f140014g = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.hnt);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById8;
        this.f140013f = imageView;
        U6(imageView, -1, this.C);
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f485428hn3);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById9;
        this.f140015h = imageView2;
        U6(imageView2, -1, this.C);
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.azi);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f140017m = (android.widget.Button) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.hky);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.widget.ImageView imageView3 = (android.widget.ImageView) findViewById11;
        this.f140018n = imageView3;
        imageView3.setOnClickListener(new f53.v(this));
        android.widget.ImageView imageView4 = this.f140015h;
        if (imageView4 == null) {
            kotlin.jvm.internal.o.o("ivPicIcon");
            throw null;
        }
        imageView4.setOnClickListener(new f53.w(this));
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig6 = this.f140023s;
        if (gameInputConfig6 != null && gameInputConfig6.hideImgBtn) {
            android.widget.ImageView imageView5 = this.f140015h;
            if (imageView5 == null) {
                kotlin.jvm.internal.o.o("ivPicIcon");
                throw null;
            }
            imageView5.setVisibility(8);
        }
        android.view.View view = this.f140020p;
        if (view == null) {
            kotlin.jvm.internal.o.o("viewPlaceHolderTop");
            throw null;
        }
        view.setOnClickListener(new f53.x(this));
        android.widget.Button button = this.f140017m;
        if (button == null) {
            kotlin.jvm.internal.o.o("btSendComment");
            throw null;
        }
        java.util.Map map = (java.util.Map) ((jz5.n) this.f140027w).getValue();
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig7 = this.f140023s;
        button.setText((java.lang.CharSequence) map.get(gameInputConfig7 != null ? gameInputConfig7.returnKeyType : null));
        android.widget.Button button2 = this.f140017m;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("btSendComment");
            throw null;
        }
        button2.setOnClickListener(new f53.y(this));
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig8 = this.f140023s;
        if (gameInputConfig8 != null) {
            java.lang.String str2 = gameInputConfig8.textPlaceHolder;
            if (str2 != null) {
                com.tencent.mm.ui.widget.MMEditText mMEditText = this.f140012e;
                if (mMEditText == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                mMEditText.setHint(str2);
            }
            int i18 = gameInputConfig8.maxInputCharsCo;
            if (i18 > 0) {
                com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f140012e;
                if (mMEditText2 == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                mMEditText2.setMaxEms(i18);
            }
            java.lang.String str3 = gameInputConfig8.contentText;
            if (!(str3 == null || str3.length() == 0)) {
                com.tencent.mm.ui.widget.MMEditText mMEditText3 = this.f140012e;
                if (mMEditText3 == null) {
                    kotlin.jvm.internal.o.o("gameCommentInputTxt");
                    throw null;
                }
                mMEditText3.n(gameInputConfig8.contentText);
            }
        }
        f53.c0 c0Var = new f53.c0(this);
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig9 = this.f140023s;
        if (gameInputConfig9 != null && gameInputConfig9.canShowAtSomeoneView) {
            com.tencent.mm.ui.widget.MMEditText mMEditText4 = this.f140012e;
            if (mMEditText4 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText4.setOnClickListener(new f53.z(this));
            com.tencent.mm.ui.widget.MMEditText mMEditText5 = this.f140012e;
            if (mMEditText5 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText5.setSelectionChangedListener(new f53.a0(this));
        }
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig10 = this.f140023s;
        java.lang.String str4 = gameInputConfig10 != null ? gameInputConfig10.quickEmojiList : null;
        if (!(str4 == null || str4.length() == 0)) {
            com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView X6 = X6();
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig11 = this.f140023s;
            X6.setEmojiStr(java.lang.String.valueOf(gameInputConfig11 != null ? gameInputConfig11.quickEmojiList : null));
        }
        X6().setOnTextOperationListener(c0Var);
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView X62 = X6();
        java.util.LinkedList linkedList = X62.f140005h;
        java.lang.Object obj = X62.f140002e;
        ((lr.z) obj).E(linkedList);
        ((androidx.recyclerview.widget.f2) obj).notifyDataSetChanged();
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView X63 = X6();
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig12 = this.f140023s;
        X63.setCanShowEmoji(gameInputConfig12 != null && gameInputConfig12.showEmojiQuickInputView);
        int i19 = this.C;
        if (i19 == 1) {
            X6().setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.f479169rt));
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f140014g;
            if (inputPanelLinearLayout == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            inputPanelLinearLayout.setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.f479169rt));
            com.tencent.mm.ui.widget.MMEditText mMEditText6 = this.f140012e;
            if (mMEditText6 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText6.setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.aaz));
            com.tencent.mm.ui.widget.MMEditText mMEditText7 = this.f140012e;
            if (mMEditText7 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText7.setTextColor(b3.l.getColor(this, com.tencent.mm.R.color.f478716f7));
        } else if (i19 == 2) {
            X6().setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.f478513v));
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout2 = this.f140014g;
            if (inputPanelLinearLayout2 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            inputPanelLinearLayout2.setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.f478513v));
            com.tencent.mm.ui.widget.MMEditText mMEditText8 = this.f140012e;
            if (mMEditText8 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText8.setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.f478514w));
            com.tencent.mm.ui.widget.MMEditText mMEditText9 = this.f140012e;
            if (mMEditText9 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            mMEditText9.setTextColor(b3.l.getColor(this, com.tencent.mm.R.color.aaz));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new f53.b0(this, this.F, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2));
        com.tencent.mm.ui.widget.MMEditText mMEditText10 = this.f140012e;
        if (mMEditText10 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        ck5.f b17 = ck5.f.b(mMEditText10);
        int i27 = this.F;
        b17.f42561f = 0;
        b17.f42560e = i27;
        b17.f42563h = arrayList;
        b17.d(null);
        com.tencent.mm.ui.widget.MMEditText mMEditText11 = this.f140012e;
        if (mMEditText11 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText11.addTextChangedListener(new f53.e0(this));
        if (com.tencent.mm.pluginsdk.ui.chat.i6.a() == null) {
            this.f140011d = new com.tencent.mm.pluginsdk.ui.chat.t5(this);
        } else {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel c17 = this.C == 2 ? qk.w9.c(this, true) : ((g30.c0) com.tencent.mm.pluginsdk.ui.chat.i6.a()).wi(this);
            this.f140011d = c17;
            c17.setShowGame(false);
            c17.o(false, false);
            com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig13 = this.f140023s;
            java.lang.String str5 = gameInputConfig13 != null ? gameInputConfig13.emoticonBoardViewType : null;
            if (kotlin.jvm.internal.o.b(str5, "emojiCustomCommon")) {
                c17.p(true, false);
                c17.setShowStore(true);
                c17.setShowSearch(true);
            } else if (kotlin.jvm.internal.o.b(str5, "emojiNoCustomCommon")) {
                c17.p(false, false);
                c17.setShowStore(true);
                c17.setShowSearch(true);
            } else {
                c17.p(false, false);
                c17.setShowStore(false);
                c17.setShowSearch(false);
            }
            c17.setShowSmiley(true);
            c17.setTalkerName("");
            int i28 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
            c17.setEntranceScene(102);
            com.tencent.mm.ui.widget.MMEditText mMEditText12 = this.f140012e;
            if (mMEditText12 == null) {
                kotlin.jvm.internal.o.o("gameCommentInputTxt");
                throw null;
            }
            c17.setToSendText(mMEditText12.getText().toString());
            c17.setOnTextOperationListener(new f53.h0(c17, this));
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = this.f140011d;
            if (chatFooterPanel == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel.setCallback(new f53.i0(this));
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel2 = this.f140011d;
            if (chatFooterPanel2 == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            chatFooterPanel2.setVisibility(8);
            com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout3 = this.f140014g;
            if (inputPanelLinearLayout3 == null) {
                kotlin.jvm.internal.o.o("linearRoot");
                throw null;
            }
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel3 = this.f140011d;
            if (chatFooterPanel3 == null) {
                kotlin.jvm.internal.o.o("smileyPanel");
                throw null;
            }
            inputPanelLinearLayout3.addView(chatFooterPanel3, -1, com.tencent.mm.sdk.platformtools.d2.g(getContext()));
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText13 = this.f140012e;
        if (mMEditText13 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        mMEditText13.setOnTouchListener(new f53.f0(this));
        android.widget.ImageView imageView6 = this.f140013f;
        if (imageView6 == null) {
            kotlin.jvm.internal.o.o("ivSmileyIcon");
            throw null;
        }
        imageView6.setOnClickListener(new f53.g0(this));
        java.lang.String str6 = (java.lang.String) ((jz5.n) this.f140026v).getValue();
        kotlin.jvm.internal.o.f(str6, "<get-defaultViewType>(...)");
        if (kotlin.jvm.internal.o.b(str6, "image")) {
            a7();
            return;
        }
        if (kotlin.jvm.internal.o.b(str6, "emoticon")) {
            android.widget.ImageView imageView7 = this.f140013f;
            if (imageView7 == null) {
                kotlin.jvm.internal.o.o("ivSmileyIcon");
                throw null;
            }
            imageView7.performClick();
            X6().setVisibility(8);
            return;
        }
        com.tencent.mm.ui.widget.MMEditText mMEditText14 = this.f140012e;
        if (mMEditText14 == null) {
            kotlin.jvm.internal.o.o("gameCommentInputTxt");
            throw null;
        }
        java.lang.Object systemService = mMEditText14.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            mMEditText14.requestFocus();
            inputMethodManager.showSoftInput(mMEditText14, 0);
        }
        X6().setVisibility(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String str;
        super.onDestroy();
        com.tencent.mm.plugin.game.api.GameInputConfig gameInputConfig = this.f140023s;
        if (gameInputConfig == null || (str = gameInputConfig.identifier) == null) {
            return;
        }
        if (this.B) {
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193055c, new com.tencent.mm.ipcinvoker.type.IPCString(str), com.tencent.mm.plugin.game.luggage.ui.circle.PostCommentDialogUI.c.class, null);
        } else {
            m33.x0.f323344a.f323345a.remove(str);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = this.f140014g;
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.e(new f53.j0(this));
        } else {
            kotlin.jvm.internal.o.o("linearRoot");
            throw null;
        }
    }
}
